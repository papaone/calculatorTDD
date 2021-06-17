package com.example.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorApplicationTests {

    Calculator calculator = new Calculator();

    @Test
    void testSum() {
        double value1 = 1.5;
        double value2 = 2.0;
        double result = 3.5;

        assert calculator.sum(value1, value2).equals(result);
    }

    @Test
    void testSubtract() {
        double value1 = 1.5;
        double value2 = 2.0;
        double result = -0.5;

        assert calculator.subtract(value1, value2).equals(result);
    }

    @Test
    void testMultiply() {
        double value1 = 1.5;
        double value2 = 2.0;
        double result = 3.0;

        assert calculator.multiply(value1, value2).equals(result);
    }

    @Test
    void testDivision() {
        double value1 = 1.5;
        double value2 = 2.0;
        double result = 0.75;

        assert calculator.division(value1, value2).equals(result);
    }

    @Test
    void testDivisionThreeValues() {
        double value1 = 1.5;
        double value2 = 2.0;
        double value3 = 3.75;
        double result = 0.2;

        assert calculator.division(value1, value2, value3).equals(result);
    }
}