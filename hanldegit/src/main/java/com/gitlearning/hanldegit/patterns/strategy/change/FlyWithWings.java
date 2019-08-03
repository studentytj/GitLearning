package com.gitlearning.hanldegit.patterns.strategy.change;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.err.println("I'm flying.");
    }
}
