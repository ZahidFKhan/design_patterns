package com.design_patterns.behavioural.strategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PaymentStrategyTest {
  @Test
  void strategyTest() {
    PaymentStrategy paymentStrategy = new CreditCardPayment();
    final var shoppingCart = new ShoppingCart();
    final var success = shoppingCart.checkout(1200, paymentStrategy);
    Assertions.assertTrue(success);
  }
}
