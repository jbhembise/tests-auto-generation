package jbhembise.testauto.example1;


import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {
    @Test(timeout = 10000)
    public void divide_should_work() throws Exception {
        Calculator calculator = new Calculator(1000);
        Assert.assertEquals(1000, ((int) (((Calculator) (calculator)).getResult())));
        calculator.divide(10);
        Assert.assertEquals(100, ((int) (((Calculator) (calculator)).getResult())));
    }

    @Test(timeout = 10000)
    public void divide_should_work_mg4() throws Exception {
        int __DSPOT_n_2 = 156591366;
        Calculator calculator = new Calculator(1000);
        Assert.assertEquals(1000, ((int) (((Calculator) (calculator)).getResult())));
        calculator.divide(10);
        calculator.multiply(__DSPOT_n_2);
        Assert.assertEquals(-1520732584, ((int) (((Calculator) (calculator)).getResult())));
    }

    @Test(timeout = 10000)
    public void divide_should_work_mg2() throws Exception {
        Calculator calculator = new Calculator(1000);
        Assert.assertEquals(1000, ((int) (((Calculator) (calculator)).getResult())));
        calculator.divide(10);
        calculator.clear();
        Assert.assertEquals(0, ((int) (((Calculator) (calculator)).getResult())));
    }

    @Test(timeout = 10000)
    public void divide_should_work_mg1() throws Exception {
        int __DSPOT_n_0 = -1150482841;
        Calculator calculator = new Calculator(1000);
        Assert.assertEquals(1000, ((int) (((Calculator) (calculator)).getResult())));
        calculator.divide(10);
        calculator.add(__DSPOT_n_0);
        Assert.assertEquals(-1150482741, ((int) (((Calculator) (calculator)).getResult())));
    }

    @Test(timeout = 10000)
    public void divide_should_work_mg5() throws Exception {
        int __DSPOT_n_3 = 825130495;
        Calculator calculator = new Calculator(1000);
        Assert.assertEquals(1000, ((int) (((Calculator) (calculator)).getResult())));
        calculator.divide(10);
        calculator.substract(__DSPOT_n_3);
        Assert.assertEquals(-825130395, ((int) (((Calculator) (calculator)).getResult())));
    }
}

