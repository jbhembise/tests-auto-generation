package jbhembise.testauto.example2;


import org.junit.Assert;
import org.junit.Test;


public class DiscountCalculatorTest {
    @Test(timeout = 10000)
    public void calculatePercentage_should_return_0_under_10_items() throws Exception {
        int o_calculatePercentage_should_return_0_under_10_items__1 = DiscountCalculator.calculatePercentage(0);
        Assert.assertEquals(0, ((int) (o_calculatePercentage_should_return_0_under_10_items__1)));
    }

    @Test(timeout = 10000)
    public void calculatePercentage_should_return_0_under_10_itemslitNum9() throws Exception {
        int o_calculatePercentage_should_return_0_under_10_itemslitNum9__1 = DiscountCalculator.calculatePercentage(Integer.MAX_VALUE);
        Assert.assertEquals(15, ((int) (o_calculatePercentage_should_return_0_under_10_itemslitNum9__1)));
    }
}

