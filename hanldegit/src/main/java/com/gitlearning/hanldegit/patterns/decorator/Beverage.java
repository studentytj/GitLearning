package com.gitlearning.hanldegit.patterns.decorator;

/**
 * 相当于Component
 */
public abstract class Beverage {
    String description = "Unkown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}

class MilkTea extends Beverage {
    @Override
    public String getDescription() {
        return "奶茶";
    }

    @Override
    public double cost() {
        return 8.00;
    }
}

class RedTea extends Beverage {
    @Override
    public String getDescription() {
        return "红茶";
    }

    @Override
    public double cost() {
        return 7.00;
    }
}

class GreenTea extends Beverage {
    @Override
    public String getDescription() {
        return "绿茶";
    }

    @Override
    public double cost() {
        return 5.00;
    }
}
