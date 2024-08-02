package com.designpattern.creational.abstract_factory;

public class SamsungSwitch implements Switch {
  @Override
  public boolean turnOff() {
    System.out.println("Samsung switch turned off");
    return false;
  }
}
