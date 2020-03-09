package com.gitlearning.hanldegit.patterns.observe.first;

import org.junit.jupiter.api.Test;

public class TestObserver {
    @Test
    void test() {
        Subject houseSite = new HouseSite();
        Person zhangsan = new Person("张三");
        Person lisi = new Person("李四");
        houseSite.registerObserver(zhangsan);
        houseSite.registerObserver(lisi);
        houseSite.publishMessage("今日涨价房源100套，降价房源888套。");

        houseSite.removeObserver(lisi);
        houseSite.publishMessage("今日有事，网站暂停更新");
    }
}
