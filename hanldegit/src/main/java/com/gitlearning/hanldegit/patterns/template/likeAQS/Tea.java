package com.gitlearning.hanldegit.patterns.template.likeAQS;

public class Tea implements Drinkable {
    Sync sync = new Sync();

    @Override
    public void getOneCupOfDrink() {
        sync.prepareRecipe();
    }

    class Sync extends CaffeineBeverage {
        @Override
        protected void addCondiments() {
            System.err.println("加柠檬");
        }

        @Override
        protected void brew() {
            System.err.println("浸泡茶叶");
        }
    }
}
