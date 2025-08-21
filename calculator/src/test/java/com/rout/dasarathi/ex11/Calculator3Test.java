package com.rout.dasarathi.ex11;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("UNIT")
@Tag("QUICK")
public class Calculator3Test {
    @Test
    @DisplayName("Calculator.AdditionTest-QUICK")
    void additionTestFast(TestInfo testInfo) {
        Calculator calculator = new Calculator();

        assertEquals(5,
                calculator.addition(2, 3),
                "2+3 Should Equal 5");

        assertEquals("Calculator.AdditionTest-QUICK",
                testInfo.getDisplayName(),
                "Calculator.AdditionTest-QUICK");
        assertEquals("[UNIT, QUICK]",
                testInfo.getTags().toString(),
                "TEST TAGS");
        assertEquals("class com.rout.dasarathi.ex11.Calculator3Test",
                testInfo.getTestClass().get().toString(),
                "Class : com.rout.dasarathi.ex11.Calculator3Test");
        assertEquals("void com.rout.dasarathi.ex11.Calculator3Test.additionTestFast(org.junit.jupiter.api.TestInfo)",
                testInfo.getTestMethod().get().toString(),
                "Method: void com.rout.dasarathi.ex11.Calculator3Test.additionTestFast(org.junit.jupiter.api.TestInfo)");
    }
}
