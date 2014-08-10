package com.github.marschall.wicket.counter;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

public class CounterApplication extends WebApplication {

  @Override
  public Class<? extends Page> getHomePage() {
    return Counter.class;
  }

}
