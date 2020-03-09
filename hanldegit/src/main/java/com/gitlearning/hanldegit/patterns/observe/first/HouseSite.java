package com.gitlearning.hanldegit.patterns.observe.first;

import java.util.ArrayList;
import java.util.List;

/**
 * 房子站点
 */
public class HouseSite implements Subject{

    private List<Subscriber> observers;

    public HouseSite() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Subscriber subscriber) {
        observers.add(subscriber);
    }

    @Override
    public void removeObserver(Subscriber subscriber) {
        observers.remove(subscriber);
    }

    @Override
    public void publishMessage(String message) {
        observers.forEach(observer -> observer.updateMessage(message));
    }

}

interface Subject {
    void registerObserver(Subscriber subscriber);
    void removeObserver(Subscriber subscriber);
    void publishMessage(String message);
}
