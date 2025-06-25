package com.designpattern.behavioural.observer;

public class Main {
  public static void main(String[] args) {
    Subscriber user1 = new User("Zahid");
    Subscriber user2 = new User("Sarwat");

    Publisher publisher = new AwsSnsService();
    publisher.subscribe(user1);
    publisher.subscribe(user2);

    publisher.notifySubscribers();
    publisher.unsubscribe(user1);

    Subscriber user3 = new User("Arif");
    publisher.subscribe(user3);
    publisher.notifySubscribers();
  }
}
