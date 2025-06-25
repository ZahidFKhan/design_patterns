package com.designpattern.behavioural.state.states;

public class Context {
  private double moneyAvailable = 0;
  private AtmStates atmStates = new StartATMConcreteState();

  void deposit(double money) {
    atmStates.deposit(this, money);
  }

  public void withdraw(double money) {
    atmStates.withdraw(this, money);
  }

  public double balance() {
    return moneyAvailable;
  }

  void addMoney(double money) {
    this.moneyAvailable += money;
  }

  void withdrawMoney(double money) {
    this.moneyAvailable -= money;
  }

  void setAtmStates(AtmStates atmStates) {
    this.atmStates = atmStates;
  }

  double getMoneyAvailable() {
    return this.moneyAvailable;
  }
}
