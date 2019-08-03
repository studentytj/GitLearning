package com.gitlearning.hanldegit.patterns.template.likeAQS;

import org.junit.jupiter.api.Test;

public class TemplateTest {
    @Test
    void test() {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();
        coffee.getOneCupOfDrink();
        tea.getOneCupOfDrink();
    }
}
