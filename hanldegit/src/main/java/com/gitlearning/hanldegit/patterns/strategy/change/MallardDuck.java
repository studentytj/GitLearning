package com.gitlearning.hanldegit.patterns.strategy.change;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.err.println("I'm a  real Mallard Duck.");
    }
}
