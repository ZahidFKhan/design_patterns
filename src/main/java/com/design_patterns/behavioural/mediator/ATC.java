package com.design_patterns.behavioural.mediator;

interface ATC {
  void registerInFlightPlane(Airplane airplane);

  void deRegisterPlane(Airplane airplane);

  void allowedToLand(Airplane airplane);
}
