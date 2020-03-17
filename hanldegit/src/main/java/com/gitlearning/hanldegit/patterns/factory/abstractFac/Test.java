package com.gitlearning.hanldegit.patterns.factory.abstractFac;

import com.gitlearning.hanldegit.patterns.factory.abstractFac.po.Pizza;
import lombok.extern.slf4j.Slf4j;

public class Test {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza nyCheesePizza = pizzaStore.orderPizza("cheese");
        PizzaStore caPizzaStore = new CAPizzaStore();
        Pizza caPizzaStorePizza = caPizzaStore.orderPizza("clam");
        System.out.println(nyCheesePizza);
        System.out.println(caPizzaStorePizza);
        new A().test();
    }
}

@Slf4j
class A {
    void test() {
      log.error("fdafad : {}", "ytj");
    }
}
