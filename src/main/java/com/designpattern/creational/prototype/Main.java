package com.designpattern.creational.prototype;

public class Main {
  public static void main(String[] args) throws CloneNotSupportedException {
    Student student = new Student(12, 12000, "Zahid");
    Student student1 = (Student) student.clone();
    System.out.println(student.equals(student1));
    System.out.println(student == student1);
  }
}

record Student(int id, long salary, String name) implements Cloneable {
  @Override
  protected Object clone() throws CloneNotSupportedException {
    return new Student(id(), salary(), name());
  }
}
