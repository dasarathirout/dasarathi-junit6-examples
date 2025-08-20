package com.rout.dasarathi.ex11;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calculator4Test
{
    @Test
    @Disabled
    @DisplayName("CalculatorDisabledTest")
    void calculatorDisabledTest() {
        Calculator calculator = new Calculator();
        assertEquals(3,
                calculator.addition(1,2),
                "#Disabled Result Should Be 3");
    }

    @Test
    @Tag("UNIT")
    @Tag("SLOW")
    void calculatorSlowTest() throws InterruptedException {
        Thread.sleep(1000);
        Calculator calculator = new Calculator();
        assertEquals(0,calculator.addition(0,0));
    }
}
