package com.designpattern.creational.prototype;

record Student(int id, long salary, String name) implements Cloneable {
  @Override
  protected Object clone() throws CloneNotSupportedException {
    return new Student(id(), salary(), name());
  }
}
