package com.design_patterns.creational.abstract_factory;

public class Main {
    public static void main(String[] args){
        Appliance electricAppliances = AppliancesAbstractFactory.getInstance(ApplianceCategory.PREMIUM);
        electricAppliances.getLighting();
        electricAppliances.getSwitch();
    }
}
