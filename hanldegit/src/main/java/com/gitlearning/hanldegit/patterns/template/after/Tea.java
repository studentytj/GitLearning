package com.gitlearning.hanldegit.patterns.template.after;

public class Tea extends CaffeineBeverage {
    @Override
    protected void addCondiments() {
        System.err.println("加柠檬");
    }

    @Override
    protected void brew() {
        System.err.println("浸泡茶叶");
    }
}
