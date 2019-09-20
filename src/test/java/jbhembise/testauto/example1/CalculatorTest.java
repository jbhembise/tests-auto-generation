package jbhembise.testauto.example1;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void divide_should_work() {
        Calculator calculator = new Calculator();
        calculator.divide(10);
    }

}
