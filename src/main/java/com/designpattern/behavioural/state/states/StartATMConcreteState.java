package com.designpattern.behavioural.state.states;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StartATMConcreteState implements AtmStates {
  @Override
  public void withdraw(Context context, double withdraw) {

  }

  @Override
  public void deposit(Context context, double deposit) {
    final var moneyAvailable = context.getMoneyAvailable();
    if (moneyAvailable + deposit > 10_000) {
      log.error("Cannot deposit");
    }
    context.addMoney(deposit);
    context.setAtmStates(new HasMoneyATMConcreteState());
  }
}
