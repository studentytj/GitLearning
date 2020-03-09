package com.gitlearning.hanldegit.patterns.observe.userInternal;

import java.util.Observable;

public class HouseSite extends Observable {
    void publishEvent(String message) {
        setChanged();
        notifyObservers(message);
    }
}
