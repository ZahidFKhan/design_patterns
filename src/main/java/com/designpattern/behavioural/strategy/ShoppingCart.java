package com.designpattern.behavioural.strategy;

public class ShoppingCart {
  boolean checkout(double amount, PaymentStrategy paymentStrategy) {
    paymentStrategy.pay(amount);
    System.out.println("Paid successfully.");
    return true;
  }
}
