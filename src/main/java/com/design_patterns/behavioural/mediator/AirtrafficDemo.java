package com.design_patterns.behavioural.mediator;

class AirtrafficDemo {
  public static void main(String[] args) {
    ATC srinagarATC = new SrinagarAirportATC();
    var b2BOMBER = new Airplane("B2BOMBER", srinagarATC);
    Airplane indigoC2322 = new Airplane("Indigo AC2322", srinagarATC);

    srinagarATC.registerInFlightPlane(b2BOMBER);
    srinagarATC.registerInFlightPlane(indigoC2322);

    srinagarATC.allowedToLand(b2BOMBER);
    srinagarATC.allowedToLand(indigoC2322);
  }
}
