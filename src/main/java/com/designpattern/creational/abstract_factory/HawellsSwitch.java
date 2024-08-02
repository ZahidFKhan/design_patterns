package com.designpattern.creational.abstract_factory;

public class HawellsSwitch implements Switch {
    @Override
    public boolean turnOff() {
        System.out.println("Turned off");
        return false;
    }
}
