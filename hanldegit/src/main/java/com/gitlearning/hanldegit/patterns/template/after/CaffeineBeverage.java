package com.gitlearning.hanldegit.patterns.template.after;

// 咖啡因饮料
public abstract class CaffeineBeverage {
    void prepareRecipe() {
        // 1. 烧水
        boilWater();
        // 2. 冲泡
        brew();
        // 3. 倒进杯子
        pourInCup();
        // 4. 加料
        addCondiments();
    }

    protected abstract void addCondiments() ;

    private void pourInCup() {
        System.err.println("茶倒入杯子里");
    }

    protected abstract void brew() ;

    private void boilWater() {
        System.err.println("将水煮沸");
    }
}
