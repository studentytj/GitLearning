package com.gitlearning.hanldegit.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {
    void doSomething() {

    }
}


class Composite extends Component {
    private List<Component> componentList = new ArrayList<>();

    public void add(Component component) {
        componentList.add(component);
    }

    public void remove(Component component) {
        componentList.remove(component);
    }

    public List<Component> getChildren() {
        return componentList;
    }
}

class Leaf extends Component {
    @Override
    void doSomething() {

    }
}

class Client {
    public static void main(String[] args) {
        Composite root = new Composite();

    }
}