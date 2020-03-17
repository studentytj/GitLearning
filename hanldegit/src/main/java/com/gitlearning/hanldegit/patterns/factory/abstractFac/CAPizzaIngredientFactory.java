package com.gitlearning.hanldegit.patterns.factory.abstractFac;

import com.gitlearning.hanldegit.patterns.factory.abstractFac.po.*;

public class CAPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new CADough();
    }

    @Override
    public Sauce createSauce() {
        return new CASauce();
    }

    @Override
    public Cheese createCheese() {
        return new CACheese();
    }

    @Override
    public Clam createClam() {
        return new CAClam();
    }

}
