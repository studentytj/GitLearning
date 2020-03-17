package com.gitlearning.hanldegit.patterns.factory.abstractFac;

import com.gitlearning.hanldegit.patterns.factory.abstractFac.po.CheesePizza;
import com.gitlearning.hanldegit.patterns.factory.abstractFac.po.ClamPizza;
import com.gitlearning.hanldegit.patterns.factory.abstractFac.po.Pizza;

public abstract class PizzaStore {
    Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        return pizza;
    }

    /**
     * 工厂方法， 如何创建由子类确定
     * @param type
     * @return 产品的抽象类Pizza
     */
    abstract Pizza createPizza(String type) ;
}

 class CAPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory integradientFactory = new CAPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(integradientFactory);
            pizza.setName("CA cheese pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(integradientFactory);
            pizza.setName("CA Clam pizza");
        }
        return pizza;
    }
}

class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory integradientFactory = new NYPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(integradientFactory);
            pizza.setName("NY cheese pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(integradientFactory);
            pizza.setName("NY Clam pizza");
        }
        return pizza;
    }
}