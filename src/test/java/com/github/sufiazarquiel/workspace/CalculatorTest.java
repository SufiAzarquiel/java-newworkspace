package com.github.sufiazarquiel.workspace;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit-level testing for {@link Calculator} object.
 */
public class CalculatorTest {
    
    @Test
    public void calculatorInitialValueZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.getValue());
    }

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        calculator.add(3);
        assertEquals(3, calculator.getValue());
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        calculator.subtract(4);
        calculator.add(10);
        assertEquals(6, calculator.getValue());
    }

    @Test
    public void testResetValue() {
        Calculator calculator = new Calculator();
        calculator.subtract(4);
        calculator.resetValue();
        assertEquals(0, calculator.getValue());
    }
}
