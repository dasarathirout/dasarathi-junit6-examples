package com.rout.dasarathi.ex11;

import io.qameta.allure.internal.shadowed.jackson.annotation.JsonIgnore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calculator1Test {

  @Test
  public void additionTest() {
    Calculator calculator = new Calculator();
    assertEquals(5, calculator.addition(2, 3), "addition(2,3) should result 5");
  }

    @Test
    public void failedCaseTest() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.addition(1, 1), "addition(1,1) should not result 0");
    }

    @Test
    public void errorCaseTest() {
      throw new RuntimeException();
    }

    @Disabled
    public void disabledTestCase() {
        throw new RuntimeException();
    }
}
