package com.design_patterns.creational.abstract_factory.items.lighting;

public class SamsungLighting implements Lighting {
  public void turnOn() {
    System.out.println("Turned ON!");
  }

  public void turnOff() {
    System.out.println("Turned off!");
  }
}
