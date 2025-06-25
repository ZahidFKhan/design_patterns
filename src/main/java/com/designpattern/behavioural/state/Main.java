package com.designpattern.behavioural.state;

import com.designpattern.behavioural.state.states.Context;

public class Main {
    public static void main(String[] args){
        Context context = new Context();
        context.withdraw(100);
    }
}
