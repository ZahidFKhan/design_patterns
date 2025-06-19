package com.designpattern.creational.prototype;

record Student(int id, long salary, String name) implements Cloneable {
  // 1st Way
  Student(Student secondStudent) {
    this(secondStudent.id(), secondStudent.salary(), secondStudent.name());
  }

  // 2nd WAY not recommended
  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
