package com.gitlearning.hanldegit.patterns.factory.abstractFac.po;

import com.gitlearning.hanldegit.patterns.factory.abstractFac.PizzaIngredientFactory;

/**
 * 这里的CheesePizza不再需要区分是NewYork还是California了，通过组成原料的属地就可以区分了
 */
public class CheesePizza extends Pizza{
    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        // NY 和
        cheese = pizzaIngredientFactory.createCheese();
    }
}
