package com.designpattern.behavioural.visitor;

/**
 * The Visitable interface declares an accept method that takes a Visitor as an argument. This
 * method is responsible for calling the appropriate visit method on the visitor, passing itself
 * (this) as an argument.
 */
public interface Visitable {
    void accept(Visitor visitor);
}
