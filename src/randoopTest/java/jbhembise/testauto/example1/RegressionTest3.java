package jbhembise.testauto.example1;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        int int4 = calculator0.getResult();
        calculator0.clear();
        calculator0.multiply(1000);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.multiply(858);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        calculator0.substract(958);
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
        int int17 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.clear();
        calculator0.clear();
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.multiply((-1));
        calculator0.add(1);
        calculator0.multiply(182);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) -1);
        calculator0.substract(42);
        calculator0.add(1);
        int int13 = calculator0.getResult();
        int int14 = calculator0.getResult();
        calculator0.multiply((int) (byte) -1);
        calculator0.multiply(21128);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-41) + "'", int13 == (-41));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-41) + "'", int14 == (-41));
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.add((int) (short) 1);
        calculator0.clear();
        calculator0.add(35);
        calculator0.substract(6);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(42);
        calculator0.divide(31);
        int int14 = calculator0.getResult();
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        int int8 = calculator0.getResult();
        int int9 = calculator0.getResult();
        calculator0.clear();
        calculator0.add((int) (short) 100);
        calculator0.divide((-20));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
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
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        calculator0.add(97);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((-1));
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.multiply(9);
        int int13 = calculator0.getResult();
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.substract(42);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.clear();
        int int13 = calculator0.getResult();
        calculator0.add(8);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        calculator0.multiply((-52));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
        calculator0.add(43);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-43) + "'", int15 == (-43));
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 1);
        calculator0.multiply((int) (short) 100);
        calculator0.divide(1);
        calculator0.clear();
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply(100);
        calculator0.clear();
        calculator0.clear();
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
        calculator0.multiply(10);
        calculator0.clear();
        int int21 = calculator0.getResult();
        int int22 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-42) + "'", int15 == (-42));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(42);
        calculator0.multiply((int) (byte) -1);
        int int14 = calculator0.getResult();
        calculator0.divide(33950);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.substract((int) (byte) 10);
        int int8 = calculator0.getResult();
        calculator0.clear();
        calculator0.add(1612);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-9) + "'", int8 == (-9));
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
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
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
        calculator0.divide((-97));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.add((int) (byte) 100);
        calculator0.multiply((int) (byte) 1);
        int int9 = calculator0.getResult();
        calculator0.add(26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 152 + "'", int9 == 152);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        int int6 = calculator0.getResult();
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.substract((int) '#');
        calculator0.substract(100);
        calculator0.substract(97);
        int int15 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-232) + "'", int15 == (-232));
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        calculator0.add((int) (short) 10);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        int int8 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.multiply((-1));
        calculator0.multiply((-15200));
        calculator0.add(58);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide((int) ' ');
        calculator0.substract((int) '4');
        int int7 = calculator0.getResult();
        calculator0.divide((-32));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-52) + "'", int7 == (-52));
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.add((int) 'a');
        calculator0.add((int) (short) 1);
        int int9 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
        int int16 = calculator0.getResult();
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3582 + "'", int16 == 3582);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.add((int) (short) 1);
        calculator0.add(2);
        calculator0.divide(83);
        calculator0.clear();
        int int15 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) (short) 100);
        calculator0.clear();
        int int6 = calculator0.getResult();
        calculator0.multiply((-35));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        int int11 = calculator0.getResult();
        calculator0.clear();
        calculator0.multiply((int) (short) 1);
        int int15 = calculator0.getResult();
        calculator0.clear();
        int int17 = calculator0.getResult();
        calculator0.divide((-9));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        int int5 = calculator0.getResult();
        calculator0.substract(52);
        calculator0.multiply(10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-100) + "'", int5 == (-100));
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        calculator0.multiply(11);
        calculator0.multiply(26);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.add(1);
        calculator0.multiply((int) '4');
        calculator0.divide(1000);
        calculator0.substract(33);
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        int int8 = calculator0.getResult();
        int int9 = calculator0.getResult();
        calculator0.clear();
        calculator0.multiply(42);
        calculator0.divide((-100099));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.divide((int) (byte) -1);
        calculator0.substract(10);
        calculator0.add((int) 'a');
        int int14 = calculator0.getResult();
        calculator0.divide(520);
        calculator0.divide(108);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 184 + "'", int14 == 184);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        calculator0.divide((-100));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.add(1);
        calculator0.multiply((-2));
        int int13 = calculator0.getResult();
        calculator0.multiply(26);
        calculator0.multiply((-9));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((-1));
        calculator0.add((int) '4');
        calculator0.substract(1612);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        int int8 = calculator0.getResult();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        int int10 = calculator0.getResult();
        calculator0.clear();
        calculator0.multiply(108);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.substract(10);
        calculator0.divide((int) (byte) -1);
        int int9 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide((-3));
        calculator0.divide((-142));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.substract(10);
        calculator0.substract(968);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
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
        calculator0.substract((int) (short) 1);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        calculator0.multiply(184);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
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
        calculator0.multiply((int) (short) 100);
        int int21 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-42) + "'", int15 == (-42));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.add(1);
        int int11 = calculator0.getResult();
        calculator0.divide(43);
        calculator0.clear();
        int int15 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
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
        calculator0.multiply((int) 'a');
        int int17 = calculator0.getResult();
        calculator0.multiply((-20));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-970) + "'", int17 == (-970));
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.divide(2);
        calculator0.add(10890);
        calculator0.divide(108);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(1612);
        calculator0.divide((-1000));
        int int9 = calculator0.getResult();
        calculator0.add((int) '4');
        calculator0.substract(160);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        calculator0.divide((-1));
        calculator0.clear();
        calculator0.divide((int) (short) 10);
        calculator0.divide(1000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) (short) 1);
        calculator0.divide((int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        calculator0.add(42);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.substract((int) 'a');
        calculator0.add(43);
        int int10 = calculator0.getResult();
        calculator0.divide((-183));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-106) + "'", int10 == (-106));
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(42);
        calculator0.substract((int) (short) 100);
        calculator0.substract(10);
        calculator0.multiply((int) (short) 100);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract(10);
        int int8 = calculator0.getResult();
        int int9 = calculator0.getResult();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-10) + "'", int8 == (-10));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-10) + "'", int9 == (-10));
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        int int5 = calculator0.getResult();
        calculator0.substract(8);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
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
        int int18 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 520 + "'", int18 == 520);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.substract((int) (byte) 100);
        calculator0.divide(42);
        calculator0.multiply((-1));
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.add(31);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        calculator0.add((int) '4');
        calculator0.divide((-100));
        calculator0.divide((int) '4');
        calculator0.add(152);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        calculator0.divide(183);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
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
        calculator0.clear();
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
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
        calculator0.divide((-17));
        int int20 = calculator0.getResult();
        calculator0.divide((-2));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((-1));
        calculator0.add((int) '4');
        calculator0.substract(152);
        calculator0.clear();
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
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
        calculator0.substract((int) (short) 1);
        int int18 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-99) + "'", int13 == (-99));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-99) + "'", int14 == (-99));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-99) + "'", int15 == (-99));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
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
        int int18 = calculator0.getResult();
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        int int5 = calculator0.getResult();
        calculator0.multiply((int) (byte) -1);
        calculator0.multiply(36);
        calculator0.multiply(182);
        calculator0.multiply(1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-100) + "'", int5 == (-100));
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
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
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        calculator0.divide((int) '4');
        calculator0.substract(43);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.add((int) (byte) 100);
        calculator0.multiply((int) (byte) 1);
        calculator0.multiply((int) '#');
        calculator0.clear();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.clear();
        calculator0.divide(20);
        calculator0.clear();
        calculator0.multiply((-970));
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        int int5 = calculator0.getResult();
        int int6 = calculator0.getResult();
        int int7 = calculator0.getResult();
        calculator0.divide((-520));
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.clear();
        int int12 = calculator0.getResult();
        int int13 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((int) (byte) 100);
        calculator0.substract(42);
        calculator0.clear();
        int int14 = calculator0.getResult();
        calculator0.multiply((-17));
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) '4');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.divide(10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        int int11 = calculator0.getResult();
        calculator0.clear();
        calculator0.substract((int) (byte) 1);
        calculator0.add(10000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((-100));
        int int11 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide((-64));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1000) + "'", int11 == (-1000));
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
        calculator0.multiply(0);
        calculator0.clear();
        calculator0.add(21128);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.add(100);
        calculator0.substract((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.clear();
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.clear();
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.substract(187);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
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
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-35) + "'", int13 == (-35));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-35) + "'", int14 == (-35));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(42);
        calculator0.multiply(52);
        int int14 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        calculator0.divide((int) (byte) 10);
        calculator0.divide((-20));
        calculator0.clear();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((-100));
        int int11 = calculator0.getResult();
        calculator0.add((int) ' ');
        calculator0.divide(184);
        int int16 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1000) + "'", int11 == (-1000));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-5) + "'", int16 == (-5));
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        calculator0.divide((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 183 + "'", int16 == 183);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
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
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        calculator0.substract(152);
        java.lang.Class<?> wildcardClass18 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.substract((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
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
        calculator0.add(2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 42 + "'", int15 == 42);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        int int11 = calculator0.getResult();
        calculator0.multiply(2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-100) + "'", int11 == (-100));
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.clear();
        calculator0.substract(1);
        calculator0.substract((int) (short) 1);
        calculator0.multiply((int) '#');
        calculator0.clear();
        calculator0.clear();
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.add((int) (byte) 100);
        calculator0.multiply((int) (byte) 1);
        calculator0.substract((int) (byte) 1);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        calculator0.multiply(0);
        calculator0.multiply((-1010));
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        int int5 = calculator0.getResult();
        calculator0.add(1000);
        calculator0.substract((int) ' ');
        calculator0.clear();
        calculator0.add(350);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
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
        calculator0.divide((-41));
        calculator0.add(152);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.multiply(0);
        calculator0.multiply(2);
        calculator0.add(26);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(42);
        calculator0.multiply(83);
        int int5 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.clear();
        calculator0.add(33950);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((-1));
        int int10 = calculator0.getResult();
        int int11 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.substract((int) 'a');
        calculator0.add(43);
        int int10 = calculator0.getResult();
        calculator0.divide(97);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-106) + "'", int10 == (-106));
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.clear();
        calculator0.substract(131);
        calculator0.add(1612);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        calculator0.substract((int) (byte) 1);
        calculator0.clear();
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.clear();
        calculator0.multiply((-43));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.clear();
        calculator0.divide((int) ' ');
        calculator0.substract((int) '4');
        calculator0.clear();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        calculator0.multiply((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.add(1);
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        calculator0.divide((int) 'a');
        int int22 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.multiply((-9900));
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        calculator0.clear();
        calculator0.divide((int) (short) 10);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
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
        int int19 = calculator0.getResult();
        calculator0.divide((-9900));
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 33 + "'", int19 == 33);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 1);
        calculator0.multiply((int) (short) 100);
        calculator0.substract(33);
        calculator0.divide((-100000));
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.divide((int) (byte) -1);
        calculator0.substract(10);
        calculator0.add((int) 'a');
        int int14 = calculator0.getResult();
        calculator0.divide(520);
        calculator0.divide(6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 184 + "'", int14 == 184);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        calculator0.multiply(520);
        int int18 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 520 + "'", int18 == 520);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) '4');
        calculator0.clear();
        calculator0.divide((-1000));
        calculator0.divide((-53));
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
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
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
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
        calculator0.multiply(10);
        calculator0.clear();
        int int21 = calculator0.getResult();
        calculator0.divide(131);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-42) + "'", int15 == (-42));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.divide((int) (byte) -1);
        int int10 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.multiply((-1));
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.substract(8);
        calculator0.divide((-2));
        calculator0.divide((int) (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract(10);
        calculator0.multiply(350);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.add(100);
        calculator0.substract((int) (short) 1);
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.divide((-1));
        int int8 = calculator0.getResult();
        calculator0.substract(10);
        calculator0.multiply(1);
        calculator0.multiply(99);
        int int15 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-990) + "'", int15 == (-990));
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.add(184);
        calculator0.divide((-97));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
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
        calculator0.clear();
        calculator0.divide((-64));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.add(100);
        calculator0.substract((int) (short) 1);
        calculator0.multiply((-2));
        int int11 = calculator0.getResult();
        calculator0.divide(42);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-198) + "'", int11 == (-198));
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.substract((int) (byte) 1);
        calculator0.add((int) 'a');
        calculator0.add((int) '4');
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
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
        calculator0.substract((int) (byte) 1);
        calculator0.clear();
        calculator0.divide((int) (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
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
        calculator0.divide((-64));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(42);
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.substract(35);
        int int7 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-35) + "'", int7 == (-35));
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        int int6 = calculator0.getResult();
        calculator0.substract(43);
        calculator0.clear();
        calculator0.substract(83);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.add((int) '4');
        calculator0.divide((int) (short) 10);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.divide(2);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        calculator0.divide((int) (byte) 10);
        calculator0.multiply(10);
        calculator0.multiply((int) 'a');
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        calculator0.divide(83);
        calculator0.add(97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-10));
        calculator0.clear();
        calculator0.add((int) (byte) 100);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((int) (byte) 100);
        calculator0.clear();
        calculator0.clear();
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(42);
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.multiply(1612);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-42) + "'", int3 == (-42));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
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
        calculator0.divide((int) (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) '4');
        calculator0.substract(100);
        calculator0.multiply(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.divide((-2));
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        int int8 = calculator0.getResult();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.add((int) (short) 100);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.add(100);
        calculator0.clear();
        calculator0.clear();
        int int9 = calculator0.getResult();
        calculator0.add(20);
        calculator0.multiply(100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.divide(160);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.substract((int) '4');
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.divide((-53));
        calculator0.clear();
        calculator0.divide(36);
        calculator0.divide(6);
        int int20 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.substract(36);
        calculator0.divide((-17));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.add((int) (short) 100);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.clear();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.divide((int) '#');
        calculator0.add(1);
        calculator0.multiply((-2));
        calculator0.divide((-32));
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        calculator0.clear();
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        calculator0.clear();
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.divide((-97));
        calculator0.clear();
        calculator0.substract(67);
        calculator0.add(5320);
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.add((int) (short) 1);
        calculator0.clear();
        calculator0.multiply(0);
        calculator0.substract(1000);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.add((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.add(36);
        calculator0.clear();
        int int11 = calculator0.getResult();
        calculator0.divide((int) '#');
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
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
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        calculator0.multiply((-564201));
        calculator0.divide((-4160));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract(10);
        int int8 = calculator0.getResult();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-10) + "'", int8 == (-10));
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.add((int) '#');
        calculator0.divide(131);
        calculator0.clear();
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((int) (byte) 100);
        calculator0.clear();
        int int12 = calculator0.getResult();
        int int13 = calculator0.getResult();
        calculator0.divide((int) (byte) 1);
        calculator0.divide(183);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) -1);
        calculator0.multiply(52);
        int int11 = calculator0.getResult();
        calculator0.substract((int) ' ');
        calculator0.divide((-90));
        int int16 = calculator0.getResult();
        calculator0.divide((-183));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.divide((int) (short) 1);
        calculator0.multiply(1000);
        int int9 = calculator0.getResult();
        calculator0.multiply(12);
        calculator0.add((int) ' ');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        int int9 = calculator0.getResult();
        calculator0.substract(33);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.clear();
        int int7 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) '4');
        calculator0.clear();
        calculator0.divide((-1000));
        calculator0.multiply((int) 'a');
        int int13 = calculator0.getResult();
        calculator0.divide((-3));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(100);
        calculator0.multiply(87);
        calculator0.clear();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.substract(959);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
        calculator0.substract(21128);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1000) + "'", int11 == (-1000));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        calculator0.add(52);
        calculator0.clear();
        calculator0.divide((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.divide(160);
        calculator0.clear();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.divide((-10001));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(100);
        calculator0.substract(42);
        int int9 = calculator0.getResult();
        int int10 = calculator0.getResult();
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-142) + "'", int9 == (-142));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-142) + "'", int10 == (-142));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
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
        calculator0.substract(21128);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.substract((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.divide(1612);
        calculator0.clear();
        calculator0.substract((int) (short) 1);
        int int15 = calculator0.getResult();
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        calculator0.add((int) '4');
        calculator0.divide((-100));
        calculator0.multiply(2);
        calculator0.substract(10890);
        calculator0.add(43);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
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
        calculator0.divide(99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-35) + "'", int13 == (-35));
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.add((int) (short) 100);
        int int10 = calculator0.getResult();
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        int int12 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        int int5 = calculator0.getResult();
        calculator0.substract((int) ' ');
        calculator0.substract((int) ' ');
        calculator0.clear();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        java.lang.Class<?> wildcardClass17 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) ' ');
        calculator0.substract((int) (byte) 1);
        calculator0.add((int) (byte) 100);
        int int15 = calculator0.getResult();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 131 + "'", int15 == 131);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(42);
        calculator0.clear();
        int int8 = calculator0.getResult();
        calculator0.divide(152);
        calculator0.divide(350);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        calculator0.multiply((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.add(1000);
        int int14 = calculator0.getResult();
        calculator0.divide((-40));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.add(100);
        calculator0.substract((int) (short) 1);
        calculator0.clear();
        calculator0.multiply(58);
        calculator0.multiply((-10001));
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.clear();
        calculator0.multiply(36);
        calculator0.divide(33950);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        int int9 = calculator0.getResult();
        calculator0.divide((int) (byte) 10);
        calculator0.multiply(10);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        calculator0.divide(4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.divide((int) (short) -1);
        calculator0.clear();
        calculator0.multiply(31);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
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
        int int15 = calculator0.getResult();
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        calculator0.divide((-100000));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.clear();
        calculator0.divide(100);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
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
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply(20);
        calculator0.substract((int) (byte) 1);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
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
        calculator0.add(33950);
        calculator0.multiply(99);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(42);
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.substract(6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.substract(1000);
        calculator0.divide((-42));
        calculator0.clear();
        calculator0.divide((-41));
        calculator0.substract(26);
        calculator0.multiply(43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.clear();
        calculator0.substract(350);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) 10);
        calculator0.clear();
        int int11 = calculator0.getResult();
        calculator0.divide(8);
        calculator0.divide((-100099));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
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
        calculator0.substract(10890);
        calculator0.divide(3);
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply(10);
        calculator0.multiply((int) (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
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
        calculator0.multiply(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply(100);
        calculator0.multiply(0);
        calculator0.multiply(0);
        calculator0.add(43);
        calculator0.add(20);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        int int7 = calculator0.getResult();
        calculator0.add(52);
        calculator0.clear();
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10) + "'", int7 == (-10));
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.multiply(1);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.multiply((-32));
        int int14 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.substract((int) '#');
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.multiply(0);
        calculator0.add(959);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        calculator0.add((int) (short) 10);
        int int7 = calculator0.getResult();
        calculator0.divide(36);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
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
        calculator0.multiply(21128);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.multiply((int) (short) 0);
        calculator0.clear();
        calculator0.add(10);
        int int11 = calculator0.getResult();
        calculator0.multiply(43);
        calculator0.multiply(108);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.add((int) (short) 1);
        calculator0.add(1);
        calculator0.clear();
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
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
        int int18 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        calculator0.multiply((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.add(1000);
        int int14 = calculator0.getResult();
        calculator0.divide(10);
        calculator0.add(58);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-100));
        calculator0.multiply((int) (byte) 10);
        calculator0.multiply((-1));
        calculator0.divide((-99));
        calculator0.divide(42);
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.clear();
        calculator0.substract(1);
        calculator0.substract((int) (short) 1);
        calculator0.multiply((int) '#');
        calculator0.clear();
        calculator0.clear();
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
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
        int int16 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
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
        calculator0.divide((-4160));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-100));
        calculator0.multiply((int) (byte) 10);
        int int9 = calculator0.getResult();
        calculator0.multiply(160);
        calculator0.substract((int) '#');
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        calculator0.multiply(8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.substract(10);
        calculator0.divide((int) (byte) -1);
        int int9 = calculator0.getResult();
        calculator0.clear();
        calculator0.add(131);
        int int13 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 131 + "'", int13 == 131);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.divide((int) '#');
        calculator0.substract((int) (short) 10);
        calculator0.add((int) (byte) 1);
        calculator0.divide(1612);
        calculator0.add(131);
        int int16 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 131 + "'", int16 == 131);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.substract(10);
        calculator0.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract(43);
        calculator0.multiply((-9900));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.add((int) ' ');
        calculator0.substract(42);
        calculator0.clear();
        calculator0.substract((int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        calculator0.multiply(36);
        calculator0.multiply(0);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
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
        calculator0.clear();
        calculator0.multiply((-4160));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
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
        calculator0.multiply(26);
        int int19 = calculator0.getResult();
        int int20 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.substract((int) (byte) 100);
        calculator0.divide(42);
        calculator0.multiply((-42));
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        int int11 = calculator0.getResult();
        calculator0.clear();
        calculator0.multiply((int) (short) 1);
        int int15 = calculator0.getResult();
        calculator0.clear();
        int int17 = calculator0.getResult();
        java.lang.Class<?> wildcardClass18 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
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
        calculator0.substract(187);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        calculator0.add((int) '4');
        calculator0.divide((-100));
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        int int11 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.clear();
        calculator0.add((int) (byte) 10);
        calculator0.multiply(11);
        int int14 = calculator0.getResult();
        java.lang.Class<?> wildcardClass15 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 110 + "'", int14 == 110);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
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
        calculator0.divide(33950);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.add(100);
        calculator0.substract((int) (short) 1);
        calculator0.multiply((-2));
        calculator0.add((int) (short) 100);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.clear();
        calculator0.substract(129);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(100);
        calculator0.divide((int) 'a');
        int int9 = calculator0.getResult();
        calculator0.add((int) (short) 100);
        calculator0.multiply((-9));
        int int14 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-891) + "'", int14 == (-891));
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.multiply(0);
        calculator0.divide((int) ' ');
        calculator0.divide(8);
        int int12 = calculator0.getResult();
        int int13 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        int int8 = calculator0.getResult();
        calculator0.multiply((int) (short) 1);
        calculator0.clear();
        calculator0.multiply(160);
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
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
        calculator0.divide(514800);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.multiply(10);
        calculator0.divide((int) '4');
        calculator0.divide((-97));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(42);
        calculator0.clear();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.add(100);
        calculator0.substract((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply((-35));
        calculator0.add(26);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
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
        calculator0.multiply((-162));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-42) + "'", int15 == (-42));
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.clear();
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.multiply(0);
        calculator0.clear();
        calculator0.multiply((-1000));
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.clear();
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.multiply(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.multiply((int) (short) 0);
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        int int10 = calculator0.getResult();
        calculator0.clear();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.clear();
        calculator0.substract((int) ' ');
        calculator0.multiply(0);
        calculator0.divide((int) ' ');
        calculator0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
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
        calculator0.divide((-100000));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        calculator0.add((int) (byte) 10);
        int int6 = calculator0.getResult();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        int int6 = calculator0.getResult();
        calculator0.divide((-43));
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.divide((-109));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-52) + "'", int6 == (-52));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(42);
        calculator0.divide((int) 'a');
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.substract((int) (byte) 10);
        int int8 = calculator0.getResult();
        calculator0.clear();
        calculator0.add(31);
        int int12 = calculator0.getResult();
        calculator0.divide(43);
        int int15 = calculator0.getResult();
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-9) + "'", int8 == (-9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(42);
        calculator0.substract((int) (short) 100);
        calculator0.substract(10);
        calculator0.clear();
        calculator0.clear();
        calculator0.multiply((-90));
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(42);
        calculator0.substract((int) (short) 100);
        calculator0.substract(10);
        calculator0.multiply((int) (byte) 100);
        calculator0.divide(858);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.add((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.multiply((int) (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(42);
        calculator0.substract((int) (short) 100);
        calculator0.multiply(20);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        int int11 = calculator0.getResult();
        calculator0.multiply((int) (byte) -1);
        calculator0.divide(11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-100) + "'", int11 == (-100));
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
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
        int int21 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(1612);
        calculator0.divide((-1000));
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        int int11 = calculator0.getResult();
        int int12 = calculator0.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
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
        calculator0.add(10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1000) + "'", int11 == (-1000));
    }
}

