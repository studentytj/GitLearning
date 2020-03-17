package com.gitlearning.hanldegit.patterns.state;


public interface State {
    void meaningOfLife(PersonContext personContext);
}

class Born implements State {

    @Override
    public void meaningOfLife(PersonContext personContext) {
        if (personContext.getAge() == 0) {

            System.out.println("Cry...");
        } else {
            personContext.setState(new Thirty());
        }
    }
}

class Thirty implements State {

    @Override
    public void meaningOfLife(PersonContext personContext) {
        if (personContext.getAge() <= 30) {

            System.out.println("三十而立");
        } else {
            personContext.setState(new Fourty());
        }
    }
}


class Fourty implements State {

    @Override
    public void meaningOfLife(PersonContext personContext) {
        if (personContext.getAge() <= 40) {
            System.out.println("四十而不惑");
        } else {
            personContext.setState(new Fifty());
        }
    }
}


class Fifty implements  State {

    @Override
    public void meaningOfLife(PersonContext personContext) {
        if (personContext.getAge() <= 50) {
            System.out.println("五十而知天命");
        } else {
            personContext.setState(new Hit());
        }
    }
}

class Hit implements State {

    @Override
    public void meaningOfLife(PersonContext personContext) {
        System.out.println("处世若大梦，胡为劳其生");
    }
}