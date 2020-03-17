package com.gitlearning.hanldegit.patterns.state;

import lombok.Data;

@Data
public class PersonContext {
    // 人生状态
    State state;
    int age;

    public void feeling() {
        state.meaningOfLife(this);
    }

    public void setAge(int age) {
        this.age = age;
        // 这里纯粹是为了改变一下状态
        feeling();
    }

    public PersonContext() {
        state = new Born();
    }
}


class Test {
    public static void main(String[] args) {
        PersonContext personContext = new PersonContext();
        personContext.feeling();
        personContext.setAge(30);
        personContext.feeling();
        personContext.setAge(40);
        personContext.feeling();
        personContext.setAge(50);
        personContext.feeling();
        personContext.setAge(60);
        personContext.feeling();
    }
}
