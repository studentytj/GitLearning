package com.gitlearning.hanldegit.patterns.factory.fac;

import com.gitlearning.hanldegit.patterns.factory.simpleFac.*;

/**
 * 相当于工厂UML中的Creator，里面定义一个抽象的工厂方法
 * 这里相比书中的例子更简单一些，不考虑pizza是如何下单，制作等过程，因此只定义了一个createPizza的方法
 */
public abstract class PizzaStore {

    /**
     * 工厂方法， 如何创建由子类确定
     * @param type
     * @return 产品的抽象类Pizza
     */
    abstract Pizza createPizza(String type) ;
}


class NYStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NewYorkCheesePizza();
        } else if (type.equals("clam")) {
            pizza = new NewYorkClamPizza();
        }
        return pizza;
    }
}

class CAStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CaliforniaCheesePizza();
        } else if (type.equals("clam")) {
            pizza = new CaliforniaClamPizza();
        }
        return pizza;
    }
}