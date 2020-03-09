package com.gitlearning.hanldegit.patterns.prototype;

public class ProtoypeClass implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        ProtoypeClass protoypeClass = null;
        protoypeClass = (ProtoypeClass) super.clone();
        return protoypeClass;
    }
}
