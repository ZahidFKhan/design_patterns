package com.designpattern.behavioural.observer;

public interface Publisher {
  void subscribe(Subscriber user1);

  void unsubscribe(Subscriber user1);

  void notifySubscribers();
}
