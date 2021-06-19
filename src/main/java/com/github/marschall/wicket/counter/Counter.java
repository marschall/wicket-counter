package com.github.marschall.wicket.counter;

import java.math.BigInteger;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.wicketstuff.lambda.components.ComponentFactory;

public class Counter extends WebPage {

  private final IModel<BigInteger> count;

  public Counter() {
    this.count = new Model<>(BigInteger.ZERO);
    this.add(new Label("count", this.count));
    this.add(ComponentFactory.link("increment", link -> this.increment()));
    this.add(ComponentFactory.link("decrement", link -> this.decrement()));
  }

  void increment() {
    this.count.setObject(this.count.getObject().add(BigInteger.ONE));
  }

  void decrement() {
    this.count.setObject(this.count.getObject().subtract(BigInteger.ONE));
  }

}
