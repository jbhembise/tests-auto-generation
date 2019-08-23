package jbhembise.testauto.example1;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(10);
        calculator1.multiply((int) (short) 10);
        calculator1.multiply((int) (byte) -1);
        calculator1.multiply((-25));
        calculator1.divide((-1400000));
        calculator1.add((int) (short) 1);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.multiply((-34107528));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        int int5 = calculator1.getResult();
        calculator1.clear();
        int int7 = calculator1.getResult();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract((int) (byte) 1);
        int int8 = calculator1.getResult();
        calculator1.multiply((-1481));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        int int5 = calculator1.getResult();
        calculator1.add(49);
        calculator1.multiply((-12));
        calculator1.divide((-1400000));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((int) (short) 0);
        calculator1.clear();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide((int) (byte) -1);
        int int7 = calculator1.getResult();
        calculator1.clear();
        calculator1.clear();
        calculator1.substract((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.substract((int) 'a');
        int int8 = calculator1.getResult();
        calculator1.substract(100);
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        int int13 = calculator1.getResult();
        calculator1.clear();
        int int15 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-97) + "'", int8 == (-97));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-197) + "'", int13 == (-197));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.divide((int) '#');
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.add(100);
        int int9 = calculator1.getResult();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        calculator1.multiply((int) (short) 10);
        java.lang.Class<?> wildcardClass14 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(40);
        calculator1.add(152);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide((-14948));
        int int7 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        calculator1.substract((int) (byte) 1);
        calculator1.clear();
        calculator1.multiply((-39));
        calculator1.multiply(35);
        calculator1.divide(15100);
        calculator1.multiply(52);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.substract(100);
        calculator1.divide(10);
        calculator1.add(40);
        calculator1.clear();
        calculator1.add(10);
        calculator1.clear();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract(39);
        calculator1.multiply((int) 'a');
        calculator1.clear();
        int int11 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((-49));
        calculator1.multiply((int) (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.clear();
        calculator1.multiply((int) '#');
        calculator1.divide(40);
        calculator1.substract((int) (byte) 10);
        calculator1.add(152);
        calculator1.add(34);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        int int7 = calculator1.getResult();
        calculator1.add(100);
        calculator1.divide((int) '#');
        calculator1.substract((int) ' ');
        calculator1.multiply((-39));
        java.lang.Class<?> wildcardClass16 = calculator1.getClass();
        calculator1.multiply(4655);
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        calculator1.clear();
        calculator1.multiply(39);
        int int9 = calculator1.getResult();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide((int) (short) 1);
        int int9 = calculator1.getResult();
        calculator1.multiply((-431));
        calculator1.multiply((-1481));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (byte) 1);
        calculator1.divide((int) (short) -1);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.substract(1248);
        calculator1.clear();
        calculator1.divide((-198900));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 10);
        calculator1.add((int) (short) 100);
        calculator1.divide((int) (short) 1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.divide((int) 'a');
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        int int12 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        calculator1.divide((-98));
        calculator1.clear();
        java.lang.Class<?> wildcardClass21 = calculator1.getClass();
        int int22 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 39 + "'", int14 == 39);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 0);
        calculator1.clear();
        calculator1.multiply(99);
        calculator1.add(30);
        int int7 = calculator1.getResult();
        calculator1.divide(71);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 30 + "'", int7 == 30);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        int int7 = calculator1.getResult();
        calculator1.add(100);
        calculator1.divide((int) '#');
        int int12 = calculator1.getResult();
        calculator1.divide((int) (short) 10);
        calculator1.substract(390);
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.divide((int) 'a');
        calculator1.divide((-2));
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.divide((int) (short) 100);
        calculator1.multiply(73);
        calculator1.substract(100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.multiply(10);
        calculator1.multiply((int) '#');
        calculator1.multiply(30);
        calculator1.divide(39);
        calculator1.divide(89);
        calculator1.divide((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        java.lang.Class<?> wildcardClass18 = calculator1.getClass();
        calculator1.substract(40);
        int int21 = calculator1.getResult();
        calculator1.divide(500);
        int int24 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-12) + "'", int16 == (-12));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-12) + "'", int17 == (-12));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-52) + "'", int21 == (-52));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        calculator1.multiply(1);
        calculator1.divide((int) (byte) 100);
        calculator1.substract(10);
        calculator1.add(1);
        calculator1.divide(10);
        int int15 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(10);
        calculator1.add(48);
        calculator1.multiply(99);
        calculator1.clear();
        java.lang.Class<?> wildcardClass16 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.multiply(0);
        calculator1.add((int) (short) 1);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.divide((-197));
        calculator1.multiply(10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        int int5 = calculator1.getResult();
        calculator1.add(49);
        calculator1.add(7852);
        calculator1.divide(35);
        int int12 = calculator1.getResult();
        calculator1.divide(152);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 225 + "'", int12 == 225);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(49);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.add((int) (short) 1);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        calculator1.substract((int) (byte) 1);
        calculator1.add((int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        calculator1.clear();
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.multiply(0);
        calculator1.substract(30);
        calculator1.add((int) '#');
        calculator1.multiply(40);
        calculator1.multiply(140);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.add(107);
        calculator1.substract(30);
        calculator1.divide((-53));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(199);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        int int9 = calculator1.getResult();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        int int11 = calculator1.getResult();
        calculator1.divide((int) (short) 100);
        calculator1.substract(902);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 40 + "'", int9 == 40);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 40 + "'", int11 == 40);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.substract((int) ' ');
        calculator1.clear();
        calculator1.divide((int) (short) 100);
        calculator1.multiply(32);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 0);
        calculator1.clear();
        calculator1.multiply(99);
        calculator1.add(30);
        int int7 = calculator1.getResult();
        calculator1.multiply((-4521544));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 30 + "'", int7 == 30);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(39);
        calculator1.divide(10);
        calculator1.divide(110);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (byte) 1);
        calculator1.substract((int) 'a');
        calculator1.clear();
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.divide((-10));
        calculator1.multiply((-1));
        calculator1.divide((-2000));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        calculator1.clear();
        int int18 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 151 + "'", int8 == 151);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        int int9 = calculator1.getResult();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        int int11 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.clear();
        calculator1.multiply((int) '#');
        calculator1.substract(185);
        calculator1.add(85);
        calculator1.divide((-4521544));
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.clear();
        calculator1.divide((-100));
        calculator1.multiply(40);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.multiply((int) ' ');
        calculator1.multiply(185);
        calculator1.multiply((-1600));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.substract(5);
        calculator1.divide((-7852));
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        calculator1.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass20 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        calculator1.multiply((int) '4');
        calculator1.add((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        calculator1.multiply((-4));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-12));
        int int2 = calculator1.getResult();
        calculator1.divide((-9751));
        int int5 = calculator1.getResult();
        calculator1.divide((-1300));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide(185);
        int int5 = calculator1.getResult();
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 10);
        calculator1.multiply(100);
        calculator1.divide(39);
        int int10 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-10) + "'", int10 == (-10));
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        java.lang.Class<?> wildcardClass19 = calculator1.getClass();
        calculator1.substract((int) (byte) 100);
        int int22 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-100) + "'", int22 == (-100));
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.clear();
        calculator1.add(10);
        calculator1.substract((int) '4');
        calculator1.multiply(696072);
        calculator1.add(52);
        calculator1.add(162);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) '4');
        calculator1.add(40);
        calculator1.clear();
        calculator1.multiply(85);
        calculator1.substract(95);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.add(100);
        calculator1.clear();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(49);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.divide((-400));
        calculator1.divide((-49));
        calculator1.divide(10);
        calculator1.substract(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        calculator1.divide(85);
        calculator1.multiply((-198900));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.substract((int) '4');
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(10);
        calculator1.add(48);
        int int13 = calculator1.getResult();
        int int14 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 78 + "'", int13 == 78);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 78 + "'", int14 == 78);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.substract((int) (byte) 10);
        calculator1.clear();
        calculator1.clear();
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.divide((int) '#');
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        calculator1.substract(1);
        calculator1.clear();
        calculator1.clear();
        calculator1.multiply(98);
        calculator1.substract(51);
        calculator1.divide((-39));
        java.lang.Class<?> wildcardClass18 = calculator1.getClass();
        calculator1.multiply((int) (byte) 1);
        calculator1.clear();
        calculator1.add(198900);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(39);
        calculator1.add(35);
        calculator1.divide((-97));
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide((int) (short) 1);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        int int6 = calculator1.getResult();
        calculator1.substract(100);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.multiply(0);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide((int) 'a');
        calculator1.substract(40);
        calculator1.multiply((-10));
        calculator1.substract(500);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-3877090));
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.clear();
        calculator1.multiply((int) '#');
        calculator1.divide(40);
        calculator1.substract((int) (byte) 10);
        int int11 = calculator1.getResult();
        int int12 = calculator1.getResult();
        calculator1.multiply((-35));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-10) + "'", int11 == (-10));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        int int3 = calculator1.getResult();
        calculator1.divide((-100));
        calculator1.divide((-97));
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.clear();
        calculator1.multiply(151);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.add(7852);
        calculator1.multiply(468);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.substract((int) 'a');
        calculator1.clear();
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        int int10 = calculator1.getResult();
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        calculator1.multiply((-7882));
        int int14 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }
}

