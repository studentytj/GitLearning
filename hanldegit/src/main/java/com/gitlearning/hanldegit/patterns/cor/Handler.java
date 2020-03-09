package com.gitlearning.hanldegit.patterns.cor;

import lombok.Setter;

@Setter
public abstract class Handler {
    String name;
    Handler nextHandler;

    abstract void handleRequest(int leaveDays);

    public Handler(String name) {
        this.name = name;
    }
}

class HandlerA extends Handler {
    public HandlerA(String name) {
        super(name);
    }

    @Override
    void handleRequest(int leaveDays) {
        if (leaveDays <= 3) {
            System.err.println(String.format("%s批准了你的请假天数： %s天", name, leaveDays));
        } else {
            nextHandler.handleRequest(leaveDays);
        }
    }
}

class HandlerB extends Handler {

    public HandlerB(String name) {
        super(name);
    }

    @Override
    void handleRequest(int leaveDays) {
        if (leaveDays <= 7) {
            System.err.println(String.format("%s批准了你的请假天数： %s天", name, leaveDays));
        } else {
            nextHandler.handleRequest(leaveDays);
        }
    }
}

class HandlerC extends Handler {

    public HandlerC(String name) {
        super(name);
    }

    @Override
    void handleRequest(int leaveDays) {

        System.err.println(String.format("%s批准了你的请假天数： %s天", name, leaveDays));
    }
}

class Test {
    public static void main(String[] args) {
        HandlerA handlerA = new HandlerA("技术leader");
        HandlerB handlerB = new HandlerB("部门经理");
        HandlerC handlerC = new HandlerC("CTO");
        handlerA.setNextHandler(handlerB);
        handlerB.setNextHandler(handlerC);

        handlerA.handleRequest(1);
        handlerA.handleRequest(5);
        handlerA.handleRequest(8);

    }
}
