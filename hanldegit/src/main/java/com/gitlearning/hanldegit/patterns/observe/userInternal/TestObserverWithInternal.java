package com.gitlearning.hanldegit.patterns.observe.userInternal;

import org.junit.jupiter.api.Test;

import java.util.Observer;

public class TestObserverWithInternal {
    @Test
    void test() {
        HouseSite site = new HouseSite();
        Observer zhangsan = new Person("张三");
        Observer lisi = new Person("李四");
        site.addObserver(zhangsan);
        site.addObserver(lisi);
        site.publishEvent("今日最新消息， 首套房利率上浮25%");

        site.deleteObserver(zhangsan);
        site.publishEvent("离岸人民币汇率破7！");
    }
}
