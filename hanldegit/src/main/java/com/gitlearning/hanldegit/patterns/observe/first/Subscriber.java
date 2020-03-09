package com.gitlearning.hanldegit.patterns.observe.first;

public interface Subscriber {

    void updateMessage(String message);
}

class Person implements Subscriber{
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void updateMessage(String message) {
        System.err.println(name + "收到了最新消息: " + message);
    }
}

