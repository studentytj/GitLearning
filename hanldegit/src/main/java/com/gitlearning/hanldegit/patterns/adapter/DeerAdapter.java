package com.gitlearning.hanldegit.patterns.adapter;

public class DeerAdapter implements Horse {
    Deer deer;

    public DeerAdapter(Deer deer) {
        this.deer = deer;
    }

    @Override
    public void run() {
        deer.walk();
    }
}
