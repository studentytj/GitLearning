package com.gitlearning.hanldegit.patterns.adapter;

import org.junit.jupiter.api.Test;

public class AdapterTest {
    @Test
    void test() {
        Deer deer = new WhiteDeer();
        Horse blackHorse = new BlackHorse();
        DeerAdapter deerAdapter = new DeerAdapter(deer);
        System.err.println(deer instanceof Deer);
        System.err.println(blackHorse instanceof Horse);
        System.err.println("白鹿是马吗？" + (deer instanceof Horse));
        System.err.println("适配器是马吗？" + (deerAdapter instanceof Horse));
    }
}
