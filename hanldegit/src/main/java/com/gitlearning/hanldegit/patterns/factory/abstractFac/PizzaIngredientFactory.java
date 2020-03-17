package com.gitlearning.hanldegit.patterns.factory.abstractFac;

import com.gitlearning.hanldegit.patterns.factory.abstractFac.po.*;

/**
 * Pizza原料工厂
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Clam createClam();
}
