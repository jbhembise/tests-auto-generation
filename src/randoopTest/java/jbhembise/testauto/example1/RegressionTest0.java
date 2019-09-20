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
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.clear();
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        int int11 = calculator0.getResult();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        int int10 = calculator0.getResult();
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(42);
        calculator0.clear();
        calculator0.add(100);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.clear();
        int int10 = calculator0.getResult();
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.clear();
        calculator0.multiply((-42));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        calculator0.divide((int) (byte) 10);
        calculator0.multiply(10);
        calculator0.multiply((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        int int10 = calculator0.getResult();
        calculator0.multiply((int) (byte) 1);
        int int13 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.substract((int) 'a');
        calculator0.multiply(0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.add(100);
        calculator0.substract((int) (short) 1);
        calculator0.clear();
        calculator0.divide((int) 'a');
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-100));
        calculator0.clear();
        calculator0.multiply(2);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((-100));
        int int11 = calculator0.getResult();
        calculator0.substract(100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1000) + "'", int11 == (-1000));
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.clear();
        calculator0.substract(1);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(42);
        calculator0.multiply(52);
        calculator0.multiply((int) (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        calculator0.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add(100);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.substract((int) (byte) 100);
        calculator0.divide(42);
        calculator0.clear();
        calculator0.clear();
        calculator0.add((int) '4');
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(42);
        calculator0.substract((int) (short) 100);
        calculator0.substract(10);
        calculator0.divide((int) '#');
        calculator0.multiply((int) (byte) 10);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.add(100);
        calculator0.multiply((-2));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.add((int) '4');
        calculator0.divide((int) (short) 10);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.clear();
        calculator0.multiply((-2));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.substract((int) (byte) 100);
        calculator0.divide(42);
        calculator0.clear();
        calculator0.clear();
        calculator0.add((int) '4');
        int int11 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.substract((int) (short) 1);
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.multiply(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        calculator0.clear();
        calculator0.clear();
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.substract((int) (byte) 100);
        calculator0.divide(42);
        int int7 = calculator0.getResult();
        calculator0.add((int) (byte) 10);
        int int10 = calculator0.getResult();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(42);
        calculator0.multiply(52);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((-100));
        calculator0.clear();
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.divide((int) '4');
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.clear();
        int int12 = calculator0.getResult();
        calculator0.substract((int) (byte) 10);
        int int15 = calculator0.getResult();
        calculator0.clear();
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.substract(100);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.divide((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.divide((int) (short) 1);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(42);
        calculator0.clear();
        int int8 = calculator0.getResult();
        calculator0.divide(152);
        calculator0.divide((-2));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.divide((int) (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(42);
        calculator0.clear();
        calculator0.multiply((-2));
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.substract((int) (byte) 100);
        calculator0.divide(42);
        calculator0.clear();
        calculator0.clear();
        calculator0.add((int) '4');
        calculator0.divide(2);
        int int13 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.clear();
        int int12 = calculator0.getResult();
        calculator0.substract((int) (byte) 10);
        calculator0.clear();
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        calculator0.multiply((int) (short) 10);
        calculator0.substract((int) (byte) 10);
        int int13 = calculator0.getResult();
        calculator0.substract((int) '#');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1010) + "'", int13 == (-1010));
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.add((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.divide((int) ' ');
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.multiply((int) (short) 0);
        calculator0.clear();
        calculator0.add(10);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 1);
        calculator0.multiply((int) (short) 100);
        calculator0.divide(1);
        calculator0.multiply(10);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.substract(42);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.clear();
        int int13 = calculator0.getResult();
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        int int15 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        int int11 = calculator0.getResult();
        calculator0.multiply((int) (byte) 1);
        calculator0.substract((int) ' ');
        calculator0.substract((int) '#');
        calculator0.multiply((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.add((int) (short) 10);
        calculator0.add(1);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        int int7 = calculator0.getResult();
        calculator0.add(52);
        calculator0.substract((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10) + "'", int7 == (-10));
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) -1);
        calculator0.multiply(52);
        calculator0.add((int) (short) 1);
        calculator0.add(152);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.substract((int) (short) 1);
        int int9 = calculator0.getResult();
        calculator0.divide(10);
        int int12 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.substract((int) 'a');
        calculator0.divide((-9));
        calculator0.multiply(10);
        int int12 = calculator0.getResult();
        calculator0.add(1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 160 + "'", int12 == 160);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.substract(10);
        calculator0.divide((int) (byte) -1);
        calculator0.clear();
        calculator0.substract(83);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) (byte) 1);
        calculator0.clear();
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) (short) 1);
        calculator0.substract((int) (byte) 100);
        calculator0.add(100);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        int int6 = calculator0.getResult();
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.multiply(52);
        int int10 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.substract((int) '4');
        calculator0.multiply(10);
        int int8 = calculator0.getResult();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-520) + "'", int8 == (-520));
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        int int8 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-97) + "'", int8 == (-97));
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) ' ');
        calculator0.substract((int) (byte) 1);
        calculator0.multiply((int) '4');
        int int15 = calculator0.getResult();
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1612 + "'", int15 == 1612);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.divide((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.clear();
        int int10 = calculator0.getResult();
        calculator0.multiply(0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(42);
        calculator0.multiply((int) (byte) -1);
        calculator0.divide((int) (byte) 10);
        int int16 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.clear();
        calculator0.clear();
        calculator0.multiply((int) (byte) 0);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.divide((int) (short) 1);
        calculator0.multiply(52);
        int int9 = calculator0.getResult();
        calculator0.substract(99);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.multiply(10);
        calculator0.add(52);
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) (short) 100);
        calculator0.multiply(42);
        calculator0.substract((int) (short) 1);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.add((int) '#');
        calculator0.substract((int) (byte) 1);
        int int9 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.add((int) 'a');
        calculator0.substract((int) (short) 1);
        calculator0.divide((-1010));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply((int) (short) -1);
        int int12 = calculator0.getResult();
        calculator0.clear();
        calculator0.multiply((int) (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.add((int) ' ');
        calculator0.clear();
        int int6 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        calculator0.multiply(0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.add((int) (byte) 100);
        calculator0.multiply((int) (byte) 1);
        int int9 = calculator0.getResult();
        calculator0.divide(42);
        int int12 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 152 + "'", int9 == 152);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.substract((int) (byte) 10);
        int int8 = calculator0.getResult();
        calculator0.clear();
        calculator0.multiply(2);
        calculator0.multiply(160);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-9) + "'", int8 == (-9));
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.add((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.divide((int) ' ');
        calculator0.divide((int) 'a');
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.add((int) '4');
        int int8 = calculator0.getResult();
        calculator0.substract(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide((int) ' ');
        calculator0.substract((int) '4');
        int int7 = calculator0.getResult();
        calculator0.add(9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-52) + "'", int7 == (-52));
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(42);
        calculator0.multiply((int) (byte) -1);
        calculator0.add(1612);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.add(100);
        int int4 = calculator0.getResult();
        int int5 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.multiply(1);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.divide(160);
        calculator0.divide(1000);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) '4');
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        int int6 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.divide((int) (short) 100);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.add(1);
        calculator0.multiply((int) '4');
        int int13 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((int) (short) 10);
        int int10 = calculator0.getResult();
        calculator0.multiply((int) (short) 10);
        calculator0.multiply((-10));
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) ' ');
        calculator0.substract((int) (byte) 1);
        calculator0.multiply((int) '4');
        calculator0.multiply((-3));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.divide((int) (short) 100);
        calculator0.multiply((int) '4');
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.substract((int) (byte) 10);
        calculator0.clear();
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) '4');
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.multiply(10);
        calculator0.multiply((-1010));
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.multiply((int) (short) 0);
        calculator0.divide((int) (byte) 1);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((int) (short) 10);
        int int10 = calculator0.getResult();
        calculator0.clear();
        calculator0.add(2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.add(20);
        calculator0.add(52);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.add(100);
        calculator0.divide(100);
        int int6 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        int int7 = calculator0.getResult();
        calculator0.multiply((-10));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10) + "'", int7 == (-10));
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(42);
        calculator0.divide((int) 'a');
        int int5 = calculator0.getResult();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        calculator0.divide((int) (byte) 10);
        calculator0.multiply(35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.multiply(1);
        calculator0.add(1);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        calculator0.add((int) '4');
        calculator0.clear();
        calculator0.clear();
        calculator0.divide((int) (byte) -1);
        calculator0.multiply((-41));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.multiply((-1010));
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.multiply(10);
        calculator0.clear();
        int int11 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        int int12 = calculator0.getResult();
        calculator0.multiply((-42));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.divide((int) (byte) -1);
        calculator0.substract(10);
        calculator0.add((int) 'a');
        calculator0.substract(1);
        calculator0.divide((-520));
        calculator0.substract((int) (short) 10);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        int int10 = calculator0.getResult();
        calculator0.multiply((int) (byte) 1);
        calculator0.substract(42);
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) '4');
        calculator0.clear();
        calculator0.divide((-1000));
        int int11 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.substract((int) '#');
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.add(100);
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(42);
        calculator0.multiply(52);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        calculator0.add((int) ' ');
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.substract(10);
        calculator0.divide(2);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(42);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.substract((int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        calculator0.multiply((int) '#');
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        int int8 = calculator0.getResult();
        calculator0.multiply((int) (short) 1);
        calculator0.multiply((-198));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        int int9 = calculator0.getResult();
        calculator0.clear();
        int int11 = calculator0.getResult();
        int int12 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-100));
        calculator0.multiply((-2));
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        int int9 = calculator0.getResult();
        calculator0.add((int) '#');
        int int12 = calculator0.getResult();
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.substract((int) (byte) 100);
        calculator0.divide(42);
        calculator0.clear();
        calculator0.clear();
        calculator0.divide((int) ' ');
        calculator0.divide(1612);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.divide((-32));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        int int8 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide((-3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.multiply((-100));
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.clear();
        calculator0.substract((int) (byte) 100);
        calculator0.add(100);
        calculator0.add(3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) ' ');
        calculator0.substract(42);
        calculator0.clear();
        calculator0.divide(42);
        int int16 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) (short) 1);
        calculator0.substract((int) (byte) 100);
        int int13 = calculator0.getResult();
        calculator0.substract((int) '4');
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-99) + "'", int13 == (-99));
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(100);
        calculator0.divide((int) 'a');
        int int9 = calculator0.getResult();
        calculator0.add((int) (short) 100);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.multiply((int) (byte) -1);
        calculator0.substract((int) (byte) 1);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.clear();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        calculator0.multiply(131);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((-1));
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        int int11 = calculator0.getResult();
        calculator0.divide((int) '4');
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.divide((int) (byte) -1);
        calculator0.substract(10);
        calculator0.add((int) 'a');
        calculator0.substract(1);
        calculator0.divide((-520));
        java.lang.Class<?> wildcardClass18 = calculator0.getClass();
        int int19 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(42);
        calculator0.substract((int) (short) 100);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.substract((int) '4');
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(1612);
        calculator0.divide((-1000));
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        calculator0.multiply(52);
        calculator0.multiply((int) (short) 100);
        calculator0.add(100);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-100));
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.divide((int) (short) -1);
        calculator0.divide((int) (byte) 10);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        calculator0.divide(20);
        int int10 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.substract((int) (byte) 10);
        int int8 = calculator0.getResult();
        calculator0.clear();
        calculator0.multiply(2);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-9) + "'", int8 == (-9));
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.substract(42);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.clear();
        int int13 = calculator0.getResult();
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        calculator0.divide(9);
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        calculator0.substract((int) '4');
        calculator0.add(52);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.multiply((int) 'a');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide((int) ' ');
        calculator0.substract((int) '4');
        calculator0.multiply(52);
        calculator0.substract(8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        int int9 = calculator0.getResult();
        calculator0.divide((int) (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) '4');
        calculator0.substract(100);
        calculator0.multiply(1);
        calculator0.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.clear();
        calculator0.multiply(100);
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.divide((int) (short) 1);
        calculator0.multiply(1000);
        calculator0.multiply(0);
        calculator0.divide(10);
        calculator0.clear();
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        int int8 = calculator0.getResult();
        calculator0.multiply((int) '#');
        calculator0.multiply(0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((int) (short) 10);
        int int10 = calculator0.getResult();
        int int11 = calculator0.getResult();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        int int13 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.clear();
        calculator0.divide((-1010));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.substract(184);
        calculator0.clear();
        int int10 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.add((int) 'a');
        calculator0.add((int) (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        calculator0.add(52);
        calculator0.multiply((-9));
        calculator0.multiply((-198));
        calculator0.substract(1612);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.add(100);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply(100);
        calculator0.multiply(0);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply(42);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(42);
        int int3 = calculator0.getResult();
        calculator0.multiply((int) (byte) 100);
        calculator0.multiply((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide(1);
        calculator0.add(1);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.divide((int) (byte) -1);
        calculator0.substract(10);
        calculator0.clear();
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        calculator0.multiply((int) (byte) -1);
        calculator0.multiply((-99));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(10);
        calculator0.clear();
        calculator0.add(2);
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.multiply((-1));
        int int4 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((int) (short) 10);
        int int10 = calculator0.getResult();
        int int11 = calculator0.getResult();
        int int12 = calculator0.getResult();
        calculator0.divide((int) (short) -1);
        calculator0.multiply(31);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) '4');
        calculator0.substract(100);
        calculator0.multiply(1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        int int5 = calculator0.getResult();
        int int6 = calculator0.getResult();
        calculator0.divide((int) (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.add((int) (short) 1);
        calculator0.clear();
        calculator0.substract((int) (byte) 10);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.multiply((int) (short) 0);
        calculator0.clear();
        calculator0.add(10);
        calculator0.multiply((int) (short) 10);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        int int14 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide(1);
        calculator0.multiply(131);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.divide((int) (byte) -1);
        calculator0.substract((int) (byte) 10);
        int int12 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 87 + "'", int12 == 87);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        calculator0.substract((int) (byte) 1);
        int int6 = calculator0.getResult();
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) '4');
        calculator0.substract(100);
        calculator0.multiply(1);
        calculator0.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.clear();
        calculator0.divide((-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        int int12 = calculator0.getResult();
        calculator0.multiply((-1000));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        int int11 = calculator0.getResult();
        calculator0.multiply((int) (byte) 1);
        calculator0.substract((int) ' ');
        calculator0.substract((int) '#');
        int int18 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-25) + "'", int18 == (-25));
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.add((int) (short) 1);
        calculator0.clear();
        calculator0.divide((int) '4');
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.clear();
        calculator0.multiply(1612);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.substract((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.substract(52);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(42);
        calculator0.multiply(52);
        calculator0.divide((int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        int int17 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply((-100));
        int int12 = calculator0.getResult();
        calculator0.divide(8);
        int int15 = calculator0.getResult();
        int int16 = calculator0.getResult();
        calculator0.divide(20);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) '4');
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.multiply((-1));
        int int11 = calculator0.getResult();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.substract((int) (short) 1);
        int int9 = calculator0.getResult();
        calculator0.divide(152);
        int int12 = calculator0.getResult();
        calculator0.multiply(52);
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        int int11 = calculator0.getResult();
        calculator0.multiply((int) (byte) 1);
        calculator0.substract((int) ' ');
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.substract((int) 'a');
        calculator0.divide((-9));
        calculator0.multiply(10);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.divide((int) '#');
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) (short) 1);
        calculator0.substract((int) (byte) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        int int15 = calculator0.getResult();
        calculator0.add(160);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.substract(10);
        calculator0.divide((int) ' ');
        calculator0.substract(160);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        int int3 = calculator0.getResult();
        calculator0.add(131);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.multiply(43);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) '4');
        calculator0.substract(35);
        calculator0.clear();
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.multiply(1);
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.clear();
        calculator0.divide(100);
        calculator0.add(3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.add((int) 'a');
        calculator0.add(42);
        int int9 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 139 + "'", int9 == 139);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply(100);
        calculator0.multiply(0);
        calculator0.multiply(0);
        calculator0.add(43);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.substract((int) (byte) 100);
        calculator0.divide(42);
        int int7 = calculator0.getResult();
        calculator0.add((int) (byte) 10);
        calculator0.substract(160);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) (short) 100);
        calculator0.clear();
        int int6 = calculator0.getResult();
        calculator0.multiply(35);
        calculator0.add((int) ' ');
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.multiply((int) (short) 0);
        calculator0.clear();
        calculator0.add(10);
        calculator0.substract((int) (byte) 1);
        calculator0.divide((-1010));
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.substract(8);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((-1));
        calculator0.add((int) '4');
        calculator0.substract(152);
        calculator0.clear();
        calculator0.add(100);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) '4');
        calculator0.substract(100);
        calculator0.multiply(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.clear();
        calculator0.clear();
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) (short) 1);
        calculator0.substract((int) (byte) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        calculator0.clear();
        calculator0.multiply((-87));
        java.lang.Class<?> wildcardClass18 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((int) (byte) 100);
        calculator0.substract(42);
        int int13 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 958 + "'", int13 == 958);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) (short) 1);
        calculator0.substract((int) (byte) 100);
        calculator0.substract(10);
        calculator0.multiply((int) (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply(100);
        calculator0.multiply(0);
        calculator0.substract((int) '#');
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        int int10 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-35) + "'", int10 == (-35));
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(42);
        calculator0.clear();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.multiply(1);
        calculator0.add(1);
        calculator0.add(8);
        calculator0.multiply((-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        calculator0.add((int) '4');
        calculator0.divide((-100));
        calculator0.divide((int) '4');
        calculator0.multiply(100);
        calculator0.add(36);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.clear();
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.divide(1612);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.multiply(1);
        calculator0.add(1);
        int int13 = calculator0.getResult();
        calculator0.divide(87);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        int int10 = calculator0.getResult();
        calculator0.multiply((int) (byte) 1);
        calculator0.substract(42);
        int int15 = calculator0.getResult();
        calculator0.multiply(8);
        calculator0.clear();
        calculator0.multiply(26);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-42) + "'", int15 == (-42));
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.substract((int) (byte) 100);
        calculator0.divide(42);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) (short) 100);
        calculator0.clear();
        calculator0.multiply(0);
        calculator0.multiply(100);
        calculator0.multiply((-52));
        int int12 = calculator0.getResult();
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        calculator0.substract((int) (byte) 1);
        calculator0.divide(1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.clear();
        calculator0.substract(1);
        calculator0.multiply(10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        int int6 = calculator0.getResult();
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.divide(42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.divide((-3));
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.substract((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.divide(1612);
        calculator0.clear();
        calculator0.clear();
        calculator0.multiply(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.substract(10);
        calculator0.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.clear();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.multiply(152);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.multiply(1);
        calculator0.add(1);
        int int13 = calculator0.getResult();
        calculator0.add((int) (byte) 1);
        calculator0.add(1);
        calculator0.multiply(42);
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.clear();
        calculator0.substract((int) (byte) 100);
        calculator0.add(100);
        int int14 = calculator0.getResult();
        calculator0.divide(52);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.substract((int) (byte) 100);
        calculator0.divide(42);
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        int int9 = calculator0.getResult();
        int int10 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        calculator0.substract((int) (byte) 1);
        int int6 = calculator0.getResult();
        calculator0.multiply((-42));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) (short) 1);
        calculator0.substract((int) (byte) 100);
        int int13 = calculator0.getResult();
        int int14 = calculator0.getResult();
        calculator0.divide((-100));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-99) + "'", int13 == (-99));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-99) + "'", int14 == (-99));
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.multiply(0);
        calculator0.divide((int) ' ');
        calculator0.multiply(139);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.divide((int) '4');
        calculator0.multiply((int) (byte) -1);
        calculator0.clear();
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.divide(160);
        calculator0.clear();
        calculator0.substract(152);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) (short) 100);
        calculator0.clear();
        int int6 = calculator0.getResult();
        calculator0.add((int) (short) 1);
        calculator0.multiply((-43));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.divide((int) (short) 100);
        calculator0.divide(52);
        calculator0.substract((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((int) (short) 10);
        int int10 = calculator0.getResult();
        int int11 = calculator0.getResult();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(42);
        int int3 = calculator0.getResult();
        int int4 = calculator0.getResult();
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        calculator0.divide((int) (byte) 10);
        calculator0.multiply(10);
        calculator0.multiply((int) 'a');
        calculator0.divide((int) 'a');
        calculator0.divide((-42));
        calculator0.multiply(1);
        int int22 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(10);
        calculator0.clear();
        calculator0.add(8);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.divide((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.multiply(152);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.add((int) 'a');
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.substract(10);
        calculator0.divide((int) (byte) -1);
        int int9 = calculator0.getResult();
        calculator0.substract((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.divide((int) '4');
        calculator0.add((int) (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.divide((int) (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        int int9 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.substract((int) '4');
        calculator0.multiply(10);
        int int8 = calculator0.getResult();
        calculator0.multiply(99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-520) + "'", int8 == (-520));
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.substract(10);
        calculator0.divide(9);
        int int12 = calculator0.getResult();
        calculator0.multiply(183);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.divide(160);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(3);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        int int10 = calculator0.getResult();
        calculator0.multiply((int) (byte) 1);
        calculator0.substract(42);
        int int15 = calculator0.getResult();
        calculator0.multiply(8);
        calculator0.multiply(2);
        calculator0.divide((-42));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-42) + "'", int15 == (-42));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.divide((int) '#');
        calculator0.substract((int) (short) 10);
        calculator0.clear();
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.substract((int) (short) 1);
        calculator0.multiply(131);
        calculator0.divide(152);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((-1));
        calculator0.add((int) '4');
        calculator0.divide((-97));
        calculator0.multiply(52);
        calculator0.clear();
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        int int3 = calculator0.getResult();
        calculator0.divide((-3));
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.multiply(1);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.divide(160);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.clear();
        calculator0.divide((int) (short) 1);
        int int12 = calculator0.getResult();
        int int13 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(42);
        calculator0.divide((int) 'a');
        int int5 = calculator0.getResult();
        int int6 = calculator0.getResult();
        calculator0.divide((-198));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        int int11 = calculator0.getResult();
        calculator0.multiply((int) (byte) 1);
        calculator0.substract((int) ' ');
        calculator0.add((int) (short) 10);
        calculator0.substract((int) (byte) 100);
        calculator0.multiply((int) '4');
        int int22 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-4160) + "'", int22 == (-4160));
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) (short) 1);
        calculator0.substract((int) (byte) 100);
        calculator0.substract(10);
        calculator0.multiply(99);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        int int4 = calculator0.getResult();
        calculator0.multiply((int) (short) 10);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.multiply((int) (short) 0);
        calculator0.clear();
        calculator0.add(10);
        calculator0.multiply((int) (short) 10);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        int int14 = calculator0.getResult();
        int int15 = calculator0.getResult();
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract(1612);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) ' ');
        calculator0.substract((int) (byte) 1);
        calculator0.add((int) (byte) 100);
        calculator0.add((int) ' ');
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.add(160);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) '4');
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.multiply((-1));
        calculator0.substract((int) '4');
        calculator0.multiply((int) (short) 1);
        calculator0.add(8);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.multiply(0);
        calculator0.divide((int) ' ');
        calculator0.divide(8);
        calculator0.divide(10);
        calculator0.add((int) 'a');
        int int16 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.add(100);
        calculator0.substract((int) (short) 1);
        calculator0.clear();
        calculator0.substract(31);
        calculator0.add((int) ' ');
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.substract((int) '#');
        int int11 = calculator0.getResult();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-35) + "'", int11 == (-35));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.substract(42);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.substract(160);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(10);
        calculator0.clear();
        calculator0.add(2);
        int int15 = calculator0.getResult();
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide((int) ' ');
        calculator0.add(1);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) (short) 1);
        calculator0.substract((int) (byte) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        int int15 = calculator0.getResult();
        calculator0.add((int) '4');
        calculator0.multiply((-520));
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.substract((int) '#');
        calculator0.substract(100);
        calculator0.multiply(31);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.divide(152);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        calculator0.multiply((-520));
        int int8 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-100));
        calculator0.clear();
        calculator0.multiply((-106));
        calculator0.add(26);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.substract((int) (byte) 10);
        calculator0.substract((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.add((int) '#');
        calculator0.substract(10);
        calculator0.substract(958);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) (short) 100);
        calculator0.clear();
        int int6 = calculator0.getResult();
        calculator0.multiply(35);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract(52);
        calculator0.divide((-42));
        int int7 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.clear();
        calculator0.multiply((-162));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.clear();
        int int12 = calculator0.getResult();
        calculator0.substract((int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.add(1);
        int int11 = calculator0.getResult();
        calculator0.multiply((int) (short) -1);
        calculator0.add(83);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.clear();
        calculator0.divide((-42));
        calculator0.divide((-99));
        int int14 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.add(100);
        int int4 = calculator0.getResult();
        calculator0.add(8);
        calculator0.add((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply(100);
        calculator0.multiply(0);
        calculator0.substract((int) '#');
        calculator0.divide(43);
        calculator0.add(26);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(42);
        calculator0.divide(31);
        calculator0.add(43);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.clear();
        calculator0.substract(1);
        calculator0.substract((int) (short) 1);
        calculator0.multiply((-42));
        calculator0.divide(83);
        calculator0.divide((-43));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.multiply(0);
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.add((int) (short) 100);
        calculator0.divide((-10));
        calculator0.multiply(11);
        calculator0.divide((-142));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.substract(10);
        calculator0.divide(9);
        calculator0.divide((-2));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        calculator0.multiply(52);
        calculator0.add(520);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.substract(42);
        calculator0.add(10);
        int int13 = calculator0.getResult();
        calculator0.substract(1);
        calculator0.multiply((-9));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-32) + "'", int13 == (-32));
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        int int8 = calculator0.getResult();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        int int11 = calculator0.getResult();
        int int12 = calculator0.getResult();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply((-100));
        int int12 = calculator0.getResult();
        calculator0.divide(8);
        int int15 = calculator0.getResult();
        int int16 = calculator0.getResult();
        int int17 = calculator0.getResult();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((int) (short) 10);
        int int10 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.substract(20);
        calculator0.multiply(160);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.divide((int) (byte) -1);
        calculator0.substract(10);
        calculator0.add((int) 'a');
        calculator0.substract(1);
        calculator0.divide((-520));
        calculator0.substract(8);
        calculator0.divide((-35));
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.divide((int) (byte) -1);
        calculator0.substract(10);
        calculator0.clear();
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        calculator0.clear();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        int int10 = calculator0.getResult();
        calculator0.multiply((int) (byte) 1);
        calculator0.substract(42);
        int int15 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-42) + "'", int15 == (-42));
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.substract((int) 'a');
        calculator0.divide((-9));
        calculator0.multiply(10);
        int int12 = calculator0.getResult();
        calculator0.substract(184);
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 160 + "'", int12 == 160);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) ' ');
        calculator0.substract((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        calculator0.multiply((-52));
        calculator0.substract((int) '#');
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide((int) ' ');
        calculator0.substract((int) '4');
        calculator0.multiply(52);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.divide(20);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(42);
        calculator0.divide((int) 'a');
        int int5 = calculator0.getResult();
        int int6 = calculator0.getResult();
        int int7 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        int int6 = calculator0.getResult();
        calculator0.add((int) (short) 1);
        int int9 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(42);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.substract((int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        int int16 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-10) + "'", int16 == (-10));
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.divide((int) (short) 100);
        calculator0.multiply(100);
        calculator0.divide((-100));
        calculator0.divide(52);
        calculator0.substract((int) '4');
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        calculator0.divide((-1));
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply((-100));
        calculator0.multiply((int) (byte) 10);
        int int14 = calculator0.getResult();
        calculator0.add(1000);
        calculator0.substract(131);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.divide((int) (short) 1);
        calculator0.multiply(1000);
        calculator0.multiply(0);
        int int11 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.divide((int) (short) 1);
        calculator0.multiply(1000);
        int int9 = calculator0.getResult();
        calculator0.multiply(1000);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.divide((int) (short) 1);
        calculator0.multiply(52);
        int int9 = calculator0.getResult();
        calculator0.divide(1612);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.multiply(1);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.divide(160);
        calculator0.divide((-198));
        calculator0.add(42);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((int) (byte) 100);
        calculator0.clear();
        int int12 = calculator0.getResult();
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) ' ');
        calculator0.substract(42);
        calculator0.clear();
        calculator0.multiply((int) '#');
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        int int17 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) (short) 1);
        calculator0.substract((int) (byte) 100);
        int int13 = calculator0.getResult();
        calculator0.substract(1000);
        calculator0.add((int) '4');
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-99) + "'", int13 == (-99));
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(42);
        calculator0.divide((int) 'a');
        calculator0.multiply(1612);
        calculator0.add(1000);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.substract(83);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.add((int) 'a');
        int int7 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.divide((-10));
        calculator0.substract((int) (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply(100);
        calculator0.clear();
        int int6 = calculator0.getResult();
        int int7 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.multiply(42);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        int int3 = calculator0.getResult();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        int int11 = calculator0.getResult();
        calculator0.multiply((int) (byte) 1);
        calculator0.substract((int) ' ');
        calculator0.add((int) (short) 10);
        calculator0.substract((int) (byte) 100);
        calculator0.multiply(183);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) '4');
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.multiply((-1));
        int int11 = calculator0.getResult();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.multiply(97);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.divide((int) (byte) -1);
        calculator0.substract(10);
        calculator0.substract(20);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        int int15 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 67 + "'", int15 == 67);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.add(20);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.multiply((-99));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.divide((int) (short) 1);
        calculator0.multiply(1000);
        int int9 = calculator0.getResult();
        calculator0.multiply(1000);
        calculator0.divide((-1));
        calculator0.multiply(10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(100);
        calculator0.divide((int) 'a');
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(42);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.substract((int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        calculator0.clear();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.substract((int) 'a');
        calculator0.divide((-9));
        calculator0.multiply(10);
        int int12 = calculator0.getResult();
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 160 + "'", int12 == 160);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        calculator0.add(52);
        calculator0.multiply((-9));
        calculator0.multiply((-198));
        int int10 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 185328 + "'", int10 == 185328);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) ' ');
        calculator0.substract(42);
        calculator0.clear();
        calculator0.add(8);
        calculator0.substract(10);
        java.lang.Class<?> wildcardClass18 = calculator0.getClass();
        calculator0.add(33);
        java.lang.Class<?> wildcardClass21 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        int int7 = calculator0.getResult();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.clear();
        int int10 = calculator0.getResult();
        calculator0.multiply(160);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10) + "'", int7 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        int int6 = calculator0.getResult();
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.substract(100);
        int int10 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-100) + "'", int10 == (-100));
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.clear();
        calculator0.divide((-142));
        calculator0.divide((-43));
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.multiply(0);
        calculator0.divide((int) ' ');
        calculator0.divide(8);
        calculator0.divide(10);
        calculator0.clear();
        calculator0.multiply(185328);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.multiply((int) (byte) 100);
        calculator0.add((int) '4');
        calculator0.clear();
        int int10 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.substract((int) 'a');
        calculator0.divide((-9));
        calculator0.clear();
        int int11 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.add((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.substract((int) (byte) 100);
        calculator0.divide(42);
        calculator0.clear();
        calculator0.clear();
        calculator0.add((int) '4');
        calculator0.clear();
        calculator0.multiply(52);
        int int14 = calculator0.getResult();
        calculator0.multiply(43);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        int int11 = calculator0.getResult();
        calculator0.multiply((int) (byte) -1);
        calculator0.multiply((-1000));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-100) + "'", int11 == (-100));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.multiply(0);
        calculator0.divide((int) ' ');
        calculator0.divide(8);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.divide(152);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        int int11 = calculator0.getResult();
        int int12 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        int int3 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((int) (short) 10);
        int int10 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(42);
        calculator0.clear();
        calculator0.clear();
        calculator0.add((int) '4');
        calculator0.clear();
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.substract(42);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.clear();
        calculator0.multiply((int) (byte) 0);
        int int15 = calculator0.getResult();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.substract((int) 'a');
        calculator0.divide((-9));
        calculator0.clear();
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) '4');
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.multiply(10);
        calculator0.add(31);
        calculator0.multiply(0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(42);
        calculator0.clear();
        calculator0.multiply((-32));
        calculator0.add(520);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.substract((int) (byte) 100);
        calculator0.multiply(36);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) ' ');
        calculator0.substract((int) (byte) 1);
        calculator0.add((int) (byte) 100);
        calculator0.add(185328);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.substract(42);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.clear();
        int int13 = calculator0.getResult();
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        calculator0.multiply(42);
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((int) (byte) 100);
        calculator0.substract(42);
        calculator0.multiply((int) '4');
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.multiply((int) (short) 0);
        calculator0.clear();
        calculator0.add(10);
        calculator0.multiply((int) (short) 10);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        int int14 = calculator0.getResult();
        int int15 = calculator0.getResult();
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract(3);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.substract((int) (byte) 10);
        calculator0.divide(43);
        int int10 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-100));
        int int7 = calculator0.getResult();
        calculator0.add(52);
        calculator0.divide((-520));
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        int int13 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.multiply((int) (short) 0);
        calculator0.clear();
        calculator0.add(10);
        calculator0.substract((int) (byte) 1);
        calculator0.divide((-42));
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        calculator0.multiply((int) (short) 10);
        calculator0.multiply((-1000));
        int int14 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-100000) + "'", int14 == (-100000));
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.substract((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        int int10 = calculator0.getResult();
        calculator0.multiply((int) '#');
        calculator0.multiply(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract(31);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.substract((int) (byte) 10);
        calculator0.divide(43);
        calculator0.multiply((-1000));
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.multiply(1);
        calculator0.add(1);
        int int13 = calculator0.getResult();
        calculator0.divide((-10));
        calculator0.add((int) '#');
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.multiply((int) (short) 0);
        calculator0.clear();
        calculator0.add(10);
        calculator0.multiply((int) (short) 10);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        int int14 = calculator0.getResult();
        calculator0.add(10);
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((-1));
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.multiply(9);
        calculator0.multiply((-1010));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        calculator0.divide((int) ' ');
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.clear();
        calculator0.multiply((-43));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.add(100);
        calculator0.substract((int) (short) 1);
        calculator0.clear();
        calculator0.multiply(0);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        int int13 = calculator0.getResult();
        calculator0.divide((-198));
        calculator0.clear();
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.clear();
        calculator0.clear();
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.add(43);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(100);
        calculator0.divide((int) 'a');
        int int9 = calculator0.getResult();
        calculator0.divide((int) (short) -1);
        calculator0.divide((int) (byte) 1);
        int int14 = calculator0.getResult();
        int int15 = calculator0.getResult();
        calculator0.substract((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply(100);
        calculator0.multiply(0);
        calculator0.multiply(0);
        calculator0.substract((int) (short) 1);
        calculator0.clear();
        int int12 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.multiply(1);
        calculator0.add(1);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        calculator0.add((int) '4');
        calculator0.clear();
        calculator0.clear();
        calculator0.divide((int) (byte) -1);
        calculator0.multiply(187);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        calculator0.divide((-52));
        calculator0.clear();
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) (short) 1);
        calculator0.divide((int) (byte) 100);
        calculator0.multiply(1);
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        calculator0.clear();
        calculator0.multiply(26);
        calculator0.clear();
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.multiply((int) (short) 0);
        calculator0.clear();
        calculator0.add(10);
        calculator0.multiply((int) (short) 10);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        int int14 = calculator0.getResult();
        int int15 = calculator0.getResult();
        calculator0.multiply((int) (byte) 100);
        int int18 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10000 + "'", int18 == 10000);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        int int11 = calculator0.getResult();
        calculator0.multiply((int) (byte) -1);
        calculator0.divide((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-100) + "'", int11 == (-100));
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.add((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.add(36);
        calculator0.clear();
        calculator0.multiply((-1010));
        int int13 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        int int9 = calculator0.getResult();
        calculator0.add((int) '#');
        calculator0.multiply((int) 'a');
        calculator0.add(187);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(42);
        calculator0.divide((int) 'a');
        calculator0.clear();
        calculator0.multiply(131);
        calculator0.divide(99);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.clear();
        calculator0.divide((-142));
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.substract(10);
        calculator0.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.clear();
        calculator0.multiply(2);
        int int13 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-4160));
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        calculator0.add((int) '4');
        calculator0.divide((-100));
        calculator0.divide(33);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.clear();
        calculator0.clear();
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.multiply((-1));
        calculator0.add(1);
        calculator0.add(67);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.add((int) (byte) 100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        int int8 = calculator0.getResult();
        calculator0.substract(131);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 152 + "'", int8 == 152);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.add(100);
        calculator0.substract((int) (short) 1);
        int int9 = calculator0.getResult();
        calculator0.divide((-97));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((-100));
        calculator0.substract(2);
        calculator0.divide((-198));
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) (short) 1);
        calculator0.substract((int) (byte) 100);
        calculator0.substract(10);
        calculator0.substract(187);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.add((int) '4');
        int int8 = calculator0.getResult();
        int int9 = calculator0.getResult();
        calculator0.divide(1612);
        int int12 = calculator0.getResult();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(42);
        calculator0.multiply(83);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.multiply(0);
        calculator0.divide((int) ' ');
        calculator0.divide(8);
        calculator0.divide(10);
        calculator0.clear();
        int int15 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.substract((int) (byte) 10);
        int int8 = calculator0.getResult();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.clear();
        int int11 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-9) + "'", int8 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        int int6 = calculator0.getResult();
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.multiply(52);
        calculator0.add((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) -1);
        calculator0.multiply(52);
        calculator0.add((int) (short) 1);
        calculator0.add(99);
        calculator0.substract(67);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(42);
        calculator0.divide(31);
        calculator0.add(10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) ' ');
        calculator0.substract(42);
        calculator0.clear();
        calculator0.substract(52);
        calculator0.divide(520);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        int int5 = calculator0.getResult();
        calculator0.add(3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-100) + "'", int5 == (-100));
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.divide((int) (short) 1);
        calculator0.multiply(1000);
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.multiply((-162));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        calculator0.clear();
        calculator0.substract((int) (short) 100);
        calculator0.multiply(152);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract(10);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        calculator0.add(100);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.substract((int) (short) 1);
        int int9 = calculator0.getResult();
        calculator0.divide(152);
        int int12 = calculator0.getResult();
        calculator0.multiply(52);
        calculator0.multiply(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.clear();
        int int12 = calculator0.getResult();
        calculator0.substract((int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        calculator0.multiply((-1000));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.add(100);
        int int4 = calculator0.getResult();
        calculator0.divide((-1010));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        calculator0.multiply((int) (byte) 10);
        int int8 = calculator0.getResult();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        int int11 = calculator0.getResult();
        calculator0.clear();
        calculator0.substract((int) (byte) 1);
        calculator0.add((int) '4');
        calculator0.add((int) '#');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.clear();
        calculator0.multiply(152);
        int int6 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(42);
        calculator0.multiply(131);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        int int10 = calculator0.getResult();
        calculator0.multiply((int) (byte) 1);
        calculator0.substract(42);
        int int15 = calculator0.getResult();
        calculator0.multiply(8);
        calculator0.clear();
        calculator0.divide(139);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-42) + "'", int15 == (-42));
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.multiply(10);
        calculator0.divide((int) (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((-100));
        int int11 = calculator0.getResult();
        calculator0.clear();
        int int13 = calculator0.getResult();
        calculator0.divide(2);
        calculator0.multiply((-106));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1000) + "'", int11 == (-1000));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.substract((int) (byte) 100);
        calculator0.divide(42);
        calculator0.clear();
        calculator0.clear();
        calculator0.add((int) '4');
        calculator0.clear();
        calculator0.multiply(52);
        calculator0.clear();
        int int15 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(10);
        calculator0.multiply((-52));
        calculator0.multiply(2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) (short) 100);
        calculator0.clear();
        int int6 = calculator0.getResult();
        calculator0.add((int) (short) 1);
        calculator0.multiply(1612);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.clear();
        calculator0.divide(20);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.divide((-35));
        calculator0.divide((int) '#');
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        int int11 = calculator0.getResult();
        calculator0.clear();
        calculator0.substract((int) (byte) 1);
        calculator0.add((int) '4');
        calculator0.multiply(33);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.substract(10890);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.clear();
        calculator0.divide((int) (short) 1);
        calculator0.divide((int) (byte) 100);
        calculator0.multiply((-198));
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.add((int) (short) 100);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.multiply(10);
        calculator0.add((int) (short) 1);
        calculator0.multiply((-99));
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        calculator0.substract(10);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        int int6 = calculator0.getResult();
        calculator0.multiply((int) (short) 10);
        calculator0.multiply(1612);
        calculator0.divide((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.substract((int) 'a');
        calculator0.divide((-9));
        calculator0.multiply(10);
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.add((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.multiply((-87));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) ' ');
        calculator0.substract((int) (byte) 1);
        int int13 = calculator0.getResult();
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 31 + "'", int13 == 31);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) (short) 100);
        calculator0.clear();
        calculator0.multiply(0);
        calculator0.multiply(100);
        calculator0.add(99);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) (short) 1);
        calculator0.add(43);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        calculator0.divide((-1));
        int int8 = calculator0.getResult();
        calculator0.multiply(1000);
        calculator0.clear();
        calculator0.substract((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        calculator0.substract((int) (byte) 1);
        calculator0.clear();
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.substract(1000);
        calculator0.divide((-1010));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.substract((int) (byte) 10);
        calculator0.divide(43);
        calculator0.multiply(10890);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        calculator0.add((int) '4');
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        int int8 = calculator0.getResult();
        calculator0.multiply(187);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        calculator0.multiply((int) (short) 10);
        calculator0.substract((int) (byte) 10);
        int int13 = calculator0.getResult();
        calculator0.multiply((-1010));
        calculator0.divide(10);
        calculator0.divide(2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1010) + "'", int13 == (-1010));
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) '4');
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.multiply((-1));
        int int11 = calculator0.getResult();
        calculator0.divide((int) (short) 100);
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.add((int) (short) 1);
        calculator0.clear();
        calculator0.divide(10);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide((int) ' ');
        calculator0.add(1);
        calculator0.divide((-100000));
        calculator0.multiply((-42));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((-1));
        calculator0.divide((int) (byte) -1);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        int int5 = calculator0.getResult();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(42);
        calculator0.multiply(52);
        calculator0.divide((int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        calculator0.divide(185328);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) '4');
        calculator0.clear();
        calculator0.divide((-1000));
        calculator0.divide((int) '#');
        calculator0.clear();
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        calculator0.add((int) '4');
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.multiply((-97));
        int int10 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.add((int) '#');
        calculator0.clear();
        calculator0.divide((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.divide((-100));
        calculator0.substract(20);
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        int int5 = calculator0.getResult();
        calculator0.multiply((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-100));
        int int7 = calculator0.getResult();
        calculator0.multiply((int) (byte) 1);
        calculator0.substract((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) (short) 1);
        calculator0.divide((int) (byte) 100);
        calculator0.multiply(1);
        calculator0.divide((-43));
        calculator0.divide((-10));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.add(100);
        calculator0.substract((int) (short) 1);
        calculator0.clear();
        calculator0.multiply(0);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        int int13 = calculator0.getResult();
        calculator0.multiply((int) (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.substract((int) (short) 1);
        int int9 = calculator0.getResult();
        calculator0.divide(10);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.clear();
        calculator0.multiply((int) 'a');
        int int12 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((int) (short) 10);
        int int10 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.substract(20);
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.substract((int) 'a');
        calculator0.add(43);
        int int10 = calculator0.getResult();
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-106) + "'", int10 == (-106));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.multiply((int) (short) 0);
        calculator0.clear();
        calculator0.add(10);
        calculator0.add((int) (short) 100);
        calculator0.divide((int) (short) -1);
        calculator0.divide((-2));
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        calculator0.multiply((int) (short) 10);
        calculator0.multiply((-1000));
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        calculator0.add(2);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        calculator0.add((int) (short) 10);
        int int7 = calculator0.getResult();
        calculator0.add(20);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.divide((-198));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        int int8 = calculator0.getResult();
        calculator0.divide(35);
        calculator0.divide((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.add(100);
        calculator0.substract((int) (short) 1);
        calculator0.clear();
        calculator0.multiply(0);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        int int13 = calculator0.getResult();
        calculator0.multiply((-9900));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        calculator0.substract(10);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        int int4 = calculator0.getResult();
        calculator0.clear();
        calculator0.multiply(1000);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.multiply((-4160));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.substract(42);
        calculator0.add(10);
        int int13 = calculator0.getResult();
        calculator0.substract(1);
        calculator0.divide(20);
        calculator0.multiply(26);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-32) + "'", int13 == (-32));
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.divide((int) (short) 1);
        calculator0.clear();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract(10);
        int int8 = calculator0.getResult();
        int int9 = calculator0.getResult();
        calculator0.multiply(152);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-10) + "'", int8 == (-10));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-10) + "'", int9 == (-10));
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.add((int) '4');
        int int8 = calculator0.getResult();
        int int9 = calculator0.getResult();
        calculator0.divide(1612);
        calculator0.add(2);
        calculator0.multiply(152);
        calculator0.divide((-100));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        calculator0.divide(83);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        int int9 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.add(97);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply(100);
        calculator0.multiply(0);
        calculator0.multiply(0);
        calculator0.clear();
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) ' ');
        calculator0.substract((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        calculator0.multiply(10);
        calculator0.multiply((-2));
        calculator0.divide(87);
        calculator0.substract(9);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        int int8 = calculator0.getResult();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.clear();
        int int12 = calculator0.getResult();
        calculator0.substract((int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        int int16 = calculator0.getResult();
        int int17 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-10) + "'", int16 == (-10));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-10) + "'", int17 == (-10));
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.add((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.divide((int) ' ');
        calculator0.divide((int) 'a');
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.substract(10);
        calculator0.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        int int10 = calculator0.getResult();
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.multiply((int) '4');
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        calculator0.divide((int) (byte) -1);
        calculator0.add((int) ' ');
        calculator0.multiply((-106));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((int) (short) 10);
        int int10 = calculator0.getResult();
        calculator0.multiply((int) (short) 10);
        calculator0.substract(43);
        calculator0.add(1);
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        int int18 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-42) + "'", int18 == (-42));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) '4');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.clear();
        calculator0.multiply((-52));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.add((int) '#');
        calculator0.clear();
        calculator0.divide((int) (short) 100);
        calculator0.clear();
        calculator0.substract(183);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.divide((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.multiply((-10));
        calculator0.divide(9);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.multiply(0);
        calculator0.divide((int) ' ');
        calculator0.divide(8);
        calculator0.divide(10);
        calculator0.add((int) 'a');
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        calculator0.divide((-162));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) ' ');
        calculator0.substract((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        calculator0.multiply(10);
        calculator0.substract(10890);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-100));
        calculator0.clear();
        calculator0.multiply((-106));
        calculator0.add(26);
        calculator0.clear();
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.multiply((int) (short) 0);
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        int int10 = calculator0.getResult();
        calculator0.multiply((-53));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.add((int) '4');
        int int8 = calculator0.getResult();
        int int9 = calculator0.getResult();
        calculator0.divide(1612);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        calculator0.add((int) (short) 10);
        calculator0.multiply(52);
        calculator0.add(10000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.add(100);
        calculator0.substract((int) (short) 1);
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.multiply(1);
        calculator0.add(1);
        int int13 = calculator0.getResult();
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        int int15 = calculator0.getResult();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.divide(2);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.divide((int) (short) 1);
        calculator0.multiply(52);
        int int9 = calculator0.getResult();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        int int7 = calculator0.getResult();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.clear();
        int int10 = calculator0.getResult();
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10) + "'", int7 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-10));
        calculator0.divide(1000);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.divide(97);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) '4');
        calculator0.clear();
        calculator0.divide((-1000));
        calculator0.multiply((int) 'a');
        int int13 = calculator0.getResult();
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.clear();
        int int11 = calculator0.getResult();
        calculator0.substract(31);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide(1);
        calculator0.add(1);
        int int10 = calculator0.getResult();
        int int11 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        calculator0.clear();
        calculator0.multiply(8);
        int int11 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        calculator0.multiply((int) (short) 10);
        calculator0.divide((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(42);
        calculator0.substract((int) (short) 100);
        calculator0.substract(10);
        calculator0.divide((int) '#');
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) (short) 1);
        calculator0.substract((int) (byte) 100);
        calculator0.clear();
        int int14 = calculator0.getResult();
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        int int16 = calculator0.getResult();
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        java.lang.Class<?> wildcardClass18 = calculator0.getClass();
        int int19 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        calculator0.clear();
        int int12 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.multiply(0);
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        int int10 = calculator0.getResult();
        int int11 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.substract((int) (byte) 100);
        calculator0.divide(42);
        calculator0.clear();
        calculator0.clear();
        calculator0.add((int) '4');
        calculator0.clear();
        calculator0.multiply(52);
        calculator0.clear();
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide((int) ' ');
        calculator0.substract((int) '4');
        int int7 = calculator0.getResult();
        int int8 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-52) + "'", int7 == (-52));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-52) + "'", int8 == (-52));
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.add((int) (short) 100);
        int int10 = calculator0.getResult();
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide(1);
        calculator0.add(1);
        calculator0.add((int) (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.add(20);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(42);
        calculator0.clear();
        int int8 = calculator0.getResult();
        calculator0.substract((int) (short) 10);
        calculator0.add(2);
        int int13 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-8) + "'", int13 == (-8));
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((int) (short) 10);
        int int10 = calculator0.getResult();
        int int11 = calculator0.getResult();
        int int12 = calculator0.getResult();
        calculator0.multiply((int) (short) 10);
        calculator0.clear();
        calculator0.add(99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.substract((int) (byte) 10);
        calculator0.divide(43);
        calculator0.multiply(10000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        calculator0.add((int) (byte) 10);
        calculator0.substract((int) 'a');
        int int8 = calculator0.getResult();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-87) + "'", int8 == (-87));
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        int int10 = calculator0.getResult();
        calculator0.multiply((int) (byte) 1);
        calculator0.substract(42);
        calculator0.multiply(33);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.divide((int) (byte) -1);
        calculator0.substract(10);
        calculator0.add((int) 'a');
        calculator0.substract(1);
        calculator0.divide((-520));
        calculator0.multiply((int) '#');
        int int20 = calculator0.getResult();
        calculator0.multiply(31);
        calculator0.divide(2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.multiply(0);
        calculator0.divide((int) ' ');
        calculator0.divide(8);
        calculator0.divide(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.substract(42);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.clear();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-100));
        calculator0.clear();
        calculator0.multiply(152);
        calculator0.multiply((-2));
        calculator0.substract(11);
        calculator0.divide((-25));
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        int int8 = calculator0.getResult();
        int int9 = calculator0.getResult();
        calculator0.multiply(26);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.multiply((-142));
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.divide((-1));
        int int8 = calculator0.getResult();
        int int9 = calculator0.getResult();
        calculator0.multiply((-10));
        calculator0.add(42);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) '4');
        calculator0.clear();
        calculator0.divide((-1000));
        calculator0.divide(83);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) 10);
        calculator0.clear();
        calculator0.multiply((-52));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        calculator0.multiply(52);
        calculator0.multiply((int) (short) 100);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.clear();
        calculator0.add(26);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(42);
        calculator0.substract((int) (short) 100);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        int int6 = calculator0.getResult();
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-142) + "'", int6 == (-142));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.clear();
        int int12 = calculator0.getResult();
        calculator0.substract((int) (byte) 10);
        int int15 = calculator0.getResult();
        calculator0.clear();
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        calculator0.divide((-4160));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        int int10 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.clear();
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.multiply(42);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.substract(42);
        int int11 = calculator0.getResult();
        calculator0.substract(184);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-42) + "'", int11 == (-42));
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide((int) ' ');
        calculator0.divide(1612);
        calculator0.clear();
        calculator0.multiply(0);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.add(1612);
        calculator0.divide((int) 'a');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.multiply((int) (byte) 100);
        calculator0.multiply((-10001));
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((-100));
        calculator0.substract(2);
        calculator0.multiply(183);
        calculator0.multiply(33);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.add((int) (short) 1);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.clear();
        calculator0.divide((int) 'a');
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
}

