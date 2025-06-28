package com.design_patterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AwsSnsService implements Publisher {
  private final List<Subscriber> subscribers = new ArrayList<>();

  @Override
  public void subscribe(Subscriber user) {
    log.info("{} has been subscribed into the system.", user);
    subscribers.add(user);
  }

  @Override
  public void unsubscribe(Subscriber user) {
    log.info("{} has been unsubscribed into the system.", user);
    subscribers.remove(user);
  }

  @Override
  public void notifySubscribers() {
    for (var subscriber : subscribers) {
      log.info("{} has been notified about the event.", subscriber);
    }
  }
}
