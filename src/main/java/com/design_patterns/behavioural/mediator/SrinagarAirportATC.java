package com.design_patterns.behavioural.mediator;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class SrinagarAirportATC implements ATC {
  private static final Set<Airplane> airplanes = new HashSet<>();
  private final AtomicBoolean isLane1Free = new AtomicBoolean(true);

  @Override
  public void registerInFlightPlane(Airplane airplane) {
    log.info("Registering {} with Srinagar AIRPORT.", airplane.name());
    airplanes.add(airplane);
  }

  @Override
  public void deRegisterPlane(Airplane airplane) {
    airplanes.remove(airplane);
  }

  @Override
  @SneakyThrows
  public void allowedToLand(Airplane airplane) {
    if (isLane1Free.compareAndSet(true, false)) {
      log.info("{} is allowed to land on {}", airplane.name(), "run1.");
      isLane1Free.set(true);
      log.info("{} landed on the {}", airplane.name(), "run1.");
    } else {
      log.warn("Prohibited! {} is NOT ALLOWED to land on run1.", airplane.name());
    }
  }
}
