package com.designpattern.behavioural.state.states;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NoMoneyATMConcreteState implements AtmStates {
  @Override
  public void withdraw(Context context, double withdraw) {
    log.error("Cannot withdraw money as no money.");
  }

  @Override
  public void deposit(Context context, double deposit) {
    if (deposit + context.getMoneyAvailable() > 10_000) {
      log.error("Cannot add more money.");
      return;
    }
    context.addMoney(deposit);
    context.setAtmStates(new HasMoneyATMConcreteState());
  }


}
