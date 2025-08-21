package com.rout.dasarathi.ex11;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("REGRESSION")
public class Calculator5Test {
    @Tag("INTEGRATION")
    @ParameterizedTest(name = "Calculator.addition( {0} + {1} ) = {2}")
    @CsvSource({
            "1, 2, 3",
            "25, -25, 0",
            "-5, -7, -12",
            "90, -40, 50"})
    void testAdditionFromSources(int firstNumber, int secondNumber, int expectedResult) {
        Calculator calculator = new Calculator();
        assertEquals(
                expectedResult,
                calculator.addition(firstNumber, secondNumber),
                () -> {
                    String resultMessage =
                            firstNumber + " + " + secondNumber + " Should Equal " + expectedResult;
                    System.out.println("Test Addition From Sources : " + resultMessage);
                    return resultMessage;
                });
    }
}
