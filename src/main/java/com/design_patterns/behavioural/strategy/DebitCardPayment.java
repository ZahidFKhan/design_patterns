package com.design_patterns.behavioural.strategy;

public class DebitCardPayment implements PaymentStrategy {
  @Override
  public void pay(double amount) {
    System.out.println("Processing Debit Card payment of $" + amount);
    // This would involve connecting to a bank's debit card processing system.
    if (amount > 0 && amount <= 1000) { // Debit cards often have lower daily limits
      System.out.println("Debit Card payment successful.");
    } else {
      System.out.println("Debit Card payment failed (simulated insufficient funds or limit).");
    }
  }
}
