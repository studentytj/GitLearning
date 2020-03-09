package com.gitlearning.hanldegit.patterns.factory.simpleFac;

import lombok.Data;

/**
 * 产品的抽象
 */
@Data
public class Pizza {
    // 调料
    String sauce;
    // pizza名字
    String name;
    // 面团
    String dough;
}


