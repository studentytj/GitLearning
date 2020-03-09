package com.gitlearning.hanldegit.patterns.adapter;

public class WhiteDeer implements Deer {
    @Override
    public void walk() {
        System.err.println("silence walk.");
    }
}
