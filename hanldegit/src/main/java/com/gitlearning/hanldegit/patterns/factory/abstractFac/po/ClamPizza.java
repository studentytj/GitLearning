package com.gitlearning.hanldegit.patterns.factory.abstractFac.po;

import com.gitlearning.hanldegit.patterns.factory.abstractFac.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        clam = pizzaIngredientFactory.createClam();
    }
}
