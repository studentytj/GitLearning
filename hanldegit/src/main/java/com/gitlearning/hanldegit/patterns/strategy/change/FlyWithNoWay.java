package com.gitlearning.hanldegit.patterns.strategy.change;

public class FlyWithNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.err.println("I can't fly.");
    }
}
