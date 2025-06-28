package com.design_patterns.behavioural.template;

public class Chess extends Game {

  @Override
  void selectPlayers() {
    System.out.println("selected 2 players");
  }

  @Override
  void selectSides() {
    System.out.println("Selected black side");
  }

  @Override
  void toss() {
    System.out.println("Lost the toss");
  }
}
