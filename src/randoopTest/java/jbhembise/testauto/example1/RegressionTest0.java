package jbhembise.testauto.example1;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 10);
        calculator1.add(48);
        calculator1.clear();
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.add(30);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        calculator1.add(1);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.multiply(151);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        calculator1.divide((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.divide(10);
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.divide(10);
        calculator1.divide((int) (short) 1);
        int int13 = calculator1.getResult();
        calculator1.multiply((-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.multiply(0);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide((int) 'a');
        int int7 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        int int9 = calculator1.getResult();
        calculator1.clear();
        calculator1.clear();
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        int int7 = calculator1.getResult();
        int int8 = calculator1.getResult();
        calculator1.multiply((-12));
        calculator1.multiply(0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide(39);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.multiply(10);
        calculator1.multiply(5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.divide(1);
        calculator1.add(10);
        calculator1.divide(51);
        calculator1.multiply(48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        calculator1.clear();
        int int7 = calculator1.getResult();
        calculator1.divide((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.multiply(10);
        int int14 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 390 + "'", int14 == 390);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.multiply((int) (short) 100);
        calculator1.multiply((int) (short) -1);
        calculator1.multiply(10);
        calculator1.add(30);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide(10);
        calculator1.multiply(390);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((int) (short) 0);
        calculator1.substract((int) (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        int int7 = calculator1.getResult();
        calculator1.substract((int) (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(4);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        int int6 = calculator1.getResult();
        int int7 = calculator1.getResult();
        int int8 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 151 + "'", int6 == 151);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 151 + "'", int7 == 151);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 151 + "'", int8 == 151);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        calculator1.substract((int) (byte) 1);
        calculator1.multiply(39);
        int int10 = calculator1.getResult();
        calculator1.substract((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-39) + "'", int10 == (-39));
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        int int9 = calculator1.getResult();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        calculator1.multiply(49);
        calculator1.multiply((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        calculator1.multiply((int) '4');
        calculator1.add((int) (short) 10);
        calculator1.clear();
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        calculator1.clear();
        calculator1.divide((-7852));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(39);
        calculator1.clear();
        calculator1.substract((int) (short) 10);
        int int5 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-10) + "'", int5 == (-10));
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) 'a');
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-100));
        calculator1.multiply((int) 'a');
        calculator1.clear();
        calculator1.divide(99);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(0);
        calculator1.add((int) (short) 100);
        calculator1.substract(10);
        calculator1.add(10);
        calculator1.clear();
        calculator1.add(2);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.divide((int) '#');
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.add(100);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.add(51);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.clear();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(0);
        calculator1.add((int) (short) 100);
        calculator1.substract(10);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        calculator1.substract((int) (byte) 1);
        calculator1.multiply(39);
        int int10 = calculator1.getResult();
        calculator1.substract((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-39) + "'", int10 == (-39));
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(30);
        calculator1.multiply((int) (byte) 1);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 100);
        calculator1.divide(85);
        calculator1.add(78);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.substract((int) 'a');
        int int8 = calculator1.getResult();
        calculator1.substract(100);
        calculator1.add(151);
        calculator1.divide((int) 'a');
        int int15 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-97) + "'", int8 == (-97));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(0);
        calculator1.add((int) (short) 100);
        calculator1.substract(10);
        calculator1.add(10);
        calculator1.divide((int) (short) 100);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        calculator1.add(30);
        int int13 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 69 + "'", int13 == 69);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        int int6 = calculator1.getResult();
        int int7 = calculator1.getResult();
        calculator1.substract(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 10);
        calculator1.multiply(100);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        int int4 = calculator1.getResult();
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.clear();
        calculator1.substract(500);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        calculator1.clear();
        calculator1.divide((int) '4');
        int int9 = calculator1.getResult();
        calculator1.divide(30);
        int int12 = calculator1.getResult();
        calculator1.divide(5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '#');
        calculator1.clear();
        calculator1.divide(7852);
        calculator1.divide(10);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide(10);
        calculator1.multiply(100);
        calculator1.divide((int) 'a');
        calculator1.substract((int) '4');
        java.lang.Class<?> wildcardClass16 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        calculator1.clear();
        int int7 = calculator1.getResult();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract(39);
        calculator1.substract(185);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        calculator1.substract(98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.multiply((-100));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.add(49);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(5);
        calculator1.add(78);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract(39);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 10);
        calculator1.substract(2);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.multiply(0);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((int) (short) 0);
        calculator1.clear();
        calculator1.substract(48);
        calculator1.multiply((-1));
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.multiply(0);
        calculator1.substract(30);
        calculator1.multiply(30);
        calculator1.divide((int) (short) 10);
        calculator1.multiply(500);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(99);
        calculator1.add(1);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(10);
        calculator1.multiply((int) (short) 10);
        calculator1.clear();
        int int5 = calculator1.getResult();
        calculator1.substract((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(0);
        calculator1.add((int) (short) 100);
        calculator1.substract(10);
        calculator1.clear();
        int int7 = calculator1.getResult();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.divide(7852);
        calculator1.substract(98);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        calculator1.clear();
        calculator1.divide((int) '4');
        int int9 = calculator1.getResult();
        calculator1.clear();
        calculator1.clear();
        int int12 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(39);
        calculator1.divide(10);
        calculator1.divide(39);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        calculator1.divide((-39));
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.divide(1);
        java.lang.Class<?> wildcardClass14 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide(10);
        calculator1.add(30);
        calculator1.divide((-100));
        calculator1.substract((int) (short) 1);
        int int16 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.divide((int) '#');
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        calculator1.multiply((-10));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        calculator1.clear();
        calculator1.add(39);
        java.lang.Class<?> wildcardClass14 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(1000);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.add((int) (byte) 1);
        calculator1.add((int) (byte) 1);
        int int7 = calculator1.getResult();
        calculator1.divide(85);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(185);
        int int2 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 185 + "'", int2 == 185);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        calculator1.clear();
        calculator1.add(49);
        calculator1.multiply(51);
        calculator1.divide(390);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.clear();
        calculator1.divide((-100));
        calculator1.multiply(40);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.multiply((int) ' ');
        calculator1.multiply(185);
        calculator1.add(48);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        int int9 = calculator1.getResult();
        calculator1.clear();
        calculator1.add((int) (byte) 1);
        int int13 = calculator1.getResult();
        calculator1.substract(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        calculator1.multiply((int) '4');
        int int10 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7852 + "'", int10 == 7852);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        calculator1.clear();
        int int7 = calculator1.getResult();
        calculator1.add(100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        int int9 = calculator1.getResult();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        int int11 = calculator1.getResult();
        calculator1.divide((-97));
        int int14 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 40 + "'", int9 == 40);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 40 + "'", int11 == 40);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(30);
        calculator1.multiply((-1));
        calculator1.add(99);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.multiply((int) (short) 100);
        calculator1.multiply(10);
        calculator1.clear();
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        calculator1.add((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(10);
        calculator1.add(39);
        calculator1.divide(500);
        calculator1.multiply(69);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.multiply(0);
        calculator1.add((int) (short) 1);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        int int7 = calculator1.getResult();
        calculator1.add(100);
        calculator1.divide((int) '#');
        int int12 = calculator1.getResult();
        calculator1.add(51);
        calculator1.divide(390);
        calculator1.multiply((int) (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        int int6 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(48);
        calculator1.clear();
        calculator1.multiply(48);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.substract(100);
        calculator1.divide(10);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        calculator1.multiply(1);
        calculator1.divide((int) '#');
        int int9 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.add((int) (byte) 1);
        calculator1.add((int) (byte) 1);
        int int7 = calculator1.getResult();
        calculator1.clear();
        int int9 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.substract(100);
        calculator1.divide(10);
        calculator1.add(40);
        calculator1.clear();
        calculator1.add(10);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.substract((int) (byte) 1);
        int int8 = calculator1.getResult();
        calculator1.clear();
        calculator1.clear();
        calculator1.substract(48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.add(185);
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        calculator1.substract(30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.multiply((int) (byte) -1);
        calculator1.multiply(0);
        calculator1.multiply(49);
        calculator1.substract(99);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.multiply(0);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.clear();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(696072);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.multiply(5);
        calculator1.add((int) '#');
        calculator1.multiply(39);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        int int6 = calculator1.getResult();
        calculator1.multiply(99);
        int int9 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.clear();
        calculator1.multiply((int) '#');
        int int7 = calculator1.getResult();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((int) (short) 0);
        calculator1.multiply((int) (short) -1);
        calculator1.multiply(99);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(10);
        calculator1.add(39);
        calculator1.multiply(151);
        calculator1.clear();
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.divide(1);
        int int14 = calculator1.getResult();
        calculator1.clear();
        calculator1.multiply((int) (byte) -1);
        int int18 = calculator1.getResult();
        java.lang.Class<?> wildcardClass19 = calculator1.getClass();
        calculator1.multiply(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 39 + "'", int14 == 39);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.divide(1);
        int int14 = calculator1.getResult();
        calculator1.clear();
        calculator1.multiply((int) (byte) -1);
        int int18 = calculator1.getResult();
        calculator1.multiply(185);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 39 + "'", int14 == 39);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        calculator1.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.clear();
        calculator1.multiply((int) '#');
        calculator1.divide(40);
        calculator1.substract(51);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.clear();
        calculator1.multiply((int) '#');
        calculator1.divide(40);
        calculator1.substract((int) (byte) 10);
        calculator1.divide((int) (byte) -1);
        calculator1.clear();
        calculator1.multiply(390);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.substract((int) (byte) 10);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.clear();
        calculator1.add(10);
        calculator1.multiply((int) (short) -1);
        calculator1.clear();
        calculator1.multiply((-100));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.divide((int) (short) 10);
        calculator1.add(151);
        calculator1.substract((int) '4');
        int int13 = calculator1.getResult();
        calculator1.multiply((-7852));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.divide((int) (short) 100);
        calculator1.substract((int) '#');
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.divide(1);
        calculator1.add(10);
        java.lang.Class<?> wildcardClass16 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.divide((int) (short) 10);
        calculator1.add(151);
        calculator1.substract((int) '4');
        int int13 = calculator1.getResult();
        calculator1.divide(35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.substract((int) (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.clear();
        calculator1.multiply((int) '#');
        calculator1.divide(40);
        calculator1.clear();
        int int10 = calculator1.getResult();
        calculator1.substract(56);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.substract((int) 'a');
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        int int10 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-98) + "'", int10 == (-98));
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.substract(100);
        calculator1.divide(10);
        calculator1.substract(2);
        calculator1.multiply(100);
        calculator1.clear();
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide((int) (short) 1);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide(10);
        calculator1.multiply(78);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-12));
        calculator1.clear();
        calculator1.multiply((-97));
        calculator1.multiply(1);
        calculator1.add(49);
        int int9 = calculator1.getResult();
        calculator1.substract((int) 'a');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 10);
        calculator1.multiply(100);
        calculator1.divide(39);
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide((int) (short) 1);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide(10);
        calculator1.clear();
        int int8 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(5);
        int int2 = calculator1.getResult();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-100));
        calculator1.multiply((int) 'a');
        calculator1.clear();
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(198900);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.clear();
        calculator1.multiply(5);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(10);
        int int11 = calculator1.getResult();
        calculator1.clear();
        int int13 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.add(5);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.substract(1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.add(51);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide((int) (byte) -1);
        calculator1.divide(696072);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(39);
        calculator1.multiply((int) (byte) 1);
        int int6 = calculator1.getResult();
        int int7 = calculator1.getResult();
        int int8 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(40);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.divide(4);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.multiply(0);
        calculator1.substract(30);
        calculator1.add((int) '#');
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        int int13 = calculator1.getResult();
        calculator1.divide((-4000));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        int int9 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(312000000);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(10);
        calculator1.add(151);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.add((int) (byte) 1);
        calculator1.substract((int) (byte) 100);
        int int7 = calculator1.getResult();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-99) + "'", int7 == (-99));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-90));
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        int int8 = calculator1.getResult();
        calculator1.divide((int) '4');
        calculator1.clear();
        int int12 = calculator1.getResult();
        calculator1.substract(39);
        calculator1.add(56);
        java.lang.Class<?> wildcardClass17 = calculator1.getClass();
        calculator1.add(69);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 151 + "'", int8 == 151);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.add((int) (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        int int9 = calculator1.getResult();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 40 + "'", int9 == 40);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-100));
        calculator1.substract((int) '4');
        calculator1.divide(2);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.clear();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-12));
        calculator1.clear();
        calculator1.multiply((-97));
        calculator1.multiply(1);
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        calculator1.add(30);
        calculator1.substract(40);
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.add(51);
        calculator1.clear();
        calculator1.clear();
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(48);
        int int2 = calculator1.getResult();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.divide(10);
        calculator1.divide((int) (short) 1);
        calculator1.clear();
        calculator1.substract(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (byte) 1);
        calculator1.substract((int) 'a');
        calculator1.clear();
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide((-100));
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.divide(1);
        calculator1.substract(51);
        calculator1.divide(4);
        calculator1.multiply(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        calculator1.clear();
        calculator1.divide((int) '4');
        int int9 = calculator1.getResult();
        calculator1.multiply((int) (short) -1);
        calculator1.divide(99);
        calculator1.multiply((-97));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 10);
        calculator1.multiply(100);
        int int8 = calculator1.getResult();
        int int9 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-400) + "'", int8 == (-400));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-400) + "'", int9 == (-400));
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(390);
        int int2 = calculator1.getResult();
        int int3 = calculator1.getResult();
        calculator1.divide(99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 390 + "'", int2 == 390);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 390 + "'", int3 == 390);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.multiply(0);
        int int8 = calculator1.getResult();
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(185);
        calculator1.multiply((-99));
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.multiply((int) (short) 100);
        calculator1.multiply(10);
        java.lang.Class<?> wildcardClass14 = calculator1.getClass();
        calculator1.substract(30);
        calculator1.add(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(10);
        calculator1.divide(5);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 1);
        calculator1.divide((int) (byte) 100);
        calculator1.substract((int) 'a');
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        int int7 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.clear();
        calculator1.multiply((int) '#');
        calculator1.divide(40);
        calculator1.substract(7852);
        calculator1.divide(10);
        calculator1.substract(185);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.multiply(151);
        calculator1.substract(78);
        calculator1.clear();
        calculator1.divide((int) (short) 1);
        calculator1.multiply(0);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        int int4 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.multiply(0);
        calculator1.multiply((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        calculator1.divide(500);
        calculator1.divide(2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.multiply((-1));
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.multiply((-3783));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.divide((int) 'a');
        calculator1.clear();
        calculator1.clear();
        calculator1.multiply(151);
        calculator1.clear();
        calculator1.multiply((int) (byte) 0);
        calculator1.divide(4);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.clear();
        calculator1.divide((-100));
        calculator1.multiply(40);
        calculator1.substract(1);
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 10);
        calculator1.substract((int) 'a');
        calculator1.divide(7852);
        calculator1.add(152);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        calculator1.multiply((int) ' ');
        int int15 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1248 + "'", int15 == 1248);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (byte) 1);
        calculator1.substract((int) 'a');
        calculator1.clear();
        calculator1.multiply(390);
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.multiply((int) (short) 100);
        calculator1.add(151);
        calculator1.divide((int) '#');
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.divide(1);
        calculator1.substract(51);
        int int16 = calculator1.getResult();
        int int17 = calculator1.getResult();
        int int18 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-12) + "'", int16 == (-12));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-12) + "'", int17 == (-12));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-12) + "'", int18 == (-12));
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        int int6 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.divide((int) (short) 10);
        calculator1.add(1);
        calculator1.multiply((-1));
        calculator1.substract(152);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.clear();
        calculator1.multiply((int) '#');
        calculator1.divide(40);
        calculator1.substract(7852);
        calculator1.divide(10);
        int int13 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-785) + "'", int13 == (-785));
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.divide((int) 'a');
        calculator1.clear();
        calculator1.clear();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        calculator1.divide(98);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide((-100));
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        calculator1.multiply(49);
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        calculator1.clear();
        calculator1.divide((int) '4');
        int int9 = calculator1.getResult();
        calculator1.divide(30);
        int int12 = calculator1.getResult();
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        int int5 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.substract((int) (byte) 1);
        int int8 = calculator1.getResult();
        int int9 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.substract((int) 'a');
        int int8 = calculator1.getResult();
        calculator1.substract(100);
        calculator1.add(151);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        calculator1.multiply((-3783));
        calculator1.substract((int) ' ');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-97) + "'", int8 == (-97));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.divide(1);
        calculator1.substract(51);
        calculator1.multiply((int) (byte) 1);
        calculator1.divide(198900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.divide((int) (byte) 100);
        calculator1.divide(99);
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide((int) (short) 1);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(40);
        int int2 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 10);
        calculator1.clear();
        calculator1.substract(39);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.divide(1000);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(49);
        int int2 = calculator1.getResult();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        int int4 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 49 + "'", int4 == 49);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.multiply(0);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.clear();
        calculator1.multiply((int) 'a');
        calculator1.substract(312000000);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        calculator1.clear();
        calculator1.divide((int) '4');
        int int9 = calculator1.getResult();
        calculator1.clear();
        calculator1.multiply(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        calculator1.multiply(1);
        calculator1.divide((int) '#');
        calculator1.clear();
        calculator1.divide(39949);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.divide(10);
        calculator1.divide((int) (short) 1);
        int int13 = calculator1.getResult();
        java.lang.Class<?> wildcardClass14 = calculator1.getClass();
        calculator1.divide((int) (byte) 10);
        calculator1.divide((-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.multiply((int) (short) 100);
        calculator1.multiply(10);
        calculator1.multiply((int) (short) 100);
        calculator1.multiply(78);
        calculator1.divide((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.substract((int) (byte) 10);
        int int7 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10) + "'", int7 == (-10));
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.divide((int) (short) 10);
        calculator1.add(151);
        calculator1.clear();
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        int int8 = calculator1.getResult();
        calculator1.multiply((-7852));
        calculator1.add(5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.divide(1);
        int int14 = calculator1.getResult();
        calculator1.clear();
        calculator1.multiply((int) (byte) -1);
        int int18 = calculator1.getResult();
        java.lang.Class<?> wildcardClass19 = calculator1.getClass();
        int int20 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 39 + "'", int14 == 39);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.substract(49);
        calculator1.clear();
        calculator1.divide(100);
        int int17 = calculator1.getResult();
        calculator1.substract(5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (byte) 1);
        calculator1.substract((int) 'a');
        calculator1.multiply(0);
        calculator1.divide(100);
        calculator1.multiply((int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.divide((int) '#');
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        calculator1.substract(1);
        calculator1.clear();
        calculator1.divide(4);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        int int7 = calculator1.getResult();
        calculator1.add(100);
        calculator1.divide((int) '#');
        int int12 = calculator1.getResult();
        calculator1.add(51);
        calculator1.multiply(100);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.clear();
        calculator1.add(1);
        calculator1.substract(56);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.multiply((int) (short) 100);
        calculator1.multiply(10);
        calculator1.substract(51);
        int int16 = calculator1.getResult();
        calculator1.add(1248);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 39949 + "'", int16 == 39949);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (byte) 1);
        calculator1.substract((int) 'a');
        calculator1.multiply((int) (byte) 0);
        calculator1.add(152);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.divide(1);
        calculator1.substract(51);
        int int16 = calculator1.getResult();
        calculator1.add(30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-12) + "'", int16 == (-12));
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide(10);
        calculator1.multiply((int) (short) 0);
        calculator1.clear();
        calculator1.multiply(0);
        calculator1.divide(185);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.substract((int) 'a');
        int int8 = calculator1.getResult();
        calculator1.substract(100);
        calculator1.add(151);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        calculator1.multiply((-3783));
        java.lang.Class<?> wildcardClass16 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-97) + "'", int8 == (-97));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.multiply((int) (byte) -1);
        calculator1.multiply((-97));
        calculator1.divide(49);
        calculator1.substract((int) (byte) 100);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.substract(100);
        calculator1.divide(10);
        calculator1.substract(2);
        calculator1.multiply(100);
        calculator1.substract((int) (short) 100);
        calculator1.multiply(49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide((int) (byte) -1);
        int int7 = calculator1.getResult();
        calculator1.add(39);
        calculator1.substract(85);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(48);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-7852));
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.substract(30);
        calculator1.substract(510);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        calculator1.clear();
        calculator1.divide((int) '4');
        int int9 = calculator1.getResult();
        calculator1.divide(30);
        calculator1.add((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(39);
        calculator1.clear();
        calculator1.substract((int) (byte) 100);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(0);
        calculator1.add((int) (short) 100);
        calculator1.substract(10);
        calculator1.clear();
        int int7 = calculator1.getResult();
        calculator1.clear();
        int int9 = calculator1.getResult();
        calculator1.add(39);
        calculator1.divide((int) (short) 1);
        int int14 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 39 + "'", int14 == 39);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '#');
        int int2 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.substract((int) ' ');
        calculator1.multiply((int) (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-39));
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.divide((int) (short) 10);
        calculator1.add(151);
        calculator1.substract((int) '4');
        int int13 = calculator1.getResult();
        calculator1.substract((int) ' ');
        calculator1.divide((-100));
        calculator1.divide((int) (short) 100);
        calculator1.substract(198900);
        int int22 = calculator1.getResult();
        calculator1.add(98);
        calculator1.multiply((-7852));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-198900) + "'", int22 == (-198900));
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.divide(40);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.add(39949);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.multiply((int) (byte) -1);
        calculator1.multiply((-97));
        calculator1.clear();
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.multiply(0);
        calculator1.add((int) (short) 1);
        int int6 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.multiply(151);
        calculator1.substract(78);
        calculator1.clear();
        calculator1.divide((int) (short) 1);
        calculator1.multiply((int) (short) 1);
        calculator1.divide(15100);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        int int7 = calculator1.getResult();
        calculator1.divide(69);
        int int10 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        calculator1.clear();
        int int7 = calculator1.getResult();
        calculator1.add(390);
        int int10 = calculator1.getResult();
        calculator1.add((int) ' ');
        calculator1.substract(85);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 390 + "'", int10 == 390);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        calculator1.multiply((int) '4');
        calculator1.divide((int) (byte) 1);
        calculator1.multiply((-1));
        int int14 = calculator1.getResult();
        int int15 = calculator1.getResult();
        calculator1.add(152);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-7852) + "'", int14 == (-7852));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7852) + "'", int15 == (-7852));
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        calculator1.multiply(7852);
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.multiply((-1));
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(10);
        calculator1.add(151);
        calculator1.substract(696072);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide((int) (short) 1);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        int int6 = calculator1.getResult();
        calculator1.substract(100);
        calculator1.divide(151);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-9751));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        calculator1.substract((int) (byte) 1);
        calculator1.multiply(39);
        int int10 = calculator1.getResult();
        int int11 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-39) + "'", int10 == (-39));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-39) + "'", int11 == (-39));
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.substract(39);
        calculator1.add(151);
        calculator1.multiply(4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.multiply((int) (short) 100);
        calculator1.multiply(10);
        calculator1.clear();
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        java.lang.Class<?> wildcardClass16 = calculator1.getClass();
        calculator1.multiply((int) (byte) 100);
        calculator1.substract((int) (byte) 1);
        calculator1.add(312000000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        calculator1.clear();
        int int7 = calculator1.getResult();
        calculator1.add(390);
        int int10 = calculator1.getResult();
        calculator1.add(78);
        calculator1.clear();
        int int14 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 390 + "'", int10 == 390);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        int int9 = calculator1.getResult();
        calculator1.clear();
        calculator1.add((int) (byte) 1);
        calculator1.substract(40);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.substract(49);
        calculator1.add(151);
        calculator1.multiply(98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 10);
        calculator1.add((int) (short) 100);
        int int8 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 96 + "'", int8 == 96);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        int int9 = calculator1.getResult();
        calculator1.clear();
        calculator1.clear();
        int int12 = calculator1.getResult();
        int int13 = calculator1.getResult();
        calculator1.multiply(140);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        calculator1.multiply((int) 'a');
        int int4 = calculator1.getResult();
        calculator1.multiply((int) (short) 10);
        calculator1.divide((-3783));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-97) + "'", int4 == (-97));
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(39);
        calculator1.divide(10);
        calculator1.clear();
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        int int9 = calculator1.getResult();
        calculator1.clear();
        calculator1.add((int) (byte) 1);
        calculator1.multiply((-99));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        calculator1.multiply((int) '4');
        calculator1.add((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.multiply((int) (short) 100);
        calculator1.substract(500);
        java.lang.Class<?> wildcardClass14 = calculator1.getClass();
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.multiply((int) (short) 100);
        calculator1.multiply((int) (short) -1);
        calculator1.multiply(10);
        calculator1.multiply((int) '#');
        int int18 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1400000) + "'", int18 == (-1400000));
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.add(51);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.divide(7852);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        int int4 = calculator1.getResult();
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide(10);
        calculator1.add(30);
        calculator1.multiply(10);
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(0);
        calculator1.add((int) (short) 100);
        calculator1.substract(10);
        calculator1.add(10);
        calculator1.clear();
        int int9 = calculator1.getResult();
        calculator1.divide((-40));
        calculator1.add(30);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(39);
        calculator1.multiply((int) (byte) 1);
        calculator1.divide(98);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(140);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide((int) (short) 10);
        calculator1.divide(30);
        int int9 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract(39);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        int int9 = calculator1.getResult();
        calculator1.multiply((int) (byte) 10);
        calculator1.multiply((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        int int5 = calculator1.getResult();
        calculator1.substract(48);
        calculator1.substract(40);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        calculator1.clear();
        calculator1.divide((int) '4');
        int int9 = calculator1.getResult();
        calculator1.divide(30);
        int int12 = calculator1.getResult();
        calculator1.multiply(151);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.add(51);
        calculator1.multiply((-100));
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.divide(40);
        calculator1.clear();
        calculator1.substract(85);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        int int6 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract(56);
        int int10 = calculator1.getResult();
        int int11 = calculator1.getResult();
        calculator1.add((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-56) + "'", int10 == (-56));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-56) + "'", int11 == (-56));
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.divide((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        int int10 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        calculator1.multiply(1);
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(96);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 10);
        calculator1.add((int) (short) 100);
        calculator1.multiply(200);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        calculator1.add(30);
        calculator1.multiply(1);
        calculator1.multiply(390);
        calculator1.multiply((-400));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 10);
        calculator1.multiply(100);
        calculator1.divide(39);
        calculator1.clear();
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(49);
        calculator1.clear();
        calculator1.add((int) (short) 100);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.multiply((int) (byte) -1);
        calculator1.multiply((-97));
        calculator1.multiply((int) (short) 100);
        calculator1.divide((int) ' ');
        int int12 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-14550) + "'", int12 == (-14550));
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (byte) 1);
        calculator1.substract((int) 'a');
        calculator1.clear();
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.divide((-10));
        calculator1.divide(140);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.substract(51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.substract(100);
        int int6 = calculator1.getResult();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(0);
        calculator1.add((int) (short) 100);
        calculator1.substract(10);
        calculator1.clear();
        int int7 = calculator1.getResult();
        int int8 = calculator1.getResult();
        calculator1.substract(1000);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.divide((int) (short) 100);
        calculator1.add(100);
        calculator1.multiply((int) (short) 1);
        calculator1.substract((int) '4');
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '#');
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(39);
        calculator1.divide(10);
        int int6 = calculator1.getResult();
        calculator1.divide(5);
        int int9 = calculator1.getResult();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.add(78);
        calculator1.add(10);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        calculator1.multiply((-12));
        calculator1.clear();
        calculator1.clear();
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        calculator1.multiply(1);
        calculator1.divide((int) '#');
        calculator1.clear();
        calculator1.clear();
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        calculator1.multiply(1);
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        int int4 = calculator1.getResult();
        calculator1.clear();
        int int6 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(39);
        calculator1.multiply((int) (byte) 1);
        int int6 = calculator1.getResult();
        calculator1.clear();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        int int9 = calculator1.getResult();
        calculator1.add(100);
        calculator1.multiply(5);
        calculator1.substract(15100);
        calculator1.divide((-400));
        calculator1.substract(2);
        int int20 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 34 + "'", int20 == 34);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        int int3 = calculator1.getResult();
        calculator1.divide((-100));
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.multiply((-146));
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.add(152);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 10);
        calculator1.add((int) (short) 100);
        calculator1.divide((int) (short) 1);
        calculator1.multiply((int) (byte) 100);
        calculator1.multiply(198900);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(107);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 0);
        calculator1.add((int) 'a');
        calculator1.multiply((-4000));
        calculator1.divide(40);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 0);
        calculator1.clear();
        calculator1.multiply(99);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.multiply(85);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        int int6 = calculator1.getResult();
        calculator1.clear();
        calculator1.multiply((int) ' ');
        int int10 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        int int5 = calculator1.getResult();
        calculator1.substract((int) '4');
        int int8 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-53) + "'", int8 == (-53));
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.divide(40);
        calculator1.clear();
        int int5 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(48);
        int int2 = calculator1.getResult();
        calculator1.divide(95);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.add(69);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(10);
        calculator1.add(39);
        calculator1.multiply(151);
        calculator1.add((int) (short) 1);
        int int8 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7400 + "'", int8 == 7400);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        int int9 = calculator1.getResult();
        calculator1.add(100);
        calculator1.multiply(5);
        calculator1.substract(15100);
        java.lang.Class<?> wildcardClass16 = calculator1.getClass();
        calculator1.substract((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        int int9 = calculator1.getResult();
        calculator1.add(100);
        calculator1.multiply(5);
        calculator1.substract(15100);
        calculator1.divide((-400));
        calculator1.clear();
        java.lang.Class<?> wildcardClass19 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.substract(49);
        int int5 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-49) + "'", int5 == (-49));
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (byte) 1);
        calculator1.substract((int) 'a');
        calculator1.clear();
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.divide((-10));
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.divide((int) (short) 100);
        calculator1.multiply((int) (short) 100);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-97));
        calculator1.substract(432);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((int) (short) 0);
        calculator1.divide((int) (byte) 100);
        calculator1.multiply(96);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(49);
        int int2 = calculator1.getResult();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.substract((int) (byte) 10);
        calculator1.divide(95);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 1);
        calculator1.divide((int) (byte) 100);
        calculator1.divide(49);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        int int5 = calculator1.getResult();
        int int6 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.divide((int) (short) 10);
        calculator1.add(151);
        calculator1.substract((int) '4');
        int int13 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract(99);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.add(51);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        calculator1.multiply((int) '4');
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.divide((-49));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.multiply(0);
        calculator1.substract(30);
        calculator1.add((int) '#');
        calculator1.multiply(40);
        calculator1.substract(56);
        java.lang.Class<?> wildcardClass16 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide(10);
        calculator1.multiply(100);
        calculator1.divide((int) 'a');
        calculator1.clear();
        int int15 = calculator1.getResult();
        java.lang.Class<?> wildcardClass16 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.add((int) (byte) 10);
        int int11 = calculator1.getResult();
        calculator1.multiply(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.multiply(0);
        calculator1.substract((int) (byte) 100);
        int int13 = calculator1.getResult();
        java.lang.Class<?> wildcardClass14 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-100) + "'", int13 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.substract((int) 'a');
        int int8 = calculator1.getResult();
        calculator1.substract(100);
        calculator1.add(151);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        calculator1.clear();
        int int15 = calculator1.getResult();
        calculator1.substract(39949);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-97) + "'", int8 == (-97));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.substract(39);
        calculator1.clear();
        calculator1.substract(2);
        int int10 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.multiply(0);
        calculator1.substract(99);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.divide((int) (byte) 100);
        int int8 = calculator1.getResult();
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.substract(390);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '#');
        calculator1.substract(1248);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.divide(40);
        calculator1.clear();
        calculator1.add(100);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(39);
        calculator1.multiply((int) (byte) 1);
        calculator1.clear();
        int int7 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.substract(100);
        calculator1.divide(10);
        calculator1.add(40);
        calculator1.clear();
        calculator1.add(10);
        calculator1.multiply(0);
        calculator1.multiply((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(10);
        calculator1.add(48);
        calculator1.substract((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.substract(100);
        int int6 = calculator1.getResult();
        calculator1.clear();
        calculator1.divide((int) 'a');
        calculator1.add(85);
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.add((int) (byte) 10);
        calculator1.substract(30);
        calculator1.divide((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) ' ');
        calculator1.clear();
        calculator1.add(99);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        int int3 = calculator1.getResult();
        calculator1.divide((-100));
        calculator1.divide((-97));
        calculator1.multiply((int) (byte) 0);
        calculator1.clear();
        calculator1.divide(100);
        calculator1.divide(312000000);
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        calculator1.clear();
        calculator1.divide((int) '4');
        int int9 = calculator1.getResult();
        calculator1.clear();
        calculator1.clear();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.multiply((-97));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(0);
        calculator1.add((int) (short) 100);
        calculator1.substract(10);
        calculator1.clear();
        int int7 = calculator1.getResult();
        int int8 = calculator1.getResult();
        calculator1.divide(1248);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide((int) (short) 1);
        calculator1.add(4);
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        calculator1.multiply((-99));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.multiply(51);
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.substract(100);
        calculator1.divide(10);
        calculator1.add(40);
        calculator1.clear();
        calculator1.add(10);
        calculator1.multiply(0);
        int int15 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.multiply(85);
        calculator1.divide(312000000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) '4');
        calculator1.add(40);
        calculator1.clear();
        calculator1.add((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        int int7 = calculator1.getResult();
        calculator1.add(100);
        calculator1.divide((int) '#');
        calculator1.substract((int) ' ');
        calculator1.clear();
        calculator1.multiply(390);
        calculator1.divide((int) (short) -1);
        calculator1.substract(432);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.divide((int) (short) 10);
        calculator1.add(151);
        calculator1.substract((int) '4');
        int int13 = calculator1.getResult();
        calculator1.add(7852);
        java.lang.Class<?> wildcardClass16 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.clear();
        calculator1.divide((-100));
        calculator1.multiply(40);
        calculator1.clear();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(40);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        int int3 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 40 + "'", int3 == 40);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.substract((int) 'a');
        calculator1.clear();
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.clear();
        calculator1.divide((-100));
        calculator1.multiply(40);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.multiply((int) ' ');
        calculator1.multiply(185);
        calculator1.multiply((-4000));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(390);
        calculator1.add((int) ' ');
        calculator1.multiply((-53));
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 0);
        calculator1.clear();
        calculator1.divide((-1));
        calculator1.add(30);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 10);
        calculator1.clear();
        calculator1.clear();
        int int8 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 10);
        calculator1.clear();
        calculator1.clear();
        calculator1.clear();
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        int int7 = calculator1.getResult();
        int int8 = calculator1.getResult();
        calculator1.clear();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        calculator1.clear();
        calculator1.divide((int) '4');
        int int9 = calculator1.getResult();
        calculator1.multiply((int) (short) -1);
        int int12 = calculator1.getResult();
        calculator1.add(696072);
        calculator1.divide(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        calculator1.multiply(1);
        calculator1.divide((int) (byte) 100);
        int int9 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.multiply((int) (byte) -1);
        calculator1.multiply((-97));
        calculator1.multiply((int) (short) 100);
        calculator1.clear();
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        calculator1.clear();
        int int7 = calculator1.getResult();
        calculator1.add(390);
        int int10 = calculator1.getResult();
        calculator1.add((int) ' ');
        calculator1.multiply((-4656));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 390 + "'", int10 == 390);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        int int9 = calculator1.getResult();
        calculator1.multiply((int) (byte) 10);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.clear();
        calculator1.multiply((int) '#');
        calculator1.multiply(30);
        calculator1.divide((-39));
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (byte) 1);
        calculator1.divide((int) (short) -1);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(48);
        int int2 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.add(51);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide((int) (byte) -1);
        calculator1.add(200);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(185);
        calculator1.clear();
        int int3 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        int int8 = calculator1.getResult();
        calculator1.divide((int) '4');
        calculator1.clear();
        int int12 = calculator1.getResult();
        calculator1.substract(39);
        calculator1.multiply(51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 151 + "'", int8 == 151);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.divide(1);
        int int14 = calculator1.getResult();
        calculator1.clear();
        calculator1.multiply((int) (byte) -1);
        int int18 = calculator1.getResult();
        java.lang.Class<?> wildcardClass19 = calculator1.getClass();
        calculator1.multiply((-98));
        calculator1.multiply(39);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 39 + "'", int14 == 39);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.multiply(0);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide((int) 'a');
        calculator1.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.divide((int) 'a');
        calculator1.clear();
        calculator1.clear();
        calculator1.multiply(151);
        calculator1.clear();
        int int10 = calculator1.getResult();
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        int int12 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        int int5 = calculator1.getResult();
        calculator1.add(49);
        int int8 = calculator1.getResult();
        calculator1.divide(7852);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.multiply((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.clear();
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.substract((int) 'a');
        int int8 = calculator1.getResult();
        calculator1.substract(100);
        calculator1.add(151);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        calculator1.clear();
        int int15 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-97) + "'", int8 == (-97));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        int int3 = calculator1.getResult();
        calculator1.divide((-100));
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.divide(400);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.clear();
        calculator1.add(10);
        calculator1.multiply((int) (short) -1);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-500));
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        calculator1.multiply(1);
        calculator1.divide((int) '#');
        calculator1.clear();
        calculator1.add((int) '4');
        int int12 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        int int7 = calculator1.getResult();
        calculator1.add(100);
        calculator1.divide((int) '#');
        int int12 = calculator1.getResult();
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        java.lang.Class<?> wildcardClass14 = calculator1.getClass();
        calculator1.substract(99);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.multiply((int) (short) 100);
        calculator1.multiply((int) (short) -1);
        calculator1.multiply(10);
        calculator1.add(30);
        java.lang.Class<?> wildcardClass18 = calculator1.getClass();
        calculator1.divide(69);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.clear();
        calculator1.add(10);
        calculator1.add((int) 'a');
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        int int10 = calculator1.getResult();
        calculator1.divide((-12));
        calculator1.add(15100);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 107 + "'", int10 == 107);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.add(100);
        calculator1.multiply((-97));
        calculator1.substract(51);
        int int15 = calculator1.getResult();
        int int16 = calculator1.getResult();
        calculator1.add(85);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9751) + "'", int15 == (-9751));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-9751) + "'", int16 == (-9751));
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.add(100);
        calculator1.clear();
        calculator1.add((int) (short) 10);
        calculator1.add(39);
        calculator1.multiply(95);
        calculator1.divide((-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(30);
        calculator1.clear();
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        calculator1.clear();
        calculator1.divide((int) '4');
        int int9 = calculator1.getResult();
        calculator1.clear();
        calculator1.clear();
        calculator1.divide((int) ' ');
        int int14 = calculator1.getResult();
        calculator1.multiply(2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide(10);
        calculator1.divide(39);
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(39);
        int int2 = calculator1.getResult();
        int int3 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39 + "'", int2 == 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 39 + "'", int3 == 39);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.multiply((int) (short) 100);
        calculator1.multiply(10);
        calculator1.multiply((int) (short) 100);
        calculator1.multiply(78);
        calculator1.add(432);
        int int20 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 312000432 + "'", int20 == 312000432);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.multiply(0);
        calculator1.multiply((int) (byte) -1);
        int int7 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(39949);
        calculator1.divide(312000000);
        calculator1.multiply(198900);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(5);
        int int2 = calculator1.getResult();
        calculator1.substract(34);
        calculator1.divide((-588));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.multiply(0);
        calculator1.substract(30);
        calculator1.multiply(30);
        calculator1.add(30);
        calculator1.multiply((int) (byte) 10);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.substract(48);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 1);
        calculator1.divide(48);
        int int4 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.multiply(0);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply(51);
        calculator1.multiply(185);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        calculator1.clear();
        calculator1.multiply(39);
        int int9 = calculator1.getResult();
        calculator1.divide((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 1);
        calculator1.multiply(1248);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-1));
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.multiply((-56));
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.add(1);
        calculator1.add(2);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        int int8 = calculator1.getResult();
        calculator1.divide((int) '4');
        calculator1.clear();
        int int12 = calculator1.getResult();
        calculator1.substract(39);
        calculator1.multiply(1000);
        calculator1.add(5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 151 + "'", int8 == 151);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(1248);
        calculator1.clear();
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract(39);
        calculator1.multiply((int) 'a');
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        int int11 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-3783) + "'", int11 == (-3783));
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(51);
        calculator1.multiply((int) (short) 100);
        calculator1.clear();
        calculator1.clear();
        calculator1.add(98);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.divide((int) '#');
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        calculator1.substract(1);
        int int10 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.add(100);
        calculator1.substract(7852);
        calculator1.multiply((int) '#');
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        int int4 = calculator1.getResult();
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide((int) (short) -1);
        calculator1.add(39949);
        calculator1.divide((-14948));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide(10);
        calculator1.multiply(100);
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        calculator1.multiply((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        calculator1.substract((int) (short) 100);
        java.lang.Class<?> wildcardClass18 = calculator1.getClass();
        calculator1.clear();
        java.lang.Class<?> wildcardClass20 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        int int6 = calculator1.getResult();
        calculator1.clear();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        int int3 = calculator1.getResult();
        calculator1.divide((-100));
        calculator1.divide((-97));
        calculator1.multiply((int) (byte) 0);
        calculator1.clear();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.divide(107);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        int int6 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract(56);
        int int10 = calculator1.getResult();
        int int11 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-56) + "'", int10 == (-56));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-56) + "'", int11 == (-56));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.divide((int) (short) 10);
        calculator1.add(151);
        calculator1.substract((int) '4');
        int int13 = calculator1.getResult();
        int int14 = calculator1.getResult();
        calculator1.add(98);
        calculator1.add(390);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(48);
        int int2 = calculator1.getResult();
        calculator1.add(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        int int4 = calculator1.getResult();
        calculator1.clear();
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.multiply(1248);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 0);
        calculator1.clear();
        calculator1.clear();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.add(152);
        calculator1.clear();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide((int) '#');
        calculator1.divide((int) (short) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-4000));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(0);
        calculator1.add((int) (short) 100);
        calculator1.substract(10);
        calculator1.add(10);
        calculator1.clear();
        int int9 = calculator1.getResult();
        calculator1.divide((-40));
        calculator1.multiply(4);
        java.lang.Class<?> wildcardClass14 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide(10);
        calculator1.multiply((int) (short) 0);
        calculator1.divide((-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        calculator1.multiply((int) '4');
        calculator1.divide((int) (byte) 1);
        calculator1.multiply((-1));
        int int14 = calculator1.getResult();
        calculator1.divide(7852);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-7852) + "'", int14 == (-7852));
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (byte) 1);
        calculator1.substract((int) 'a');
        calculator1.multiply(0);
        calculator1.divide(100);
        calculator1.divide(100);
        calculator1.clear();
        calculator1.add(39);
        calculator1.add(152);
        calculator1.add(15100);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) ' ');
        calculator1.add(527);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(85);
        calculator1.substract((int) (byte) 100);
        calculator1.substract(49);
        calculator1.multiply(7852);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 0);
        calculator1.clear();
        calculator1.multiply(99);
        calculator1.add(30);
        int int7 = calculator1.getResult();
        calculator1.multiply((-53));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 30 + "'", int7 == 30);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        int int3 = calculator1.getResult();
        calculator1.divide((-100));
        calculator1.divide((-97));
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.divide(1248);
        calculator1.divide((-15100));
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        int int4 = calculator1.getResult();
        calculator1.clear();
        calculator1.clear();
        calculator1.divide(10);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.substract(100);
        calculator1.multiply(48);
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        int int7 = calculator1.getResult();
        calculator1.add(100);
        calculator1.divide((int) '#');
        int int12 = calculator1.getResult();
        calculator1.add(51);
        calculator1.divide(390);
        calculator1.divide(99);
        int int19 = calculator1.getResult();
        int int20 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.divide(40);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(40);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.divide(1);
        calculator1.substract(51);
        calculator1.multiply(151);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.substract(100);
        calculator1.divide(10);
        int int8 = calculator1.getResult();
        int int9 = calculator1.getResult();
        calculator1.divide(152);
        calculator1.multiply((-3783));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-10) + "'", int8 == (-10));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-10) + "'", int9 == (-10));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.divide(10);
        calculator1.divide((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        java.lang.Class<?> wildcardClass14 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(100);
        calculator1.add((int) ' ');
        calculator1.clear();
        calculator1.divide(140);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.multiply(0);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide((int) 'a');
        calculator1.substract(40);
        calculator1.multiply((-10));
        calculator1.divide(40);
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((int) (short) 0);
        calculator1.divide((int) (byte) 100);
        calculator1.substract(510);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        int int4 = calculator1.getResult();
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.clear();
        calculator1.multiply(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        calculator1.substract((int) (byte) 1);
        calculator1.add((int) (byte) 100);
        int int10 = calculator1.getResult();
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.clear();
        calculator1.add(10);
        calculator1.multiply((int) (short) -1);
        calculator1.clear();
        calculator1.multiply((int) (byte) 0);
        calculator1.divide(140);
        int int14 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((int) (short) 0);
        calculator1.clear();
        int int8 = calculator1.getResult();
        int int9 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide((-785));
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        calculator1.divide(99);
        int int10 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.multiply(0);
        calculator1.substract(30);
        calculator1.add((int) '#');
        calculator1.multiply(39);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(51);
        calculator1.multiply((int) (short) 100);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-100));
        calculator1.clear();
        calculator1.multiply((-588));
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.multiply(0);
        calculator1.substract(30);
        calculator1.add((int) '#');
        int int12 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.divide((int) (short) 100);
        int int11 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.divide(1);
        calculator1.substract(51);
        int int16 = calculator1.getResult();
        calculator1.clear();
        java.lang.Class<?> wildcardClass18 = calculator1.getClass();
        calculator1.divide((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-12) + "'", int16 == (-12));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        int int6 = calculator1.getResult();
        int int7 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.divide((-4000));
        int int12 = calculator1.getResult();
        calculator1.multiply(48);
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        java.lang.Class<?> wildcardClass16 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '#');
        calculator1.clear();
        calculator1.divide(7852);
        calculator1.add((int) ' ');
        calculator1.substract((int) ' ');
        int int9 = calculator1.getResult();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-40));
        int int2 = calculator1.getResult();
        calculator1.substract(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-40) + "'", int2 == (-40));
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        calculator1.multiply((int) (short) 100);
        calculator1.multiply((-1));
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.add(100);
        calculator1.clear();
        calculator1.substract((int) (byte) 1);
        calculator1.clear();
        calculator1.divide((-500));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(39);
        calculator1.divide(99);
        calculator1.multiply(200);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.multiply(0);
        calculator1.clear();
        calculator1.multiply(200);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        int int9 = calculator1.getResult();
        calculator1.clear();
        calculator1.add((int) (byte) 1);
        calculator1.multiply((-3783));
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.multiply((-1));
        calculator1.clear();
        int int9 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) '4');
        calculator1.multiply((-97));
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) '4');
        calculator1.add((int) (short) 10);
        calculator1.multiply(4);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        calculator1.multiply(5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.divide(1);
        calculator1.substract(51);
        int int16 = calculator1.getResult();
        int int17 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.divide(85);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-12) + "'", int16 == (-12));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-12) + "'", int17 == (-12));
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.clear();
        calculator1.multiply((int) '#');
        calculator1.multiply(30);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        int int10 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (byte) 1);
        calculator1.divide((int) (short) -1);
        int int8 = calculator1.getResult();
        calculator1.divide(1);
        calculator1.multiply((int) (short) 0);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.add(107);
        calculator1.substract(30);
        calculator1.multiply(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide((int) '#');
        int int8 = calculator1.getResult();
        calculator1.clear();
        calculator1.multiply((-4));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.add(100);
        calculator1.clear();
        calculator1.add((int) (short) 10);
        calculator1.add(39);
        calculator1.multiply(95);
        int int18 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4655 + "'", int18 == 4655);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.divide((int) (short) 100);
        calculator1.add(100);
        calculator1.clear();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.divide(1);
        calculator1.substract(51);
        int int16 = calculator1.getResult();
        int int17 = calculator1.getResult();
        calculator1.divide((-100));
        int int20 = calculator1.getResult();
        java.lang.Class<?> wildcardClass21 = calculator1.getClass();
        calculator1.divide((-12));
        java.lang.Class<?> wildcardClass24 = calculator1.getClass();
        java.lang.Class<?> wildcardClass25 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-12) + "'", int16 == (-12));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-12) + "'", int17 == (-12));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.clear();
        calculator1.multiply((int) '#');
        calculator1.multiply(30);
        calculator1.divide((-39));
        calculator1.divide((-35));
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '#');
        calculator1.clear();
        calculator1.divide(7852);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.multiply(107);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.multiply(0);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide((int) 'a');
        calculator1.substract(40);
        calculator1.substract(390);
        calculator1.substract(78);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.multiply(151);
        calculator1.substract(78);
        calculator1.clear();
        calculator1.divide((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.substract(100);
        int int6 = calculator1.getResult();
        calculator1.substract(40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add(1);
        calculator0.substract(56);
        calculator0.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.divide(1);
        calculator1.substract(51);
        calculator1.multiply((int) (byte) 1);
        calculator1.divide(7400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        int int9 = calculator1.getResult();
        calculator1.add(100);
        calculator1.multiply(5);
        calculator1.substract(15100);
        calculator1.divide((-400));
        calculator1.multiply((-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.clear();
        calculator1.divide((-100));
        calculator1.multiply(40);
        calculator1.substract(1);
        calculator1.clear();
        calculator1.divide(1);
        calculator1.substract(7852);
        calculator1.clear();
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.add((int) ' ');
        calculator1.divide((int) '#');
        int int7 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide((int) (short) 1);
        calculator1.divide(51);
        calculator1.divide((int) (byte) 100);
        calculator1.add((int) ' ');
        calculator1.multiply(0);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(10);
        calculator1.clear();
        calculator1.clear();
        calculator1.multiply(1248);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.add(34);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        calculator1.multiply((int) '4');
        calculator1.divide((int) (byte) 1);
        calculator1.multiply((int) (byte) -1);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 10);
        int int6 = calculator1.getResult();
        calculator1.divide(85);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-4) + "'", int6 == (-4));
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        int int6 = calculator1.getResult();
        int int7 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.divide((-4000));
        calculator1.divide(2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(1248);
        int int2 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1248 + "'", int2 == 1248);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(0);
        int int2 = calculator1.getResult();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.divide(1);
        calculator1.clear();
        calculator1.substract(40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.divide(10);
        calculator1.divide((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        calculator1.multiply(140);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.add(100);
        int int9 = calculator1.getResult();
        calculator1.divide(85);
        calculator1.add((int) 'a');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.clear();
        int int4 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (byte) 1);
        calculator1.divide((int) (short) -1);
        int int8 = calculator1.getResult();
        calculator1.divide(1);
        calculator1.multiply(39);
        calculator1.divide((int) (short) 10);
        int int15 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 187 + "'", int15 == 187);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        int int8 = calculator1.getResult();
        calculator1.clear();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-51));
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        int int9 = calculator1.getResult();
        calculator1.add(100);
        calculator1.multiply(5);
        calculator1.substract(15100);
        calculator1.divide((-400));
        calculator1.clear();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.multiply(0);
        calculator1.divide((int) (byte) -1);
        calculator1.add(85);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(5);
        int int2 = calculator1.getResult();
        calculator1.add(198900);
        calculator1.divide((-14948));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.multiply((int) (byte) -1);
        calculator1.multiply((-97));
        calculator1.multiply((int) (short) 100);
        calculator1.clear();
        calculator1.multiply((int) (byte) 100);
        calculator1.divide(39);
        calculator1.divide(1);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.add(7852);
        calculator1.clear();
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) '4');
        calculator1.add(40);
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        calculator1.clear();
        int int7 = calculator1.getResult();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.divide(696072);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.divide(1);
        int int14 = calculator1.getResult();
        calculator1.clear();
        calculator1.multiply((int) (byte) -1);
        int int18 = calculator1.getResult();
        java.lang.Class<?> wildcardClass19 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 39 + "'", int14 == 39);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.add(100);
        int int9 = calculator1.getResult();
        calculator1.divide(85);
        int int12 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-100));
        calculator1.multiply((int) 'a');
        calculator1.clear();
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.add(4655);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.multiply((int) (short) 100);
        calculator1.multiply(10);
        calculator1.clear();
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        calculator1.multiply((int) (byte) 1);
        java.lang.Class<?> wildcardClass18 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide(7400);
        calculator1.divide((-15100));
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-2));
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.multiply(40);
        int int6 = calculator1.getResult();
        int int7 = calculator1.getResult();
        calculator1.multiply((-7882));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        int int7 = calculator1.getResult();
        calculator1.add(100);
        calculator1.divide((int) '#');
        calculator1.substract((int) ' ');
        calculator1.clear();
        int int15 = calculator1.getResult();
        calculator1.substract(89);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.multiply((-1));
        calculator1.multiply((int) (byte) 0);
        calculator1.multiply((-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        int int8 = calculator1.getResult();
        calculator1.divide((int) '4');
        calculator1.clear();
        int int12 = calculator1.getResult();
        calculator1.substract(39);
        calculator1.add(56);
        java.lang.Class<?> wildcardClass17 = calculator1.getClass();
        calculator1.divide((-49));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 151 + "'", int8 == 151);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.add(100);
        calculator1.clear();
        calculator1.substract((int) 'a');
        calculator1.clear();
        calculator1.multiply((-400));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.divide((int) '#');
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        calculator1.substract(1);
        calculator1.clear();
        calculator1.clear();
        calculator1.add(1248);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide((-400));
        calculator1.divide(4655);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }
}

