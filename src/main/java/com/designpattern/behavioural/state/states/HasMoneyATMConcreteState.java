package com.designpattern.behavioural.state.states;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HasMoneyATMConcreteState implements AtmStates {
  @Override
  public void withdraw(Context context, double withdraw) {
    final var moneyAvailable = context.getMoneyAvailable();
    if (moneyAvailable > withdraw) {
      context.withdrawMoney(withdraw);
    } else if (moneyAvailable == 0) {
      context.setAtmStates(new HasMoneyATMConcreteState());
    } else {
      log.error("Insufficient funds.");
      context.setAtmStates(new NoMoneyATMConcreteState());
    }
  }

  @Override
  public void deposit(Context context, double deposit) {
    final var moneyAvailable = context.getMoneyAvailable();
    if (moneyAvailable + deposit > 10_000) {
      log.error("Cannot deposit, already full.");
    }
    context.addMoney(deposit);
  }
}
