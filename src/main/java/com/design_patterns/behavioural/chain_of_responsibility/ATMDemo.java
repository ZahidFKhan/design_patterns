package com.design_patterns.behavioural.chain_of_responsibility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ATMDemo {

  public static void main(String[] args) {

    final var atm = new ATM(getDispencerChain());
    atm.disperseMoney(10001);
  }

  private static DispencerChain getDispencerChain() {
    FiveHundrendRupeesDispencer fiveHundrendRupeesDispencer = new FiveHundrendRupeesDispencer();
    HundrendRupeesDispencer hundrendRupeesDispencer = new HundrendRupeesDispencer();
    TenRupeesDispencer tenRupeesDispencer = new TenRupeesDispencer();
    final var oneRupeeDispencer = new OneRupeesDispencer();

    fiveHundrendRupeesDispencer.setNextChain(hundrendRupeesDispencer);
    hundrendRupeesDispencer.setNextChain(tenRupeesDispencer);
    tenRupeesDispencer.setNextChain(oneRupeeDispencer);

    return fiveHundrendRupeesDispencer;
  }
}
