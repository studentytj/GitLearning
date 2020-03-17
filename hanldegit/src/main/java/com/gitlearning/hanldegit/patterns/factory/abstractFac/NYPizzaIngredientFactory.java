package com.gitlearning.hanldegit.patterns.factory.abstractFac;

import com.gitlearning.hanldegit.patterns.factory.abstractFac.po.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new NYDough();
    }

    @Override
    public Sauce createSauce() {
        return new NYSauce();
    }

    @Override
    public Cheese createCheese() {
        return new NYCheese();
    }

    @Override
    public Clam createClam() {
        return new NYClam();
    }

}
