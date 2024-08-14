package com.designpattern.creational.abstract_factory.items.switches;

public class SamsungSwitch implements Switch {
  @Override
  public boolean turnOff() {
    System.out.println("Samsung switch turned off");
    return false;
  }
}
