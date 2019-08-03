package com.gitlearning.hanldegit.patterns.template.after;

public class Coffee extends CaffeineBeverage {
    @Override
    protected void addCondiments() {
        System.err.println("加奶和糖");
    }

    @Override
    protected void brew() {
        System.err.println("冲泡咖啡");
    }
}
