/**
 * 
 */
package Week5Session5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * JUnit test methods to cover basic scenarios like adding 
 * positive/negative numbers and subtracting positive/negative numbers. 
 * Using assertions to ensure that
 * the calculator functions correctly.
 */
 


public class CalculatorTest {

    @Test
    public void testAdditionWithPositiveNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    public void testAdditionWithNegativeNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.add(-5, -3);
        assertEquals(-8, result);
    }

    @Test
    public void testSubtractionWithPositiveNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(10, 3);
        assertEquals(7, result);
    }

    @Test
    public void testSubtractionWithNegativeNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(-10, -3);
        assertEquals(-7, result);
    }
}