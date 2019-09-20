package jbhembise.testauto.example1;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((-100));
        calculator0.substract(2);
        calculator0.divide((int) (byte) -1);
        calculator0.add(83);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.add((int) (byte) 100);
        calculator0.multiply((int) (byte) 1);
        calculator0.clear();
        int int10 = calculator0.getResult();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.add(1);
        calculator0.multiply((int) '4');
        calculator0.divide((int) 'a');
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide((int) ' ');
        calculator0.divide(1612);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add(26);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        int int5 = calculator0.getResult();
        calculator0.add(1000);
        calculator0.substract((int) ' ');
        int int10 = calculator0.getResult();
        int int11 = calculator0.getResult();
        int int12 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 968 + "'", int10 == 968);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 968 + "'", int11 == 968);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 968 + "'", int12 == 968);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply((int) (short) -1);
        int int12 = calculator0.getResult();
        calculator0.multiply(1000);
        int int15 = calculator0.getResult();
        calculator0.divide(10890);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.add((int) (short) 10);
        calculator0.divide((int) (short) -1);
        calculator0.multiply(1000);
        calculator0.substract((int) (byte) 1);
        calculator0.multiply((-162));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        int int6 = calculator0.getResult();
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.multiply(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.divide((-2));
        calculator0.divide((-97));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        calculator0.add(52);
        calculator0.substract(1612);
        calculator0.multiply(97);
        calculator0.substract(12);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.divide(160);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.substract((int) '4');
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.multiply(42);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(1612);
        calculator0.divide((int) (byte) 1);
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply(20);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.substract(110);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.add((int) '4');
        calculator0.divide((int) (short) 10);
        int int10 = calculator0.getResult();
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((int) (short) 10);
        int int10 = calculator0.getResult();
        int int11 = calculator0.getResult();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.divide((-1010));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.substract((int) (byte) 100);
        calculator0.add(36);
        calculator0.add((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.multiply((int) (byte) 100);
        calculator0.add((int) '4');
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.divide((-1));
        int int8 = calculator0.getResult();
        int int9 = calculator0.getResult();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        calculator0.divide((-1010));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        int int9 = calculator0.getResult();
        calculator0.add((int) '#');
        calculator0.add(152);
        calculator0.clear();
        calculator0.divide((int) (short) -1);
        int int17 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((-2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        int int7 = calculator0.getResult();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.divide((-3));
        calculator0.divide((int) '#');
        calculator0.multiply(139);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10) + "'", int7 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        int int12 = calculator0.getResult();
        int int13 = calculator0.getResult();
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1000 + "'", int13 == 1000);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        int int11 = calculator0.getResult();
        calculator0.clear();
        calculator0.substract((int) (byte) 1);
        calculator0.multiply(187);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.clear();
        calculator0.substract(1);
        calculator0.substract((int) (short) 1);
        calculator0.multiply((-42));
        calculator0.substract((int) (short) 1);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        calculator0.divide((int) (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        int int11 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide(1);
        calculator0.add(968);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        calculator0.divide((-1));
        int int8 = calculator0.getResult();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        calculator0.multiply((int) (short) 10);
        calculator0.substract(131);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.add((int) '#');
        calculator0.clear();
        int int8 = calculator0.getResult();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.add((int) '#');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.add((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.add(36);
        calculator0.divide(858);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        calculator0.multiply(139);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        int int6 = calculator0.getResult();
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.multiply((int) (byte) 1);
        calculator0.divide(26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.add(1);
        int int11 = calculator0.getResult();
        calculator0.multiply((int) (short) -1);
        calculator0.substract(6);
        calculator0.add(858);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.add(97);
        calculator0.multiply(350);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.clear();
        calculator0.substract(20);
        calculator0.multiply(0);
        calculator0.clear();
        calculator0.divide(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.add((int) (short) 10);
        calculator0.divide((int) (short) -1);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.add(11);
        calculator0.add(33);
        calculator0.multiply((-17));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        calculator0.multiply(160);
        calculator0.multiply(185328);
        calculator0.clear();
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-100));
        calculator0.multiply((int) (byte) 10);
        int int9 = calculator0.getResult();
        calculator0.clear();
        calculator0.multiply(1);
        int int13 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.divide(8);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        calculator0.substract(5320);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.divide((int) (byte) -1);
        calculator0.substract(10);
        calculator0.substract(20);
        calculator0.substract(514800);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        calculator0.multiply((-2));
        calculator0.clear();
        calculator0.add(20);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-42) + "'", int15 == (-42));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.multiply((int) (short) 0);
        calculator0.divide((-8));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.multiply(1);
        calculator0.multiply((int) (short) -1);
        int int13 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) ' ');
        calculator0.add(8);
        calculator0.clear();
        calculator0.substract(26);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.multiply(10);
        calculator0.clear();
        calculator0.clear();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.divide((int) (byte) -1);
        calculator0.substract(10);
        calculator0.substract(20);
        calculator0.multiply(1000);
        calculator0.divide(36);
        calculator0.clear();
        calculator0.divide((-162));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        calculator0.multiply((-32));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.add(1);
        int int11 = calculator0.getResult();
        calculator0.multiply((int) (short) -1);
        calculator0.substract(2);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        calculator0.substract(97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.substract((int) '#');
        calculator0.add((int) (short) 100);
        calculator0.divide((-100000));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.substract(10);
        calculator0.divide((int) (byte) -1);
        int int9 = calculator0.getResult();
        calculator0.clear();
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        calculator0.divide(58);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        calculator0.multiply((int) (byte) 0);
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) (short) 1);
        calculator0.substract((int) (byte) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.multiply(3582);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        int int8 = calculator0.getResult();
        calculator0.divide(35);
        calculator0.divide((int) (short) 1);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((-1));
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.multiply(9);
        int int13 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide(350);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.multiply(0);
        calculator0.multiply(2);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        int int8 = calculator0.getResult();
        calculator0.divide((-15200));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.add(12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-100));
        calculator0.clear();
        calculator0.multiply(152);
        calculator0.multiply((-2));
        calculator0.clear();
        calculator0.multiply((-35));
        calculator0.divide(9);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.multiply(1);
        calculator0.add(1);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        calculator0.divide((-43));
        calculator0.divide(43);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
        calculator0.add(858);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        int int8 = calculator0.getResult();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.add(35);
        calculator0.substract(184);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) '4');
        calculator0.substract(100);
        calculator0.add(20);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        calculator0.divide((int) 'a');
        int int14 = calculator0.getResult();
        int int15 = calculator0.getResult();
        calculator0.substract(10000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
        calculator0.multiply(100);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(42);
        calculator0.substract((int) (short) 100);
        calculator0.substract(10);
        calculator0.multiply(36);
        calculator0.add((int) (short) 100);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.add((int) '#');
        calculator0.clear();
        int int8 = calculator0.getResult();
        calculator0.divide((-87));
        calculator0.add(33);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-32) + "'", int13 == (-32));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        calculator0.multiply((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.add(1);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.divide((int) (short) 1);
        calculator0.multiply(52);
        int int9 = calculator0.getResult();
        calculator0.multiply((-41));
        calculator0.substract(183);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.add(100);
        int int4 = calculator0.getResult();
        calculator0.add(8);
        int int7 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 108 + "'", int7 == 108);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) -1);
        calculator0.substract(42);
        calculator0.substract((int) (byte) 1);
        calculator0.divide((-9));
        int int15 = calculator0.getResult();
        int int16 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(42);
        calculator0.clear();
        int int8 = calculator0.getResult();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        int int6 = calculator0.getResult();
        calculator0.substract(968);
        calculator0.clear();
        calculator0.substract((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        calculator0.add((int) (byte) 10);
        calculator0.substract((int) 'a');
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        int int17 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide(1);
        calculator0.add(1);
        int int10 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide(35);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        calculator0.add(100);
        calculator0.clear();
        calculator0.divide(100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-100));
        calculator0.clear();
        calculator0.multiply(152);
        calculator0.multiply(6);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        int int9 = calculator0.getResult();
        calculator0.multiply((int) (byte) 10);
        calculator0.clear();
        calculator0.substract((int) 'a');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        calculator0.divide(187);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
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
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        int int18 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 182 + "'", int18 == 182);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.add(100);
        int int4 = calculator0.getResult();
        calculator0.add(8);
        calculator0.multiply(108);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
        calculator0.multiply(8);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        calculator0.add((int) (short) 10);
        int int7 = calculator0.getResult();
        calculator0.add(20);
        calculator0.substract((int) ' ');
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-42) + "'", int15 == (-42));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.substract((int) (byte) 10);
        calculator0.divide(43);
        calculator0.multiply((-1000));
        calculator0.multiply((-8));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.clear();
        calculator0.clear();
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.multiply((-1));
        calculator0.add(1);
        int int10 = calculator0.getResult();
        calculator0.substract(8);
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.divide((int) (short) 100);
        calculator0.multiply(100);
        calculator0.divide((-100));
        calculator0.divide(52);
        int int11 = calculator0.getResult();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(42);
        calculator0.multiply(52);
        calculator0.multiply((-2));
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        int int10 = calculator0.getResult();
        calculator0.multiply((int) (byte) 1);
        calculator0.add(10);
        calculator0.divide((-42));
        int int17 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        int int7 = calculator0.getResult();
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.multiply(182);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
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
        calculator0.divide(520);
        calculator0.multiply(3582);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 160 + "'", int12 == 160);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.multiply(1);
        calculator0.add(1);
        calculator0.add(100);
        calculator0.clear();
        calculator0.clear();
        calculator0.multiply(350);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
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
        calculator0.substract(9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.add(20);
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
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
        calculator0.multiply((int) (short) 1);
        java.lang.Class<?> wildcardClass21 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        calculator0.divide(514800);
        calculator0.multiply((-52));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-42) + "'", int15 == (-42));
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
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
        int int22 = calculator0.getResult();
        int int23 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        int int9 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.multiply(10890);
        calculator0.multiply(52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        calculator0.substract((int) '#');
        calculator0.divide((-43));
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.add((int) (short) 100);
        calculator0.multiply(11);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.substract((int) (byte) 1);
        calculator0.divide(2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        int int14 = calculator0.getResult();
        calculator0.multiply((int) ' ');
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        calculator0.multiply(21128);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-35) + "'", int13 == (-35));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-35) + "'", int14 == (-35));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.clear();
        int int6 = calculator0.getResult();
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.divide(83);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        calculator0.add((int) '4');
        calculator0.divide((-100));
        calculator0.multiply(2);
        calculator0.substract(10890);
        calculator0.clear();
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
        calculator0.multiply(31);
        int int15 = calculator0.getResult();
        calculator0.divide((int) (byte) 10);
        calculator0.substract(97);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
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
        calculator0.divide(3);
        calculator0.multiply(26);
        int int21 = calculator0.getResult();
        calculator0.multiply(83);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 858 + "'", int21 == 858);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.substract((int) (short) 1);
        int int9 = calculator0.getResult();
        calculator0.divide((int) (short) 1);
        calculator0.multiply(10);
        calculator0.substract(1612);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
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
        calculator0.add(52);
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        calculator0.clear();
        calculator0.divide((-970));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(42);
        calculator0.multiply((int) (byte) -1);
        calculator0.divide((-97));
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.divide((-1520));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.clear();
        calculator0.substract(1);
        calculator0.substract((int) (short) 1);
        int int10 = calculator0.getResult();
        int int11 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.clear();
        calculator0.multiply((-8));
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        int int16 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        calculator0.add(100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.divide((-100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        calculator0.divide(3);
        calculator0.divide(12);
        calculator0.substract(968);
        calculator0.multiply(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.multiply((-79));
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        int int15 = calculator0.getResult();
        calculator0.add(152);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (byte) 1);
        calculator0.add((int) (byte) 100);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) '4');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.divide((-1010));
        calculator0.add(160);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.add(100);
        calculator0.substract((int) (short) 1);
        calculator0.divide((int) 'a');
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) ' ');
        calculator0.substract((int) (byte) 1);
        calculator0.add((int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        int int16 = calculator0.getResult();
        calculator0.add(2);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 131 + "'", int16 == 131);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.add((int) (short) 1);
        calculator0.clear();
        calculator0.multiply(0);
        calculator0.substract(1000);
        calculator0.clear();
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        calculator0.multiply((int) (short) 10);
        int int11 = calculator0.getResult();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.multiply(20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1000) + "'", int11 == (-1000));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
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
        calculator0.divide((-520));
        int int19 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-99) + "'", int13 == (-99));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
        calculator0.substract(1612);
        int int18 = calculator0.getResult();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1664) + "'", int18 == (-1664));
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(42);
        calculator0.substract((int) (short) 100);
        calculator0.clear();
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.substract((int) (byte) 100);
        calculator0.divide(42);
        calculator0.clear();
        calculator0.clear();
        calculator0.add((int) '4');
        calculator0.substract(9);
        int int13 = calculator0.getResult();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 43 + "'", int13 == 43);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) (byte) 1);
        calculator0.multiply(184);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        calculator0.multiply(52);
        calculator0.clear();
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        calculator0.divide(36);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) '4');
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.multiply((-1));
        int int11 = calculator0.getResult();
        calculator0.add(184);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        int int7 = calculator0.getResult();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.divide((-3));
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10) + "'", int7 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(10);
        calculator0.clear();
        int int13 = calculator0.getResult();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) '4');
        calculator0.substract(100);
        calculator0.multiply(1);
        calculator0.divide(160);
        calculator0.substract((int) (byte) 1);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.divide((int) (short) 1);
        calculator0.multiply(1000);
        calculator0.multiply(0);
        calculator0.clear();
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        int int5 = calculator0.getResult();
        calculator0.add(1000);
        calculator0.substract((int) ' ');
        calculator0.clear();
        calculator0.substract(185328);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) 10);
        calculator0.clear();
        int int11 = calculator0.getResult();
        calculator0.substract(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        calculator0.divide(520);
        calculator0.add(131);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.add(1);
        calculator0.multiply((int) '4');
        calculator0.divide(1000);
        calculator0.multiply(35);
        int int17 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        int int8 = calculator0.getResult();
        int int9 = calculator0.getResult();
        calculator0.divide((-520));
        calculator0.clear();
        int int13 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        int int9 = calculator0.getResult();
        calculator0.clear();
        int int11 = calculator0.getResult();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.add((int) (byte) 100);
        calculator0.multiply((int) (byte) 1);
        calculator0.multiply((int) '#');
        calculator0.multiply(108);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.add(100);
        calculator0.substract((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.clear();
        calculator0.divide(958);
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        calculator0.multiply((int) (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.add((int) (short) 100);
        calculator0.multiply(11);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.divide((-4160));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract(52);
        int int5 = calculator0.getResult();
        calculator0.add(99);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-52) + "'", int5 == (-52));
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(42);
        calculator0.substract((int) (short) 100);
        calculator0.substract(10);
        calculator0.divide((int) '#');
        calculator0.multiply((-15200));
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-42) + "'", int15 == (-42));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.multiply((int) (short) 0);
        calculator0.clear();
        calculator0.add(10);
        calculator0.multiply((int) (short) 10);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        calculator0.multiply((int) (short) 10);
        int int16 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1000 + "'", int16 == 1000);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        calculator0.divide((int) (byte) 10);
        calculator0.multiply(10);
        calculator0.add(1000);
        calculator0.divide((-32));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-100));
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.divide((int) (short) -1);
        calculator0.divide((int) (byte) 10);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        calculator0.multiply((-100));
        calculator0.substract(1000);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.divide((-17));
        calculator0.clear();
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
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
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        calculator0.substract(99);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(42);
        calculator0.clear();
        calculator0.clear();
        calculator0.add((int) '4');
        calculator0.divide(1612);
        calculator0.divide((-10001));
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.add(100);
        int int4 = calculator0.getResult();
        calculator0.divide((-32));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.divide((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        calculator0.clear();
        int int15 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) '4');
        calculator0.substract(100);
        calculator0.add(20);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        calculator0.divide((int) 'a');
        int int14 = calculator0.getResult();
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.substract(42);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.clear();
        int int13 = calculator0.getResult();
        calculator0.divide((-19));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        calculator0.multiply((-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        int int3 = calculator0.getResult();
        calculator0.multiply((int) (short) 10);
        calculator0.clear();
        calculator0.divide(33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        calculator0.multiply((int) (short) 10);
        calculator0.multiply((-1000));
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        calculator0.substract(99);
        int int17 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-100099) + "'", int17 == (-100099));
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        int int7 = calculator0.getResult();
        int int8 = calculator0.getResult();
        calculator0.divide((-970));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        calculator0.multiply(42);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.add(97);
        calculator0.multiply(350);
        int int14 = calculator0.getResult();
        calculator0.divide(43);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 33950 + "'", int14 == 33950);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        calculator0.multiply((int) (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-99) + "'", int13 == (-99));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.multiply((-1));
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.substract(8);
        calculator0.clear();
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.clear();
        calculator0.divide((-42));
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        int int4 = calculator0.getResult();
        calculator0.clear();
        calculator0.multiply(1000);
        calculator0.clear();
        calculator0.substract(110);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.add(1);
        int int11 = calculator0.getResult();
        calculator0.multiply((int) (short) -1);
        calculator0.substract(6);
        calculator0.divide(139);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        calculator0.multiply((int) (short) 10);
        calculator0.substract((int) (byte) 10);
        int int13 = calculator0.getResult();
        calculator0.multiply(3);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1010) + "'", int13 == (-1010));
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        calculator0.add(152);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.clear();
        calculator0.substract(1);
        calculator0.substract((int) (short) 1);
        calculator0.substract(160);
        int int12 = calculator0.getResult();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-162) + "'", int12 == (-162));
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.divide((-1));
        int int8 = calculator0.getResult();
        calculator0.substract(10);
        calculator0.divide((-8));
        calculator0.multiply((-8));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.divide((-1));
        int int8 = calculator0.getResult();
        int int9 = calculator0.getResult();
        calculator0.multiply((-10));
        calculator0.divide((int) (byte) 100);
        calculator0.add(1);
        calculator0.multiply((-19));
        java.lang.Class<?> wildcardClass18 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        calculator0.add((int) (byte) 10);
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        calculator0.multiply((int) (short) 10);
        calculator0.multiply((-1000));
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        int int15 = calculator0.getResult();
        int int16 = calculator0.getResult();
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100000) + "'", int15 == (-100000));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-100000) + "'", int16 == (-100000));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide((int) (short) 1);
        int int9 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.divide((-1));
        int int8 = calculator0.getResult();
        calculator0.substract(10);
        calculator0.divide((-8));
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        calculator0.add(958);
        int int16 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 959 + "'", int16 == 959);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(42);
        calculator0.clear();
        int int8 = calculator0.getResult();
        calculator0.divide(152);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.substract(100);
        calculator0.clear();
        calculator0.clear();
        calculator0.substract((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.multiply((-2));
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.clear();
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
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
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.clear();
        calculator0.divide((-42));
        calculator0.clear();
        calculator0.multiply((-1));
        calculator0.add(131);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.clear();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        int int9 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.substract(3);
        int int5 = calculator0.getResult();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.divide(6);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.clear();
        calculator0.divide(20);
        calculator0.substract(9);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.substract(10);
        calculator0.divide(9);
        calculator0.divide(1612);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.substract((int) (byte) 10);
        int int8 = calculator0.getResult();
        calculator0.clear();
        calculator0.add(31);
        calculator0.multiply((-9));
        calculator0.divide(12);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        calculator0.substract(33950);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-9) + "'", int8 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) (short) 1);
        calculator0.multiply((-20));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        calculator0.multiply((int) (short) 10);
        calculator0.clear();
        calculator0.clear();
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        calculator0.clear();
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-43) + "'", int15 == (-43));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply(100);
        calculator0.clear();
        calculator0.clear();
        calculator0.multiply(0);
        calculator0.add(58);
        calculator0.multiply((-99));
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((int) (short) 10);
        int int10 = calculator0.getResult();
        int int11 = calculator0.getResult();
        int int12 = calculator0.getResult();
        calculator0.divide((-1000));
        calculator0.divide(10);
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        java.lang.Class<?> wildcardClass18 = calculator0.getClass();
        calculator0.multiply((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.substract((int) (byte) 100);
        calculator0.divide(42);
        calculator0.clear();
        calculator0.clear();
        calculator0.divide((int) ' ');
        calculator0.clear();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.substract((int) (byte) 10);
        int int8 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.divide(183);
        calculator0.multiply((-15200));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-9) + "'", int8 == (-9));
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.add((int) (short) 10);
        calculator0.divide((int) (short) -1);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.add(152);
        calculator0.add((int) (short) 10);
        calculator0.add(2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
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
        calculator0.clear();
        java.lang.Class<?> wildcardClass18 = calculator0.getClass();
        calculator0.substract(67);
        calculator0.multiply((-10));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.add(100);
        int int4 = calculator0.getResult();
        calculator0.add(52);
        calculator0.multiply((-100));
        calculator0.clear();
        int int10 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.add(1);
        int int11 = calculator0.getResult();
        calculator0.multiply((int) (short) -1);
        calculator0.substract(2);
        int int16 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-3) + "'", int16 == (-3));
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.substract((int) 'a');
        calculator0.add(43);
        calculator0.divide((int) '#');
        calculator0.clear();
        calculator0.multiply((int) '#');
        calculator0.multiply((int) 'a');
        calculator0.add(131);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) '4');
        calculator0.substract(100);
        calculator0.multiply(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.add((int) '#');
        calculator0.divide((-198));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        int int9 = calculator0.getResult();
        calculator0.multiply((int) (byte) 10);
        int int12 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1000) + "'", int12 == (-1000));
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        calculator0.divide((-1664));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.substract((int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.substract(8);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        calculator0.multiply(0);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        int int11 = calculator0.getResult();
        calculator0.multiply((int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        calculator0.add(152);
        calculator0.multiply((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
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
        calculator0.clear();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1000 + "'", int13 == 1000);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.multiply((int) (short) 0);
        calculator0.clear();
        calculator0.add(1);
        calculator0.multiply((-564201));
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.substract((int) '#');
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.add((int) (short) 1);
        calculator0.clear();
        calculator0.multiply(0);
        calculator0.multiply((int) (short) -1);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        calculator0.divide((int) (byte) 10);
        calculator0.multiply(10);
        calculator0.divide((int) ' ');
        calculator0.substract(26);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) (short) 100);
        calculator0.clear();
        int int6 = calculator0.getResult();
        calculator0.multiply(35);
        int int9 = calculator0.getResult();
        calculator0.substract(139);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) -1);
        calculator0.substract(42);
        calculator0.add(1);
        int int13 = calculator0.getResult();
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        int int15 = calculator0.getResult();
        calculator0.divide(187);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-41) + "'", int13 == (-41));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-41) + "'", int15 == (-41));
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) '4');
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.multiply((-1));
        calculator0.divide(42);
        calculator0.multiply(152);
        int int15 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 152 + "'", int15 == 152);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(100);
        calculator0.divide((int) 'a');
        int int9 = calculator0.getResult();
        calculator0.divide((int) (short) -1);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.divide((-162));
        calculator0.add(58);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(42);
        calculator0.substract((int) (short) 100);
        calculator0.substract(10);
        calculator0.divide((int) '#');
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        calculator0.add(26);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) (short) 100);
        int int5 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        calculator0.divide(187);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) (short) 100);
        calculator0.clear();
        int int6 = calculator0.getResult();
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.substract(10);
        int int10 = calculator0.getResult();
        calculator0.substract(83);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-10) + "'", int10 == (-10));
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(1612);
        calculator0.divide((-1000));
        calculator0.multiply(350);
        calculator0.clear();
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) (short) 1);
        calculator0.multiply((-90));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
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
        calculator0.multiply(8);
        calculator0.multiply((-183));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.multiply((-1));
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.divide(33950);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide((int) (short) 1);
        calculator0.clear();
        calculator0.divide(99);
        calculator0.multiply((-4160));
        calculator0.substract(11);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        calculator0.multiply((int) '4');
        calculator0.multiply(160);
        calculator0.divide(10890);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.add(160);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
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
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(9);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((-1));
        calculator0.add((int) '4');
        calculator0.substract(152);
        calculator0.clear();
        calculator0.clear();
        int int16 = calculator0.getResult();
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        calculator0.divide(52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(1612);
        calculator0.divide((-1000));
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(100);
        calculator0.divide((int) 'a');
        int int9 = calculator0.getResult();
        int int10 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.substract(10);
        calculator0.divide((int) (byte) -1);
        int int9 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide((-3));
        calculator0.multiply(87);
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.divide((int) '#');
        calculator0.substract((int) (short) 10);
        calculator0.add((int) (byte) 1);
        calculator0.divide(1612);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.add(100);
        calculator0.substract((int) (short) 1);
        calculator0.multiply((int) (short) -1);
        int int11 = calculator0.getResult();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-99) + "'", int11 == (-99));
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.multiply((-2));
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.divide((int) (short) 1);
        calculator0.multiply(1000);
        calculator0.multiply(0);
        calculator0.divide(10);
        calculator0.add(183);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.clear();
        calculator0.clear();
        calculator0.divide(184);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.multiply((int) (short) 0);
        calculator0.clear();
        calculator0.add(10);
        int int11 = calculator0.getResult();
        calculator0.add(2);
        calculator0.divide((-564201));
        calculator0.add(33);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        calculator0.divide((-1));
        calculator0.add((int) (short) 1);
        calculator0.divide(20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.divide((int) (short) -1);
        calculator0.clear();
        calculator0.multiply(0);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.divide((int) (byte) 1);
        calculator0.divide((-106));
        calculator0.substract(9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
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
        calculator0.divide((-1));
        int int23 = calculator0.getResult();
        calculator0.multiply(87);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.clear();
        calculator0.clear();
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.multiply((-1));
        calculator0.add(1);
        int int10 = calculator0.getResult();
        calculator0.substract(8);
        calculator0.divide(83);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        calculator0.multiply((int) (short) 10);
        int int11 = calculator0.getResult();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.multiply(36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1000) + "'", int11 == (-1000));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.substract((int) (short) 10);
        int int8 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-10) + "'", int8 == (-10));
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        calculator0.substract((int) (byte) 1);
        calculator0.divide(11);
        calculator0.multiply((-183));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        calculator0.add((int) '4');
        calculator0.divide((-100));
        calculator0.divide((int) '4');
        calculator0.multiply(100);
        calculator0.substract((int) (short) 100);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) '4');
        calculator0.clear();
        calculator0.divide((-1000));
        calculator0.multiply((int) 'a');
        calculator0.substract(9);
        calculator0.multiply((-35));
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
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
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1010) + "'", int13 == (-1010));
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        int int7 = calculator0.getResult();
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        int int11 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.clear();
        calculator0.divide(520);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
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
        java.lang.Class<?> wildcardClass21 = calculator0.getClass();
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        int int15 = calculator0.getResult();
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        calculator0.multiply((-35));
        calculator0.substract(139);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.substract((int) (byte) 100);
        calculator0.divide(42);
        calculator0.clear();
        calculator0.clear();
        calculator0.add((int) '4');
        calculator0.substract(9);
        calculator0.divide((int) 'a');
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.clear();
        calculator0.substract(131);
        calculator0.multiply((-1664));
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(100);
        calculator0.substract(42);
        int int9 = calculator0.getResult();
        int int10 = calculator0.getResult();
        calculator0.multiply((-79));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-142) + "'", int9 == (-142));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-142) + "'", int10 == (-142));
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.add((int) 'a');
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.multiply((int) (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
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
        calculator0.multiply(520);
        calculator0.add(3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply(100);
        calculator0.multiply(0);
        calculator0.substract((int) '#');
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply((-10));
        int int12 = calculator0.getResult();
        calculator0.multiply((-97));
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 350 + "'", int12 == 350);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        calculator0.divide((-52));
        calculator0.multiply(968);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply(100);
        calculator0.multiply(0);
        calculator0.substract((int) '#');
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply((-10));
        int int12 = calculator0.getResult();
        calculator0.divide((-32));
        calculator0.multiply((int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 350 + "'", int12 == 350);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.clear();
        calculator0.clear();
        calculator0.divide(2);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        calculator0.substract(97);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) 10);
        calculator0.add((int) ' ');
        calculator0.divide((-198));
        calculator0.divide(12);
        calculator0.substract(11);
        calculator0.multiply((int) ' ');
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.substract(10);
        calculator0.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        int int10 = calculator0.getResult();
        calculator0.divide((-99998));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 1);
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        calculator0.clear();
        calculator0.divide(9);
        int int14 = calculator0.getResult();
        calculator0.multiply((-2));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        calculator0.add(968);
        calculator0.substract(139);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) (short) 100);
        calculator0.clear();
        calculator0.multiply(0);
        calculator0.multiply(100);
        calculator0.add(99);
        calculator0.multiply(139);
        calculator0.multiply((-41));
        calculator0.clear();
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.divide((int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        int int10 = calculator0.getResult();
        int int11 = calculator0.getResult();
        calculator0.add(8);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.multiply((int) (short) 0);
        calculator0.clear();
        calculator0.add(10);
        calculator0.substract((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 1);
        int int9 = calculator0.getResult();
        calculator0.multiply(0);
        int int12 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        calculator0.divide((-1));
        calculator0.add((int) (short) 1);
        calculator0.divide(8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.divide((-99));
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
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
        calculator0.divide(858);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-42) + "'", int15 == (-42));
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.clear();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.clear();
        calculator0.multiply((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract(10);
        int int8 = calculator0.getResult();
        calculator0.substract((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-10) + "'", int8 == (-10));
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.substract(10);
        calculator0.divide((int) ' ');
        calculator0.multiply(26);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
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
        int int19 = calculator0.getResult();
        int int20 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1000 + "'", int13 == 1000);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-90) + "'", int19 == (-90));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-90) + "'", int20 == (-90));
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
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
        calculator0.clear();
        int int18 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 183 + "'", int16 == 183);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
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
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(10);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.divide(152);
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.multiply(1);
        calculator0.divide((-99));
        calculator0.multiply((-32));
        calculator0.divide(98);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.clear();
        calculator0.substract(1);
        calculator0.substract((int) (short) 1);
        calculator0.substract(160);
        calculator0.multiply(1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.divide((int) (short) 1);
        calculator0.multiply(1000);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        int int10 = calculator0.getResult();
        int int11 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) 10);
        calculator0.multiply(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.add((int) (short) 100);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.clear();
        calculator0.multiply(98);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.substract((int) (byte) 100);
        calculator0.divide(42);
        calculator0.clear();
        calculator0.clear();
        calculator0.add((int) '4');
        calculator0.divide(2);
        calculator0.divide((-87));
        calculator0.substract(1000);
        calculator0.substract(3582);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        calculator0.add(31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.multiply(10);
        calculator0.divide((int) '4');
        calculator0.multiply(160);
        calculator0.add(67);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply(100);
        calculator0.multiply(0);
        calculator0.multiply(0);
        int int9 = calculator0.getResult();
        calculator0.multiply(183);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.multiply((int) (short) 0);
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.add(98);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.multiply(1);
        calculator0.add(1);
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        calculator0.add(35);
        int int10 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.divide((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.substract(3);
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) '4');
        calculator0.substract(100);
        calculator0.multiply(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.substract(52);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.substract((int) (byte) 10);
        calculator0.substract(2);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.multiply((int) (byte) 100);
        calculator0.add((int) '4');
        calculator0.substract(350);
        calculator0.substract((int) (short) 1);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
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
        calculator0.divide(33);
        java.lang.Class<?> wildcardClass20 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.multiply(1);
        calculator0.add(1);
        int int13 = calculator0.getResult();
        calculator0.multiply((-7544));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.clear();
        calculator0.divide(1612);
        calculator0.divide((-9900));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) (short) 100);
        calculator0.multiply(42);
        calculator0.multiply((-162));
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.substract((int) (byte) 1);
        calculator0.clear();
        calculator0.divide(2);
        int int10 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
        java.lang.Class<?> wildcardClass18 = calculator0.getClass();
        calculator0.divide((int) '4');
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) -1);
        calculator0.multiply(52);
        calculator0.substract(1000);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
        calculator0.add(52);
        calculator0.substract(1612);
        calculator0.multiply(97);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        calculator0.multiply((-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        calculator0.divide((int) (byte) 10);
        calculator0.multiply(10);
        calculator0.multiply((int) 'a');
        calculator0.clear();
        calculator0.add(11);
        calculator0.substract((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) '4');
        calculator0.substract(100);
        calculator0.add(20);
        calculator0.multiply(10890);
        calculator0.substract(35);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.multiply((int) (short) 0);
        calculator0.clear();
        calculator0.add(10);
        int int11 = calculator0.getResult();
        calculator0.multiply(43);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
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
        calculator0.multiply(20);
        calculator0.add((int) (byte) 100);
        calculator0.divide(968);
        calculator0.multiply(0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
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
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.clear();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        int int13 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        calculator0.add((int) (short) 10);
        calculator0.substract((int) ' ');
        calculator0.add(131);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.clear();
        calculator0.divide((int) ' ');
        int int11 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.multiply(10);
        calculator0.clear();
        calculator0.add(99);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        calculator0.multiply(52);
        calculator0.clear();
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        calculator0.divide(958);
        calculator0.clear();
        int int13 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(42);
        calculator0.clear();
        calculator0.divide(183);
        int int6 = calculator0.getResult();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.substract(350);
        calculator0.multiply((-53));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) '4');
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.multiply((-1));
        calculator0.divide(42);
        calculator0.divide((-99998));
        calculator0.clear();
        calculator0.divide((-32));
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        calculator0.add((int) (byte) 10);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.multiply(1);
        calculator0.clear();
        calculator0.clear();
        calculator0.multiply(35);
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.add((int) (byte) 100);
        calculator0.multiply((int) (byte) 1);
        calculator0.clear();
        calculator0.substract((int) 'a');
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.substract(1000);
        calculator0.divide((-42));
        calculator0.clear();
        calculator0.divide((-41));
        calculator0.substract(26);
        calculator0.divide(99);
        calculator0.substract(10000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((-1));
        calculator0.add((int) '4');
        calculator0.divide((-97));
        int int14 = calculator0.getResult();
        calculator0.multiply((int) (short) 0);
        int int17 = calculator0.getResult();
        int int18 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
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
        calculator0.add(52);
        calculator0.divide(87);
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((-1000));
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) (short) 100);
        calculator0.clear();
        int int6 = calculator0.getResult();
        calculator0.multiply(35);
        calculator0.add((int) ' ');
        calculator0.substract(99);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
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
        calculator0.multiply(1000);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1000 + "'", int13 == 1000);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.add(100);
        calculator0.add(9);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.add((int) '#');
        calculator0.clear();
        calculator0.divide((int) (short) 100);
        calculator0.divide(968);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) 10);
        calculator0.clear();
        int int11 = calculator0.getResult();
        calculator0.multiply(10);
        calculator0.divide((-35));
        calculator0.substract(1612);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
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
        calculator0.divide(58);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
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
        calculator0.multiply((-2));
        calculator0.divide((int) (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        calculator0.add(36);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.add((int) 'a');
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.divide(131);
        calculator0.add(183);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.divide((-17));
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.substract(10);
        calculator0.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.clear();
        calculator0.substract((int) ' ');
        int int6 = calculator0.getResult();
        calculator0.divide(10000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-32) + "'", int6 == (-32));
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
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
        int int16 = calculator0.getResult();
        calculator0.substract(58);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.multiply((int) (short) 0);
        calculator0.clear();
        calculator0.add(10);
        int int11 = calculator0.getResult();
        calculator0.add(2);
        calculator0.divide((-564201));
        calculator0.add(520);
        calculator0.multiply(35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.substract(10);
        calculator0.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.divide((-9900));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.substract((int) '#');
        calculator0.substract(100);
        calculator0.substract(97);
        calculator0.add(83);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((int) (byte) 100);
        calculator0.substract(42);
        calculator0.divide(83);
        int int15 = calculator0.getResult();
        calculator0.add(1);
        int int18 = calculator0.getResult();
        int int19 = calculator0.getResult();
        calculator0.substract((int) '4');
        int int22 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 12 + "'", int18 == 12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 12 + "'", int19 == 12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-40) + "'", int22 == (-40));
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
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
        calculator0.add(514800);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1612 + "'", int15 == 1612);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.clear();
        calculator0.divide((int) ' ');
        calculator0.clear();
        int int12 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        calculator0.multiply((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.add(1000);
        calculator0.divide(1612);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
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
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.clear();
        int int7 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((-1));
        int int10 = calculator0.getResult();
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-100));
        calculator0.multiply((int) (byte) 10);
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.multiply(33);
        calculator0.multiply((-520));
        int int16 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.multiply((int) (short) 0);
        calculator0.clear();
        calculator0.add(10);
        int int11 = calculator0.getResult();
        calculator0.add(2);
        calculator0.divide((-564201));
        calculator0.multiply((-2));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.substract((int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.substract(8);
        calculator0.multiply(87);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        calculator0.add((int) '4');
        calculator0.divide((-100));
        calculator0.multiply(2);
        int int11 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.divide((int) (short) 1);
        calculator0.multiply(1000);
        int int9 = calculator0.getResult();
        calculator0.multiply(12);
        calculator0.multiply((int) '4');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.divide((int) '#');
        calculator0.substract((int) (short) 10);
        int int10 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-10) + "'", int10 == (-10));
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.multiply((int) (short) 0);
        calculator0.clear();
        calculator0.add(1);
        calculator0.substract((int) 'a');
        int int13 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-96) + "'", int13 == (-96));
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.add(97);
        calculator0.add(160);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
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
        calculator0.divide((-42));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.clear();
        calculator0.substract(1);
        calculator0.substract((int) (short) 1);
        calculator0.multiply((int) '#');
        calculator0.multiply((int) (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
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
        int int15 = calculator0.getResult();
        int int16 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.clear();
        calculator0.substract(131);
        calculator0.add(187);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.substract(42);
        calculator0.add((int) (short) 100);
        int int13 = calculator0.getResult();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 58 + "'", int13 == 58);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) -1);
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        int int11 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.substract(10);
        calculator0.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((-53));
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        calculator0.multiply((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        int int13 = calculator0.getResult();
        calculator0.divide(35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(42);
        calculator0.multiply(10);
        calculator0.substract(21128);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
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
        int int17 = calculator0.getResult();
        int int18 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-9) + "'", int8 == (-9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1520) + "'", int17 == (-1520));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1520) + "'", int18 == (-1520));
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.add((int) 'a');
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.divide(131);
        calculator0.add(183);
        calculator0.divide((-3));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.multiply(1);
        calculator0.add(1);
        int int13 = calculator0.getResult();
        calculator0.multiply(0);
        calculator0.multiply((-9900));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
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
        calculator0.multiply(20);
        calculator0.add((int) (byte) 100);
        calculator0.divide(968);
        calculator0.multiply(1612);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide((int) ' ');
        calculator0.divide(1612);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.clear();
        int int11 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-100));
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.divide((int) (short) -1);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.divide(98);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.divide((int) (short) 1);
        calculator0.multiply(1000);
        int int9 = calculator0.getResult();
        int int10 = calculator0.getResult();
        calculator0.multiply(1612);
        calculator0.multiply((-25));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) ' ');
        calculator0.substract((int) (byte) 1);
        calculator0.add((int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        int int16 = calculator0.getResult();
        calculator0.multiply((-97));
        calculator0.multiply(3582);
        calculator0.divide(1000);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 131 + "'", int16 == 131);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.add(100);
        calculator0.substract(514800);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
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
        calculator0.divide(52);
        calculator0.add((int) (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.substract((int) (byte) 10);
        int int8 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.multiply(514800);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-9) + "'", int8 == (-9));
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide((int) ' ');
        calculator0.divide(1612);
        int int7 = calculator0.getResult();
        int int8 = calculator0.getResult();
        calculator0.clear();
        int int10 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.substract((int) (byte) 10);
        int int8 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.divide(183);
        calculator0.add(26);
        int int15 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-9) + "'", int8 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 26 + "'", int15 == 26);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(42);
        calculator0.clear();
        calculator0.clear();
        calculator0.add((int) '4');
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.clear();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
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
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.divide((int) (short) 1);
        calculator0.multiply(1000);
        int int9 = calculator0.getResult();
        calculator0.multiply(1000);
        calculator0.divide((-1));
        calculator0.divide((int) ' ');
        calculator0.divide(520);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.divide((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.add(100);
        calculator0.substract((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.clear();
        calculator0.divide(958);
        calculator0.add(12);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(42);
        calculator0.clear();
        calculator0.clear();
        int int9 = calculator0.getResult();
        calculator0.add(183);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 1);
        calculator0.multiply((int) (short) 100);
        calculator0.divide(1);
        calculator0.divide((-97));
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        calculator0.divide((int) (byte) -1);
        calculator0.add((int) ' ');
        calculator0.multiply(12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        calculator0.divide((-1));
        calculator0.add((int) (short) 1);
        calculator0.multiply(58);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        int int8 = calculator0.getResult();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.divide((int) '#');
        calculator0.substract((int) (short) 10);
        calculator0.add((int) (byte) 1);
        calculator0.clear();
        calculator0.add((int) (byte) 100);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) -1);
        calculator0.multiply(3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        calculator0.add((int) (short) 10);
        calculator0.substract((int) ' ');
        calculator0.substract(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.divide((int) '#');
        calculator0.substract((int) (short) 10);
        calculator0.add((int) (byte) 1);
        int int12 = calculator0.getResult();
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        int int14 = calculator0.getResult();
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-9) + "'", int14 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
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
        calculator0.divide((-520));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-99) + "'", int13 == (-99));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.clear();
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        calculator0.clear();
        calculator0.multiply((-1));
        int int7 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.multiply(0);
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        int int10 = calculator0.getResult();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        int int6 = calculator0.getResult();
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.multiply((-564201));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.add((int) '4');
        int int8 = calculator0.getResult();
        calculator0.add(184);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        int int5 = calculator0.getResult();
        int int6 = calculator0.getResult();
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.divide((int) (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(42);
        calculator0.substract((int) (short) 100);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((-100));
        int int11 = calculator0.getResult();
        calculator0.clear();
        int int13 = calculator0.getResult();
        int int14 = calculator0.getResult();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1000) + "'", int11 == (-1000));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
        calculator0.multiply((int) (byte) 0);
        calculator0.substract(100);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.multiply((-1));
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.substract(8);
        calculator0.multiply((-20));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide((int) ' ');
        calculator0.substract((int) '4');
        int int7 = calculator0.getResult();
        calculator0.substract((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-52) + "'", int7 == (-52));
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(1612);
        calculator0.divide((-1000));
        int int9 = calculator0.getResult();
        calculator0.add((int) '4');
        calculator0.substract(160);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply((-100));
        int int12 = calculator0.getResult();
        int int13 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.substract((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.substract(52);
        calculator0.divide((-25));
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
        int int14 = calculator0.getResult();
        calculator0.multiply((int) ' ');
        calculator0.multiply((-1010));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-35) + "'", int13 == (-35));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-35) + "'", int14 == (-35));
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.substract(1000);
        calculator0.divide((-42));
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply((-564201));
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.add(10000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        calculator0.multiply((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.add(1000);
        int int14 = calculator0.getResult();
        calculator0.add((int) (short) 1);
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        calculator0.add((int) (short) 10);
        int int7 = calculator0.getResult();
        int int8 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
        java.lang.Class<?> wildcardClass18 = calculator0.getClass();
        calculator0.multiply((-15200));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
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
        calculator0.add(152);
        calculator0.clear();
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.add((int) (short) 1);
        calculator0.multiply((-42));
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        int int9 = calculator0.getResult();
        calculator0.clear();
        calculator0.substract(1000);
        calculator0.substract((int) 'a');
        calculator0.clear();
        calculator0.multiply(184);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.clear();
        calculator0.clear();
        calculator0.divide(2);
        calculator0.multiply((-9));
        int int9 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        int int5 = calculator0.getResult();
        int int6 = calculator0.getResult();
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        int int8 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        int int11 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide(1);
        calculator0.multiply((int) '#');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        calculator0.clear();
        int int18 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.divide((int) (short) 1);
        calculator0.multiply(1000);
        calculator0.multiply(0);
        calculator0.multiply(184);
        int int13 = calculator0.getResult();
        int int14 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
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
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-35) + "'", int13 == (-35));
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.multiply((int) (short) 0);
        calculator0.clear();
        calculator0.add(10);
        calculator0.clear();
        calculator0.add((int) (byte) 10);
        calculator0.multiply(0);
        calculator0.divide(3);
        calculator0.multiply((int) (byte) 1);
        int int20 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.substract((int) (byte) 100);
        calculator0.divide(42);
        int int7 = calculator0.getResult();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.clear();
        calculator0.divide((int) '4');
        calculator0.clear();
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-100));
        int int7 = calculator0.getResult();
        calculator0.add(52);
        calculator0.clear();
        int int11 = calculator0.getResult();
        int int12 = calculator0.getResult();
        int int13 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.divide((int) (short) 1);
        calculator0.multiply(52);
        calculator0.divide((int) ' ');
        calculator0.clear();
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.multiply((int) (byte) 100);
        calculator0.add((int) '4');
        calculator0.multiply((int) (byte) 10);
        calculator0.add(10000);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
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
        calculator0.clear();
        calculator0.multiply(968);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((int) (short) 10);
        int int10 = calculator0.getResult();
        int int11 = calculator0.getResult();
        calculator0.divide((int) (short) -1);
        int int14 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.substract((int) (byte) 100);
        calculator0.add(36);
        int int13 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-64) + "'", int13 == (-64));
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.multiply((-1010));
        calculator0.substract(20);
        calculator0.add(42);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        calculator0.multiply(52);
        calculator0.multiply((int) (short) 100);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        int int10 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) '4');
        calculator0.substract(100);
        calculator0.multiply(1);
        calculator0.divide(160);
        int int11 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(42);
        calculator0.clear();
        int int8 = calculator0.getResult();
        calculator0.substract((int) (short) 10);
        calculator0.multiply((-99998));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((int) (short) 10);
        int int10 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide((int) 'a');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.substract((int) 'a');
        calculator0.divide((-9));
        calculator0.multiply(10);
        int int12 = calculator0.getResult();
        calculator0.divide((-87));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 160 + "'", int12 == 160);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
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
        java.lang.Class<?> wildcardClass20 = calculator0.getClass();
        calculator0.divide((-53));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.substract(10);
        calculator0.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.clear();
        calculator0.add((int) '#');
        calculator0.divide((-17));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide((int) ' ');
        calculator0.substract((int) '4');
        calculator0.clear();
        calculator0.multiply((-43));
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        int int10 = calculator0.getResult();
        calculator0.multiply((int) (byte) 1);
        calculator0.add(10);
        calculator0.divide((-42));
        calculator0.divide((-42));
        calculator0.multiply((-106));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.divide((int) (short) 100);
        calculator0.divide(52);
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply(8);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(100);
        calculator0.divide((int) 'a');
        int int9 = calculator0.getResult();
        calculator0.divide((int) (short) -1);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.divide((-162));
        calculator0.divide(185328);
        calculator0.substract((int) '4');
        int int19 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-52) + "'", int19 == (-52));
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.add(1);
        int int11 = calculator0.getResult();
        calculator0.multiply((int) (short) -1);
        calculator0.substract(2);
        int int16 = calculator0.getResult();
        calculator0.clear();
        int int18 = calculator0.getResult();
        calculator0.add(968);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-3) + "'", int16 == (-3));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.multiply(10);
        calculator0.add((int) (short) 1);
        calculator0.multiply((-99));
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        calculator0.multiply((-198));
        calculator0.add(87);
        calculator0.add(3);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) 10);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.multiply((-97));
        calculator0.multiply(87);
        calculator0.divide((-52));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
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
        calculator0.clear();
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(42);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-100));
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(184);
        calculator0.divide(42);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) '4');
        calculator0.substract(100);
        calculator0.multiply(1);
        calculator0.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.divide(152);
        calculator0.multiply(1612);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        int int8 = calculator0.getResult();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.divide(4);
        int int13 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        int int9 = calculator0.getResult();
        calculator0.multiply(8);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.add((int) '4');
        int int8 = calculator0.getResult();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.multiply(12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.add(100);
        calculator0.substract((int) (short) 1);
        calculator0.multiply((int) (short) -1);
        calculator0.divide(160);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) '4');
        calculator0.substract(100);
        calculator0.add(20);
        calculator0.clear();
        calculator0.divide(139);
        calculator0.clear();
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-100));
        int int7 = calculator0.getResult();
        calculator0.substract((int) ' ');
        calculator0.clear();
        calculator0.substract(20);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
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
        calculator0.add(184);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((-100));
        int int11 = calculator0.getResult();
        calculator0.add((int) ' ');
        calculator0.divide((int) (byte) 100);
        calculator0.multiply((int) (byte) 1);
        calculator0.substract(33);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1000) + "'", int11 == (-1000));
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((-1));
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        int int11 = calculator0.getResult();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-100));
        calculator0.multiply((int) (byte) 10);
        calculator0.multiply((-1));
        calculator0.divide((-99));
        int int13 = calculator0.getResult();
        int int14 = calculator0.getResult();
        calculator0.multiply((-97));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
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
        int int15 = calculator0.getResult();
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        calculator0.multiply((-35));
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        int int5 = calculator0.getResult();
        calculator0.substract((int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 1);
        int int9 = calculator0.getResult();
        calculator0.multiply(0);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
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
        calculator0.add(131);
        int int19 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 183 + "'", int19 == 183);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(42);
        calculator0.clear();
        calculator0.clear();
        calculator0.add((int) '4');
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        int int12 = calculator0.getResult();
        calculator0.add(6);
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract(31);
        calculator0.add(160);
        int int12 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 129 + "'", int12 == 129);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.add((int) (short) 10);
        calculator0.multiply((int) (byte) 0);
        calculator0.clear();
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
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
        calculator0.divide((-520));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-43) + "'", int15 == (-43));
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
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
        calculator0.substract((int) ' ');
        calculator0.clear();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        calculator0.clear();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        calculator0.multiply((-3));
        calculator0.add(2);
        java.lang.Class<?> wildcardClass18 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
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
        calculator0.substract(1);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((-1));
        calculator0.add((int) '4');
        calculator0.divide((-97));
        calculator0.clear();
        calculator0.add(100);
        calculator0.clear();
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.multiply((-1010));
        calculator0.divide(1);
        int int12 = calculator0.getResult();
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.multiply((-2));
        int int11 = calculator0.getResult();
        int int12 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        calculator0.multiply((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.multiply(52);
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.substract((int) (short) 1);
        calculator0.multiply(131);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        calculator0.substract((int) (short) 1);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        calculator0.divide((int) (byte) 10);
        calculator0.multiply(10);
        calculator0.multiply((int) 'a');
        calculator0.clear();
        calculator0.multiply((-3));
        calculator0.substract(182);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.add((int) (byte) 100);
        calculator0.multiply((int) (byte) 1);
        calculator0.divide(160);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.substract(11);
        int int14 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-11) + "'", int14 == (-11));
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
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
        calculator0.multiply((-53));
        calculator0.multiply(5320);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) '4');
        calculator0.substract(100);
        calculator0.multiply(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.multiply((-260));
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) '4');
        calculator0.substract(100);
        calculator0.multiply(1);
        calculator0.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        int int12 = calculator0.getResult();
        calculator0.multiply((-8));
        calculator0.divide((-7544));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9900) + "'", int12 == (-9900));
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract(52);
        int int5 = calculator0.getResult();
        calculator0.multiply((-1386));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-52) + "'", int5 == (-52));
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
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
        calculator0.multiply((int) (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.substract((int) (byte) 100);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.divide(12);
        calculator0.multiply((-1000));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(42);
        calculator0.substract((int) (short) 100);
        calculator0.substract(10);
        calculator0.divide((int) '#');
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.divide(8);
        calculator0.divide((-52));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
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
        int int15 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(42);
        calculator0.divide((int) 'a');
        calculator0.clear();
        calculator0.multiply((-162));
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(42);
        calculator0.clear();
        int int8 = calculator0.getResult();
        calculator0.divide(152);
        calculator0.multiply((-97));
        calculator0.divide((-99998));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.substract((int) (byte) 100);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.substract(160);
        int int9 = calculator0.getResult();
        calculator0.substract(958);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-260) + "'", int9 == (-260));
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.clear();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract(31);
        calculator0.add(87);
        calculator0.substract(42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        int int9 = calculator0.getResult();
        calculator0.add((int) '#');
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        int int13 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        int int4 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.substract(97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.substract(10);
        calculator0.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        int int10 = calculator0.getResult();
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        int int12 = calculator0.getResult();
        calculator0.add(99);
        calculator0.add((int) ' ');
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
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
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((-1));
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.multiply(9);
        int int13 = calculator0.getResult();
        calculator0.clear();
        calculator0.multiply(3);
        int int17 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }
}

