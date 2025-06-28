package com.design_patterns.behavioural.strategy;

public class CreditCardPayment implements PaymentStrategy {
  @Override
  public void pay(double amount) {

    System.out.println("Processing Credit Card payment of $" + amount);
    // In a real application, this would involve calling a payment gateway API
    // and validating card details.
    if (amount > 0 && amount <= 5000) { // Simulate limits or success conditions
      System.out.println("Credit Card payment successful." + ".");
    } else {
      System.out.println("Credit Card payment failed (simulated issue or limit exceeded).");
    }
  }
}
