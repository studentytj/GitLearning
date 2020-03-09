package com.gitlearning.hanldegit.patterns.factory.simpleFac;

public class SimplePizzaFactory {
    Pizza createPizza(String type){
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NewYorkCheesePizza();
        } else if (type.equals("clam")) {
            pizza = new NewYorkClamPizza();
        }
        return pizza;
    }
}
