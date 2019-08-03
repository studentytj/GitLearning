package com.gitlearning.hanldegit.patterns.template.before;

public class Coffee {
    void prepareRecipe() {
        // 1. 烧水
        boilWater();
        // 2. 用沸水冲泡咖啡
        brewCoffeeGrinds();
        // 3. 把咖啡倒进杯子
        pourInCup();
        // 4. 加糖和牛奶
        addSugarAndMilk();
    }
    private void addSugarAndMilk() {
        System.err.println("加柠檬");
    }

    private void pourInCup() {
        System.err.println("茶导入杯子里");
    }

    private void brewCoffeeGrinds() {
        System.err.println("冲泡咖啡");
    }

    private void boilWater() {
        System.err.println("将水煮沸");
    }
}
