package com.design_patterns.behavioural.template;

public abstract class Game {
    public void play(){
        selectPlayers();
        selectSides();
        toss();
    }
    abstract void selectPlayers();
    abstract void selectSides();
    abstract void toss();
}
