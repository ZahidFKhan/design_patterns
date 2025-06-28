package com.design_patterns.creational.factory;

import com.design_patterns.creational.factory.models.Laptop;
import com.design_patterns.creational.factory.models.Server;
import com.design_patterns.creational.factory.models.SuperComputer;
import com.design_patterns.creational.factory.options.ComputerType;
import com.design_patterns.creational.factory.type.Computer;

public class ComputerFactory {
  public static Computer getInstance(
      ComputerType computerType, final String ram, final String hdd, final String processor) {
    if (computerType == ComputerType.LAPTOP) {
      return new Laptop(ram, hdd, processor);
    } else if (computerType == ComputerType.SERVER) {
      return new Server(ram, hdd, processor);
    } else {
      return new SuperComputer(ram, hdd, processor);
    }
  }
}
