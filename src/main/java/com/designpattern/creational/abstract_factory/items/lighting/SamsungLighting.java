package com.designpattern.creational.abstract_factory.items.lighting;

import com.designpattern.creational.abstract_factory.items.lighting.Lighting;

public class SamsungLighting implements Lighting {
  public void turnOn() {
    System.out.println("Turned ON!");
  }

  public void turnOff() {
    System.out.println("Turned off!");
  }
}
