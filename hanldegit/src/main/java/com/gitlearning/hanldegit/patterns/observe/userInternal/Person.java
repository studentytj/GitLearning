package com.gitlearning.hanldegit.patterns.observe.userInternal;

import java.util.Observable;
import java.util.Observer;

public class Person implements Observer {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.err.println(name + "收到了最新消息： " + arg);
    }
}
