package com.github.marschall.wicket.counter;

import java.math.BigInteger;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;

public class Counter extends WebPage {
  
  private final IModel<BigInteger> count;

  public Counter() {
    this.count = new Model<>(BigInteger.ZERO);
    this.add(new Label("count", this.count));
    this.add(new Link("increment"){

      public void onClick() {
        increment();
      }});
    this.add(new Link("decrement"){
      
      public void onClick() {
        increment();
      }});
  }

  void increment() {
    count.setObject(count.getObject().add(BigInteger.ONE));
  }
  
  void decrement() {
    count.setObject(count.getObject().subtract(BigInteger.ONE));
  }

}
