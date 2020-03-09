package com.gitlearning.hanldegit.patterns.prototype;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//@Data
@Getter
@Setter
@ToString
public class ShallowClone implements Cloneable {
    private List<String> list = new ArrayList<>();
    private List<String> val = new ArrayList<>();
    @Override
    protected ShallowClone clone() throws CloneNotSupportedException {
        return (ShallowClone) super.clone();
    }

    public void setValue(String value) {
        val.add(value);
    }

    public List<String> getValue() {
        return val;
    }
}


class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShallowClone shallowClone = new ShallowClone();
        shallowClone.setList(Collections.singletonList("a"));
        shallowClone.setValue("张三");
        ShallowClone clone = shallowClone.clone();
        clone.setList(Collections.singletonList("b"));
        clone.setValue("李四");
        System.out.println(shallowClone);
        System.out.println(clone);

        DeepClone deepClone = new DeepClone();
        deepClone.setValue("zhangsan");
        DeepClone clone1 = deepClone.clone();
        clone1.setValue("lisi");
        System.out.printf(deepClone.getValue().toString());

    }
}

 class DeepClone implements Cloneable {
    private List<String> val = new ArrayList<>();
    @Override
    protected DeepClone clone() throws CloneNotSupportedException {
        DeepClone clone = (DeepClone) super.clone();
        clone.val = (List<String>) ((ArrayList) this.val).clone();
        return clone;
    }

    public void setValue(String value) {
        val.add(value);
    }

    public List<String> getValue() {
        return val;
    }
}