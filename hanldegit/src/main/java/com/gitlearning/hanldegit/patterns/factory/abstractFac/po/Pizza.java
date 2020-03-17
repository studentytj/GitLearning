package com.gitlearning.hanldegit.patterns.factory.abstractFac.po;

import lombok.Data;

/**
 * 这里的Pizza具象化了些，不同地方用到的面团和调料可能不一样
 */
@Data
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Clam clam;

    /**
     * 由于引入了原料，因此加上了准备的过程
     */
    public abstract void prepare();
}
