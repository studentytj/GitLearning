package com.gitlearning.hanldegit.patterns.factory.fac;

import com.gitlearning.hanldegit.patterns.factory.simpleFac.Pizza;

public class Test {
    public static void main(String[] args) {
        PizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        Pizza newYorkPizza = nyStylePizzaStore.createPizza("cheese");
        PizzaStore caStylePizzaStore = new CAStylePizzaStore();
        Pizza clam = caStylePizzaStore.createPizza("clam");

        System.out.println(newYorkPizza);
        System.out.println(clam);
    }
}
