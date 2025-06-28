package com.design_patterns.behavioural.observer;

public interface Publisher {
  void subscribe(Subscriber user1);

  void unsubscribe(Subscriber user1);

  void notifySubscribers();
}
