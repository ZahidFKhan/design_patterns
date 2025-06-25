package com.designpattern.behavioural.visitor.models;

import com.designpattern.behavioural.visitor.Visitable;
import com.designpattern.behavioural.visitor.Visitor;

public record DVD(String title, double price, int durationMinutes) implements Visitable {

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
