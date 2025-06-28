package com.design_patterns.behavioural.state;

import com.design_patterns.behavioural.state.states.Context;

public class Main {
    public static void main(String[] args){
        Context context = new Context();
        context.withdraw(100);
    }
}
