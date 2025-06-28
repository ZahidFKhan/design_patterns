package com.design_patterns.behavioural.memento;

class Main {
  public static void main(String[] args) {
    CareTaker careTaker = new CareTaker();
    Originator originator = new Originator();

    originator.addText("State1");
    originator.addText("State2");
    careTaker.save(originator.save());
    originator.addText("State3");
    careTaker.save(originator.save());
    originator.addText("State4");
    originator.restore(careTaker.restore());
    originator.restore(careTaker.restore());
  }
}
