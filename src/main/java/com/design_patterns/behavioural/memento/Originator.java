package com.design_patterns.behavioural.memento;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Originator {
  private StringBuilder stringBuilder = new StringBuilder();

  public void addText(String value) {
    log.info("Adding \"{}\" into the editor.", value);
    stringBuilder.append(value);
  }

  Memento save() {
    return new Memento(stringBuilder.toString());
  }

  void restore(Memento state) {
    log.info("Restored {} state into the path.", state);
    stringBuilder = new StringBuilder(state.text());
  }
}
