package com.designpattern.behavioural.state.states;

public interface AtmStates {
  void withdraw(Context context, double withdraw);

  void deposit(Context context, double deposit);
}
