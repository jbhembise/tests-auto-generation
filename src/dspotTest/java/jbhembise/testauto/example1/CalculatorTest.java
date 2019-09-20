package jbhembise.testauto.example1;


import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {
    @Test(timeout = 10000)
    public void divide_should_work_literalMutationNumber8_failAssert0() throws Exception {
        try {
            Calculator calculator = new Calculator();
            calculator.divide(0);
            org.junit.Assert.fail("divide_should_work_literalMutationNumber8 should have thrown ArithmeticException");
        } catch (ArithmeticException expected) {
        }
    }

    @Test(timeout = 10000)
    public void divide_should_work_mg1() throws Exception {
        int __DSPOT_n_0 = -1150482841;
        Calculator calculator = new Calculator();
        Assert.assertEquals(0, ((int) (((Calculator) (calculator)).getResult())));
        calculator.divide(10);
        calculator.add(__DSPOT_n_0);
        Assert.assertEquals(-1150482841, ((int) (((Calculator) (calculator)).getResult())));
    }

    @Test(timeout = 10000)
    public void divide_should_work_mg5() throws Exception {
        int __DSPOT_n_3 = 825130495;
        Calculator calculator = new Calculator();
        Assert.assertEquals(0, ((int) (((Calculator) (calculator)).getResult())));
        calculator.divide(10);
        calculator.substract(__DSPOT_n_3);
        Assert.assertEquals(-825130495, ((int) (((Calculator) (calculator)).getResult())));
    }

    @Test(timeout = 10000)
    public void divide_should_work_mg5_mg81() throws Exception {
        int __DSPOT_n_3 = 825130495;
        Calculator calculator = new Calculator();
        Assert.assertEquals(0, ((int) (((Calculator) (calculator)).getResult())));
        calculator.divide(10);
        calculator.substract(__DSPOT_n_3);
        calculator.clear();
        Assert.assertEquals(0, ((int) (((Calculator) (calculator)).getResult())));
    }

    @Test(timeout = 10000)
    public void divide_should_work_mg1_add322_mg2515() throws Exception {
        int __DSPOT_n_356 = 1281550771;
        int __DSPOT_n_0 = -1150482841;
        Calculator calculator = new Calculator();
        Assert.assertEquals(0, ((int) (((Calculator) (calculator)).getResult())));
        calculator.getResult();
        calculator.divide(10);
        calculator.add(__DSPOT_n_0);
        calculator.multiply(__DSPOT_n_356);
        Assert.assertEquals(1333606661, ((int) (((Calculator) (calculator)).getResult())));
    }

    @Test(timeout = 10000)
    public void divide_should_worklitNum23_failAssert0() throws Exception {
        try {
            Calculator calculator = new Calculator();
            calculator.divide(0);
            Assert.fail("divide_should_worklitNum23 should have thrown ArithmeticException");
        } catch (ArithmeticException expected) {
        }
    }

    @Test(timeout = 10000)
    public void divide_should_work_mg1_mg369() throws Exception {
        int __DSPOT_n_0 = -1150482841;
        Calculator calculator = new Calculator();
        Assert.assertEquals(0, ((int) (((Calculator) (calculator)).getResult())));
        calculator.divide(10);
        calculator.add(__DSPOT_n_0);
        calculator.clear();
        Assert.assertEquals(0, ((int) (((Calculator) (calculator)).getResult())));
    }
}

