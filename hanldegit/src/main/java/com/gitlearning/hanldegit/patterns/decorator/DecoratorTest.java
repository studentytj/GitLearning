package com.gitlearning.hanldegit.patterns.decorator;

import org.junit.jupiter.api.Test;

public class DecoratorTest {
    @Test
    void test() {
        // 来一杯加波霸和布丁的奶茶
        Beverage milkTea = new MilkTea();
        milkTea = new Pudding(milkTea);
        milkTea = new Boba(milkTea);
        System.err.println(milkTea.getDescription() + "￥"+ milkTea.cost());

        // 来一杯加红豆的绿茶
        Beverage greenTea = new GreenTea();
        greenTea = new RedBean(greenTea);
        System.err.println(greenTea.getDescription() + "￥"+ greenTea.cost());

        // 来一杯加红豆、布丁、波霸的红茶
        Beverage redTea = new RedTea();
        redTea = new Pudding(redTea);
        redTea = new Boba(redTea);
        redTea = new RedBean(redTea);
        System.err.println(redTea.getDescription() + "￥"+ redTea.cost());
    }
}
