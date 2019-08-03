package com.gitlearning.hanldegit.patterns.template.after;

import org.junit.jupiter.api.Test;

public class TemplateTest {
    @Test
    void test() {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();
        coffee.prepareRecipe();
        tea.prepareRecipe();
    }
}
