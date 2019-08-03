package com.gitlearning.hanldegit.patterns.template.likeAQS;

public class Coffee implements Drinkable {
    Sync sync = new Sync();

    @Override
    public void getOneCupOfDrink() {
        sync.prepareRecipe();
    }

    class Sync extends CaffeineBeverage {
        @Override
        protected void addCondiments() {
            System.err.println("加奶和糖");
        }

        @Override
        protected void brew() {
            System.err.println("冲泡咖啡");
        }

        @Override
        public void beforeExecute() {
            System.err.println("客官，您的咖啡正在准备中。");
        }

        @Override
        public void afterExecute() {
            System.err.println("您的咖啡已制作完成....");
        }
    }
}
