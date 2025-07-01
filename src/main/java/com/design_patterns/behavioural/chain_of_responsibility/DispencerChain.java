package com.design_patterns.behavioural.chain_of_responsibility;


public interface DispencerChain {
  void setNextChain(DispencerChain nextChain);

  void dispense(long amount);
}
