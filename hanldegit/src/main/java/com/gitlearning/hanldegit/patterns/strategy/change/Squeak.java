package com.gitlearning.hanldegit.patterns.strategy.change;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.err.println("吱吱叫.");
    }
}
