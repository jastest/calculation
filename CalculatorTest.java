package com.leszko.calculator;
import org.junit.test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
      private Calculator calculator = new
Calculator();

     @Test
     public void testSum() {
          assertEquals(5, calculator.sum(2,3));
          }
}


     
