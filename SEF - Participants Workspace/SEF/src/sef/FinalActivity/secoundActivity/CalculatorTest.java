package sef.FinalActivity.secoundActivity;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {
    @Test
    public void add() {
        Assertions.assertEquals(25, Calculator.add(20 , 5));
    }

    @Test
    public void subtract() {
        Assertions.assertEquals(7 , Calculator.subtract(10 , 3));
    }

    @Test
    public void multiply() {
        Assertions.assertEquals(49, Calculator.multiply(7 , 7));
    }

    @Test
    public void divide() {
        Assertions.assertEquals(100, Calculator.divide(100 , 1));
    }

}
