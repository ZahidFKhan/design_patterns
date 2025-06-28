package com.design_patterns.behavioural.visitor.models;

import com.design_patterns.behavioural.visitor.Visitable;
import com.design_patterns.behavioural.visitor.Visitor;

public record DVD(String title, double price, int durationMinutes) implements Visitable {

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
