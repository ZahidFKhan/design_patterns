package com.designpattern.behavioural.visitor.models;

import com.designpattern.behavioural.visitor.Visitable;
import com.designpattern.behavioural.visitor.Visitor;

/**
 * Concrete Element A: Represents a Book. It implements the Visitable interface.
 *
 * @param weight in kg
 */
public record Book(String title, double price, double weight) implements Visitable {

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
