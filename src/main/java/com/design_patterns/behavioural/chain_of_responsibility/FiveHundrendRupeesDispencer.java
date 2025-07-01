package com.design_patterns.behavioural.chain_of_responsibility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FiveHundrendRupeesDispencer implements DispencerChain {
  private DispencerChain dispencerChain;

  @Override
  public void setNextChain(DispencerChain nextChain) {
    dispencerChain = nextChain;
  }

  @Override
  public void dispense(long amount) {
    var notes = amount / 500;
    var remaining = amount % 500;

    log.info("Dispercing {} notes of 500.", notes);

    dispencerChain.dispense(remaining);
  }
}
