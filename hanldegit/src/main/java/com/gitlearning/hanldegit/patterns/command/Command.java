package com.gitlearning.hanldegit.patterns.command;

/**
 * Command接口
 */
public interface Command {
    void execute();
}

/**
 * ConcreteCommand对象
 */
class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}


/**
 * 灯(请求的接收者Receiver)
 */
class Light {
    void on() {
        System.err.println("light is on");
    }

    void off(){
        System.out.printf("light is off");
    }
}
