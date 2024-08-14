package com.designpattern.creational.abstract_factory;

import com.designpattern.creational.abstract_factory.items.lighting.Lighting;
import com.designpattern.creational.abstract_factory.items.switches.Switch;

public interface Appliance {
    Switch getSwitch();
    Lighting getLighting();
}
