package com.design_patterns.behavioural.template;

public class Football extends Game{

    @Override
    void selectPlayers() {
        System.out.println("selected 11 players");
    }

    @Override
    void selectSides() {
        System.out.println("Selected supporting side");
    }

    @Override
    void toss() {
        System.out.println("Lost the toss");
    }
}
