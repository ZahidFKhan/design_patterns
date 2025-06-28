package com.design_patterns.behavioural.memento;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CareTaker {
  private final List<Memento> mementoList = new ArrayList<>();

  void save(Memento snapshot) {
    log.info("Saved into db {}", snapshot);
    mementoList.add(snapshot);
  }

  Memento restore() {
    final var last = mementoList.getLast();
    mementoList.remove(last);
    return last;
  }
}
