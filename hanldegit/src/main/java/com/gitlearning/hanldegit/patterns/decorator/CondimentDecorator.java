package com.gitlearning.hanldegit.patterns.decorator;

public abstract class CondimentDecorator extends Beverage {
    @Override
    public abstract String getDescription();


}

class RedBean extends CondimentDecorator {

    Beverage beverage;

    public RedBean(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "添加红豆";
    }

    @Override
    public double cost() {
        return beverage.cost() + 3.00;
    }
}

class Pudding extends CondimentDecorator {
    Beverage beverage;

    public Pudding(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "添加布丁";
    }

    @Override
    public double cost() {
        return beverage.cost() + 5.00;
    }
}

class Boba extends CondimentDecorator {
    Beverage beverage;

    public Boba(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "添加波霸";
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.00;
    }
}