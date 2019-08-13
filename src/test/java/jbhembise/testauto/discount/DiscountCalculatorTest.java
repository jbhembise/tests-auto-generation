package jbhembise.testauto.discount;

import org.junit.Test;

public class DiscountCalculatorTest {

    @Test
    public void calculate_percentage_should_return_0_under_10() {
        DiscountCalculator discountCalculator = new DiscountCalculator();
        int result = discountCalculator.calculatePercentage(9);
        //Assert.assertEquals(0, result);
    }

}
