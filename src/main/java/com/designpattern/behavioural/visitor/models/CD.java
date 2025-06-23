package com.designpattern.behavioural.visitor.models;

import com.designpattern.behavioural.visitor.Visitable;
import com.designpattern.behavioural.visitor.Visitor;
import lombok.Getter;

/** Concrete Element B: Represents a CD. It implements the Visitable interface. */
public record CD(String title, double price, int trackCount) implements Visitable {

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
