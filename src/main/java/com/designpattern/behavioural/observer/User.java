package com.designpattern.behavioural.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public record User(String name) implements Subscriber {

  @Override
  public void receiveEvent(String event) {
    log.info("Received an AWS Event : {}", event);
  }
}
