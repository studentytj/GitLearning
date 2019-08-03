package com.gitlearning.hanldegit.patterns.strategy.change;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.err.println("Quack.");
    }
}
