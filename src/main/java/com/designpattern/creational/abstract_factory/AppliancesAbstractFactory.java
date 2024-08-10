package com.designpattern.creational.abstract_factory;

public class AppliancesAbstractFactory {
  public static Appliance getInstance(ApplianceCategory applianceCategory) {

    switch (applianceCategory) {
      case PREMIUM:
        return new Appliance() {
          @Override
          public Switch getSwitch() {
            return new SamsungSwitch();
          }

          @Override
          public Lighting getLighting() {
            return new SamsungLighting();
          }
        };
      case MEDIUM:
        break;
      case ECONOMICAL:
        break;
    }
    return null;
  }
}
