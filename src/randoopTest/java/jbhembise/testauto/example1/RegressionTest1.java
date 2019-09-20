package jbhembise.testauto.example1;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        calculator0.add((int) (byte) 1);
        calculator0.add(33);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
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
        calculator0.add(36);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        calculator0.multiply((int) (byte) 10);
        calculator0.divide(1000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.divide(160);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(3);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.substract(42);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.substract(152);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.multiply((int) (byte) 100);
        calculator0.add((int) '4');
        calculator0.clear();
        calculator0.multiply(52);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.add(1000);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.substract((int) (byte) 100);
        calculator0.divide(42);
        calculator0.clear();
        calculator0.clear();
        calculator0.add((int) '4');
        calculator0.clear();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        calculator0.divide(3);
        calculator0.divide(958);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide((int) ' ');
        calculator0.substract((int) '4');
        calculator0.multiply(52);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.substract(20);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.add(187);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.divide((int) (short) 100);
        calculator0.multiply(100);
        calculator0.divide((-100));
        calculator0.divide(52);
        calculator0.multiply((-43));
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.divide(3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
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
        java.lang.Class<?> wildcardClass18 = calculator0.getClass();
        calculator0.divide((int) ' ');
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.substract(42);
        calculator0.add(10);
        int int13 = calculator0.getResult();
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-32) + "'", int13 == (-32));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.add((int) (short) 10);
        calculator0.divide((int) (short) -1);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.add(11);
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) -1);
        calculator0.multiply(52);
        calculator0.add((int) (short) 1);
        int int13 = calculator0.getResult();
        int int14 = calculator0.getResult();
        int int15 = calculator0.getResult();
        calculator0.substract(10890);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.divide((int) (byte) 1);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        calculator0.substract((int) (byte) 1);
        calculator0.multiply((-100));
        int int8 = calculator0.getResult();
        int int9 = calculator0.getResult();
        calculator0.divide((-53));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.multiply(1);
        calculator0.substract((int) (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
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
        calculator0.divide((-1010));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply(100);
        calculator0.multiply(0);
        calculator0.substract((int) '#');
        calculator0.substract(152);
        calculator0.multiply((-19));
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.add((int) '#');
        calculator0.substract((int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract(31);
        calculator0.add(87);
        calculator0.multiply(10890);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
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
        calculator0.add((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.add((int) 'a');
        calculator0.add(42);
        calculator0.add(3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply(100);
        calculator0.multiply(0);
        calculator0.substract((int) '#');
        calculator0.substract(99);
        calculator0.multiply(26);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
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
        calculator0.substract((int) 'a');
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        calculator0.add((int) '4');
        calculator0.divide((-100));
        calculator0.divide((int) '4');
        calculator0.add(152);
        calculator0.add(3);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) '4');
        calculator0.substract(100);
        calculator0.add(20);
        calculator0.divide(2);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
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
        int int17 = calculator0.getResult();
        java.lang.Class<?> wildcardClass18 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(42);
        calculator0.clear();
        calculator0.multiply((-32));
        calculator0.multiply((int) (short) 0);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
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
        calculator0.divide((-198));
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        calculator0.add((int) (short) 10);
        int int7 = calculator0.getResult();
        calculator0.add(20);
        calculator0.substract((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) '4');
        calculator0.substract(100);
        calculator0.multiply(1);
        calculator0.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        int int12 = calculator0.getResult();
        calculator0.add(3);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9900) + "'", int12 == (-9900));
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        calculator0.multiply(52);
        calculator0.multiply((int) (short) 100);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.clear();
        calculator0.divide((int) ' ');
        calculator0.substract((int) '#');
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.divide((int) (short) 1);
        calculator0.multiply(1000);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        int int10 = calculator0.getResult();
        calculator0.substract(10890);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.add(1);
        int int11 = calculator0.getResult();
        calculator0.clear();
        int int13 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.add((int) '#');
        calculator0.clear();
        int int8 = calculator0.getResult();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide((int) ' ');
        calculator0.divide(1612);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
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
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.clear();
        calculator0.multiply((int) (short) 10);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
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
        calculator0.divide(139);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
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
        calculator0.multiply(52);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.substract((int) (byte) 100);
        calculator0.divide(42);
        calculator0.clear();
        calculator0.clear();
        calculator0.divide((int) ' ');
        calculator0.clear();
        int int12 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.clear();
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) (short) 100);
        calculator0.clear();
        calculator0.multiply(0);
        calculator0.multiply(100);
        calculator0.substract(97);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.clear();
        calculator0.clear();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.add(87);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) '4');
        calculator0.clear();
        calculator0.divide((-1000));
        calculator0.multiply((int) 'a');
        calculator0.substract(9);
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(100);
        calculator0.divide((int) 'a');
        int int9 = calculator0.getResult();
        calculator0.add((int) (short) 100);
        calculator0.clear();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.clear();
        calculator0.multiply((-520));
        int int13 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        int int5 = calculator0.getResult();
        calculator0.add(1000);
        calculator0.multiply((-106));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.add(26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        calculator0.multiply((int) (byte) 10);
        calculator0.add(958);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        calculator0.add(52);
        calculator0.multiply((-9));
        calculator0.multiply(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.multiply((int) (byte) 100);
        calculator0.add((int) '4');
        calculator0.clear();
        calculator0.multiply(52);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        int int13 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-100));
        int int7 = calculator0.getResult();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.substract(10);
        calculator0.multiply(0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
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
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        int int5 = calculator0.getResult();
        calculator0.add(1000);
        calculator0.substract((int) ' ');
        calculator0.clear();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.add((int) '#');
        calculator0.divide(958);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.substract((int) 'a');
        calculator0.add(43);
        int int10 = calculator0.getResult();
        calculator0.substract(183);
        calculator0.multiply(0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-106) + "'", int10 == (-106));
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        calculator0.divide((int) (byte) 10);
        calculator0.multiply(10);
        calculator0.substract(1612);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        int int9 = calculator0.getResult();
        calculator0.multiply((int) (byte) 10);
        calculator0.clear();
        int int13 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) '4');
        calculator0.substract(100);
        calculator0.add(20);
        int int9 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-79) + "'", int9 == (-79));
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(42);
        calculator0.clear();
        calculator0.clear();
        calculator0.add((int) '4');
        calculator0.divide(160);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(1612);
        calculator0.divide((int) (byte) 1);
        int int9 = calculator0.getResult();
        int int10 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        int int9 = calculator0.getResult();
        calculator0.add((int) '#');
        calculator0.multiply(10);
        calculator0.divide((-3));
        calculator0.add(10);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        int int11 = calculator0.getResult();
        calculator0.multiply((int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        int int15 = calculator0.getResult();
        calculator0.divide(10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 42 + "'", int15 == 42);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        int int12 = calculator0.getResult();
        int int13 = calculator0.getResult();
        calculator0.divide((-100));
        calculator0.multiply((-198));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1000 + "'", int13 == 1000);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.substract((int) (byte) 10);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.divide(160);
        calculator0.clear();
        calculator0.clear();
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.substract((int) (byte) 10);
        calculator0.divide(43);
        calculator0.clear();
        calculator0.add(1612);
        calculator0.divide((-79));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(42);
        calculator0.clear();
        calculator0.clear();
        calculator0.add((int) '4');
        calculator0.divide((-142));
        calculator0.substract((int) 'a');
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
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
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        calculator0.divide(43);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        calculator0.divide((int) 'a');
        calculator0.substract(33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply(100);
        calculator0.multiply(0);
        calculator0.multiply(0);
        calculator0.substract((int) (short) 1);
        calculator0.multiply(20);
        calculator0.clear();
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
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
        calculator0.divide((-9900));
        java.lang.Class<?> wildcardClass20 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide((int) ' ');
        calculator0.substract((int) '4');
        calculator0.multiply(52);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.substract((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.divide((int) '4');
        calculator0.add(26);
        calculator0.substract(131);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((int) (byte) 100);
        calculator0.clear();
        calculator0.clear();
        calculator0.substract(10000);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) (short) 100);
        calculator0.clear();
        calculator0.multiply(0);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((-100));
        int int11 = calculator0.getResult();
        calculator0.clear();
        int int13 = calculator0.getResult();
        calculator0.add(12);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1000) + "'", int11 == (-1000));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.substract(184);
        calculator0.clear();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.divide(9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((-100));
        int int11 = calculator0.getResult();
        calculator0.add((int) ' ');
        calculator0.divide((int) (byte) 100);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1000) + "'", int11 == (-1000));
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.substract((int) (byte) 10);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
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
        calculator0.add(2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
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
        calculator0.add(152);
        calculator0.multiply((-20));
        calculator0.divide(58);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.clear();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.add(100);
        calculator0.substract((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.clear();
        calculator0.divide(958);
        int int13 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
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
        calculator0.divide(31);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
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
        calculator0.multiply(0);
        calculator0.multiply((-100));
        calculator0.clear();
        calculator0.divide((-52));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        calculator0.divide((int) (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-42) + "'", int15 == (-42));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
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
        calculator0.multiply((-53));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
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
        calculator0.divide((-32));
        calculator0.add(958);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-100));
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.divide((int) (short) -1);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.substract((int) (byte) 10);
        int int8 = calculator0.getResult();
        calculator0.clear();
        calculator0.add(31);
        calculator0.divide((-100));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-9) + "'", int8 == (-9));
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        int int5 = calculator0.getResult();
        calculator0.add(1000);
        calculator0.substract((int) ' ');
        calculator0.add(31);
        calculator0.divide(131);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        calculator0.add(100);
        calculator0.clear();
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) (short) 1);
        calculator0.substract((int) (byte) 100);
        calculator0.clear();
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
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
        calculator0.add(152);
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) (short) 100);
        calculator0.clear();
        calculator0.multiply(0);
        calculator0.multiply(100);
        calculator0.add(99);
        calculator0.multiply(139);
        calculator0.multiply((-41));
        int int16 = calculator0.getResult();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((-100));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-564201) + "'", int16 == (-564201));
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(10);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.add(42);
        calculator0.multiply((-20));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.substract((int) (byte) 10);
        int int8 = calculator0.getResult();
        calculator0.clear();
        calculator0.add(31);
        int int12 = calculator0.getResult();
        calculator0.divide((-17));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-9) + "'", int8 == (-9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.substract((int) (byte) 100);
        calculator0.divide(42);
        calculator0.clear();
        calculator0.clear();
        calculator0.divide((int) ' ');
        calculator0.add(131);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.add(100);
        calculator0.substract((int) (short) 1);
        calculator0.multiply((int) (short) -1);
        calculator0.clear();
        calculator0.multiply(9);
        calculator0.clear();
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.clear();
        calculator0.substract((int) (byte) 100);
        calculator0.divide((-41));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply((-100));
        calculator0.multiply((int) (byte) 10);
        calculator0.clear();
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        calculator0.divide((-520));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
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
        calculator0.clear();
        calculator0.divide((-10));
        int int19 = calculator0.getResult();
        calculator0.add(35);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.add(1);
        calculator0.multiply((-2));
        calculator0.divide((-32));
        calculator0.multiply((-99));
        calculator0.clear();
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) ' ');
        calculator0.add(8);
        calculator0.clear();
        calculator0.substract(1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        int int6 = calculator0.getResult();
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.add((int) 'a');
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.divide(131);
        int int10 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        int int9 = calculator0.getResult();
        calculator0.substract(3);
        calculator0.multiply(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.substract((int) 'a');
        calculator0.divide((-9));
        calculator0.clear();
        calculator0.divide(83);
        calculator0.multiply((int) (byte) -1);
        calculator0.multiply((int) (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.add((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.divide((int) ' ');
        int int11 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) ' ');
        calculator0.substract((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        calculator0.divide((-1));
        calculator0.add(184);
        java.lang.Class<?> wildcardClass18 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(42);
        calculator0.clear();
        calculator0.clear();
        calculator0.add((int) '4');
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        int int12 = calculator0.getResult();
        calculator0.divide((int) (byte) -1);
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.add(1);
        int int11 = calculator0.getResult();
        calculator0.divide(43);
        calculator0.multiply(3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.substract(10);
        calculator0.divide(9);
        int int12 = calculator0.getResult();
        calculator0.divide(1612);
        int int15 = calculator0.getResult();
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.add((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.divide((int) ' ');
        calculator0.divide((int) 'a');
        calculator0.multiply(0);
        calculator0.add((int) (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) (short) 1);
        calculator0.substract((int) (byte) 100);
        int int13 = calculator0.getResult();
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        int int15 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-99) + "'", int13 == (-99));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-99) + "'", int15 == (-99));
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.substract((int) (byte) 10);
        int int8 = calculator0.getResult();
        calculator0.add(43);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.add((int) '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-9) + "'", int8 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.clear();
        calculator0.clear();
        calculator0.substract((int) '#');
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
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
        calculator0.multiply(139);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.add((int) (byte) 100);
        calculator0.multiply((int) (byte) 1);
        calculator0.multiply((int) '#');
        int int11 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5320 + "'", int11 == 5320);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
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
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
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
        calculator0.divide((-9));
        calculator0.clear();
        calculator0.divide(33);
        calculator0.divide((int) ' ');
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((-100));
        calculator0.substract(2);
        calculator0.multiply(43);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply(100);
        calculator0.multiply(0);
        calculator0.multiply(0);
        calculator0.substract((int) (short) 1);
        calculator0.multiply(20);
        calculator0.divide(87);
        int int15 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        int int9 = calculator0.getResult();
        calculator0.clear();
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.substract(58);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        int int9 = calculator0.getResult();
        calculator0.add((int) '#');
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.clear();
        calculator0.divide(20);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) (short) 100);
        calculator0.clear();
        calculator0.multiply(0);
        calculator0.multiply((int) ' ');
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.divide(1612);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.divide((int) '4');
        int int8 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.multiply((int) (short) 0);
        calculator0.multiply((int) (short) 10);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(42);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) '4');
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.multiply((-1));
        int int11 = calculator0.getResult();
        calculator0.divide(52);
        calculator0.add((int) (byte) 1);
        calculator0.multiply(0);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.divide((-1));
        int int8 = calculator0.getResult();
        calculator0.clear();
        calculator0.add(10890);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        calculator0.add(100);
        int int8 = calculator0.getResult();
        calculator0.add(42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((int) (short) 10);
        int int10 = calculator0.getResult();
        calculator0.clear();
        int int12 = calculator0.getResult();
        calculator0.divide(31);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.add(100);
        calculator0.substract((int) (short) 1);
        calculator0.clear();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((int) (short) 10);
        int int10 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.divide(1000);
        calculator0.multiply(0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.add(187);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) '4');
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.multiply((-1));
        calculator0.divide(42);
        calculator0.multiply(152);
        calculator0.clear();
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.add((int) (byte) 100);
        calculator0.multiply((int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) '4');
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.multiply((-1));
        int int11 = calculator0.getResult();
        calculator0.divide(52);
        calculator0.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        calculator0.add(9);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        int int12 = calculator0.getResult();
        int int13 = calculator0.getResult();
        calculator0.divide((-100));
        int int16 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1000 + "'", int13 == 1000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-10) + "'", int16 == (-10));
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.add(100);
        calculator0.substract((int) (short) 1);
        calculator0.multiply((int) (short) -1);
        calculator0.divide((-520));
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.substract((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.substract(52);
        int int12 = calculator0.getResult();
        calculator0.multiply((-35));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-53) + "'", int12 == (-53));
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-100));
        int int7 = calculator0.getResult();
        calculator0.add(52);
        calculator0.clear();
        int int11 = calculator0.getResult();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        int int11 = calculator0.getResult();
        calculator0.multiply((int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        int int15 = calculator0.getResult();
        calculator0.divide((-97));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 42 + "'", int15 == 42);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) '4');
        calculator0.substract(100);
        calculator0.multiply(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.clear();
        calculator0.substract(152);
        calculator0.multiply(958);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.divide((int) '#');
        calculator0.multiply((int) (byte) 10);
        calculator0.add((int) (short) 1);
        calculator0.multiply(31);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((-100));
        calculator0.substract(2);
        calculator0.multiply(183);
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add(3);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        int int5 = calculator0.getResult();
        calculator0.add(1000);
        calculator0.substract((int) ' ');
        calculator0.add(9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.substract(1000);
        calculator0.divide((-42));
        calculator0.clear();
        calculator0.divide((-41));
        calculator0.substract(26);
        calculator0.add((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.multiply(10);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        int int11 = calculator0.getResult();
        calculator0.divide(3);
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) ' ');
        calculator0.substract((int) (byte) 1);
        calculator0.multiply((int) '4');
        calculator0.clear();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) '4');
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.multiply((-1));
        int int11 = calculator0.getResult();
        calculator0.divide(52);
        calculator0.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
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
        calculator0.divide(52);
        int int18 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
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
        calculator0.substract((int) (short) 100);
        calculator0.add(87);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.substract((int) '#');
        int int11 = calculator0.getResult();
        calculator0.divide((int) (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-35) + "'", int11 == (-35));
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.add(1);
        calculator0.multiply((int) '4');
        calculator0.divide(1000);
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        calculator0.multiply((-9900));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.add((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.divide((int) ' ');
        calculator0.divide((int) 'a');
        calculator0.multiply(0);
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.multiply((-100));
        calculator0.divide((int) (short) 1);
        calculator0.clear();
        calculator0.substract(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide(1);
        calculator0.add(1);
        calculator0.substract((int) (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        int int6 = calculator0.getResult();
        calculator0.multiply((int) (short) 10);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.substract((int) '#');
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.divide((int) (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply(100);
        calculator0.multiply(0);
        calculator0.multiply(0);
        calculator0.substract((int) (short) 1);
        calculator0.clear();
        calculator0.add(350);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((int) (short) 10);
        int int10 = calculator0.getResult();
        calculator0.multiply((int) (short) 10);
        calculator0.multiply((-10));
        calculator0.multiply((int) '#');
        calculator0.multiply(0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.clear();
        calculator0.clear();
        calculator0.multiply((-17));
        calculator0.add(958);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.clear();
        calculator0.substract(1);
        calculator0.substract((int) (short) 1);
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.substract(33950);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) -1);
        calculator0.substract(42);
        calculator0.substract((int) (byte) 1);
        calculator0.clear();
        calculator0.divide(26);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) (byte) 1);
        calculator0.multiply((-1664));
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.add(100);
        calculator0.substract((int) (short) 1);
        calculator0.multiply(42);
        calculator0.divide(139);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply(100);
        calculator0.clear();
        calculator0.clear();
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.divide((-100000));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
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
        calculator0.divide(42);
        calculator0.divide((-1010));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.substract(10);
        calculator0.divide((int) ' ');
        calculator0.multiply(350);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) (short) 1);
        calculator0.divide((int) (byte) 100);
        calculator0.multiply((int) (short) 0);
        calculator0.divide(31);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.add((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.add(36);
        calculator0.clear();
        calculator0.multiply((-1010));
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        int int5 = calculator0.getResult();
        calculator0.substract((int) ' ');
        calculator0.substract((int) ' ');
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.multiply((-100));
        calculator0.multiply(160);
        calculator0.multiply(33950);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) '4');
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.multiply(10);
        calculator0.multiply((-1010));
        calculator0.divide((int) 'a');
        calculator0.add(10);
        calculator0.substract(67);
        calculator0.add(97);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply((-100));
        int int12 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide((-2));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.multiply(10);
        calculator0.substract((int) ' ');
        calculator0.add(12);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) '4');
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.multiply((-1));
        int int11 = calculator0.getResult();
        calculator0.divide((int) (short) 100);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(10);
        calculator0.multiply((-1010));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.divide((int) (short) 100);
        calculator0.divide((-100000));
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
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
        calculator0.clear();
        calculator0.divide((-87));
        calculator0.divide((-10001));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.clear();
        calculator0.add((int) (byte) 10);
        calculator0.multiply(11);
        calculator0.multiply(152);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.add(20);
        calculator0.add((int) '#');
        calculator0.divide((int) (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.divide((int) (short) 1);
        calculator0.multiply(1000);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.divide((-79));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.add((int) (short) 1);
        calculator0.clear();
        calculator0.multiply((-19));
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) -1);
        calculator0.substract(42);
        calculator0.substract((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        calculator0.multiply(100);
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
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
        calculator0.multiply((-9900));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.divide((int) '#');
        calculator0.substract((int) (short) 10);
        calculator0.add((int) (byte) 1);
        int int12 = calculator0.getResult();
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        calculator0.add((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        int int5 = calculator0.getResult();
        calculator0.add(1000);
        calculator0.substract((int) ' ');
        calculator0.add(31);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        calculator0.divide((-1));
        int int8 = calculator0.getResult();
        calculator0.multiply(1000);
        calculator0.clear();
        calculator0.add((int) (short) 10);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        calculator0.add(100);
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        calculator0.multiply((int) (short) 10);
        calculator0.substract((int) (byte) 10);
        calculator0.multiply(10000);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) '4');
        calculator0.clear();
        calculator0.divide((-1000));
        calculator0.multiply((int) 'a');
        calculator0.substract(9);
        calculator0.clear();
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 1);
        calculator0.divide(52);
        calculator0.clear();
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.clear();
        calculator0.divide((-142));
        calculator0.substract(99);
        calculator0.multiply(10000);
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.add((int) (byte) 100);
        calculator0.multiply((int) (byte) 1);
        int int9 = calculator0.getResult();
        calculator0.divide(42);
        calculator0.multiply((-198));
        calculator0.multiply(10890);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 152 + "'", int9 == 152);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.substract((int) (byte) 10);
        calculator0.substract(33);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.multiply((int) (short) 0);
        calculator0.clear();
        calculator0.add(1);
        calculator0.substract((int) 'a');
        calculator0.clear();
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        int int8 = calculator0.getResult();
        calculator0.clear();
        calculator0.add(87);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) '4');
        calculator0.clear();
        calculator0.divide(8);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        calculator0.multiply((-106));
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.substract((int) (byte) 1);
        calculator0.divide((-97));
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
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
        calculator0.divide((-10));
        java.lang.Class<?> wildcardClass18 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-99) + "'", int13 == (-99));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(42);
        int int3 = calculator0.getResult();
        int int4 = calculator0.getResult();
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.add(1);
        calculator0.multiply((-2));
        calculator0.divide((-32));
        calculator0.divide((-1000));
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(42);
        calculator0.divide((int) 'a');
        int int5 = calculator0.getResult();
        calculator0.multiply((int) (short) -1);
        calculator0.add(1612);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
        int int16 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1612 + "'", int15 == 1612);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1612 + "'", int16 == 1612);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.add(100);
        calculator0.substract((int) (short) 1);
        calculator0.multiply((int) (short) -1);
        calculator0.clear();
        calculator0.multiply(9);
        calculator0.substract(20);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        int int9 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        int int13 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) (short) 100);
        calculator0.clear();
        calculator0.multiply(0);
        calculator0.multiply((int) ' ');
        int int10 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((-1));
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        int int11 = calculator0.getResult();
        calculator0.substract((int) (short) 1);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.add((int) (short) 100);
        calculator0.add(10);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        calculator0.divide((-1));
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide((int) ' ');
        calculator0.substract((int) '4');
        int int7 = calculator0.getResult();
        calculator0.multiply(958);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-52) + "'", int7 == (-52));
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.add(1);
        calculator0.multiply((-2));
        calculator0.clear();
        int int14 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) ' ');
        calculator0.substract((int) (byte) 1);
        calculator0.multiply((int) '4');
        calculator0.clear();
        int int16 = calculator0.getResult();
        calculator0.multiply(968);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.clear();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.multiply(1);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.divide((int) 'a');
        int int14 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.clear();
        calculator0.clear();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        calculator0.divide((int) (byte) 10);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.add(1612);
        calculator0.clear();
        calculator0.divide(1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.add((int) (byte) 100);
        calculator0.multiply((int) (byte) 1);
        int int9 = calculator0.getResult();
        calculator0.divide(42);
        calculator0.add(10890);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 152 + "'", int9 == 152);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        int int5 = calculator0.getResult();
        calculator0.add(1000);
        calculator0.substract((int) ' ');
        calculator0.clear();
        calculator0.divide((-20));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.add(20);
        int int12 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.clear();
        calculator0.multiply(36);
        calculator0.clear();
        calculator0.add((int) ' ');
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
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
        calculator0.add(26);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((int) (short) 10);
        int int10 = calculator0.getResult();
        calculator0.multiply((int) (short) 10);
        calculator0.multiply((-10));
        calculator0.multiply((int) '#');
        calculator0.divide((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
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
        calculator0.multiply((-99));
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        calculator0.clear();
        calculator0.divide((-10));
        int int19 = calculator0.getResult();
        calculator0.multiply(43);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-100));
        calculator0.clear();
        calculator0.multiply(152);
        calculator0.multiply((-2));
        calculator0.clear();
        calculator0.multiply((-35));
        calculator0.divide((int) (short) 1);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
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
        calculator0.multiply((-198));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
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
        calculator0.multiply(0);
        calculator0.multiply((-100));
        calculator0.clear();
        calculator0.add(10000);
        calculator0.multiply((int) (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-42) + "'", int15 == (-42));
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.substract(1000);
        calculator0.divide((-42));
        calculator0.clear();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
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
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        int int17 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        int int12 = calculator0.getResult();
        int int13 = calculator0.getResult();
        calculator0.divide((-100));
        calculator0.add(36);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1000 + "'", int13 == 1000);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
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
        calculator0.multiply((-9));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
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
        calculator0.substract((int) (short) 100);
        calculator0.multiply((-19));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.substract(42);
        calculator0.add(10);
        int int13 = calculator0.getResult();
        calculator0.substract(1);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        calculator0.substract(184);
        calculator0.divide(160);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-32) + "'", int13 == (-32));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
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
        calculator0.multiply((-4160));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) (short) 1);
        calculator0.substract((int) (byte) 100);
        calculator0.substract(10);
        int int15 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-109) + "'", int15 == (-109));
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) (short) 1);
        calculator0.substract((int) (byte) 100);
        calculator0.clear();
        calculator0.clear();
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract(131);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract(52);
        calculator0.divide((-42));
        calculator0.add(58);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        calculator0.substract((int) '4');
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(42);
        calculator0.substract((int) (short) 100);
        calculator0.substract(10);
        calculator0.multiply((int) (short) 100);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        int int10 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-15200) + "'", int10 == (-15200));
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.add((int) (byte) 100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        int int8 = calculator0.getResult();
        int int9 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 152 + "'", int8 == 152);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 152 + "'", int9 == 152);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
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
        calculator0.divide(8);
        calculator0.multiply((-99));
        java.lang.Class<?> wildcardClass20 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        calculator0.multiply(52);
        calculator0.multiply((int) (short) 100);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.clear();
        int int10 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        calculator0.divide((-1));
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.substract(185328);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.add((int) (short) 100);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.add(67);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        int int11 = calculator0.getResult();
        calculator0.clear();
        calculator0.substract((int) (byte) 1);
        calculator0.add(183);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        calculator0.multiply((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.multiply((-97));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        calculator0.add((int) (short) 10);
        int int7 = calculator0.getResult();
        calculator0.add(20);
        calculator0.multiply((int) (short) 100);
        calculator0.divide((-198));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
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
        calculator0.divide((-10001));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(10);
        calculator0.clear();
        calculator0.multiply(185328);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.add((int) (byte) 100);
        calculator0.multiply((int) (byte) 1);
        calculator0.divide(160);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-10));
        calculator0.divide(1000);
        calculator0.divide(1000);
        calculator0.multiply((-564201));
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.divide((-42));
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) ' ');
        calculator0.substract((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        calculator0.divide((-1));
        calculator0.multiply((-9));
        calculator0.substract(35);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(10);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        int int13 = calculator0.getResult();
        calculator0.divide((int) (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
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
        calculator0.clear();
        java.lang.Class<?> wildcardClass18 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
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
        java.lang.Class<?> wildcardClass18 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1010) + "'", int13 == (-1010));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        int int7 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-100));
        calculator0.clear();
        calculator0.multiply((-106));
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        calculator0.clear();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        calculator0.divide((-35));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 1);
        calculator0.clear();
        calculator0.clear();
        calculator0.multiply(87);
        calculator0.divide((-9));
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
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
        calculator0.add(184);
        calculator0.multiply((-41));
        int int19 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-7544) + "'", int19 == (-7544));
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((-1));
        calculator0.add((int) '4');
        calculator0.substract(152);
        int int14 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-100) + "'", int14 == (-100));
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
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
        calculator0.multiply(99);
        int int19 = calculator0.getResult();
        calculator0.divide(350);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10890 + "'", int19 == 10890);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.substract((int) (byte) 10);
        int int8 = calculator0.getResult();
        calculator0.clear();
        calculator0.add(31);
        calculator0.multiply((-9));
        calculator0.clear();
        calculator0.substract(11);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-9) + "'", int8 == (-9));
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
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
        calculator0.divide(350);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.substract((int) (byte) 10);
        int int8 = calculator0.getResult();
        calculator0.clear();
        calculator0.add(31);
        int int12 = calculator0.getResult();
        calculator0.substract(183);
        calculator0.multiply(10);
        calculator0.add(33);
        calculator0.divide((-42));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-9) + "'", int8 == (-9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        calculator0.add((int) '4');
        calculator0.divide((-100));
        calculator0.multiply(2);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(42);
        calculator0.clear();
        int int8 = calculator0.getResult();
        calculator0.divide(152);
        calculator0.multiply((-97));
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        calculator0.multiply((int) (byte) 10);
        int int8 = calculator0.getResult();
        calculator0.multiply((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.substract((int) (byte) 10);
        calculator0.substract(9);
        int int7 = calculator0.getResult();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.divide((-142));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-19) + "'", int7 == (-19));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
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
        java.lang.Class<?> wildcardClass18 = calculator0.getClass();
        calculator0.multiply(520);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.multiply((int) (short) 0);
        calculator0.clear();
        calculator0.add(10);
        int int11 = calculator0.getResult();
        calculator0.multiply(43);
        calculator0.substract(1000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(42);
        int int3 = calculator0.getResult();
        int int4 = calculator0.getResult();
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.divide((-10));
        int int9 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((-100));
        int int11 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide((-520));
        calculator0.divide((-4160));
        calculator0.multiply((-42));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1000) + "'", int11 == (-1000));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.add(1);
        int int11 = calculator0.getResult();
        calculator0.substract((int) (byte) 10);
        int int14 = calculator0.getResult();
        calculator0.multiply((-198));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-9) + "'", int14 == (-9));
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        calculator0.divide((int) (byte) 10);
        calculator0.multiply(10);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        calculator0.multiply((-3));
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) '4');
        calculator0.multiply((-43));
        int int7 = calculator0.getResult();
        calculator0.multiply((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-43) + "'", int7 == (-43));
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.clear();
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        calculator0.multiply((int) (byte) 10);
        calculator0.substract((int) (short) 10);
        int int10 = calculator0.getResult();
        calculator0.substract(83);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-10) + "'", int10 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.add(1);
        calculator0.multiply((int) '4');
        calculator0.divide(1000);
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        calculator0.multiply((-1000));
        calculator0.multiply((int) (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
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
        calculator0.clear();
        calculator0.divide((-10));
        int int19 = calculator0.getResult();
        calculator0.clear();
        calculator0.multiply((-32));
        calculator0.multiply(42);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
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
        calculator0.multiply((-1010));
        calculator0.multiply(12);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        calculator0.multiply((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.add(1000);
        calculator0.substract(42);
        int int16 = calculator0.getResult();
        calculator0.multiply(33);
        int int19 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-42) + "'", int16 == (-42));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1386) + "'", int19 == (-1386));
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.multiply(3582);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply(100);
        calculator0.multiply(0);
        calculator0.substract((int) '#');
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.add(1);
        int int11 = calculator0.getResult();
        calculator0.multiply((-87));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) (short) 1);
        calculator0.substract((int) (byte) 100);
        calculator0.clear();
        calculator0.clear();
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        calculator0.clear();
        calculator0.multiply((int) (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
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
        calculator0.divide((-198));
        java.lang.Class<?> wildcardClass20 = calculator0.getClass();
        calculator0.divide(1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.divide((int) (byte) -1);
        calculator0.substract((int) (byte) 10);
        calculator0.multiply(184);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        calculator0.divide(10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.divide((int) (short) 1);
        calculator0.multiply(1000);
        calculator0.multiply((-87));
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.add(1);
        int int11 = calculator0.getResult();
        calculator0.multiply((int) (short) -1);
        calculator0.divide((-142));
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.substract(10);
        calculator0.divide((int) (byte) -1);
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(42);
        calculator0.substract((int) (short) 100);
        calculator0.substract(10);
        calculator0.divide((int) '#');
        calculator0.add((int) (byte) 10);
        int int11 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply(100);
        calculator0.clear();
        int int6 = calculator0.getResult();
        int int7 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide(187);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        calculator0.add((int) '4');
        calculator0.divide((-100));
        calculator0.divide((int) '4');
        calculator0.add(152);
        calculator0.multiply(43);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(100);
        calculator0.divide((int) 'a');
        int int9 = calculator0.getResult();
        calculator0.add((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.substract((int) (byte) 100);
        calculator0.divide(42);
        int int7 = calculator0.getResult();
        calculator0.add((int) (byte) 10);
        int int10 = calculator0.getResult();
        calculator0.divide((int) ' ');
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.clear();
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        calculator0.clear();
        calculator0.multiply((-1));
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) -1);
        calculator0.substract(42);
        calculator0.substract((int) (byte) 1);
        calculator0.clear();
        calculator0.divide(185328);
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.substract((int) 'a');
        calculator0.add(43);
        calculator0.divide((int) '#');
        calculator0.clear();
        calculator0.multiply((-99998));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(10);
        calculator0.divide(131);
        int int14 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        int int11 = calculator0.getResult();
        calculator0.clear();
        calculator0.substract((int) (byte) 1);
        calculator0.add(183);
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        calculator0.multiply(183);
        calculator0.divide((-9));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        int int11 = calculator0.getResult();
        calculator0.clear();
        calculator0.multiply((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(100);
        calculator0.divide((int) 'a');
        calculator0.multiply((-10));
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
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
        calculator0.multiply((-99));
        calculator0.multiply((int) '4');
        calculator0.divide((-42));
        int int23 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.multiply((-100));
        calculator0.multiply((-1010));
        calculator0.divide((-106));
        int int13 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.add(100);
        calculator0.substract((int) (short) 1);
        calculator0.clear();
        calculator0.multiply(0);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.divide((int) (short) 100);
        int int15 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        calculator0.substract((int) (byte) 1);
        calculator0.clear();
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.substract(1000);
        calculator0.substract(97);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
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
        calculator0.multiply((-10));
        int int18 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract(52);
        calculator0.divide(42);
        calculator0.divide(1612);
        calculator0.multiply((-2));
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.clear();
        int int12 = calculator0.getResult();
        calculator0.divide((int) '4');
        calculator0.clear();
        calculator0.multiply(52);
        int int18 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.clear();
        calculator0.add(42);
        calculator0.clear();
        calculator0.divide(8);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        int int13 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        calculator0.add(52);
        calculator0.clear();
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        calculator0.divide((-1));
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        int int9 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.add(100);
        int int4 = calculator0.getResult();
        calculator0.add(52);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.clear();
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        calculator0.clear();
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.multiply((-99998));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-100));
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.divide((int) (short) -1);
        calculator0.divide((int) (byte) 10);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        calculator0.divide((-198));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.multiply((int) (short) 0);
        calculator0.clear();
        calculator0.add(10);
        calculator0.divide(160);
        calculator0.divide(152);
        calculator0.add(12);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.add((int) (short) 100);
        calculator0.divide((-10001));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.multiply((-100));
        calculator0.divide((int) (short) 1);
        calculator0.clear();
        calculator0.multiply((-42));
        calculator0.divide((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(42);
        calculator0.clear();
        calculator0.divide((int) (short) 100);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
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
        calculator0.clear();
        calculator0.divide((-10));
        int int19 = calculator0.getResult();
        java.lang.Class<?> wildcardClass20 = calculator0.getClass();
        calculator0.substract(350);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.add((int) '4');
        calculator0.divide((int) (short) 10);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.clear();
        calculator0.divide(100);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.multiply(1);
        calculator0.add(1);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        calculator0.add(97);
        int int16 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 98 + "'", int16 == 98);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        calculator0.multiply(52);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 1);
        calculator0.divide(52);
        calculator0.add(139);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.add((int) (short) 10);
        calculator0.divide((int) (short) -1);
        calculator0.multiply(1000);
        calculator0.substract((int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
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
        calculator0.clear();
        int int17 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.clear();
        calculator0.substract((int) (byte) 100);
        calculator0.divide(52);
        calculator0.multiply((-564201));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.clear();
        calculator0.add((int) (byte) 10);
        calculator0.multiply(11);
        calculator0.multiply(1);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.substract((int) (byte) 100);
        calculator0.divide(42);
        calculator0.clear();
        calculator0.clear();
        calculator0.add((int) '4');
        calculator0.divide(2);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        calculator0.clear();
        int int15 = calculator0.getResult();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
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
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        calculator0.clear();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.divide((int) (byte) -1);
        calculator0.substract(10);
        calculator0.substract(20);
        calculator0.multiply(1000);
        calculator0.divide((int) (byte) 100);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        int int8 = calculator0.getResult();
        int int9 = calculator0.getResult();
        calculator0.multiply(26);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.multiply((int) (short) 100);
        calculator0.divide((-41));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.add((int) '#');
        int int7 = calculator0.getResult();
        calculator0.divide(185328);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.add((int) (short) 10);
        int int7 = calculator0.getResult();
        calculator0.divide(1);
        calculator0.divide(1);
        int int12 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(42);
        calculator0.divide((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        int int9 = calculator0.getResult();
        calculator0.add((int) '#');
        calculator0.add(152);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        calculator0.multiply((int) '4');
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.add((int) (short) 100);
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        int int6 = calculator0.getResult();
        calculator0.multiply((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.substract(87);
        calculator0.multiply(183);
        calculator0.substract(42);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.divide(10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        int int11 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide(1);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.clear();
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        calculator0.clear();
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.divide((-97));
        calculator0.clear();
        calculator0.multiply((-10001));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.add((int) 'a');
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.multiply((int) 'a');
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) (short) 100);
        calculator0.clear();
        calculator0.multiply(0);
        calculator0.multiply(100);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.add((int) '#');
        calculator0.clear();
        calculator0.multiply((-520));
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        calculator0.clear();
        calculator0.clear();
        int int18 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-99) + "'", int13 == (-99));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
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
        int int15 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.add((int) (byte) 100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        int int8 = calculator0.getResult();
        calculator0.multiply(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 152 + "'", int8 == 152);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.add(100);
        calculator0.substract((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply((-35));
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
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
        calculator0.clear();
        int int19 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) '4');
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.multiply(10);
        calculator0.multiply((-1010));
        calculator0.divide((int) 'a');
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
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
        calculator0.multiply(0);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.add(100);
        calculator0.add(31);
        int int9 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 131 + "'", int9 == 131);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        calculator0.multiply(52);
        calculator0.multiply((int) (short) 100);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract(33);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) '4');
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.substract(6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((int) (byte) 100);
        calculator0.clear();
        calculator0.clear();
        calculator0.multiply(1612);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((int) (short) 10);
        int int10 = calculator0.getResult();
        calculator0.multiply((int) (short) 10);
        calculator0.multiply((-10));
        calculator0.divide(10000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.divide((-1));
        int int8 = calculator0.getResult();
        calculator0.substract(10);
        calculator0.divide((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((-9900));
        int int9 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 514800 + "'", int9 == 514800);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(10);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-100));
        int int7 = calculator0.getResult();
        calculator0.substract((int) ' ');
        int int10 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-32) + "'", int10 == (-32));
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        calculator0.multiply((int) (byte) 10);
        calculator0.substract((int) (short) 10);
        calculator0.clear();
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.substract((int) (byte) 10);
        int int8 = calculator0.getResult();
        calculator0.clear();
        calculator0.add(31);
        calculator0.multiply((-9));
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-9) + "'", int8 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.substract((int) (byte) 100);
        calculator0.divide(42);
        calculator0.clear();
        calculator0.clear();
        calculator0.add((int) '4');
        calculator0.substract(9);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
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
        calculator0.divide((-9));
        calculator0.clear();
        calculator0.divide(33);
        java.lang.Class<?> wildcardClass21 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.divide((-1664));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        int int5 = calculator0.getResult();
        calculator0.multiply(0);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.substract((int) (byte) 100);
        calculator0.divide(42);
        calculator0.clear();
        calculator0.clear();
        calculator0.add((int) '4');
        calculator0.substract(9);
        calculator0.multiply(33950);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-100));
        calculator0.multiply((int) (byte) 10);
        calculator0.multiply((-1));
        int int11 = calculator0.getResult();
        calculator0.multiply((int) 'a');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.add((int) (byte) 100);
        calculator0.multiply((int) (byte) 1);
        calculator0.clear();
        calculator0.divide((-3));
        int int12 = calculator0.getResult();
        calculator0.divide((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
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
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.substract((int) (short) 1);
        int int9 = calculator0.getResult();
        int int10 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        calculator0.multiply((-520));
        calculator0.clear();
        calculator0.add(12);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        calculator0.divide(3);
        calculator0.divide(12);
        calculator0.add(99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply(100);
        calculator0.clear();
        calculator0.clear();
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
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
        calculator0.substract(520);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.substract((int) (byte) 10);
        calculator0.divide(43);
        calculator0.multiply((int) (byte) 0);
        calculator0.substract((int) '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        calculator0.multiply((int) (short) 10);
        calculator0.substract(2);
        calculator0.add(20);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.add(100);
        int int4 = calculator0.getResult();
        calculator0.add(52);
        calculator0.multiply(139);
        int int9 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21128 + "'", int9 == 21128);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) (short) 100);
        calculator0.clear();
        int int6 = calculator0.getResult();
        calculator0.multiply(35);
        calculator0.add((int) ' ');
        calculator0.add(83);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.divide((int) (short) 100);
        calculator0.multiply(100);
        calculator0.divide((-100));
        calculator0.divide(52);
        calculator0.add(83);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.multiply(10);
        calculator0.add(52);
        int int12 = calculator0.getResult();
        int int13 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(42);
        calculator0.clear();
        int int8 = calculator0.getResult();
        calculator0.divide(152);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.multiply(9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        calculator0.divide((-1));
        int int8 = calculator0.getResult();
        calculator0.multiply(1000);
        calculator0.clear();
        calculator0.add((int) (short) 10);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        calculator0.divide((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
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
        calculator0.add(52);
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) (short) 1);
        calculator0.substract((int) (byte) 100);
        calculator0.clear();
        calculator0.clear();
        calculator0.divide((-19));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((int) (byte) 100);
        calculator0.substract(42);
        calculator0.clear();
        calculator0.substract(183);
        int int16 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-183) + "'", int16 == (-183));
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.add((int) (short) 100);
        calculator0.multiply(11);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((-1));
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        int int11 = calculator0.getResult();
        calculator0.multiply((int) (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.divide((int) (short) 1);
        calculator0.substract(2);
        calculator0.clear();
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) '4');
        calculator0.multiply((-43));
        int int7 = calculator0.getResult();
        calculator0.add((int) ' ');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-43) + "'", int7 == (-43));
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.substract((int) (byte) 10);
        calculator0.divide(858);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
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
        calculator0.divide((-9));
        calculator0.clear();
        calculator0.divide(33);
        calculator0.clear();
        calculator0.multiply(10890);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((int) (byte) 100);
        calculator0.substract(42);
        calculator0.divide(83);
        int int15 = calculator0.getResult();
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        int int9 = calculator0.getResult();
        int int10 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-100) + "'", int10 == (-100));
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(100);
        calculator0.divide((int) 'a');
        int int9 = calculator0.getResult();
        calculator0.add((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        calculator0.multiply((int) (short) 10);
        calculator0.substract((int) (byte) 10);
        int int13 = calculator0.getResult();
        calculator0.multiply((-1010));
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1010) + "'", int13 == (-1010));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        int int6 = calculator0.getResult();
        calculator0.add((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.divide(42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.substract((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        int int10 = calculator0.getResult();
        calculator0.multiply((int) '#');
        int int13 = calculator0.getResult();
        calculator0.add(87);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-35) + "'", int13 == (-35));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        calculator0.divide(3);
        calculator0.divide(12);
        calculator0.substract(968);
        calculator0.add(183);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((-2));
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((-97));
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
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
        calculator0.multiply((-162));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.add((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.add(36);
        calculator0.clear();
        calculator0.multiply((-1010));
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        calculator0.clear();
        calculator0.substract((int) (short) 100);
        calculator0.multiply((int) '4');
        calculator0.substract(139);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.multiply((-100));
        calculator0.multiply((-1010));
        calculator0.divide((-106));
        calculator0.divide((-90));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.add((int) (byte) 100);
        calculator0.multiply((int) (byte) 1);
        int int9 = calculator0.getResult();
        calculator0.divide(42);
        calculator0.multiply((-198));
        calculator0.clear();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 152 + "'", int9 == 152);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.divide((int) (byte) -1);
        calculator0.substract(10);
        calculator0.add((int) 'a');
        calculator0.substract(1);
        int int16 = calculator0.getResult();
        calculator0.divide((-106));
        calculator0.multiply((-564201));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 183 + "'", int16 == 183);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.divide((int) (byte) -1);
        calculator0.substract(10);
        calculator0.substract(97);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        calculator0.substract((int) (byte) 1);
        calculator0.multiply((-100));
        int int8 = calculator0.getResult();
        int int9 = calculator0.getResult();
        calculator0.divide(2);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-100));
        calculator0.multiply((int) (short) 0);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.add(1);
        int int11 = calculator0.getResult();
        calculator0.multiply((int) (short) -1);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.add((int) (short) 1);
        calculator0.clear();
        calculator0.add(35);
        calculator0.substract(1000);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        int int5 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
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
        int int15 = calculator0.getResult();
        int int16 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-99) + "'", int13 == (-99));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-99) + "'", int14 == (-99));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-99) + "'", int15 == (-99));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-99) + "'", int16 == (-99));
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply((-100));
        calculator0.multiply((int) (byte) 10);
        calculator0.clear();
        int int15 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.clear();
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        calculator0.clear();
        calculator0.multiply((-1));
        calculator0.divide(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
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
        calculator0.add(958);
        calculator0.divide((-162));
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.add((int) (byte) 100);
        calculator0.multiply((int) (byte) 1);
        calculator0.clear();
        calculator0.multiply(21128);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
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
        calculator0.multiply((-100));
        calculator0.multiply(5320);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.substract(184);
        calculator0.add(26);
        calculator0.add((int) (byte) 1);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.clear();
        calculator0.substract(1);
        calculator0.substract((int) (short) 1);
        calculator0.multiply((-42));
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract(52);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
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
        calculator0.divide(83);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        int int4 = calculator0.getResult();
        calculator0.multiply((int) (short) 10);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        int int8 = calculator0.getResult();
        calculator0.clear();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 520 + "'", int8 == 520);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        int int5 = calculator0.getResult();
        calculator0.multiply(0);
        int int8 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.add((int) (short) 10);
        calculator0.divide((int) (short) -1);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.multiply((-109));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        int int8 = calculator0.getResult();
        int int9 = calculator0.getResult();
        calculator0.multiply(26);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.multiply((int) (short) 100);
        int int15 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((int) (short) 10);
        int int10 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        int int13 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.clear();
        calculator0.divide(1612);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.multiply(21128);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.divide((int) '4');
        calculator0.divide((int) 'a');
        calculator0.multiply(10890);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.substract(42);
        calculator0.add(10);
        int int13 = calculator0.getResult();
        calculator0.substract(1);
        calculator0.divide(26);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-32) + "'", int13 == (-32));
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.substract(10);
        calculator0.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.clear();
        calculator0.multiply((-25));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.multiply(42);
        calculator0.multiply(8);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        calculator0.multiply(52);
        calculator0.multiply((int) (short) 100);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.divide(10000);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
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
        int int16 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide((-100000));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-42) + "'", int15 == (-42));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-42) + "'", int16 == (-42));
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        int int7 = calculator0.getResult();
        calculator0.add(52);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10) + "'", int7 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        int int4 = calculator0.getResult();
        calculator0.clear();
        calculator0.multiply(1000);
        calculator0.clear();
        calculator0.multiply((-32));
        calculator0.multiply((int) (byte) 100);
        calculator0.divide(139);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.divide((int) '#');
        calculator0.clear();
        calculator0.clear();
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.substract((int) (byte) 10);
        calculator0.divide(43);
        calculator0.clear();
        calculator0.add(1612);
        calculator0.multiply((-19));
        calculator0.divide((-41));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.substract((int) 'a');
        calculator0.add(43);
        calculator0.divide((int) '#');
        calculator0.multiply(26);
        calculator0.substract((int) ' ');
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        int int9 = calculator0.getResult();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(42);
        calculator0.clear();
        calculator0.clear();
        calculator0.add((int) '4');
        calculator0.divide(160);
        calculator0.substract(43);
        calculator0.clear();
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.substract((int) (short) 10);
        calculator0.multiply((-32));
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.add((int) (short) 10);
        calculator0.divide((int) (short) -1);
        calculator0.multiply(1000);
        calculator0.substract((int) (byte) 1);
        calculator0.multiply(0);
        calculator0.divide(160);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
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
        int int20 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        int int6 = calculator0.getResult();
        calculator0.substract(968);
        calculator0.clear();
        calculator0.add(183);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.add(100);
        calculator0.divide(100);
        calculator0.add(26);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        int int6 = calculator0.getResult();
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.multiply(52);
        calculator0.clear();
        calculator0.add((int) ' ');
        calculator0.divide(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) -1);
        calculator0.multiply(52);
        calculator0.add((int) (short) 1);
        calculator0.multiply(5320);
        int int15 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5320 + "'", int15 == 5320);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.multiply(0);
        calculator0.multiply(2);
        calculator0.add((int) 'a');
        int int12 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.substract((int) (short) 1);
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.clear();
        calculator0.add(183);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.divide((int) (short) 1);
        calculator0.multiply(52);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.multiply(0);
        calculator0.divide((int) ' ');
        calculator0.divide(8);
        calculator0.clear();
        int int13 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        int int11 = calculator0.getResult();
        calculator0.multiply((int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        int int15 = calculator0.getResult();
        int int16 = calculator0.getResult();
        calculator0.multiply(99);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 42 + "'", int15 == 42);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 42 + "'", int16 == 42);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        calculator0.add(100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.substract(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.divide((int) (short) 1);
        calculator0.multiply(1000);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        int int10 = calculator0.getResult();
        calculator0.divide((-25));
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        int int6 = calculator0.getResult();
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.clear();
        calculator0.add(152);
        int int12 = calculator0.getResult();
        calculator0.multiply((-109));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 152 + "'", int12 == 152);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.divide((int) '4');
        calculator0.add(26);
        calculator0.multiply(3582);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.divide(160);
        calculator0.clear();
        calculator0.substract(11);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        int int8 = calculator0.getResult();
        int int9 = calculator0.getResult();
        calculator0.substract(9);
        int int12 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        calculator0.divide((int) (byte) -1);
        calculator0.add((int) ' ');
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.divide((-42));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
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
        calculator0.clear();
        calculator0.add(100);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        java.lang.Class<?> wildcardClass20 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.add((int) '4');
        calculator0.divide((int) (short) 10);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.divide(2);
        calculator0.clear();
        calculator0.multiply((int) (short) 1);
        calculator0.add((int) 'a');
        java.lang.Class<?> wildcardClass18 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((-100));
        int int11 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1000) + "'", int11 == (-1000));
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        int int12 = calculator0.getResult();
        int int13 = calculator0.getResult();
        calculator0.divide((-100));
        calculator0.multiply(9);
        java.lang.Class<?> wildcardClass18 = calculator0.getClass();
        calculator0.divide(52);
        calculator0.divide((-99998));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1000 + "'", int13 == 1000);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.substract((int) (short) 1);
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        int int11 = calculator0.getResult();
        calculator0.multiply(33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((-100));
        int int11 = calculator0.getResult();
        calculator0.divide((-52));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1000) + "'", int11 == (-1000));
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
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
        calculator0.divide((-41));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
        calculator0.multiply((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
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
        calculator0.divide((-43));
        calculator0.divide(12);
        int int20 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        calculator0.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add(100);
        calculator0.divide(185328);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) -1);
        calculator0.substract(42);
        calculator0.substract((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        int int15 = calculator0.getResult();
        calculator0.multiply(160);
        calculator0.divide(26);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-43) + "'", int15 == (-43));
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        calculator0.multiply((-1664));
        calculator0.add((int) (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-100));
        calculator0.multiply((-2));
        calculator0.divide((int) '4');
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) ' ');
        calculator0.substract((int) (byte) 1);
        int int13 = calculator0.getResult();
        calculator0.add(9);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 31 + "'", int13 == 31);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.add((int) '#');
        calculator0.clear();
        int int8 = calculator0.getResult();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.add((int) 'a');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
}

