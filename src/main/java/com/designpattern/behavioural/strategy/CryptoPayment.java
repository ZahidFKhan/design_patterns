package com.designpattern.behavioural.strategy;

public class CryptoPayment implements PaymentStrategy {
  @Override
  public void pay(double amount) {

    System.out.println("Processing Cryptocurrency payment of $" + amount);
    if (amount > 0 && amount <= 10000) { // Crypto might support larger or different limits
      System.out.println("Initiating transfer to wallet .");
      System.out.println("Crypto payment awaiting confirmation (simulated success).");
    } else {
      System.out.println(
          "Cryptocurrency payment failed (simulated network error or invalid amount).");
    }
  }
}
