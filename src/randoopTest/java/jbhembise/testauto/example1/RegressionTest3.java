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
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '#');
        calculator1.clear();
        calculator1.divide(7852);
        calculator1.add((int) ' ');
        calculator1.add(5);
        calculator1.multiply(312000000);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add(1);
        calculator0.multiply(99);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.substract(100);
        calculator1.divide(10);
        calculator1.substract(2);
        calculator1.multiply(100);
        calculator1.substract((int) (short) 100);
        java.lang.Class<?> wildcardClass14 = calculator1.getClass();
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
        calculator1.multiply(100);
        int int15 = calculator1.getResult();
        calculator1.multiply(151);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.divide((int) 'a');
        calculator1.clear();
        calculator1.clear();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        calculator1.add((int) (short) 1);
        calculator1.divide(200);
        calculator1.divide(96);
        int int14 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.divide(96);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        int int8 = calculator1.getResult();
        calculator1.divide((int) '4');
        calculator1.clear();
        int int12 = calculator1.getResult();
        calculator1.substract(39);
        calculator1.add(390);
        calculator1.substract(17);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 151 + "'", int8 == 151);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract(39);
        calculator1.multiply((int) 'a');
        int int10 = calculator1.getResult();
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-3783) + "'", int10 == (-3783));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        calculator1.add(200);
        int int4 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 199 + "'", int4 == 199);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.clear();
        calculator1.multiply((int) '#');
        calculator1.multiply(30);
        calculator1.substract(500);
        calculator1.divide(185);
        int int13 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(10);
        calculator1.add(39);
        calculator1.divide(500);
        calculator1.clear();
        calculator1.add(500);
        int int9 = calculator1.getResult();
        calculator1.multiply(89);
        calculator1.multiply(1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 500 + "'", int9 == 500);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((int) (short) 0);
        calculator1.divide((-97));
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.divide(110);
        calculator1.add(89);
        int int14 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 89 + "'", int14 == 89);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-1400000));
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide((int) '#');
        int int8 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract(4000000);
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
        calculator1.divide((-785));
        calculator1.clear();
        calculator1.multiply(571233);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-19974500));
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.clear();
        calculator1.multiply((int) '#');
        calculator1.divide(40);
        calculator1.substract((int) (byte) 10);
        calculator1.add(152);
        calculator1.substract((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        calculator1.substract(69);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.substract(39);
        calculator1.multiply((-12));
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
        int int19 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-12) + "'", int16 == (-12));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.divide((int) (byte) 100);
        calculator1.substract(98);
        calculator1.add(1000);
        int int12 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 902 + "'", int12 == 902);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        calculator1.multiply(1);
        calculator1.divide((int) '#');
        calculator1.clear();
        int int10 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        int int4 = calculator1.getResult();
        calculator1.clear();
        calculator1.clear();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.divide((-9800));
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.substract(30);
        calculator1.substract(390);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) '4');
        calculator1.add((int) (short) 10);
        calculator1.multiply((int) '4');
        calculator1.divide(7852);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 10);
        calculator1.substract((int) '#');
        calculator1.substract(40);
        calculator1.substract(140);
        calculator1.divide((-4000));
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.divide((int) 'a');
        calculator1.clear();
        calculator1.clear();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        calculator1.add((int) (short) 1);
        calculator1.divide(200);
        calculator1.multiply((-39429));
        int int14 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        int int9 = calculator1.getResult();
        calculator1.clear();
        calculator1.clear();
        calculator1.add(10);
        calculator1.multiply(49);
        calculator1.multiply((int) ' ');
        calculator1.divide((-75));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-425683));
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.multiply(0);
        calculator1.substract(30);
        calculator1.add((int) '#');
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        int int13 = calculator1.getResult();
        calculator1.multiply(0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.multiply((int) (byte) 10);
        calculator1.clear();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide((int) '#');
        int int8 = calculator1.getResult();
        calculator1.add((int) (short) 10);
        calculator1.divide(4000000);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.clear();
        calculator1.divide((-100));
        calculator1.multiply(35);
        calculator1.substract(510);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(10);
        calculator1.multiply((int) (short) 10);
        calculator1.clear();
        int int5 = calculator1.getResult();
        calculator1.multiply(152);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 100);
        calculator1.divide((-39));
        calculator1.multiply(85);
        calculator1.multiply((-4656));
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.multiply((int) (byte) -1);
        calculator1.multiply((-97));
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        int int9 = calculator1.getResult();
        calculator1.substract(198900);
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        calculator1.multiply(480);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4656) + "'", int9 == (-4656));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(39);
        calculator1.divide(99);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.substract(100);
        calculator1.divide(10);
        calculator1.substract(2);
        calculator1.divide((-4000));
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-10));
        calculator1.multiply(2);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide(54600000);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.divide((int) 'a');
        calculator1.clear();
        calculator1.clear();
        calculator1.multiply(2);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.clear();
        calculator1.divide((-100));
        calculator1.multiply(40);
        calculator1.substract(1);
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        calculator1.clear();
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        calculator1.divide(187);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
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
        int int17 = calculator1.getResult();
        java.lang.Class<?> wildcardClass18 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract(39);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.multiply((int) (byte) 100);
        calculator1.multiply((int) (short) 0);
        calculator1.clear();
        int int14 = calculator1.getResult();
        calculator1.divide((int) 'a');
        calculator1.clear();
        calculator1.divide(140);
        calculator1.multiply((-7852));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.clear();
        calculator1.add(10);
        calculator1.add((int) 'a');
        calculator1.substract(51);
        int int11 = calculator1.getResult();
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        java.lang.Class<?> wildcardClass14 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 56 + "'", int11 == 56);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 0);
        calculator1.clear();
        calculator1.add(39);
        calculator1.add(187);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.clear();
        calculator1.divide((-100));
        calculator1.multiply(40);
        calculator1.substract(1);
        calculator1.multiply((-100));
        int int13 = calculator1.getResult();
        calculator1.add(85);
        int int16 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 185 + "'", int16 == 185);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.divide((int) (short) 100);
        calculator1.multiply((int) (short) 1);
        calculator1.clear();
        calculator1.multiply(56);
        int int9 = calculator1.getResult();
        calculator1.substract(10);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (byte) 1);
        calculator1.substract((int) 'a');
        calculator1.clear();
        calculator1.multiply(390);
        calculator1.divide(571233);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        calculator1.multiply((int) '4');
        calculator1.divide((int) (byte) 1);
        calculator1.multiply((-1));
        calculator1.clear();
        calculator1.divide(312000000);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-431));
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.multiply(151);
        calculator1.substract(78);
        calculator1.clear();
        calculator1.divide((int) (short) 1);
        calculator1.multiply((-39));
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        int int5 = calculator1.getResult();
        calculator1.substract(48);
        calculator1.substract(95);
        int int10 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-143) + "'", int10 == (-143));
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) '4');
        calculator1.add(40);
        calculator1.clear();
        calculator1.clear();
        calculator1.clear();
        calculator1.divide(187);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.substract(100);
        calculator1.divide(10);
        calculator1.add(40);
        calculator1.clear();
        calculator1.add(10);
        calculator1.divide((-92263860));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        int int6 = calculator1.getResult();
        calculator1.clear();
        calculator1.multiply((int) ' ');
        calculator1.multiply((-14550));
        calculator1.substract(7400);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        int int8 = calculator1.getResult();
        calculator1.divide((int) '4');
        calculator1.clear();
        calculator1.clear();
        calculator1.clear();
        calculator1.divide(40);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 151 + "'", int8 == 151);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.divide((-97));
        int int12 = calculator1.getResult();
        calculator1.multiply((-56));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.divide((int) (byte) 100);
        calculator1.divide(99);
        calculator1.divide((-431));
        int int12 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        calculator1.multiply((int) ' ');
        calculator1.divide((int) (byte) 100);
        int int9 = calculator1.getResult();
        int int10 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.multiply(10);
        calculator1.divide(39);
        calculator1.clear();
        calculator1.divide(199);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(10);
        calculator1.add(39);
        calculator1.multiply((int) (byte) -1);
        calculator1.multiply(696072);
        calculator1.substract((int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        calculator1.divide((-785));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(0);
        calculator1.add((int) (short) 100);
        calculator1.substract(10);
        calculator1.clear();
        calculator1.clear();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        int int9 = calculator1.getResult();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.divide((int) (short) 10);
        calculator1.add(1);
        calculator1.multiply((-1));
        calculator1.substract(15100);
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 10);
        calculator1.substract((int) '#');
        calculator1.substract(40);
        calculator1.multiply(136);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) ' ');
        calculator1.clear();
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        int int17 = calculator1.getResult();
        calculator1.multiply((-785));
        calculator1.multiply(468);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 39949 + "'", int16 == 39949);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 39949 + "'", int17 == 39949);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.clear();
        calculator1.multiply((int) '#');
        calculator1.divide(40);
        calculator1.divide((-97));
        int int11 = calculator1.getResult();
        calculator1.multiply((-4656));
        int int14 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide((int) '#');
        calculator1.clear();
        calculator1.clear();
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(7852);
        calculator1.multiply(99);
        calculator1.clear();
        calculator1.clear();
        calculator1.clear();
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((int) (byte) 1);
        calculator1.divide(151);
        int int9 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(0);
        calculator1.add((int) (short) 100);
        calculator1.substract(10);
        calculator1.clear();
        calculator1.clear();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        int int9 = calculator1.getResult();
        calculator1.multiply((-198900));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract((int) (byte) 1);
        calculator1.multiply((int) (short) 100);
        calculator1.divide(34);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract(39);
        calculator1.multiply((int) 'a');
        int int10 = calculator1.getResult();
        calculator1.multiply((int) '#');
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-3783) + "'", int10 == (-3783));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.multiply((int) (short) 100);
        calculator1.multiply(10);
        calculator1.multiply((int) (short) 100);
        calculator1.clear();
        calculator1.substract(187);
        calculator1.substract((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract(39);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.multiply((int) (byte) 100);
        calculator1.multiply(100);
        calculator1.divide((int) (short) 10);
        int int15 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-39000) + "'", int15 == (-39000));
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        calculator1.clear();
        int int7 = calculator1.getResult();
        calculator1.add(390);
        int int10 = calculator1.getResult();
        calculator1.add(78);
        int int13 = calculator1.getResult();
        calculator1.divide((-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 390 + "'", int10 == 390);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 468 + "'", int13 == 468);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.divide(10);
        calculator1.add(4);
        calculator1.divide((int) (byte) 100);
        calculator1.substract(136);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
        calculator1.add(48);
        calculator1.substract(1248);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.substract(100);
        int int6 = calculator1.getResult();
        calculator1.clear();
        calculator1.divide((int) 'a');
        int int10 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((int) (short) 0);
        calculator1.clear();
        int int8 = calculator1.getResult();
        calculator1.multiply((-14550));
        int int11 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
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
        calculator1.add(571233);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 39 + "'", int14 == 39);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        int int6 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-198900));
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(7852);
        calculator1.multiply(99);
        calculator1.clear();
        calculator1.clear();
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        calculator1.clear();
        int int7 = calculator1.getResult();
        calculator1.add(390);
        int int10 = calculator1.getResult();
        calculator1.multiply((-146));
        calculator1.multiply((-197));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 390 + "'", int10 == 390);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.multiply((int) (byte) -1);
        calculator1.multiply(0);
        calculator1.multiply(49);
        int int10 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-127));
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.add((int) '#');
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.substract(39);
        calculator1.add(151);
        calculator1.multiply(49);
        calculator1.clear();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(10);
        calculator1.add(39);
        calculator1.divide(500);
        calculator1.clear();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        calculator1.clear();
        calculator1.add(30);
        calculator1.clear();
        calculator1.substract(480);
        calculator1.clear();
        int int13 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(0);
        calculator1.add((int) (short) 100);
        calculator1.substract(10);
        calculator1.add(10);
        calculator1.clear();
        calculator1.multiply(1);
        int int11 = calculator1.getResult();
        int int12 = calculator1.getResult();
        calculator1.divide(15100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-311999099));
        calculator1.substract(162);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 100);
        calculator1.divide(85);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
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
        calculator1.multiply(2);
        calculator1.divide(56);
        int int25 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(49);
        calculator1.divide((int) 'a');
        calculator1.divide((-5920));
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-785));
        calculator1.substract(390);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        calculator1.substract((int) (byte) 1);
        calculator1.add((int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        calculator1.divide(30);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.substract(49);
        java.lang.Class<?> wildcardClass14 = calculator1.getClass();
        calculator1.substract(39949);
        calculator1.multiply((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.divide((-97));
        int int12 = calculator1.getResult();
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.substract((int) 'a');
        int int8 = calculator1.getResult();
        calculator1.substract(100);
        calculator1.add(151);
        calculator1.divide((int) 'a');
        int int15 = calculator1.getResult();
        int int16 = calculator1.getResult();
        int int17 = calculator1.getResult();
        calculator1.add(902);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-97) + "'", int8 == (-97));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        calculator1.multiply(1);
        calculator1.divide((int) '#');
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.substract(39949);
        int int12 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-39949) + "'", int12 == (-39949));
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.clear();
        calculator1.divide((-100));
        calculator1.multiply(40);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.divide((-30));
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.clear();
        calculator1.multiply(152);
        int int6 = calculator1.getResult();
        calculator1.clear();
        calculator1.divide(390);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        int int6 = calculator1.getResult();
        calculator1.clear();
        calculator1.divide(98);
        int int10 = calculator1.getResult();
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        calculator1.multiply((-100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        int int5 = calculator1.getResult();
        calculator1.clear();
        int int7 = calculator1.getResult();
        calculator1.divide((-39429));
        int int10 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide(10);
        calculator1.multiply((int) (short) 0);
        calculator1.clear();
        calculator1.divide(1248);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(10);
        calculator1.add(39);
        calculator1.multiply((-311999099));
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(5);
        int int2 = calculator1.getResult();
        calculator1.clear();
        calculator1.multiply(140);
        calculator1.divide(185);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        calculator1.clear();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(10);
        int int2 = calculator1.getResult();
        calculator1.multiply(432);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.add(100);
        calculator1.multiply((-97));
        calculator1.multiply((-7852));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        int int9 = calculator1.getResult();
        calculator1.divide((-19974500));
        calculator1.divide(200);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(39);
        calculator1.multiply((int) (byte) 1);
        int int6 = calculator1.getResult();
        calculator1.add(152);
        calculator1.substract((int) (byte) 10);
        calculator1.multiply(140);
        calculator1.multiply(0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.substract(100);
        int int6 = calculator1.getResult();
        calculator1.clear();
        calculator1.add((int) (short) 10);
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.divide(10);
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        calculator1.multiply((-312000000));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.add(100);
        int int9 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract(312000000);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
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
        calculator1.divide((int) '#');
        calculator1.divide(696072);
        calculator1.multiply((int) (byte) 100);
        int int19 = calculator1.getResult();
        java.lang.Class<?> wildcardClass20 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        int int6 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract(56);
        int int10 = calculator1.getResult();
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-56) + "'", int10 == (-56));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 10);
        calculator1.clear();
        calculator1.clear();
        calculator1.substract((int) (byte) 1);
        calculator1.add(527);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        calculator1.clear();
        calculator1.divide((int) '4');
        int int9 = calculator1.getResult();
        calculator1.multiply((int) (short) -1);
        calculator1.divide(78);
        calculator1.multiply(30);
        int int16 = calculator1.getResult();
        int int17 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        int int9 = calculator1.getResult();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        int int11 = calculator1.getResult();
        calculator1.add(185);
        calculator1.add(98);
        calculator1.divide((-14550));
        calculator1.multiply((-52));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 40 + "'", int9 == 40);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 40 + "'", int11 == 40);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.clear();
        calculator1.divide((-100));
        calculator1.multiply(40);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.multiply((int) ' ');
        int int12 = calculator1.getResult();
        calculator1.add(152);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.divide((int) (byte) 100);
        calculator1.substract(98);
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        calculator1.clear();
        calculator1.multiply(39);
        calculator1.add(2);
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        calculator1.add(39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.clear();
        calculator1.add(10);
        calculator1.multiply((int) (short) 100);
        int int9 = calculator1.getResult();
        calculator1.divide(95);
        calculator1.multiply(141);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((int) (short) 100);
        calculator1.divide(500);
        calculator1.multiply(51);
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.clear();
        calculator1.divide((-100));
        calculator1.multiply(40);
        calculator1.substract(1);
        calculator1.multiply((-100));
        int int13 = calculator1.getResult();
        calculator1.add(85);
        int int16 = calculator1.getResult();
        calculator1.multiply((-400));
        calculator1.substract(151);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 185 + "'", int16 == 185);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.multiply((-1));
        calculator1.multiply((-12));
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.divide((-500));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply(10);
        int int7 = calculator1.getResult();
        calculator1.divide(34);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 510 + "'", int7 == 510);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        int int7 = calculator1.getResult();
        calculator1.divide((-19877760));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.clear();
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.multiply(17);
        calculator1.add(225);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(51);
        calculator1.multiply((int) (short) 100);
        int int4 = calculator1.getResult();
        calculator1.substract(1);
        calculator1.divide((-3877090));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5100 + "'", int4 == 5100);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) '4');
        calculator1.add((int) (short) 10);
        calculator1.multiply(4);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        calculator1.add(56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        calculator1.multiply((int) '4');
        calculator1.divide((int) (byte) 1);
        calculator1.multiply((-1));
        calculator1.multiply(0);
        calculator1.add(500);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        int int3 = calculator1.getResult();
        calculator1.divide((-100));
        calculator1.divide((-97));
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.substract(312000432);
        calculator1.multiply((-100));
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add(1);
        calculator0.substract(56);
        calculator0.add((int) (byte) 1);
        calculator0.clear();
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide((int) (short) 1);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide((int) '#');
        int int7 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        int int6 = calculator1.getResult();
        calculator1.multiply(99);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.multiply(39949);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.add(100);
        calculator1.clear();
        calculator1.substract((int) (byte) 1);
        calculator1.clear();
        calculator1.multiply(95);
        int int17 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        calculator1.multiply((int) 'a');
        int int4 = calculator1.getResult();
        calculator1.substract(85);
        calculator1.substract(100);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.multiply(400);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-97) + "'", int4 == (-97));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide((-100));
        calculator1.multiply((-4656));
        int int9 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        calculator1.divide(15100);
        calculator1.substract(78);
        calculator1.add(198900);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.divide((int) (byte) 10);
        int int6 = calculator1.getResult();
        calculator1.multiply(7852);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        int int10 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) '4');
        int int9 = calculator1.getResult();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.divide((int) '#');
        calculator1.add(185);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.add(100);
        calculator1.clear();
        calculator1.substract((int) (byte) 1);
        calculator1.clear();
        calculator1.multiply(100);
        calculator1.divide(39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.add(100);
        calculator1.multiply((-97));
        calculator1.substract(51);
        calculator1.divide((-51));
        calculator1.divide((-6173856));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) 'a');
        calculator1.divide(2);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide((int) (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-92263860));
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.divide((int) (short) 100);
        calculator1.add(100);
        calculator1.clear();
        java.lang.Class<?> wildcardClass14 = calculator1.getClass();
        calculator1.divide(571233);
        java.lang.Class<?> wildcardClass17 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(10);
        calculator1.add(48);
        int int13 = calculator1.getResult();
        java.lang.Class<?> wildcardClass14 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide(12);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 78 + "'", int13 == 78);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(12);
        calculator1.substract(2);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(49);
        calculator1.divide(12);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide((int) (short) 1);
        calculator1.substract((int) '4');
        calculator1.add(187);
        calculator1.multiply(69);
        calculator1.divide((-29235014));
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((int) (short) 0);
        calculator1.clear();
        int int8 = calculator1.getResult();
        calculator1.multiply((-14550));
        calculator1.multiply(10);
        calculator1.add(7400);
        calculator1.add(571233);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.multiply(0);
        calculator1.substract(30);
        calculator1.add((int) '#');
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        calculator1.add(140);
        calculator1.multiply(0);
        java.lang.Class<?> wildcardClass17 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        calculator1.multiply(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(151);
        int int2 = calculator1.getResult();
        calculator1.divide((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 151 + "'", int2 == 151);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.substract(100);
        calculator1.divide(10);
        calculator1.add(40);
        calculator1.clear();
        calculator1.divide((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.divide(1);
        calculator1.substract(51);
        calculator1.substract((int) 'a');
        calculator1.multiply((int) (short) 1);
        java.lang.Class<?> wildcardClass20 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.clear();
        calculator1.clear();
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        int int6 = calculator1.getResult();
        int int7 = calculator1.getResult();
        int int8 = calculator1.getResult();
        calculator1.substract((int) '#');
        calculator1.multiply((int) '#');
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        int int6 = calculator1.getResult();
        calculator1.clear();
        calculator1.divide(98);
        int int10 = calculator1.getResult();
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        calculator1.substract(1000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(571233);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        int int5 = calculator1.getResult();
        calculator1.substract(48);
        calculator1.substract(40);
        calculator1.add((int) (short) 10);
        calculator1.multiply(107);
        calculator1.substract(99);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(39);
        calculator1.divide(99);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide(98);
        calculator1.multiply((-2));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
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
        int int17 = calculator1.getResult();
        calculator1.divide((int) ' ');
        calculator1.add(85);
        calculator1.substract(312000432);
        java.lang.Class<?> wildcardClass24 = calculator1.getClass();
        int int25 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 39949 + "'", int16 == 39949);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 39949 + "'", int17 == 39949);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-311999099) + "'", int25 == (-311999099));
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract(39);
        calculator1.multiply((int) 'a');
        calculator1.multiply((-98));
        calculator1.multiply((-19877760));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.multiply(0);
        calculator1.substract(30);
        calculator1.multiply(30);
        calculator1.clear();
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide(10);
        calculator1.multiply(100);
        int int12 = calculator1.getResult();
        calculator1.multiply(71);
        calculator1.divide((-97));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
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
        calculator1.multiply(69);
        java.lang.Class<?> wildcardClass22 = calculator1.getClass();
        calculator1.add(5);
        int int25 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.clear();
        calculator1.divide((-100));
        calculator1.multiply(40);
        calculator1.substract(1);
        calculator1.multiply((-100));
        int int13 = calculator1.getResult();
        calculator1.add(40);
        int int16 = calculator1.getResult();
        calculator1.multiply((-56));
        calculator1.clear();
        int int20 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 140 + "'", int16 == 140);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.divide(40);
        calculator1.divide((-198900));
        int int6 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.multiply(151);
        calculator1.add(152);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.clear();
        calculator1.divide((-100));
        calculator1.multiply(40);
        calculator1.substract(1);
        calculator1.multiply((-100));
        int int13 = calculator1.getResult();
        calculator1.add(85);
        int int16 = calculator1.getResult();
        calculator1.add(15100);
        calculator1.divide(696072);
        calculator1.add(140);
        java.lang.Class<?> wildcardClass23 = calculator1.getClass();
        calculator1.add(109);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 185 + "'", int16 == 185);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 100);
        int int2 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.clear();
        calculator1.multiply((int) '#');
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        int int10 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        int int4 = calculator1.getResult();
        calculator1.substract((int) '4');
        calculator1.clear();
        int int8 = calculator1.getResult();
        calculator1.add(4655);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.substract((int) (byte) 1);
        calculator1.clear();
        calculator1.multiply((-2));
        calculator1.divide((-7882));
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide((int) (short) 1);
        calculator1.add(4);
        calculator1.divide((-588));
        calculator1.divide(480);
        calculator1.divide((-197));
        calculator1.add(4000000);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-52));
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(1);
        calculator1.divide(78);
        calculator1.multiply(5100);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.add((int) (byte) 10);
        calculator1.substract((int) (byte) 100);
        calculator1.clear();
        calculator1.substract(10);
        calculator1.clear();
        int int17 = calculator1.getResult();
        calculator1.multiply((-20));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.multiply(0);
        calculator1.add((int) (short) 1);
        calculator1.substract(30);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(10);
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        int int12 = calculator1.getResult();
        calculator1.substract(140);
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        calculator1.divide(107);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 30 + "'", int12 == 30);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(39);
        calculator1.multiply((int) (byte) 1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        int int8 = calculator1.getResult();
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 0);
        calculator1.clear();
        calculator1.add(39);
        calculator1.multiply(51);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract(39);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.multiply((int) (byte) 100);
        calculator1.multiply((int) (short) 0);
        calculator1.clear();
        int int14 = calculator1.getResult();
        calculator1.divide((int) 'a');
        calculator1.clear();
        java.lang.Class<?> wildcardClass18 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.substract(49);
        int int14 = calculator1.getResult();
        calculator1.multiply(510);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-10) + "'", int14 == (-10));
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide(10);
        calculator1.multiply(100);
        calculator1.multiply(85);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.divide((int) (short) 10);
        int int9 = calculator1.getResult();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
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
        calculator1.add(39);
        calculator1.clear();
        calculator1.multiply((-312000000));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-12) + "'", int16 == (-12));
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-1));
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.substract((int) 'a');
        calculator1.clear();
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.clear();
        calculator1.divide((-100));
        calculator1.multiply(40);
        calculator1.substract(1);
        calculator1.multiply((-100));
        int int13 = calculator1.getResult();
        calculator1.add(85);
        calculator1.add((int) (byte) 1);
        calculator1.add(10);
        calculator1.divide((-52));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) '4');
        calculator1.add(40);
        calculator1.clear();
        calculator1.clear();
        int int13 = calculator1.getResult();
        java.lang.Class<?> wildcardClass14 = calculator1.getClass();
        int int15 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.substract(100);
        calculator1.divide(10);
        int int8 = calculator1.getResult();
        int int9 = calculator1.getResult();
        int int10 = calculator1.getResult();
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        calculator1.multiply((-39429));
        calculator1.substract((int) '#');
        java.lang.Class<?> wildcardClass16 = calculator1.getClass();
        java.lang.Class<?> wildcardClass17 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-10) + "'", int8 == (-10));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-10) + "'", int9 == (-10));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-10) + "'", int10 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.substract((int) 'a');
        int int8 = calculator1.getResult();
        calculator1.multiply(696072);
        calculator1.add((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-97) + "'", int8 == (-97));
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 10);
        calculator1.add((int) (short) 100);
        calculator1.add(2);
        int int10 = calculator1.getResult();
        calculator1.clear();
        int int12 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 98 + "'", int10 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(0);
        calculator1.add((int) (short) 100);
        calculator1.substract(10);
        calculator1.clear();
        calculator1.clear();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        int int9 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((int) (byte) 1);
        calculator1.divide(151);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.multiply(0);
        calculator1.divide((-49));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
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
        calculator1.clear();
        calculator1.add(89);
        calculator1.substract(98);
        calculator1.clear();
        calculator1.substract(4000000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 39 + "'", int14 == 39);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-1));
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        int int3 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-100));
        calculator1.substract(100);
        calculator1.add((int) (byte) 10);
        calculator1.multiply((-12));
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.add(185);
        calculator1.multiply((-7852));
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-12));
        calculator1.clear();
        calculator1.multiply((-97));
        calculator1.multiply(1);
        calculator1.clear();
        calculator1.add(39949);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-7852));
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.multiply((-3783));
        calculator1.substract(1);
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        calculator1.divide((-39490));
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(73);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.divide((int) 'a');
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.multiply(432);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(0);
        calculator1.add((int) (short) 100);
        calculator1.substract(10);
        calculator1.add(10);
        calculator1.clear();
        calculator1.add(34);
        calculator1.add(110);
        calculator1.clear();
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (byte) 1);
        calculator1.substract((int) 'a');
        calculator1.multiply(0);
        calculator1.multiply(56);
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        calculator1.multiply(73);
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
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
        calculator1.divide((int) '#');
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.clear();
        calculator1.multiply((int) '#');
        calculator1.divide(40);
        calculator1.substract((int) (byte) 10);
        calculator1.clear();
        calculator1.divide((-39));
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        calculator1.clear();
        calculator1.divide((int) '4');
        int int9 = calculator1.getResult();
        calculator1.multiply((int) (short) -1);
        calculator1.divide(78);
        calculator1.multiply(30);
        int int16 = calculator1.getResult();
        calculator1.add(52);
        calculator1.divide((int) '4');
        int int21 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.add(51);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        int int13 = calculator1.getResult();
        calculator1.add(48);
        calculator1.divide(56);
        calculator1.divide(15100);
        int int20 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.divide(1);
        calculator1.substract(51);
        calculator1.multiply(4);
        java.lang.Class<?> wildcardClass18 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        calculator1.clear();
        calculator1.divide((int) '4');
        int int9 = calculator1.getResult();
        calculator1.clear();
        calculator1.divide(390);
        calculator1.multiply(51);
        calculator1.multiply(100);
        calculator1.multiply((-6000000));
        calculator1.add(54600000);
        java.lang.Class<?> wildcardClass21 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.clear();
        calculator1.add(10);
        calculator1.add((int) 'a');
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        int int10 = calculator1.getResult();
        calculator1.substract(162);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 107 + "'", int10 == 107);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(49);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.divide((-400));
        calculator1.add(100);
        calculator1.divide((-4656));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        calculator1.substract((int) (byte) 1);
        calculator1.multiply(39);
        int int10 = calculator1.getResult();
        calculator1.divide(99);
        int int13 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-39) + "'", int10 == (-39));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-33203274));
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        calculator1.multiply((int) 'a');
        int int4 = calculator1.getResult();
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.add(527);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.divide((-34107528));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-97) + "'", int4 == (-97));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide(10);
        calculator1.multiply((int) (short) 0);
        calculator1.clear();
        calculator1.multiply(0);
        calculator1.clear();
        calculator1.clear();
        calculator1.substract(78);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.multiply((int) (short) 100);
        calculator1.multiply(10);
        calculator1.multiply((int) (short) 100);
        calculator1.clear();
        java.lang.Class<?> wildcardClass17 = calculator1.getClass();
        java.lang.Class<?> wildcardClass18 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.add(100);
        calculator1.multiply((-97));
        calculator1.substract(51);
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        calculator1.multiply((-20));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-7852));
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.substract(30);
        calculator1.divide((int) (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) '4');
        calculator1.multiply((-97));
        int int11 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(54600000);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.divide((-425683));
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.divide((int) '#');
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        calculator1.substract(1);
        calculator1.clear();
        calculator1.multiply(390);
        calculator1.substract(312000000);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.clear();
        calculator1.add(10);
        calculator1.multiply((int) (short) 100);
        calculator1.add(500);
        calculator1.divide((-6000000));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(10);
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        int int12 = calculator1.getResult();
        calculator1.divide((-100));
        calculator1.divide((-5920));
        calculator1.add((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 30 + "'", int12 == 30);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.divide(1);
        int int14 = calculator1.getResult();
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        calculator1.divide((-1300));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 39 + "'", int14 == 39);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract(39);
        calculator1.multiply((int) 'a');
        calculator1.clear();
        int int11 = calculator1.getResult();
        calculator1.multiply((-127));
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(10);
        calculator1.add(39);
        calculator1.divide(500);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        calculator1.divide((-7882));
        calculator1.add(510);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        calculator1.multiply(7852);
        calculator1.clear();
        calculator1.multiply(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(51);
        calculator1.multiply((int) (short) 100);
        calculator1.multiply(39);
        calculator1.divide(51);
        calculator1.substract(56);
        calculator1.divide((-52));
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(10);
        calculator1.add(39);
        calculator1.multiply(151);
        calculator1.add((int) (short) 1);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        calculator1.multiply((-12));
        calculator1.substract(40);
        calculator1.add(1000);
        calculator1.divide((-99));
        calculator1.clear();
        calculator1.divide(141);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        int int7 = calculator1.getResult();
        int int8 = calculator1.getResult();
        calculator1.add((int) '4');
        calculator1.substract(15100);
        int int13 = calculator1.getResult();
        int int14 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-14948) + "'", int13 == (-14948));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-14948) + "'", int14 == (-14948));
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(112);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.divide(39949);
        calculator1.divide(69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        calculator1.clear();
        calculator1.divide((int) '4');
        int int9 = calculator1.getResult();
        calculator1.clear();
        calculator1.divide(390);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.clear();
        int int10 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.divide((int) (short) 10);
        calculator1.add(151);
        calculator1.substract((int) '4');
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        java.lang.Class<?> wildcardClass14 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.add(51);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        calculator1.clear();
        calculator1.add(185);
        java.lang.Class<?> wildcardClass16 = calculator1.getClass();
        calculator1.multiply((-785));
        calculator1.divide(98);
        int int21 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1481) + "'", int21 == (-1481));
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(51);
        calculator1.multiply((int) (short) 100);
        calculator1.multiply(39);
        calculator1.divide(51);
        calculator1.substract(56);
        calculator1.multiply(152);
        calculator1.multiply(390);
        calculator1.divide((int) (short) 10);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(51);
        calculator1.multiply((int) (short) 100);
        calculator1.clear();
        calculator1.multiply((int) (short) 1);
        int int7 = calculator1.getResult();
        calculator1.divide((-52));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
        calculator1.multiply((-39000));
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.multiply(0);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide((int) 'a');
        calculator1.substract(40);
        calculator1.multiply((-10));
        calculator1.substract(500);
        int int13 = calculator1.getResult();
        int int14 = calculator1.getResult();
        calculator1.substract(4);
        int int17 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-100) + "'", int13 == (-100));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-100) + "'", int14 == (-100));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-104) + "'", int17 == (-104));
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(7852);
        calculator1.multiply(39);
        calculator1.add((int) '4');
        calculator1.divide((-56));
        calculator1.clear();
        calculator1.substract(49);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(100);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.add(95);
        calculator1.add(527);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.clear();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(10);
        calculator1.add(48);
        int int13 = calculator1.getResult();
        calculator1.multiply(510);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 78 + "'", int13 == 78);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.substract(136);
        calculator1.substract(17);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(7400);
        calculator1.clear();
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 10);
        calculator1.substract((int) 'a');
        calculator1.clear();
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.substract(100);
        int int6 = calculator1.getResult();
        calculator1.clear();
        calculator1.divide((int) 'a');
        calculator1.add(85);
        int int12 = calculator1.getResult();
        calculator1.multiply((-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 85 + "'", int12 == 85);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.divide((int) 'a');
        calculator1.clear();
        calculator1.clear();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.add(185);
        calculator1.divide(7400);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        calculator1.multiply((-52));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.multiply(0);
        calculator1.clear();
        int int5 = calculator1.getResult();
        calculator1.multiply((-4000));
        calculator1.multiply(510);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(0);
        calculator1.add((int) (short) 100);
        calculator1.add((int) (short) 100);
        calculator1.divide((-6173856));
        calculator1.multiply((-39));
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.multiply(10);
        calculator1.divide(39);
        calculator1.clear();
        calculator1.divide(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(7852);
        calculator1.divide(152);
        calculator1.multiply((-33203274));
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        calculator1.multiply(1);
        calculator1.divide((int) '#');
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.substract(39949);
        calculator1.divide((int) (short) 10);
        calculator1.substract(1000);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide(10);
        calculator1.multiply(100);
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        calculator1.multiply((int) (short) -1);
        calculator1.clear();
        calculator1.divide(527);
        java.lang.Class<?> wildcardClass18 = calculator1.getClass();
        calculator1.divide((int) '#');
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.clear();
        calculator1.add(10);
        calculator1.multiply((int) (short) 100);
        int int9 = calculator1.getResult();
        calculator1.divide(95);
        int int12 = calculator1.getResult();
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (byte) 1);
        calculator1.divide((int) (short) -1);
        calculator1.multiply((int) (short) 1);
        calculator1.divide((-3075462));
        int int12 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.multiply(0);
        calculator1.clear();
        int int5 = calculator1.getResult();
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        int int7 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide((int) '#');
        calculator1.divide((int) (short) -1);
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        calculator1.divide(40);
        calculator1.substract(480);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.multiply(0);
        calculator1.multiply((int) (short) 1);
        calculator1.divide((-56));
        int int15 = calculator1.getResult();
        calculator1.divide(51);
        calculator1.clear();
        calculator1.multiply(187);
        calculator1.substract(52);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (byte) 1);
        calculator1.divide((int) (short) -1);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.divide((-98));
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.divide(10);
        calculator1.clear();
        int int12 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        calculator1.add(390);
        calculator1.add(141);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide(10);
        calculator1.multiply(100);
        calculator1.divide((int) 'a');
        calculator1.clear();
        calculator1.add(10);
        calculator1.divide((-7852));
        java.lang.Class<?> wildcardClass19 = calculator1.getClass();
        calculator1.divide((-146));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(100);
        int int2 = calculator1.getResult();
        int int3 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
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
        calculator1.clear();
        calculator1.multiply((-39429));
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        calculator1.add(390);
        calculator1.add(98);
        int int15 = calculator1.getResult();
        java.lang.Class<?> wildcardClass16 = calculator1.getClass();
        int int17 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 527 + "'", int15 == 527);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 527 + "'", int17 == 527);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.clear();
        calculator1.divide((-100));
        calculator1.multiply(40);
        calculator1.substract(1);
        calculator1.clear();
        calculator1.divide(1);
        calculator1.substract(15100);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        int int4 = calculator1.getResult();
        calculator1.clear();
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.divide((-1481));
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.clear();
        calculator1.add(10);
        calculator1.add((int) 'a');
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        int int10 = calculator1.getResult();
        int int11 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 107 + "'", int10 == 107);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 107 + "'", int11 == 107);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        int int6 = calculator1.getResult();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        calculator1.multiply(152);
        int int10 = calculator1.getResult();
        calculator1.multiply(34);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(400);
        calculator1.divide((-1300));
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
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
        java.lang.Class<?> wildcardClass18 = calculator1.getClass();
        int int19 = calculator1.getResult();
        calculator1.multiply((-99));
        int int22 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 151 + "'", int8 == 151);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 17 + "'", int19 == 17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1683) + "'", int22 == (-1683));
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
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
        java.lang.Class<?> wildcardClass18 = calculator1.getClass();
        calculator1.divide(51);
        calculator1.add(312000000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-7852));
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.multiply(902);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 100);
        calculator1.divide(85);
        calculator1.multiply((int) 'a');
        calculator1.substract(39949);
        calculator1.divide(98);
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        calculator1.multiply(96);
        calculator1.multiply(510);
        int int15 = calculator1.getResult();
        java.lang.Class<?> wildcardClass16 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-19877760) + "'", int15 == (-19877760));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(0);
        calculator1.add((int) (short) 100);
        calculator1.substract(10);
        calculator1.clear();
        calculator1.clear();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.add((int) 'a');
        calculator1.add(56);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 10);
        calculator1.add(51);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(51);
        calculator1.multiply((int) (short) 100);
        calculator1.multiply(39);
        calculator1.add(199);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.divide((-100));
        calculator1.clear();
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        calculator1.clear();
        calculator1.multiply(0);
        calculator1.substract(78);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(0);
        calculator1.add((int) (short) 100);
        calculator1.substract(10);
        calculator1.add(10);
        calculator1.clear();
        calculator1.multiply(4);
        calculator1.divide((-19877760));
        calculator1.multiply((-90));
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.substract((int) 'a');
        int int8 = calculator1.getResult();
        calculator1.substract(100);
        calculator1.add(151);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        calculator1.clear();
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        calculator1.multiply((-588));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-97) + "'", int8 == (-97));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
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
        calculator1.add(107);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide(10);
        calculator1.multiply(100);
        calculator1.divide((int) 'a');
        java.lang.Class<?> wildcardClass14 = calculator1.getClass();
        calculator1.divide(39);
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide((-40));
        calculator1.clear();
        calculator1.divide(89);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.add(100);
        calculator1.multiply(151);
        int int13 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15100 + "'", int13 == 15100);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        int int8 = calculator1.getResult();
        calculator1.divide((int) '4');
        calculator1.substract(2);
        calculator1.substract(15100);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 151 + "'", int8 == 151);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.divide((int) (byte) 100);
        calculator1.substract(98);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        calculator1.substract((int) (byte) 1);
        calculator1.multiply(39);
        int int10 = calculator1.getResult();
        calculator1.multiply((int) (short) 100);
        calculator1.divide(78);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-39) + "'", int10 == (-39));
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract(39);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.multiply((int) (byte) 100);
        calculator1.multiply((int) (short) 0);
        calculator1.clear();
        int int14 = calculator1.getResult();
        calculator1.multiply((int) (byte) 0);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.clear();
        calculator1.multiply((int) '#');
        calculator1.multiply(30);
        calculator1.substract(500);
        calculator1.add(69);
        calculator1.multiply(0);
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        int int9 = calculator1.getResult();
        int int10 = calculator1.getResult();
        calculator1.multiply(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.clear();
        calculator1.add(10);
        calculator1.substract((int) '4');
        calculator1.multiply(696072);
        calculator1.add((int) (short) 10);
        int int13 = calculator1.getResult();
        calculator1.multiply(500);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-29235014) + "'", int13 == (-29235014));
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        calculator1.clear();
        calculator1.add(49);
        calculator1.clear();
        calculator1.multiply(34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((int) (short) 0);
        calculator1.clear();
        int int8 = calculator1.getResult();
        calculator1.multiply((-14550));
        calculator1.multiply(10);
        calculator1.add(7400);
        calculator1.clear();
        calculator1.add(571233);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.substract(5);
        calculator1.clear();
        calculator1.divide((-30));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.add(100);
        int int9 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract(312000000);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        int int14 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-312000000) + "'", int14 == (-312000000));
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.multiply(0);
        calculator1.substract(30);
        calculator1.substract((int) '#');
        calculator1.add(696072);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.substract(100);
        calculator1.divide(10);
        calculator1.substract(2);
        calculator1.multiply(100);
        calculator1.divide((-100));
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.substract((int) 'a');
        int int8 = calculator1.getResult();
        calculator1.substract(100);
        calculator1.divide(185);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        calculator1.add((int) 'a');
        calculator1.multiply(1248);
        calculator1.add(510);
        calculator1.divide((int) (short) 100);
        int int22 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-97) + "'", int8 == (-97));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1203 + "'", int22 == 1203);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
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
        calculator1.divide((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(39);
        calculator1.clear();
        calculator1.substract((int) (short) 10);
        calculator1.divide((-14550));
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.multiply(0);
        calculator1.substract(30);
        calculator1.add((int) '#');
        calculator1.clear();
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.multiply((int) (byte) -1);
        calculator1.multiply((-97));
        calculator1.multiply((int) (short) 100);
        calculator1.clear();
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        calculator1.substract(51);
        int int14 = calculator1.getResult();
        calculator1.clear();
        int int16 = calculator1.getResult();
        java.lang.Class<?> wildcardClass17 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-51) + "'", int14 == (-51));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        int int6 = calculator1.getResult();
        calculator1.substract(69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(10);
        int int11 = calculator1.getResult();
        calculator1.clear();
        calculator1.multiply(98);
        int int15 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.multiply(0);
        calculator1.divide(107);
        calculator1.substract(225);
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract(39);
        calculator1.multiply((int) 'a');
        calculator1.clear();
        int int11 = calculator1.getResult();
        calculator1.multiply((-127));
        calculator1.substract(432);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        calculator1.clear();
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(35);
        calculator1.clear();
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 100);
        calculator1.divide(85);
        calculator1.clear();
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.divide(10);
        calculator1.clear();
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 0);
        calculator1.clear();
        calculator1.clear();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.add(152);
        calculator1.clear();
        calculator1.multiply(696072);
        calculator1.add(17);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(902);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-7852));
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.substract(30);
        int int5 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-7882) + "'", int5 == (-7882));
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(51);
        calculator1.multiply((int) (short) 100);
        calculator1.multiply(39);
        int int6 = calculator1.getResult();
        calculator1.clear();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 198900 + "'", int6 == 198900);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        int int4 = calculator1.getResult();
        calculator1.clear();
        calculator1.clear();
        calculator1.divide(10);
        calculator1.add(78);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-1683));
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(39);
        calculator1.clear();
        calculator1.multiply(99);
        calculator1.clear();
        calculator1.add((int) (byte) 10);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.divide((int) '#');
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        calculator1.substract(1);
        calculator1.clear();
        calculator1.divide(4);
        calculator1.multiply((int) (byte) 100);
        calculator1.divide((int) (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.substract((int) 'a');
        int int8 = calculator1.getResult();
        calculator1.substract(100);
        calculator1.add(151);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        calculator1.clear();
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        java.lang.Class<?> wildcardClass16 = calculator1.getClass();
        int int17 = calculator1.getResult();
        calculator1.multiply(510);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-97) + "'", int8 == (-97));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.substract((int) 'a');
        int int8 = calculator1.getResult();
        calculator1.substract(100);
        calculator1.add(151);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        calculator1.multiply((-3783));
        calculator1.multiply(4);
        int int18 = calculator1.getResult();
        calculator1.multiply(151);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-97) + "'", int8 == (-97));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 696072 + "'", int18 == 696072);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (byte) 1);
        calculator1.substract((int) 'a');
        calculator1.multiply(0);
        calculator1.divide(100);
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        calculator1.multiply(39949);
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.multiply(85);
        calculator1.divide(52);
        calculator1.substract(468);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.divide((int) (short) 10);
        calculator1.add(151);
        calculator1.substract((int) '4');
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        calculator1.multiply((-20));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(49);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.multiply(468);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
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
        java.lang.Class<?> wildcardClass16 = calculator1.getClass();
        calculator1.divide(500);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 39 + "'", int14 == 39);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(10);
        calculator1.add(39);
        calculator1.divide(500);
        calculator1.multiply(89);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.substract((int) 'a');
        int int8 = calculator1.getResult();
        calculator1.substract(100);
        calculator1.divide(185);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        int int14 = calculator1.getResult();
        calculator1.substract((int) '4');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-97) + "'", int8 == (-97));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 10);
        calculator1.clear();
        calculator1.clear();
        calculator1.divide((int) (short) 1);
        int int6 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.add((int) ' ');
        calculator1.divide((int) (short) -1);
        calculator1.multiply((int) (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.add(107);
        int int6 = calculator1.getResult();
        calculator1.divide(7852);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 107 + "'", int6 == 107);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
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
        calculator1.divide((int) '#');
        calculator1.divide(696072);
        int int17 = calculator1.getResult();
        java.lang.Class<?> wildcardClass18 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        int int4 = calculator1.getResult();
        calculator1.clear();
        calculator1.clear();
        calculator1.divide(10);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.divide(54600000);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-3075462));
        calculator1.multiply((-560));
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        calculator1.substract((int) (byte) 1);
        calculator1.clear();
        calculator1.multiply((-39));
        calculator1.multiply(35);
        int int13 = calculator1.getResult();
        calculator1.add(141);
        calculator1.multiply(5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        calculator1.clear();
        calculator1.clear();
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.clear();
        calculator1.multiply((int) '#');
        calculator1.divide(40);
        calculator1.substract((int) (byte) 10);
        calculator1.divide((int) (byte) -1);
        calculator1.clear();
        calculator1.add((int) (byte) 10);
        calculator1.substract(510);
        calculator1.divide((-30));
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.substract((int) 'a');
        int int8 = calculator1.getResult();
        calculator1.substract(100);
        calculator1.add(151);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide((-40));
        calculator1.clear();
        calculator1.multiply((-500));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-97) + "'", int8 == (-97));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.clear();
        calculator1.multiply((int) '#');
        calculator1.multiply(30);
        calculator1.substract(500);
        calculator1.add(69);
        calculator1.multiply(0);
        calculator1.add(109);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((int) (short) 100);
        calculator1.clear();
        int int8 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.multiply(40);
        calculator1.multiply((-12));
        calculator1.divide((int) (short) -1);
        calculator1.substract((int) 'a');
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
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
        int int18 = calculator1.getResult();
        calculator1.multiply((-1600));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.multiply((int) (short) 0);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.multiply((-3075462));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.divide((int) '#');
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.add(100);
        calculator1.substract(5);
        calculator1.clear();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        calculator1.clear();
        calculator1.multiply(39);
        calculator1.add(2);
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        calculator1.divide((-312000000));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(10);
        int int11 = calculator1.getResult();
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        int int9 = calculator1.getResult();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        int int11 = calculator1.getResult();
        calculator1.divide((int) (short) 100);
        calculator1.divide((-40));
        calculator1.substract(140);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 40 + "'", int9 == 40);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 40 + "'", int11 == 40);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((int) (byte) 1);
        calculator1.divide(151);
        calculator1.multiply((-4000));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide((-100));
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        calculator1.multiply(49);
        calculator1.divide(696072);
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        int int5 = calculator1.getResult();
        int int6 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(51);
        calculator1.multiply((int) (short) 100);
        calculator1.clear();
        calculator1.multiply((int) (short) 1);
        calculator1.clear();
        calculator1.add(432);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.multiply((-1));
        calculator1.clear();
        calculator1.substract(1);
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        calculator1.add(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(390);
        calculator1.add((int) ' ');
        calculator1.add((int) (byte) 10);
        calculator1.add(1248);
        calculator1.add((int) 'a');
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        calculator1.clear();
        calculator1.divide((int) '4');
        int int9 = calculator1.getResult();
        calculator1.clear();
        calculator1.divide(390);
        calculator1.divide(56);
        calculator1.substract(510);
        java.lang.Class<?> wildcardClass17 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide(10);
        calculator1.divide(39);
        calculator1.substract((int) (short) 10);
        java.lang.Class<?> wildcardClass14 = calculator1.getClass();
        calculator1.divide((-8));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.multiply((-198900));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        int int7 = calculator1.getResult();
        int int8 = calculator1.getResult();
        calculator1.add((int) '4');
        int int11 = calculator1.getResult();
        calculator1.multiply(151);
        calculator1.multiply((-197));
        java.lang.Class<?> wildcardClass16 = calculator1.getClass();
        int int17 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 152 + "'", int11 == 152);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-4521544) + "'", int17 == (-4521544));
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        int int7 = calculator1.getResult();
        int int8 = calculator1.getResult();
        calculator1.divide(51);
        calculator1.multiply((-312000000));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        int int9 = calculator1.getResult();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        int int11 = calculator1.getResult();
        calculator1.divide(4);
        calculator1.divide(39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 40 + "'", int9 == 40);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 40 + "'", int11 == 40);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
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
        int int15 = calculator1.getResult();
        int int16 = calculator1.getResult();
        calculator1.add(34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.divide(5);
        calculator1.multiply((-56));
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        calculator1.divide((-40));
        calculator1.add((int) 'a');
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.clear();
        calculator1.add(10);
        calculator1.multiply((int) (short) -1);
        calculator1.clear();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        calculator1.clear();
        int int7 = calculator1.getResult();
        calculator1.add(390);
        int int10 = calculator1.getResult();
        calculator1.substract(15100);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 390 + "'", int10 == 390);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.multiply(151);
        calculator1.substract(78);
        calculator1.clear();
        calculator1.divide((int) (short) 1);
        calculator1.multiply((int) (short) 1);
        calculator1.clear();
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 0);
        calculator1.clear();
        calculator1.clear();
        calculator1.clear();
        calculator1.divide(39949);
        calculator1.divide(69);
        calculator1.clear();
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.substract(100);
        calculator1.divide(10);
        int int8 = calculator1.getResult();
        calculator1.multiply((-7852));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-10) + "'", int8 == (-10));
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.add(107);
        int int6 = calculator1.getResult();
        int int7 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 107 + "'", int6 == 107);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 107 + "'", int7 == 107);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
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
        calculator1.substract(96);
        calculator1.substract(71);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) '4');
        calculator1.add(40);
        calculator1.clear();
        calculator1.clear();
        calculator1.clear();
        calculator1.multiply((int) (short) 1);
        calculator1.multiply(141);
        calculator1.add(390);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) '4');
        calculator1.multiply((-97));
        calculator1.multiply((-14948));
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        int int7 = calculator1.getResult();
        int int8 = calculator1.getResult();
        calculator1.add((int) '4');
        calculator1.multiply(96);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.substract(49);
        calculator1.clear();
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        int int16 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.substract((int) (byte) 1);
        int int8 = calculator1.getResult();
        calculator1.substract((int) (byte) 100);
        calculator1.divide(107);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(1);
        calculator1.add((int) (short) 10);
        calculator1.clear();
        calculator1.clear();
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.clear();
        calculator1.add(10);
        calculator1.add((int) 'a');
        calculator1.substract(51);
        int int11 = calculator1.getResult();
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        calculator1.clear();
        calculator1.multiply(11);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 56 + "'", int11 == 56);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
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
        int int18 = calculator1.getResult();
        java.lang.Class<?> wildcardClass19 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-12) + "'", int16 == (-12));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide(10);
        calculator1.divide(39);
        calculator1.substract((int) (short) 10);
        calculator1.multiply(200);
        int int16 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2000) + "'", int16 == (-2000));
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.divide((-10));
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        calculator1.clear();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.multiply(0);
        calculator1.clear();
        int int5 = calculator1.getResult();
        calculator1.substract(1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((int) (byte) 1);
        calculator1.substract(312000000);
        calculator1.divide((int) 'a');
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.divide(10);
        calculator1.divide((-90));
        calculator1.multiply(98);
        int int9 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(39);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.clear();
        calculator1.multiply((int) '#');
        calculator1.multiply(30);
        int int9 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(0);
        calculator1.add((int) (short) 100);
        calculator1.substract(10);
        calculator1.clear();
        int int7 = calculator1.getResult();
        calculator1.clear();
        calculator1.multiply((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 100);
        calculator1.divide(85);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply(78);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        int int6 = calculator1.getResult();
        int int7 = calculator1.getResult();
        calculator1.divide(312000000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract(39);
        calculator1.divide(95);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.add((int) (short) 100);
        java.lang.Class<?> wildcardClass14 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract(39);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.add((int) '#');
        calculator1.multiply((-4656));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
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
        calculator1.divide((int) '#');
        calculator1.divide(696072);
        calculator1.substract(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        int int8 = calculator1.getResult();
        calculator1.divide((int) '4');
        calculator1.clear();
        calculator1.clear();
        calculator1.clear();
        calculator1.substract(468);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 151 + "'", int8 == 151);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide((int) '#');
        calculator1.clear();
        calculator1.add(12);
        calculator1.add(1248);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.multiply((int) (byte) -1);
        calculator1.multiply((-97));
        calculator1.multiply((int) (short) 100);
        calculator1.substract(500);
        calculator1.add(39949);
        calculator1.add(468);
        calculator1.multiply((-4));
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        int int9 = calculator1.getResult();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        int int11 = calculator1.getResult();
        int int12 = calculator1.getResult();
        calculator1.clear();
        calculator1.multiply((-3783));
        java.lang.Class<?> wildcardClass16 = calculator1.getClass();
        int int17 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 40 + "'", int9 == 40);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 40 + "'", int11 == 40);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 40 + "'", int12 == 40);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        int int9 = calculator1.getResult();
        calculator1.divide(107);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(10);
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        int int12 = calculator1.getResult();
        calculator1.substract(140);
        calculator1.divide((-53));
        calculator1.clear();
        calculator1.divide(4000000);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 30 + "'", int12 == 30);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-100));
        calculator1.substract(100);
        calculator1.substract((int) (short) 100);
        calculator1.divide(187);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.substract((int) 'a');
        int int8 = calculator1.getResult();
        calculator1.substract(100);
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        int int13 = calculator1.getResult();
        java.lang.Class<?> wildcardClass14 = calculator1.getClass();
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-97) + "'", int8 == (-97));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-197) + "'", int13 == (-197));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-12));
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.clear();
        int int5 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.multiply((int) (byte) 10);
        calculator1.multiply(0);
        calculator1.divide((-56));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(7852);
        calculator1.multiply(99);
        calculator1.clear();
        calculator1.clear();
        int int6 = calculator1.getResult();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
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
        calculator1.divide((-785));
        java.lang.Class<?> wildcardClass14 = calculator1.getClass();
        int int15 = calculator1.getResult();
        calculator1.clear();
        calculator1.multiply(141);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((int) (byte) 1);
        calculator1.divide((-8));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract((int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.divide(1);
        int int14 = calculator1.getResult();
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        int int16 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 39 + "'", int14 == 39);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 39 + "'", int16 == 39);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.add(107);
        calculator1.substract(30);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide(185);
        int int5 = calculator1.getResult();
        calculator1.clear();
        calculator1.divide((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(0);
        calculator1.add((int) (short) 100);
        calculator1.substract(10);
        calculator1.clear();
        calculator1.clear();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        int int9 = calculator1.getResult();
        int int10 = calculator1.getResult();
        calculator1.divide(527);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        calculator1.add(12);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide((int) (short) 1);
        calculator1.multiply(0);
        calculator1.add(56);
        calculator1.multiply((-1400000));
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.substract(49);
        int int14 = calculator1.getResult();
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        calculator1.multiply((int) 'a');
        calculator1.substract(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-10) + "'", int14 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
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
        calculator1.multiply(69);
        int int22 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) '4');
        calculator1.clear();
        calculator1.multiply(56);
        calculator1.divide((-99));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(30);
        calculator1.substract(78);
        calculator1.add(40);
        calculator1.multiply((-39949));
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.divide((int) 'a');
        calculator1.divide((-2));
        int int7 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        int int7 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        calculator1.divide(100);
        calculator1.multiply((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-15101));
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.multiply((-10));
        int int5 = calculator1.getResult();
        int int6 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-100) + "'", int5 == (-100));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-146));
        calculator1.clear();
        calculator1.multiply(480);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.substract((int) ' ');
        calculator1.clear();
        calculator1.substract(10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(5);
        int int2 = calculator1.getResult();
        calculator1.add(7852);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        int int6 = calculator1.getResult();
        calculator1.multiply(99);
        calculator1.clear();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        calculator1.substract(141);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-39));
        calculator1.clear();
        calculator1.clear();
        calculator1.clear();
        calculator1.substract(107);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        int int9 = calculator1.getResult();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        calculator1.multiply(49);
        calculator1.substract(112);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
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
        java.lang.Class<?> wildcardClass17 = calculator1.getClass();
        java.lang.Class<?> wildcardClass18 = calculator1.getClass();
        calculator1.divide(312000000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 39949 + "'", int16 == 39949);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
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
        calculator1.multiply((int) 'a');
        int int20 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-3877090) + "'", int20 == (-3877090));
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((-49));
        int int7 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-49) + "'", int7 == (-49));
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        int int7 = calculator1.getResult();
        calculator1.add(100);
        calculator1.divide((int) '#');
        calculator1.substract((int) ' ');
        calculator1.multiply((-39));
        calculator1.clear();
        java.lang.Class<?> wildcardClass17 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        int int6 = calculator1.getResult();
        int int7 = calculator1.getResult();
        int int8 = calculator1.getResult();
        calculator1.substract((int) '#');
        calculator1.substract((int) '#');
        calculator1.divide((int) (short) -1);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-100));
        calculator1.multiply((int) 'a');
        calculator1.clear();
        calculator1.clear();
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.divide((int) 'a');
        calculator1.clear();
        calculator1.clear();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
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
        calculator1.divide((int) '#');
        calculator1.divide(696072);
        int int17 = calculator1.getResult();
        int int18 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((int) (short) 0);
        calculator1.divide((-97));
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        int int10 = calculator1.getResult();
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(0);
        calculator1.add((int) (short) 100);
        calculator1.substract(10);
        calculator1.clear();
        calculator1.clear();
        calculator1.clear();
        calculator1.clear();
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
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
        java.lang.Class<?> wildcardClass23 = calculator1.getClass();
        calculator1.add(2);
        calculator1.multiply(136);
        calculator1.divide(4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-198900) + "'", int22 == (-198900));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
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
        calculator1.multiply(0);
        calculator1.add(200);
        calculator1.divide((-92263860));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.substract((int) 'a');
        int int8 = calculator1.getResult();
        calculator1.substract(100);
        calculator1.add(151);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        calculator1.clear();
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        java.lang.Class<?> wildcardClass16 = calculator1.getClass();
        int int17 = calculator1.getResult();
        int int18 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-97) + "'", int8 == (-97));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        calculator1.clear();
        int int7 = calculator1.getResult();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide((-1300));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) 'a');
        calculator1.divide(2);
        calculator1.divide((-100));
        calculator1.add(162);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.multiply(0);
        calculator1.divide(10);
        calculator1.multiply(7400);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.divide(10);
        calculator1.add(4);
        calculator1.multiply((int) (short) -1);
        calculator1.multiply(100);
        calculator1.multiply(468);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
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
        int int17 = calculator1.getResult();
        calculator1.divide((int) ' ');
        calculator1.add(85);
        calculator1.substract(312000432);
        calculator1.divide(110);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 39949 + "'", int16 == 39949);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 39949 + "'", int17 == 39949);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.clear();
        calculator1.divide(12);
        int int12 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide((int) (short) 1);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        int int6 = calculator1.getResult();
        calculator1.substract(1);
        calculator1.clear();
        calculator1.add(40);
        calculator1.multiply(54600000);
        int int14 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2110967296) + "'", int14 == (-2110967296));
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(0);
        calculator1.add((int) (short) 100);
        calculator1.substract(10);
        calculator1.add(10);
        calculator1.clear();
        int int9 = calculator1.getResult();
        calculator1.divide((-40));
        calculator1.substract((int) 'a');
        calculator1.multiply(141);
        java.lang.Class<?> wildcardClass16 = calculator1.getClass();
        calculator1.substract((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.multiply(0);
        calculator1.multiply((int) (short) 1);
        calculator1.clear();
        int int14 = calculator1.getResult();
        calculator1.clear();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.clear();
        calculator1.multiply((int) '#');
        calculator1.substract(185);
        calculator1.add(85);
        calculator1.divide((-4656));
        int int13 = calculator1.getResult();
        calculator1.clear();
        calculator1.multiply(225);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.clear();
        calculator1.divide((-100));
        calculator1.multiply(40);
        calculator1.substract(1);
        calculator1.multiply((-100));
        int int13 = calculator1.getResult();
        calculator1.add(85);
        java.lang.Class<?> wildcardClass16 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-100));
        int int2 = calculator1.getResult();
        int int3 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-100) + "'", int2 == (-100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-100) + "'", int3 == (-100));
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 100);
        calculator1.divide(85);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((-400));
        calculator1.add((int) (byte) 100);
        calculator1.clear();
        calculator1.divide((-197));
        int int12 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(39);
        calculator1.divide(10);
        int int6 = calculator1.getResult();
        calculator1.substract(69);
        calculator1.divide((-4656));
        int int11 = calculator1.getResult();
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.add((int) '#');
        int int9 = calculator1.getResult();
        calculator1.add(49);
        calculator1.add((int) (short) 1);
        calculator1.substract(52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 85 + "'", int9 == 85);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.clear();
        calculator1.multiply(5);
        calculator1.divide((-1));
        calculator1.clear();
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.clear();
        calculator1.substract(52);
        calculator1.add(312000000);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        calculator1.multiply(1);
        calculator1.divide((int) (byte) 100);
        calculator1.substract(10);
        calculator1.divide((-5920));
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(48);
        calculator1.clear();
        int int3 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(56);
        calculator1.add(5100);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        calculator1.multiply((int) '4');
        calculator1.divide((int) (byte) 1);
        calculator1.multiply((-1));
        int int14 = calculator1.getResult();
        calculator1.multiply((int) '4');
        calculator1.divide(30);
        calculator1.clear();
        calculator1.multiply((int) (byte) 1);
        calculator1.divide((-143));
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-7852) + "'", int14 == (-7852));
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.multiply(0);
        calculator1.substract(30);
        calculator1.substract((int) '#');
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.add((int) (byte) 10);
        calculator1.clear();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.substract((int) (byte) 1);
        int int8 = calculator1.getResult();
        calculator1.substract((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.divide((int) (short) 10);
        calculator1.add(151);
        calculator1.substract((int) '4');
        int int13 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract(17);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        int int9 = calculator1.getResult();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        calculator1.divide(400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 40 + "'", int9 == 40);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        int int4 = calculator1.getResult();
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.clear();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        calculator1.clear();
        int int9 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(10);
        int int11 = calculator1.getResult();
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        int int13 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 30 + "'", int13 == 30);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-7852));
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.multiply((-3783));
        calculator1.substract(1);
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        calculator1.divide((-90));
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.clear();
        calculator1.divide(200);
        int int6 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
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
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        int int9 = calculator1.getResult();
        int int10 = calculator1.getResult();
        calculator1.substract((int) (byte) 1);
        int int13 = calculator1.getResult();
        calculator1.divide((-48));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 40 + "'", int9 == 40);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 39 + "'", int13 == 39);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.multiply((int) (short) 100);
        int int11 = calculator1.getResult();
        calculator1.multiply((-30));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
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
        calculator1.divide(40);
        calculator1.clear();
        int int24 = calculator1.getResult();
        int int25 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-12) + "'", int16 == (-12));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-12) + "'", int17 == (-12));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        int int6 = calculator1.getResult();
        calculator1.multiply(99);
        calculator1.clear();
        calculator1.multiply(0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(49);
        int int2 = calculator1.getResult();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.substract((int) (byte) 10);
        calculator1.multiply((-14948));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        calculator1.multiply((int) '4');
        calculator1.divide((int) (byte) 1);
        calculator1.divide((-9800));
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(56);
        calculator1.multiply((int) (byte) 1);
        calculator1.add(1248);
        calculator1.divide(468);
        calculator1.divide(10);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.add(51);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.add(10);
        calculator1.divide((int) (short) 1);
        int int13 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 161 + "'", int13 == 161);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-7852));
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.multiply(500);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.multiply((-1683));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.divide((int) (byte) 100);
        calculator1.divide(99);
        calculator1.multiply((int) '4');
        calculator1.clear();
        calculator1.clear();
        calculator1.clear();
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide((int) (short) 1);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        int int6 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-1));
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.substract((int) 'a');
        calculator1.add((int) ' ');
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.substract(39);
        calculator1.add(151);
        calculator1.multiply(49);
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        int int9 = calculator1.getResult();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        int int11 = calculator1.getResult();
        calculator1.divide(4);
        int int14 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 40 + "'", int9 == 40);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 40 + "'", int11 == 40);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        calculator1.add(2);
        calculator1.multiply((-98));
        calculator1.add(1000);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        calculator1.clear();
        calculator1.add(49);
        calculator1.multiply(51);
        calculator1.clear();
        calculator1.multiply(1000);
        java.lang.Class<?> wildcardClass19 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }
}

