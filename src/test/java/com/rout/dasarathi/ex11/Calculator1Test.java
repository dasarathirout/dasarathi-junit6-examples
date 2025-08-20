package com.rout.dasarathi.ex11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calculator1Test {

  @Test
  public void additionTest() {
    Calculator calculator = new Calculator();
    assertEquals(5, calculator.addition(2, 3), "addition(2,3) should result 5");
  }
}
