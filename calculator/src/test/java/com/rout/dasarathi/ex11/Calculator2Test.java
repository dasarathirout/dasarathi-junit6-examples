package com.rout.dasarathi.ex11;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calculator2Test {

  private final Calculator calculator = new Calculator();

  @Test
  @DisplayName("Addition Positive Numbers")
  void testAdditionOfTwoPositiveNumbers() {
    int numberN1 = 5;
    int numberN2 = 7;
    int expectedResult = 12;
    int actualResult = calculator.addition(numberN1, numberN2);
    assertEquals(expectedResult, actualResult);
  }

  @Test
  @DisplayName("Addition Negative Numbers")
  void testAdditionOfTwoNegativeNumbers() {
    int numberN1 = -5;
    int numberN2 = -4;
    int expectedResult = -9;
    int actualResult = calculator.addition(numberN1, numberN2);
    assertEquals(expectedResult, actualResult);
  }

}
