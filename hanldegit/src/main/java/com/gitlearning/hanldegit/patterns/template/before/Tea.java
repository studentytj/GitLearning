package com.gitlearning.hanldegit.patterns.template.before;

public class Tea {
    /**
     * 沏茶的整个过程
     */
    void prepareRecipe() {
        // 1. 烧水
        boilWater();
        // 2. 浸泡茶叶（不是越狱中的T-bag哦）
        steepTeaBag();
        // 3. 把茶倒入杯子
        pourInCup();
        // 4. 加柠檬
        addLemon();
    }

    private void addLemon() {
        System.err.println("加柠檬");
    }

    private void pourInCup() {
        System.err.println("茶导入杯子里");
    }

    private void steepTeaBag() {
        System.err.println("浸泡茶叶");
    }

    private void boilWater() {
        System.err.println("将水煮沸");
    }
}
