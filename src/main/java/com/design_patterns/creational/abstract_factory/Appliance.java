package com.design_patterns.creational.abstract_factory;

import com.design_patterns.creational.abstract_factory.items.lighting.Lighting;
import com.design_patterns.creational.abstract_factory.items.switches.Switch;

public interface Appliance {
    Switch getSwitch();
    Lighting getLighting();
}
