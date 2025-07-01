package com.design_patterns.behavioural.chain_of_responsibility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ATM {
  private final DispencerChain startingDispencerChain;

  public ATM(DispencerChain startingDispencerChain) {
    this.startingDispencerChain = startingDispencerChain;
  }

  void disperseMoney(final long amount) {
    log.info("ATM STARTING PROCESSING.");
    startingDispencerChain.dispense(amount);
  }
}
