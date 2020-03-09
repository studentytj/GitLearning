package com.gitlearning.hanldegit.patterns.bridge;

public abstract class Corp {
    Product product;

    public Corp(Product product) {
        this.product = product;
    }

    abstract void makeMoney();
}

class FakeCorp extends Corp {

    public FakeCorp(Product product) {
        super(product);
    }

    @Override
    void makeMoney() {
        product.beProduced();
        product.beSelled();
    }
}

interface Product {
    void beProduced();
    void beSelled();
}

class IPod implements Product {

    @Override
    public void beProduced() {
        System.err.println("produce : ipod" );
    }

    @Override
    public void beSelled() {
        System.err.println("sell: ipod");
    }
}

class Toy implements Product {

    @Override
    public void beProduced() {
        System.err.println("produce : toy" );
    }

    @Override
    public void beSelled() {
        System.err.println("sell : toy" );
    }
}


class Test {
    public static void main(String[] args) {
        FakeCorp fakeCorp = new FakeCorp(new IPod());
        fakeCorp.makeMoney();

        fakeCorp = new FakeCorp(new Toy());
        fakeCorp.makeMoney();
    }
}