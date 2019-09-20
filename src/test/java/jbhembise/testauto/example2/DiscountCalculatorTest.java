package jbhembise.testauto.example2;

import org.junit.Test;

public class DiscountCalculatorTest {

    @Test
    public void calculatePercentage_should_return_0_under_10_items() {
        DiscountCalculator.calculatePercentage(0);
    }

}
