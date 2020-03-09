package com.gitlearning.hanldegit.patterns.builder;


class Director {
    AbstractBuilder builder;

    public Director(AbstractBuilder builder) {
        this.builder = builder;
    }

    Role generateRole() {
        return builder.build();
    }
}


public class Role {
    String top;
    String mid;
    String bottom;

    @Override
    public String toString() {
        return top + "\n" + mid + "\n" + bottom;
    }
}

interface AbstractBuilder {
    void buildTop();

    void buildMid();

    void buildBottom();

    Role build();
}

class MonkeyBuilder implements AbstractBuilder {
    Role role = new Role();

    @Override
    public void buildTop() {
        role.top = "top:" + "monkey";
    }

    @Override
    public void buildMid() {
        role.mid = ("mid:" + "monkey");
    }

    @Override
    public void buildBottom() {
        role.bottom = ("bottom:" + "monkey");
    }

    @Override
    public Role build() {
        buildTop();
        buildMid();
        buildBottom();
        return role;
    }
}

class PigBuilder implements AbstractBuilder {
    Role role = new Role();
    @Override
    public void buildTop() {
        role.top = ("top:" + "pig");
    }

    @Override
    public void buildMid() {
        role.mid = ("mid:" + "pig");
    }

    @Override
    public void buildBottom() {
        role.bottom = ("bottom:" + "pig");
    }

    @Override
    public Role build() {
        buildTop();
        buildMid();
        buildBottom();
        return role;
    }
}

class Test {
    public static void main(String[] args) {
        Director monkeyDirector = new Director(new MonkeyBuilder());
        Role role = monkeyDirector.generateRole();
        System.err.println(role);
    }
}