package com.gitlearning.hanldegit.patterns.adapter;

public class BlackHorse implements Horse {
    @Override
    public void run() {
        System.err.println("黑马在跑");
    }
}
