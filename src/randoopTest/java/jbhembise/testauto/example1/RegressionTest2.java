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
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 10);
        calculator1.clear();
        calculator1.clear();
        calculator1.divide(85);
        calculator1.add(52);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.multiply(0);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide((int) 'a');
        calculator1.substract(40);
        int int9 = calculator1.getResult();
        calculator1.multiply(40);
        calculator1.multiply(107);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-40) + "'", int9 == (-40));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(390);
        int int2 = calculator1.getResult();
        int int3 = calculator1.getResult();
        calculator1.substract(35);
        calculator1.substract(15100);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.divide((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 390 + "'", int2 == 390);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 390 + "'", int3 == 390);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide(10);
        calculator1.add(30);
        calculator1.divide((-100));
        calculator1.add(99);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        calculator1.substract(69);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        calculator1.divide((-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.clear();
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.divide(52);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
        java.lang.Class<?> wildcardClass16 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide(10);
        calculator1.add(30);
        calculator1.multiply((-49));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.multiply((int) (short) 100);
        calculator1.multiply((int) (short) -1);
        int int14 = calculator1.getResult();
        calculator1.add((int) (byte) 1);
        calculator1.divide(96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-4000) + "'", int14 == (-4000));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-588));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        calculator1.multiply((int) 'a');
        calculator1.add(85);
        calculator1.substract(696072);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        calculator1.multiply(1);
        calculator1.divide((int) (byte) 100);
        calculator1.clear();
        calculator1.add(85);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(10);
        calculator1.divide((-198900));
        int int13 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.clear();
        calculator1.add(10);
        calculator1.add((int) 'a');
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        int int10 = calculator1.getResult();
        calculator1.divide((-12));
        int int13 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 107 + "'", int10 == 107);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-8) + "'", int13 == (-8));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.multiply(0);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide((int) 'a');
        calculator1.substract(40);
        calculator1.substract(78);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.multiply((-10));
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        int int6 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(187);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.multiply(0);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.divide((-6000000));
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 1);
        calculator1.divide((int) (byte) 1);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        calculator1.clear();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.multiply((int) (byte) -1);
        calculator1.multiply((-97));
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        int int9 = calculator1.getResult();
        calculator1.multiply((-90));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4656) + "'", int9 == (-4656));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(39);
        calculator1.clear();
        calculator1.multiply(99);
        calculator1.clear();
        calculator1.add((int) (short) 10);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 100);
        calculator1.divide(85);
        calculator1.multiply((int) 'a');
        calculator1.substract(39949);
        calculator1.clear();
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        calculator1.multiply((-5920));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        int int7 = calculator1.getResult();
        int int8 = calculator1.getResult();
        calculator1.add((int) '4');
        calculator1.divide((-40));
        int int13 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-3) + "'", int13 == (-3));
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.multiply((int) (byte) -1);
        calculator1.multiply(0);
        calculator1.clear();
        calculator1.add(7852);
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide((int) (short) 10);
        calculator1.divide(30);
        calculator1.clear();
        int int10 = calculator1.getResult();
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(39);
        calculator1.divide(10);
        int int6 = calculator1.getResult();
        calculator1.substract(69);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.substract(100);
        int int5 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-100) + "'", int5 == (-100));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.multiply((-97));
        calculator1.multiply(1248);
        int int9 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6173856) + "'", int9 == (-6173856));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.clear();
        calculator1.add(10);
        calculator1.multiply((int) (short) -1);
        calculator1.clear();
        calculator1.multiply(49);
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        calculator1.substract((int) (byte) 1);
        calculator1.multiply((-12));
        calculator1.multiply((int) ' ');
        calculator1.divide(52);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 0);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(10);
        calculator1.divide((-39));
        calculator1.multiply(95);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(56);
        calculator1.multiply((int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-7852));
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.multiply((-3783));
        calculator1.divide((int) '4');
        int int7 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 571233 + "'", int7 == 571233);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 10);
        calculator1.clear();
        int int7 = calculator1.getResult();
        int int8 = calculator1.getResult();
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide((int) (short) 1);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        int int6 = calculator1.getResult();
        int int7 = calculator1.getResult();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        calculator1.divide(39);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-7852) + "'", int14 == (-7852));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-12));
        calculator1.clear();
        calculator1.multiply((-97));
        calculator1.multiply(1);
        calculator1.clear();
        calculator1.multiply(0);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.clear();
        calculator1.divide((-100));
        calculator1.divide(78);
        calculator1.divide((-90));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract(39);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.multiply((int) (byte) 100);
        calculator1.multiply((int) (short) 0);
        calculator1.clear();
        java.lang.Class<?> wildcardClass14 = calculator1.getClass();
        int int15 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        calculator1.divide(10);
        calculator1.add(141);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-12) + "'", int16 == (-12));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-12) + "'", int17 == (-12));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        calculator1.clear();
        calculator1.multiply((-431));
        calculator1.multiply(100);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.multiply((-10));
        calculator1.add((int) (byte) 1);
        calculator1.multiply((-39490));
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.add(100);
        calculator1.substract(7852);
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        calculator1.clear();
        int int7 = calculator1.getResult();
        calculator1.add(390);
        int int10 = calculator1.getResult();
        calculator1.add((int) ' ');
        calculator1.substract(85);
        calculator1.divide((-4000));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 390 + "'", int10 == 390);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        calculator1.substract((int) (byte) 1);
        calculator1.clear();
        int int9 = calculator1.getResult();
        calculator1.clear();
        int int11 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-100));
        calculator1.substract(100);
        calculator1.add((int) (byte) 10);
        calculator1.divide((-39));
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.add(432);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(30);
        calculator1.substract(78);
        calculator1.divide((-6173856));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.divide(48);
        calculator1.clear();
        calculator1.clear();
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.multiply(151);
        calculator1.substract(78);
        calculator1.clear();
        int int11 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((int) (short) 0);
        calculator1.divide((-97));
        calculator1.clear();
        calculator1.multiply((-500));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) '4');
        calculator1.add(40);
        calculator1.clear();
        calculator1.clear();
        calculator1.add(10);
        calculator1.divide(5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(0);
        calculator1.add((int) (short) 100);
        calculator1.substract(10);
        calculator1.clear();
        int int7 = calculator1.getResult();
        calculator1.clear();
        int int9 = calculator1.getResult();
        calculator1.clear();
        calculator1.clear();
        calculator1.add((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(48);
        int int2 = calculator1.getResult();
        calculator1.divide(39);
        calculator1.multiply((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        int int5 = calculator1.getResult();
        calculator1.substract(48);
        calculator1.divide((int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        calculator1.add((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-10));
        calculator1.multiply(2);
        int int4 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-20) + "'", int4 == (-20));
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.multiply((int) (byte) -1);
        calculator1.multiply((-97));
        calculator1.clear();
        calculator1.multiply((int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        calculator1.multiply(4);
        calculator1.add(85);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide(7400);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        int int6 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.multiply((int) (short) 0);
        calculator1.substract((int) (byte) 1);
        calculator1.multiply((int) (short) 10);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.divide((int) (short) 10);
        calculator1.add(1);
        int int11 = calculator1.getResult();
        calculator1.multiply((-7882));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.divide(1);
        calculator1.substract(51);
        calculator1.clear();
        java.lang.Class<?> wildcardClass17 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        int int4 = calculator1.getResult();
        calculator1.substract((int) '4');
        calculator1.divide((int) ' ');
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.substract((int) (byte) 1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        int int4 = calculator1.getResult();
        calculator1.clear();
        calculator1.clear();
        calculator1.divide(10);
        int int9 = calculator1.getResult();
        calculator1.multiply((-97));
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        calculator1.divide(17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-12) + "'", int16 == (-12));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.clear();
        calculator1.add(10);
        calculator1.add((int) 'a');
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        int int11 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 107 + "'", int11 == 107);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
        calculator1.substract(39);
        calculator1.substract(500);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-12) + "'", int16 == (-12));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(10);
        int int11 = calculator1.getResult();
        int int12 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 30 + "'", int12 == 30);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        int int3 = calculator1.getResult();
        calculator1.divide((-100));
        calculator1.divide((-97));
        calculator1.multiply((int) (byte) 0);
        calculator1.clear();
        calculator1.divide(100);
        calculator1.divide(151);
        int int15 = calculator1.getResult();
        calculator1.add(95);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.multiply((int) (byte) 0);
        int int9 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide(17);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.divide(56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        int int5 = calculator1.getResult();
        calculator1.add(49);
        calculator1.multiply((-12));
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-1));
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.clear();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        int int9 = calculator1.getResult();
        calculator1.clear();
        calculator1.add((int) (byte) 1);
        int int13 = calculator1.getResult();
        calculator1.multiply((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        calculator1.multiply(85);
        calculator1.add(527);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((int) (short) 100);
        calculator1.divide(500);
        calculator1.divide(1000);
        calculator1.add(7852);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        calculator1.substract(71);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-97) + "'", int8 == (-97));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        calculator1.divide((-19974500));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 185 + "'", int16 == 185);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-9800));
        calculator1.multiply((-9800));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(0);
        calculator1.add((int) (short) 100);
        calculator1.substract(10);
        calculator1.clear();
        calculator1.clear();
        int int8 = calculator1.getResult();
        calculator1.add(312000432);
        calculator1.multiply((-20));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(0);
        calculator1.add((int) (short) 100);
        calculator1.substract(10);
        calculator1.clear();
        calculator1.clear();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.multiply((-560));
        calculator1.multiply((int) '4');
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide(10);
        calculator1.multiply((int) (short) 0);
        calculator1.clear();
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-14550));
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        int int3 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-14550) + "'", int3 == (-14550));
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.substract(39);
        calculator1.divide(10);
        calculator1.clear();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.divide(10);
        calculator1.add(4);
        calculator1.multiply((int) (short) -1);
        calculator1.multiply(96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
        calculator1.add(95);
        calculator1.substract(140);
        calculator1.multiply(100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-97) + "'", int8 == (-97));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-98));
        calculator1.clear();
        calculator1.clear();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        int int6 = calculator1.getResult();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.multiply((-10));
        calculator1.divide((int) ' ');
        int int7 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-3) + "'", int7 == (-3));
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        calculator1.clear();
        calculator1.multiply(39);
        calculator1.add(2);
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        int int12 = calculator1.getResult();
        calculator1.divide(312000432);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        int int5 = calculator1.getResult();
        calculator1.add(49);
        calculator1.multiply((-12));
        int int10 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-588) + "'", int10 == (-588));
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.divide((int) (short) 10);
        calculator1.add(151);
        calculator1.divide((int) '4');
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        calculator1.divide((-1400000));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        int int9 = calculator1.getResult();
        calculator1.add(100);
        calculator1.divide((int) (byte) 1);
        calculator1.add(78);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (byte) 1);
        calculator1.divide((int) (short) -1);
        int int8 = calculator1.getResult();
        int int9 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        calculator1.multiply((int) '4');
        calculator1.divide((int) (byte) 1);
        calculator1.multiply((-1));
        int int14 = calculator1.getResult();
        calculator1.clear();
        calculator1.divide(4000000);
        calculator1.substract(48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-7852) + "'", int14 == (-7852));
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.multiply((int) (byte) 0);
        calculator1.multiply((int) (short) 0);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        calculator1.multiply(1);
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.multiply((int) (byte) 100);
        calculator1.substract((int) (byte) 10);
        calculator1.add((int) (short) 10);
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.clear();
        calculator1.multiply((int) '#');
        calculator1.divide(40);
        calculator1.substract((int) (byte) 10);
        calculator1.divide((int) (byte) -1);
        calculator1.clear();
        calculator1.add(15100);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        calculator1.add(69);
        calculator1.add(100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        int int6 = calculator1.getResult();
        calculator1.clear();
        calculator1.multiply(39949);
        int int10 = calculator1.getResult();
        calculator1.divide((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
        int int23 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.divide((int) (byte) 100);
        calculator1.divide(99);
        calculator1.multiply((int) '4');
        calculator1.substract(69);
        calculator1.substract((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.clear();
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.clear();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.multiply(198900);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '#');
        calculator1.clear();
        calculator1.divide(7852);
        calculator1.add((int) ' ');
        int int7 = calculator1.getResult();
        calculator1.divide((-20));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        calculator1.multiply((-12));
        calculator1.substract(40);
        calculator1.add(1000);
        calculator1.divide(78);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        calculator1.multiply((-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (byte) 1);
        calculator1.divide((int) (short) -1);
        int int8 = calculator1.getResult();
        calculator1.divide(1);
        calculator1.multiply(39);
        calculator1.substract(198900);
        calculator1.substract(400);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((int) (short) 0);
        calculator1.divide((-97));
        calculator1.divide((int) (byte) 1);
        calculator1.add((int) '#');
        int int13 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        int int3 = calculator1.getResult();
        calculator1.divide((-100));
        calculator1.divide((-97));
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.divide(1248);
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) '4');
        calculator1.add(40);
        calculator1.clear();
        calculator1.multiply(85);
        int int14 = calculator1.getResult();
        calculator1.substract(7852);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.substract((int) 'a');
        int int8 = calculator1.getResult();
        calculator1.substract(100);
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        calculator1.substract(390);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-97) + "'", int8 == (-97));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.multiply(151);
        calculator1.substract(78);
        calculator1.clear();
        calculator1.divide((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        java.lang.Class<?> wildcardClass14 = calculator1.getClass();
        calculator1.divide((-312000000));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.multiply((-1));
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        calculator1.divide((-51));
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        calculator1.multiply((int) 'a');
        int int4 = calculator1.getResult();
        calculator1.multiply((int) (short) 10);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-97) + "'", int4 == (-97));
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-3000));
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        calculator1.substract((int) (short) 1);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-7852));
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.clear();
        calculator1.multiply(71);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.multiply(0);
        calculator1.substract(30);
        calculator1.add((int) '#');
        calculator1.multiply(40);
        calculator1.substract(56);
        calculator1.clear();
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        calculator1.multiply((int) '4');
        calculator1.divide((int) (byte) 1);
        calculator1.multiply((-1));
        int int14 = calculator1.getResult();
        calculator1.clear();
        int int16 = calculator1.getResult();
        calculator1.divide((-14948));
        calculator1.substract(696072);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-7852) + "'", int14 == (-7852));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        calculator1.substract(200);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide((-400));
        int int8 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 10);
        calculator1.substract((int) '#');
        calculator1.clear();
        calculator1.divide(527);
        int int7 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(0);
        calculator1.add((int) (short) 100);
        calculator1.substract(10);
        calculator1.add(10);
        calculator1.add(500);
        calculator1.add(390);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(48);
        int int2 = calculator1.getResult();
        calculator1.divide(39);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(0);
        calculator1.add((int) (short) 100);
        calculator1.substract(10);
        calculator1.clear();
        calculator1.clear();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        int int9 = calculator1.getResult();
        calculator1.divide((-49));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        calculator1.multiply((-12));
        calculator1.substract(40);
        calculator1.add(1000);
        calculator1.multiply((-100));
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.substract((int) (byte) 1);
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.multiply(0);
        calculator1.substract(30);
        calculator1.add((int) '#');
        calculator1.clear();
        int int13 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide((int) (short) 1);
        calculator1.substract((int) '#');
        int int11 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-35) + "'", int11 == (-35));
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.divide((int) 'a');
        calculator1.clear();
        calculator1.clear();
        calculator1.multiply(151);
        calculator1.clear();
        int int10 = calculator1.getResult();
        calculator1.multiply((-7852));
        calculator1.clear();
        calculator1.multiply(40);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        calculator1.divide((-5920));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.multiply((int) (byte) -1);
        calculator1.multiply((-97));
        calculator1.clear();
        calculator1.divide((int) (byte) -1);
        int int11 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) '4');
        calculator1.clear();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.divide(39949);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.multiply(152);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        calculator1.substract((int) (byte) 1);
        calculator1.add((int) (short) 1);
        int int10 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
        calculator1.multiply(73);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 78 + "'", int13 == 78);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(56);
        calculator1.multiply((int) (byte) 1);
        calculator1.clear();
        calculator1.substract((int) 'a');
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        int int5 = calculator1.getResult();
        calculator1.substract(48);
        calculator1.divide((int) (byte) 100);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-400));
        int int2 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-400) + "'", int2 == (-400));
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        calculator1.clear();
        calculator1.divide((int) '4');
        int int9 = calculator1.getResult();
        calculator1.multiply((int) (short) -1);
        calculator1.multiply((-588));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (byte) 1);
        calculator1.divide((int) (short) -1);
        int int8 = calculator1.getResult();
        calculator1.divide(1);
        calculator1.multiply((int) (short) 0);
        calculator1.add(1000);
        calculator1.multiply((-3783));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.multiply((int) (byte) 0);
        calculator1.divide(151);
        int int10 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 10);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.clear();
        calculator1.add(10);
        calculator1.add((int) 'a');
        calculator1.substract(51);
        int int11 = calculator1.getResult();
        calculator1.divide((int) (byte) 10);
        calculator1.substract(100);
        calculator1.multiply(152);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 56 + "'", int11 == 56);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.multiply(5);
        calculator1.add((int) '#');
        calculator1.substract(40);
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        calculator1.divide((int) (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.divide(200);
        calculator1.divide((-7852));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.substract(30);
        int int6 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-30) + "'", int6 == (-30));
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.clear();
        calculator1.multiply((int) '#');
        calculator1.divide(40);
        calculator1.divide((-97));
        int int11 = calculator1.getResult();
        calculator1.multiply((-500));
        calculator1.multiply((-4000));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        calculator1.divide(100);
        calculator1.multiply((int) (short) 0);
        calculator1.multiply((-312000000));
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        calculator1.clear();
        calculator1.multiply(39);
        calculator1.add(2);
        calculator1.substract(35);
        calculator1.substract(71);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) ' ');
        int int4 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.divide((int) 'a');
        calculator1.clear();
        calculator1.clear();
        calculator1.multiply(151);
        calculator1.clear();
        int int10 = calculator1.getResult();
        int int11 = calculator1.getResult();
        calculator1.substract(98);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(10);
        int int2 = calculator1.getResult();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.multiply((-10));
        calculator1.add((int) (byte) 1);
        calculator1.add(527);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.multiply(5);
        calculator1.add((int) '#');
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        calculator1.substract(1000);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(10);
        calculator1.add(48);
        calculator1.clear();
        int int14 = calculator1.getResult();
        calculator1.multiply(85);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        calculator1.multiply((int) '4');
        calculator1.divide((int) (byte) 1);
        int int12 = calculator1.getResult();
        calculator1.divide((-1));
        int int15 = calculator1.getResult();
        calculator1.divide((-4656));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7852 + "'", int12 == 7852);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7852) + "'", int15 == (-7852));
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-35));
        calculator1.multiply((-4656));
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        int int18 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.clear();
        calculator1.multiply((int) '#');
        calculator1.multiply(30);
        calculator1.multiply(500);
        calculator1.multiply((-1));
        calculator1.clear();
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.clear();
        calculator1.add(10);
        calculator1.add((int) 'a');
        int int9 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 107 + "'", int9 == 107);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.divide(10);
        calculator1.add(4);
        calculator1.multiply((int) (short) -1);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        calculator1.add(54600000);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.divide((-146));
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.add(51);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        int int13 = calculator1.getResult();
        calculator1.add(510);
        calculator1.multiply(151);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        int int6 = calculator1.getResult();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        calculator1.multiply(152);
        int int10 = calculator1.getResult();
        int int11 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.multiply((int) (short) 10);
        int int11 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        int int5 = calculator1.getResult();
        calculator1.add(49);
        calculator1.multiply((-12));
        int int10 = calculator1.getResult();
        calculator1.multiply((-400));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-588) + "'", int10 == (-588));
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(390);
        calculator1.add((int) ' ');
        calculator1.add((int) (byte) 10);
        int int6 = calculator1.getResult();
        calculator1.multiply(85);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 432 + "'", int6 == 432);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 100);
        calculator1.divide(85);
        calculator1.clear();
        int int5 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.add((int) '#');
        int int9 = calculator1.getResult();
        calculator1.substract((int) ' ');
        calculator1.multiply(51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 85 + "'", int9 == 85);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(15100);
        calculator1.divide(2);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(10);
        int int11 = calculator1.getResult();
        calculator1.clear();
        calculator1.multiply((-39429));
        calculator1.multiply((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.multiply((int) (short) 100);
        calculator1.multiply(10);
        calculator1.substract(51);
        calculator1.multiply((-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
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
        calculator1.clear();
        int int18 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        int int9 = calculator1.getResult();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        int int11 = calculator1.getResult();
        int int12 = calculator1.getResult();
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 40 + "'", int9 == 40);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 40 + "'", int11 == 40);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 40 + "'", int12 == 40);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.substract((int) 'a');
        int int8 = calculator1.getResult();
        calculator1.substract(100);
        calculator1.divide((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-97) + "'", int8 == (-97));
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(78);
        int int2 = calculator1.getResult();
        calculator1.multiply(151);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 78 + "'", int2 == 78);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) '4');
        calculator1.add((int) (short) 10);
        calculator1.multiply(4);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        calculator1.add(89);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.add(51);
        calculator1.clear();
        int int9 = calculator1.getResult();
        int int10 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.divide((int) '#');
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.add(100);
        calculator1.substract(5);
        int int11 = calculator1.getResult();
        calculator1.multiply(73);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 95 + "'", int11 == 95);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.clear();
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.multiply(0);
        calculator1.substract(30);
        calculator1.add((int) '#');
        calculator1.multiply(40);
        calculator1.substract(56);
        java.lang.Class<?> wildcardClass16 = calculator1.getClass();
        calculator1.divide(48);
        calculator1.add((int) (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide((int) (short) 1);
        calculator1.divide(51);
        calculator1.divide((int) (byte) 100);
        calculator1.add((int) ' ');
        calculator1.clear();
        calculator1.divide((int) (short) -1);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(10);
        calculator1.add(48);
        calculator1.multiply(99);
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-5920));
        calculator1.divide(39);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide((int) (short) 10);
        calculator1.divide((-1));
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        int int7 = calculator1.getResult();
        int int8 = calculator1.getResult();
        calculator1.add((int) '4');
        calculator1.substract(15100);
        int int13 = calculator1.getResult();
        calculator1.substract(390);
        calculator1.substract((int) 'a');
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-14948) + "'", int13 == (-14948));
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((int) (short) 0);
        calculator1.clear();
        int int8 = calculator1.getResult();
        calculator1.multiply((-14550));
        calculator1.multiply(10);
        calculator1.clear();
        calculator1.substract(95);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.multiply((int) (byte) -1);
        calculator1.multiply((-97));
        calculator1.multiply((int) (short) 100);
        calculator1.divide((int) ' ');
        calculator1.clear();
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        int int4 = calculator1.getResult();
        int int5 = calculator1.getResult();
        calculator1.substract(4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.multiply((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.multiply(4);
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.clear();
        calculator1.add(10);
        calculator1.multiply((int) (short) -1);
        calculator1.multiply((-7882));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.divide((int) (short) 10);
        calculator1.clear();
        calculator1.add((int) (byte) 100);
        calculator1.divide((int) (short) 100);
        calculator1.divide((-25));
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) '4');
        calculator1.add((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        calculator1.divide(85);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.multiply(151);
        int int8 = calculator1.getResult();
        calculator1.multiply(69);
        calculator1.multiply(432);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15100 + "'", int8 == 15100);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.multiply(151);
        calculator1.clear();
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.divide(5);
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.multiply(0);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide((int) 'a');
        calculator1.substract(40);
        calculator1.multiply((-10));
        calculator1.substract(500);
        int int13 = calculator1.getResult();
        int int14 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-100) + "'", int13 == (-100));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-100) + "'", int14 == (-100));
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        int int9 = calculator1.getResult();
        calculator1.divide(10);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(10);
        calculator1.multiply((int) (short) 10);
        calculator1.multiply((int) (byte) -1);
        int int6 = calculator1.getResult();
        calculator1.divide(480);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.divide((int) (short) 10);
        calculator1.add(151);
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide(10);
        calculator1.add(30);
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        calculator1.divide(390);
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-99));
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        int int5 = calculator1.getResult();
        calculator1.substract(48);
        calculator1.add((int) (short) 100);
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
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
        java.lang.Class<?> wildcardClass18 = calculator1.getClass();
        calculator1.multiply((-127));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(5);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        int int7 = calculator1.getResult();
        int int8 = calculator1.getResult();
        calculator1.multiply((-12));
        calculator1.clear();
        int int12 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        calculator1.substract((int) (byte) 1);
        calculator1.add((int) (byte) 100);
        calculator1.add(5100);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(0);
        calculator1.add((int) (short) 100);
        calculator1.substract(10);
        calculator1.add(10);
        calculator1.substract(696072);
        calculator1.add(312000432);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.multiply(0);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply(51);
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) '4');
        calculator1.add((int) (short) 10);
        calculator1.multiply(4);
        calculator1.multiply(10);
        calculator1.clear();
        calculator1.divide((-400));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract(39);
        calculator1.multiply((int) 'a');
        int int10 = calculator1.getResult();
        calculator1.divide((-53));
        int int13 = calculator1.getResult();
        calculator1.multiply((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-3783) + "'", int10 == (-3783));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 71 + "'", int13 == 71);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.multiply((int) (short) 100);
        calculator1.multiply((int) (short) -1);
        calculator1.divide(51);
        calculator1.add(15100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.multiply((int) (short) 100);
        calculator1.multiply((int) (short) -1);
        int int14 = calculator1.getResult();
        calculator1.add((int) (byte) 1);
        int int17 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-4000) + "'", int14 == (-4000));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-3999) + "'", int17 == (-3999));
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.multiply((-1));
        calculator1.multiply((int) (byte) 0);
        calculator1.multiply((-19974500));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(30);
        calculator1.multiply((int) (byte) 0);
        calculator1.divide(185);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) '4');
        calculator1.add((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        int int9 = calculator1.getResult();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        calculator1.substract(99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        int int7 = calculator1.getResult();
        calculator1.add(100);
        calculator1.divide((int) '#');
        int int12 = calculator1.getResult();
        int int13 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        calculator1.multiply(185);
        calculator1.multiply((-20));
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.substract((int) (byte) 1);
        calculator1.clear();
        calculator1.multiply((-2));
        calculator1.add(200);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
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
        calculator1.divide((-197));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-12) + "'", int16 == (-12));
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (byte) 1);
        calculator1.substract((int) 'a');
        calculator1.multiply(0);
        calculator1.divide(100);
        calculator1.divide(100);
        calculator1.clear();
        calculator1.add(39);
        calculator1.substract(69);
        int int19 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-30) + "'", int19 == (-30));
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.divide((int) (short) 10);
        calculator1.add(151);
        calculator1.substract((int) '4');
        int int13 = calculator1.getResult();
        calculator1.substract((int) ' ');
        calculator1.add(51);
        calculator1.divide((-15100));
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.clear();
        calculator1.multiply((int) '#');
        calculator1.substract(185);
        calculator1.add(85);
        calculator1.divide((-4656));
        calculator1.divide(1);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-7852));
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.multiply((-3783));
        calculator1.divide((int) '4');
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(39);
        calculator1.divide(10);
        int int6 = calculator1.getResult();
        calculator1.divide(5);
        int int9 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.clear();
        calculator1.clear();
        calculator1.clear();
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        int int9 = calculator1.getResult();
        calculator1.clear();
        calculator1.add((int) (byte) 1);
        calculator1.multiply((-3783));
        calculator1.divide(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.multiply(0);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide((int) 'a');
        calculator1.substract(40);
        int int9 = calculator1.getResult();
        calculator1.multiply(40);
        int int12 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-40) + "'", int9 == (-40));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1600) + "'", int12 == (-1600));
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.clear();
        calculator1.multiply((int) '#');
        calculator1.substract(185);
        calculator1.add(85);
        calculator1.divide((-99));
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.add(100);
        calculator1.clear();
        calculator1.add((int) (short) 10);
        calculator1.add(39);
        int int16 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        calculator1.multiply(7852);
        calculator1.clear();
        int int11 = calculator1.getResult();
        calculator1.multiply(185);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
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
        calculator1.substract(39);
        calculator1.divide(51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-12) + "'", int16 == (-12));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
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
        calculator1.add(96);
        java.lang.Class<?> wildcardClass21 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
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
        calculator1.divide((-6000000));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-51) + "'", int14 == (-51));
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.multiply(0);
        calculator1.divide(10);
        calculator1.multiply(7400);
        int int8 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.divide(5);
        int int8 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 0);
        calculator1.clear();
        calculator1.divide(10);
        int int5 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(56);
        calculator1.multiply((int) (byte) 1);
        calculator1.clear();
        calculator1.multiply((-14948));
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
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
        calculator1.divide((-146));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 39 + "'", int14 == 39);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.add(100);
        calculator1.clear();
        calculator1.add((int) (short) 10);
        java.lang.Class<?> wildcardClass14 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        int int6 = calculator1.getResult();
        calculator1.clear();
        calculator1.divide(98);
        calculator1.multiply((-312000000));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract((int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.multiply((-431));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.divide(10);
        calculator1.divide((int) (short) 1);
        int int13 = calculator1.getResult();
        calculator1.divide((int) '#');
        int int16 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.clear();
        calculator1.add(10);
        calculator1.multiply((int) (short) -1);
        calculator1.clear();
        calculator1.multiply(49);
        calculator1.multiply((int) (short) 1);
        calculator1.clear();
        calculator1.add(69);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(0);
        calculator1.add((int) (short) 100);
        int int4 = calculator1.getResult();
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
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
        java.lang.Class<?> wildcardClass20 = calculator1.getClass();
        calculator1.substract(10);
        calculator1.clear();
        calculator1.substract(141);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(49);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.divide((-400));
        calculator1.divide((-49));
        calculator1.multiply(141);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.clear();
        calculator1.divide((-100));
        calculator1.divide(78);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.substract((int) ' ');
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(7852);
        calculator1.multiply(39);
        calculator1.add((int) '4');
        calculator1.divide((-56));
        calculator1.clear();
        calculator1.divide(7400);
        int int11 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 0);
        calculator1.clear();
        calculator1.add(39);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) '4');
        calculator1.clear();
        calculator1.divide((-9800));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        calculator1.multiply(7852);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(0);
        calculator1.add((int) (short) 100);
        calculator1.substract(10);
        calculator1.clear();
        calculator1.clear();
        calculator1.add((int) '#');
        calculator1.clear();
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.multiply(0);
        calculator1.substract(30);
        calculator1.add((int) '#');
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        calculator1.multiply((-53));
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.clear();
        calculator1.divide((-100));
        calculator1.multiply(40);
        calculator1.substract(1);
        calculator1.multiply((-100));
        calculator1.multiply(10);
        calculator1.add(141);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) '4');
        int int9 = calculator1.getResult();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        calculator1.multiply((-25));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.add((int) (byte) 1);
        calculator1.substract((int) (byte) 100);
        int int7 = calculator1.getResult();
        calculator1.multiply((int) (byte) 100);
        calculator1.multiply(187);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-99) + "'", int7 == (-99));
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract(39);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.multiply((int) (byte) 100);
        calculator1.multiply((int) (short) 0);
        calculator1.substract(500);
        calculator1.multiply((-560));
        calculator1.divide((int) '#');
        calculator1.multiply((-14550));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(0);
        calculator1.add((int) (short) 100);
        calculator1.substract(10);
        calculator1.clear();
        calculator1.clear();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        int int9 = calculator1.getResult();
        int int10 = calculator1.getResult();
        calculator1.divide(527);
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        int int6 = calculator1.getResult();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(10);
        calculator1.add(48);
        calculator1.multiply(99);
        calculator1.multiply(140);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        int int3 = calculator1.getResult();
        calculator1.divide((-100));
        calculator1.divide((-97));
        calculator1.multiply((int) (byte) 0);
        calculator1.clear();
        calculator1.divide(100);
        calculator1.divide(312000000);
        calculator1.divide(1000);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        int int9 = calculator1.getResult();
        int int10 = calculator1.getResult();
        calculator1.substract(7400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 40 + "'", int9 == 40);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 10);
        calculator1.clear();
        calculator1.clear();
        calculator1.divide((int) (short) 1);
        calculator1.clear();
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(49);
        calculator1.divide((int) 'a');
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        int int5 = calculator1.getResult();
        calculator1.substract((int) '4');
        calculator1.substract(56);
        calculator1.divide((int) 'a');
        calculator1.add(73);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.substract((int) (byte) 1);
        int int8 = calculator1.getResult();
        calculator1.clear();
        int int10 = calculator1.getResult();
        calculator1.add(1);
        calculator1.multiply((-99));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.clear();
        calculator1.multiply((int) '#');
        int int7 = calculator1.getResult();
        calculator1.multiply((-1400000));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.substract((int) 'a');
        int int8 = calculator1.getResult();
        calculator1.substract(100);
        calculator1.divide(185);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        calculator1.add(7852);
        calculator1.substract(17);
        calculator1.divide(1248);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-97) + "'", int8 == (-97));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-39));
        calculator1.clear();
        calculator1.substract((int) (short) 100);
        calculator1.multiply((-90));
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
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
        calculator1.substract(198900);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.clear();
        calculator1.multiply(7852);
        calculator1.add(96);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        int int6 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        int int5 = calculator1.getResult();
        calculator1.add(49);
        calculator1.add(7852);
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        calculator1.divide((-3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
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
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.clear();
        calculator1.multiply((int) '#');
        calculator1.divide(40);
        calculator1.divide((-97));
        calculator1.clear();
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        int int8 = calculator1.getResult();
        calculator1.divide((int) '4');
        calculator1.clear();
        int int12 = calculator1.getResult();
        calculator1.substract(39);
        calculator1.multiply((-51));
        calculator1.multiply(11);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 151 + "'", int8 == 151);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        int int3 = calculator1.getResult();
        calculator1.divide((-100));
        calculator1.divide((-97));
        calculator1.multiply((int) (byte) 0);
        calculator1.add((int) 'a');
        calculator1.multiply(0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        int int7 = calculator1.getResult();
        int int8 = calculator1.getResult();
        calculator1.add((int) '4');
        int int11 = calculator1.getResult();
        calculator1.multiply(151);
        calculator1.divide(35);
        calculator1.multiply((int) (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 152 + "'", int11 == 152);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.divide((int) (short) 10);
        calculator1.add(1);
        calculator1.multiply((-1));
        calculator1.substract(15100);
        int int15 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15101) + "'", int15 == (-15101));
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(100);
        calculator1.add((int) ' ');
        calculator1.clear();
        calculator1.multiply((-4));
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(49);
        int int2 = calculator1.getResult();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.substract((int) (byte) 10);
        int int6 = calculator1.getResult();
        int int7 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 39 + "'", int6 == 39);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 39 + "'", int7 == 39);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide((-100));
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        calculator1.multiply(49);
        calculator1.divide(696072);
        int int12 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide((int) (short) 10);
        calculator1.substract(5);
        calculator1.substract(400);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide(10);
        calculator1.add(30);
        calculator1.divide((-100));
        calculator1.substract((int) (short) 1);
        java.lang.Class<?> wildcardClass16 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.multiply(151);
        calculator1.divide(198900);
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        calculator1.clear();
        int int7 = calculator1.getResult();
        calculator1.add(390);
        int int10 = calculator1.getResult();
        calculator1.add((int) ' ');
        calculator1.substract(85);
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 390 + "'", int10 == 390);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide((-100));
        int int7 = calculator1.getResult();
        int int8 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.add(100);
        int int9 = calculator1.getResult();
        calculator1.divide(85);
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.divide((int) (byte) 100);
        calculator1.divide(99);
        calculator1.multiply((int) '4');
        int int12 = calculator1.getResult();
        int int13 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract(39);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.multiply((int) (byte) 100);
        calculator1.multiply((int) (short) 0);
        calculator1.multiply((-400));
        calculator1.multiply((-4000));
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.divide((int) (byte) 10);
        calculator1.divide((-19974500));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.clear();
        calculator1.multiply((int) '#');
        calculator1.multiply(30);
        calculator1.divide((-39));
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        int int12 = calculator1.getResult();
        calculator1.substract(85);
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
        calculator1.multiply(527);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 39949 + "'", int16 == 39949);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 39949 + "'", int17 == 39949);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
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
        calculator1.divide(99);
        calculator1.multiply(0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) '4');
        calculator1.add((int) (short) 10);
        calculator1.multiply((int) '4');
        calculator1.substract(39949);
        int int15 = calculator1.getResult();
        int int16 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-39429) + "'", int15 == (-39429));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-39429) + "'", int16 == (-39429));
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        calculator1.multiply((-12));
        calculator1.substract(40);
        calculator1.add((int) '#');
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.add((int) (byte) 1);
        calculator1.divide((int) (short) -1);
        calculator1.multiply((int) (byte) -1);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
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
        calculator1.multiply(4000000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-12) + "'", int16 == (-12));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-12) + "'", int17 == (-12));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(89);
        calculator1.add(12);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-6173856));
        calculator1.divide(73);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(10);
        calculator1.multiply((int) (short) 10);
        calculator1.multiply((int) (byte) -1);
        int int6 = calculator1.getResult();
        calculator1.multiply((-1600));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        int int7 = calculator1.getResult();
        int int8 = calculator1.getResult();
        calculator1.add((int) '4');
        calculator1.substract(15100);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.multiply(0);
        calculator1.substract((int) (byte) 100);
        int int13 = calculator1.getResult();
        calculator1.divide(696072);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-100) + "'", int13 == (-100));
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '#');
        calculator1.clear();
        calculator1.divide(7852);
        calculator1.add((int) ' ');
        calculator1.substract((int) ' ');
        calculator1.clear();
        calculator1.multiply((-90));
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (byte) 1);
        calculator1.substract((int) 'a');
        calculator1.clear();
        calculator1.multiply(390);
        calculator1.clear();
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        calculator1.substract(152);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.divide((int) 'a');
        calculator1.clear();
        calculator1.clear();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.divide((int) (byte) 100);
        calculator1.divide(99);
        calculator1.multiply((int) '4');
        int int12 = calculator1.getResult();
        calculator1.divide((-1400000));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        calculator1.multiply((int) '4');
        calculator1.divide((int) (byte) 1);
        int int12 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7852 + "'", int12 == 7852);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (byte) 1);
        calculator1.substract((int) 'a');
        calculator1.multiply(0);
        calculator1.divide(100);
        calculator1.multiply((int) (byte) -1);
        calculator1.clear();
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
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
        calculator1.add(4655);
        calculator1.multiply(10);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-785));
        calculator1.multiply((-53));
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(10);
        int int2 = calculator1.getResult();
        calculator1.substract(85);
        int int5 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-75) + "'", int5 == (-75));
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.substract((int) 'a');
        calculator1.multiply((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        int int9 = calculator1.getResult();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        int int11 = calculator1.getResult();
        calculator1.divide((-97));
        calculator1.clear();
        calculator1.multiply(200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 40 + "'", int9 == 40);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 40 + "'", int11 == 40);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.multiply(0);
        calculator1.clear();
        int int5 = calculator1.getResult();
        calculator1.clear();
        int int7 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.add(78);
        calculator1.divide((-35));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        calculator1.multiply((int) '4');
        calculator1.divide((int) (byte) 1);
        int int12 = calculator1.getResult();
        calculator1.divide((-1));
        int int15 = calculator1.getResult();
        java.lang.Class<?> wildcardClass16 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7852 + "'", int12 == 7852);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7852) + "'", int15 == (-7852));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.multiply(0);
        int int11 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 10);
        calculator1.add((int) (short) 100);
        calculator1.add(2);
        int int10 = calculator1.getResult();
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        calculator1.substract(52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 98 + "'", int10 == 98);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.clear();
        calculator1.multiply((int) '#');
        calculator1.multiply(30);
        calculator1.divide((-39));
        calculator1.substract(198900);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.clear();
        calculator1.add((int) (byte) 100);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        calculator1.multiply(7852);
        calculator1.clear();
        calculator1.multiply((-51));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.multiply(0);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.clear();
        calculator1.multiply((int) 'a');
        calculator1.divide((int) 'a');
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.clear();
        calculator1.multiply((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        int int9 = calculator1.getResult();
        calculator1.add(100);
        calculator1.divide((int) (byte) 1);
        calculator1.divide(500);
        calculator1.divide(5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
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
        calculator1.add(198900);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.divide((int) (short) 100);
        calculator1.multiply((int) (short) 1);
        calculator1.divide((-40));
        calculator1.divide((-1300));
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
        java.lang.Class<?> wildcardClass17 = calculator1.getClass();
        java.lang.Class<?> wildcardClass18 = calculator1.getClass();
        calculator1.divide((-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.substract((int) (byte) 1);
        int int8 = calculator1.getResult();
        calculator1.clear();
        int int10 = calculator1.getResult();
        calculator1.add(1);
        int int13 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        int int4 = calculator1.getResult();
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide((int) (short) -1);
        calculator1.clear();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (byte) 1);
        calculator1.substract((int) 'a');
        calculator1.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        calculator1.multiply(1248);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(4000000);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-7852));
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.substract(30);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.multiply((-20));
        calculator1.divide((-2));
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.add(51);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        int int13 = calculator1.getResult();
        int int14 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract(49);
        java.lang.Class<?> wildcardClass18 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        int int4 = calculator1.getResult();
        calculator1.substract((int) '4');
        calculator1.divide((int) ' ');
        int int9 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-49));
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        calculator1.clear();
        calculator1.multiply((-39429));
        calculator1.clear();
        calculator1.multiply(312000432);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 140 + "'", int16 == 140);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.clear();
        calculator1.divide((-100));
        calculator1.multiply(40);
        calculator1.substract(1);
        calculator1.multiply((-100));
        int int13 = calculator1.getResult();
        calculator1.add(85);
        calculator1.divide(40);
        int int18 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.substract(15100);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        int int5 = calculator1.getResult();
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.multiply(152);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.clear();
        int int5 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(5100);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.substract((int) 'a');
        int int8 = calculator1.getResult();
        calculator1.substract(100);
        calculator1.divide(185);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        calculator1.add((int) 'a');
        int int16 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-97) + "'", int8 == (-97));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 96 + "'", int16 == 96);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.multiply((-10));
        calculator1.substract((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.substract(39);
        calculator1.add(151);
        int int9 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 112 + "'", int9 == 112);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.add((int) (byte) 10);
        calculator1.substract((int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.add((int) ' ');
        calculator1.divide((int) '#');
        calculator1.substract(500);
        int int9 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-500) + "'", int9 == (-500));
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        calculator1.substract(100);
        calculator1.divide(10);
        int int8 = calculator1.getResult();
        int int9 = calculator1.getResult();
        calculator1.divide(152);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-10) + "'", int8 == (-10));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-10) + "'", int9 == (-10));
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        int int9 = calculator1.getResult();
        int int10 = calculator1.getResult();
        calculator1.add(571233);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 10);
        calculator1.clear();
        calculator1.divide((int) (short) 100);
        calculator1.clear();
        calculator1.divide(2);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(39);
        calculator1.multiply((int) (byte) 1);
        int int6 = calculator1.getResult();
        calculator1.add(152);
        calculator1.substract((int) (byte) 10);
        calculator1.substract(312000432);
        calculator1.clear();
        calculator1.add(89);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.add(1);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.divide((int) (short) 10);
        calculator1.add(151);
        calculator1.substract((int) '4');
        int int13 = calculator1.getResult();
        calculator1.substract(696072);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        int int3 = calculator1.getResult();
        calculator1.divide((-100));
        calculator1.divide((-97));
        calculator1.divide(7400);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.clear();
        int int7 = calculator1.getResult();
        calculator1.divide(527);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.add(185);
        calculator1.divide(7400);
        int int13 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.clear();
        calculator1.divide(200);
        calculator1.multiply(78);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(99);
        calculator1.divide((int) 'a');
        calculator1.add(2);
        calculator1.divide((-425683));
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-7882));
        calculator1.divide((-56));
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.multiply((int) (byte) -1);
        calculator1.multiply((-97));
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.multiply(0);
        calculator1.divide(51);
        calculator1.divide(141);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(10);
        calculator1.add(39);
        calculator1.multiply((int) (byte) -1);
        calculator1.substract(56);
        calculator1.divide((-5920));
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-75));
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(56);
        calculator1.multiply((int) (byte) 1);
        calculator1.add(10);
        calculator1.clear();
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.clear();
        calculator1.add(10);
        calculator1.multiply((int) (short) 100);
        calculator1.divide((-3));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract(39);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.multiply((int) (byte) 100);
        calculator1.multiply((int) (short) 0);
        calculator1.multiply((-400));
        calculator1.multiply((-4000));
        java.lang.Class<?> wildcardClass17 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.multiply((int) (byte) -1);
        calculator1.multiply((-97));
        calculator1.multiply((int) (short) 100);
        calculator1.substract(500);
        calculator1.add(39949);
        calculator1.add(468);
        int int16 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-425683) + "'", int16 == (-425683));
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        calculator1.substract((int) (byte) 1);
        calculator1.multiply(39);
        int int10 = calculator1.getResult();
        calculator1.multiply((int) (short) 100);
        calculator1.multiply(11);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-39) + "'", int10 == (-39));
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        int int6 = calculator1.getResult();
        int int7 = calculator1.getResult();
        calculator1.add(390);
        calculator1.multiply((-197));
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(51);
        calculator1.multiply((int) (short) 100);
        calculator1.multiply(39);
        calculator1.multiply((-3000));
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide(10);
        calculator1.divide(39);
        calculator1.substract((int) (short) 10);
        java.lang.Class<?> wildcardClass14 = calculator1.getClass();
        int int15 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.multiply((int) (short) 100);
        calculator1.multiply(10);
        calculator1.multiply((int) (short) 100);
        calculator1.multiply((-48));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide(112);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.clear();
        calculator1.add(95);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
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
        calculator1.multiply((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 185 + "'", int16 == 185);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(0);
        calculator1.add((int) (short) 100);
        calculator1.substract(10);
        calculator1.clear();
        calculator1.clear();
        calculator1.add((int) '#');
        calculator1.divide((-1));
        int int12 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-35) + "'", int12 == (-35));
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        calculator1.multiply(1);
        calculator1.divide((int) '#');
        calculator1.divide((-90));
        calculator1.substract(39949);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.add(51);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        calculator1.clear();
        int int14 = calculator1.getResult();
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        calculator1.add(2);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-785));
        calculator1.multiply((-9800));
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        int int8 = calculator1.getResult();
        calculator1.divide((int) '4');
        calculator1.clear();
        calculator1.multiply(30);
        calculator1.divide((-97));
        java.lang.Class<?> wildcardClass16 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 151 + "'", int8 == 151);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        calculator1.clear();
        calculator1.divide((int) '4');
        int int9 = calculator1.getResult();
        calculator1.multiply((int) (short) -1);
        calculator1.add(152);
        java.lang.Class<?> wildcardClass14 = calculator1.getClass();
        calculator1.multiply((-53));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.multiply(99);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide(34);
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-34107528));
        calculator1.clear();
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(39);
        calculator1.divide(48);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (byte) 1);
        calculator1.divide((-311999099));
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 10);
        calculator1.clear();
        calculator1.substract(39);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.add((int) '4');
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        calculator1.multiply((int) (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.substract((int) 'a');
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        calculator1.add(30);
        calculator1.divide(30);
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        calculator1.divide((-98));
        calculator1.multiply((-1300));
        calculator1.multiply(17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(151);
        int int2 = calculator1.getResult();
        calculator1.multiply(39);
        calculator1.substract(187);
        calculator1.multiply(468);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 151 + "'", int2 == 151);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
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
        java.lang.Class<?> wildcardClass18 = calculator1.getClass();
        java.lang.Class<?> wildcardClass19 = calculator1.getClass();
        int int20 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-12) + "'", int20 == (-12));
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        int int3 = calculator1.getResult();
        calculator1.divide((-100));
        calculator1.divide((-97));
        calculator1.multiply((int) (byte) 0);
        calculator1.clear();
        calculator1.divide(100);
        calculator1.divide(312000000);
        calculator1.divide(312000000);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
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
        java.lang.Class<?> wildcardClass20 = calculator1.getClass();
        java.lang.Class<?> wildcardClass21 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        int int9 = calculator1.getResult();
        calculator1.add(100);
        calculator1.multiply(5);
        java.lang.Class<?> wildcardClass14 = calculator1.getClass();
        calculator1.clear();
        int int16 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.clear();
        calculator1.add(10);
        calculator1.multiply((int) (short) 100);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        int int10 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) -1);
        calculator1.multiply((int) 'a');
        calculator1.divide(4655);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        calculator1.multiply(7852);
        calculator1.clear();
        int int11 = calculator1.getResult();
        calculator1.divide(500);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.divide((int) (short) 10);
        calculator1.add(151);
        calculator1.substract((int) '4');
        int int13 = calculator1.getResult();
        int int14 = calculator1.getResult();
        calculator1.divide((int) (short) -1);
        int int17 = calculator1.getResult();
        java.lang.Class<?> wildcardClass18 = calculator1.getClass();
        calculator1.divide((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-99) + "'", int17 == (-99));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.multiply((-1));
        calculator1.clear();
        calculator1.substract(1);
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(225);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.clear();
        calculator1.divide((-100));
        calculator1.multiply(40);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.divide((-30));
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide((int) (short) 10);
        calculator1.divide(30);
        calculator1.clear();
        calculator1.add(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-3));
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.clear();
        calculator1.multiply((int) '#');
        calculator1.multiply(30);
        calculator1.divide((-39));
        int int11 = calculator1.getResult();
        calculator1.substract((int) '#');
        java.lang.Class<?> wildcardClass14 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        int int4 = calculator1.getResult();
        calculator1.clear();
        int int6 = calculator1.getResult();
        int int7 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.divide((-4000));
        int int12 = calculator1.getResult();
        calculator1.multiply(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        int int9 = calculator1.getResult();
        int int10 = calculator1.getResult();
        calculator1.substract((int) (byte) 1);
        calculator1.clear();
        calculator1.clear();
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 40 + "'", int9 == 40);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.multiply((-1));
        calculator1.clear();
        calculator1.substract(1);
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        calculator1.add(312000432);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) ' ');
        calculator1.clear();
        calculator1.divide(56);
        calculator1.add(527);
        calculator1.divide(48);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 0);
        calculator1.clear();
        calculator1.clear();
        calculator1.clear();
        calculator1.clear();
        calculator1.clear();
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 10);
        calculator1.clear();
        calculator1.substract(39);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.add((int) '4');
        calculator1.clear();
        calculator1.divide((-9751));
        calculator1.divide(571233);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
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
        calculator1.divide((-146));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.clear();
        calculator1.multiply((int) '#');
        calculator1.multiply(30);
        calculator1.substract(500);
        calculator1.add(69);
        int int13 = calculator1.getResult();
        calculator1.multiply((-14948));
        java.lang.Class<?> wildcardClass16 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-431) + "'", int13 == (-431));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
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
        calculator1.multiply((-14948));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 39 + "'", int14 == 39);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
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
        java.lang.Class<?> wildcardClass17 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 140 + "'", int16 == 140);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide(100);
        calculator1.clear();
        int int7 = calculator1.getResult();
        calculator1.add(390);
        int int10 = calculator1.getResult();
        calculator1.multiply((-14948));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 390 + "'", int10 == 390);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.multiply((-1));
        calculator1.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
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
        java.lang.Class<?> wildcardClass18 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-97) + "'", int8 == (-97));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.multiply((int) (short) 100);
        calculator1.add(151);
        calculator1.multiply(0);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-39429));
        calculator1.multiply(78);
        int int4 = calculator1.getResult();
        calculator1.multiply(30);
        int int7 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3075462) + "'", int4 == (-3075462));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-92263860) + "'", int7 == (-92263860));
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) '4');
        calculator1.add(40);
        calculator1.clear();
        calculator1.clear();
        calculator1.divide((-98));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.multiply((int) (short) 100);
        calculator1.multiply((int) (short) -1);
        calculator1.add(1000);
        java.lang.Class<?> wildcardClass16 = calculator1.getClass();
        int int17 = calculator1.getResult();
        java.lang.Class<?> wildcardClass18 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-3000) + "'", int17 == (-3000));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        calculator1.divide((int) 'a');
        int int5 = calculator1.getResult();
        calculator1.substract(48);
        calculator1.substract(40);
        calculator1.add((int) (short) 10);
        calculator1.multiply(107);
        calculator1.substract(69);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        calculator1.divide((int) (byte) 100);
        calculator1.substract(98);
        calculator1.add(1000);
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.clear();
        calculator1.add(107);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide((int) '#');
        int int8 = calculator1.getResult();
        calculator1.clear();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((int) (byte) 1);
        calculator1.divide(151);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.multiply(0);
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        int int4 = calculator1.getResult();
        int int5 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.divide((int) (short) 10);
        calculator1.clear();
        calculator1.add((int) (byte) 100);
        calculator1.divide((-56));
        calculator1.add(48);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
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
        calculator1.clear();
        calculator1.divide(48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (short) 100);
        calculator1.substract((int) 'a');
        calculator1.clear();
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        int int10 = calculator1.getResult();
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (byte) 1);
        calculator1.substract((int) 'a');
        calculator1.clear();
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        calculator1.divide((-10));
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.divide((int) (short) 10);
        calculator1.clear();
        calculator1.add((int) (byte) 100);
        calculator1.divide((-56));
        int int14 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) 'a');
        calculator1.divide(2);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((-7882));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.multiply(0);
        calculator1.substract(30);
        calculator1.multiply(30);
        calculator1.add(30);
        calculator1.add(85);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.multiply((int) (byte) -1);
        calculator1.multiply((-97));
        calculator1.multiply((int) (short) 100);
        calculator1.substract(500);
        calculator1.add(39949);
        calculator1.add(468);
        int int16 = calculator1.getResult();
        calculator1.multiply(78);
        int int19 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-425683) + "'", int16 == (-425683));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-33203274) + "'", int19 == (-33203274));
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        calculator1.multiply((-10));
        calculator1.add((int) (byte) 1);
        int int7 = calculator1.getResult();
        calculator1.multiply((-6173856));
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-99) + "'", int7 == (-99));
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.divide((int) '#');
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.add(100);
        int int9 = calculator1.getResult();
        java.lang.Class<?> wildcardClass10 = calculator1.getClass();
        calculator1.multiply(69);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(39);
        calculator1.divide(10);
        int int6 = calculator1.getResult();
        calculator1.divide(5);
        calculator1.multiply(7852);
        calculator1.divide((-146));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        calculator1.substract(49);
        java.lang.Class<?> wildcardClass14 = calculator1.getClass();
        calculator1.add((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-14550));
        calculator1.clear();
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(39);
        calculator1.divide(10);
        int int6 = calculator1.getResult();
        calculator1.divide(5);
        calculator1.multiply(7852);
        calculator1.divide((-97));
        calculator1.divide((-400));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        int int3 = calculator1.getResult();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        int int5 = calculator1.getResult();
        calculator1.clear();
        int int7 = calculator1.getResult();
        calculator1.clear();
        calculator1.substract(39949);
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.multiply(5);
        calculator1.add((int) '#');
        calculator1.substract(40);
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        calculator1.divide((-1300));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.multiply(151);
        calculator1.substract(78);
        calculator1.clear();
        calculator1.divide((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = calculator1.getClass();
        int int14 = calculator1.getResult();
        calculator1.multiply((-48));
        int int17 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        int int9 = calculator1.getResult();
        calculator1.clear();
        int int11 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-3999));
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
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
        calculator1.divide((int) (byte) 1);
        calculator1.divide((-100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.divide((int) (short) 100);
        calculator1.multiply(0);
        calculator1.substract(30);
        calculator1.multiply(30);
        calculator1.divide((int) (short) 10);
        calculator1.substract(56);
        int int16 = calculator1.getResult();
        java.lang.Class<?> wildcardClass17 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-146) + "'", int16 == (-146));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
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
        calculator1.divide((int) (byte) -1);
        calculator1.divide((-2));
        int int29 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-12) + "'", int16 == (-12));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-12) + "'", int17 == (-12));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.multiply(0);
        calculator1.divide(10);
        calculator1.divide(10);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(7852);
        calculator1.divide(152);
        calculator1.divide(51);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
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
        calculator1.divide((int) (byte) -1);
        calculator1.divide((-2));
        calculator1.substract(17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-12) + "'", int16 == (-12));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-12) + "'", int17 == (-12));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(10);
        calculator1.clear();
        calculator1.clear();
        calculator1.multiply(510);
        calculator1.multiply(32);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.clear();
        calculator1.divide(10);
        calculator1.multiply((int) (short) 0);
        calculator1.clear();
        calculator1.multiply(35);
        calculator1.divide(49);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.divide((int) (short) 10);
        calculator1.add(151);
        java.lang.Class<?> wildcardClass11 = calculator1.getClass();
        calculator1.multiply(99);
        calculator1.clear();
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        calculator1.multiply((-5920));
        calculator1.divide((-500));
        calculator1.multiply(30);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.divide((int) '#');
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        java.lang.Class<?> wildcardClass7 = calculator1.getClass();
        calculator1.substract(69);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.multiply((int) (byte) -1);
        calculator1.multiply((-97));
        calculator1.multiply((int) (short) 100);
        calculator1.clear();
        calculator1.multiply((int) (byte) 100);
        calculator1.multiply((-98));
        java.lang.Class<?> wildcardClass15 = calculator1.getClass();
        int int16 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.clear();
        calculator1.divide((int) (short) 10);
        calculator1.add(1);
        calculator1.multiply((-1));
        calculator1.substract(15100);
        calculator1.add(107);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
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
        calculator1.multiply(0);
        int int22 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.add(51);
        calculator1.substract((int) (short) 10);
        calculator1.substract(1);
        int int11 = calculator1.getResult();
        java.lang.Class<?> wildcardClass12 = calculator1.getClass();
        int int13 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 39 + "'", int13 == 39);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.multiply(151);
        int int8 = calculator1.getResult();
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15100 + "'", int8 == 15100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.multiply(0);
        calculator1.add((int) (short) 1);
        java.lang.Class<?> wildcardClass6 = calculator1.getClass();
        calculator1.multiply((int) '#');
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide(1);
        calculator1.multiply((int) (byte) 100);
        calculator1.multiply(151);
        calculator1.divide(198900);
        calculator1.add(1000);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.clear();
        calculator1.multiply((int) '#');
        calculator1.divide(40);
        calculator1.substract((int) (byte) 10);
        calculator1.divide((int) (byte) -1);
        calculator1.divide((-100));
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) '4');
        calculator1.substract((int) (short) 100);
        calculator1.divide((int) (byte) 1);
        calculator1.divide((int) (short) -1);
        java.lang.Class<?> wildcardClass8 = calculator1.getClass();
        calculator1.substract(1248);
        calculator1.clear();
        int int12 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(51);
        calculator1.clear();
        calculator1.clear();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.multiply((int) (byte) 1);
        calculator1.clear();
        int int8 = calculator1.getResult();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 1);
        calculator1.substract(34);
        calculator1.substract(112);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 0);
        calculator1.clear();
        calculator1.multiply(99);
        calculator1.add(30);
        calculator1.divide((-39429));
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
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
        java.lang.Class<?> wildcardClass26 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 39949 + "'", int16 == 39949);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 39949 + "'", int17 == 39949);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-311999099) + "'", int25 == (-311999099));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
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
        calculator1.multiply((-425683));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-12) + "'", int16 == (-12));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-12) + "'", int17 == (-12));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-98));
        calculator1.clear();
        calculator1.clear();
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide((-48));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.clear();
        calculator1.add(10);
        calculator1.multiply((int) (short) -1);
        calculator1.clear();
        int int10 = calculator1.getResult();
        calculator1.add(696072);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.clear();
        java.lang.Class<?> wildcardClass3 = calculator1.getClass();
        calculator1.clear();
        calculator1.add(10);
        calculator1.multiply((int) (short) 100);
        int int9 = calculator1.getResult();
        calculator1.clear();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) ' ');
        calculator1.clear();
        calculator1.divide(56);
        calculator1.divide(30);
        int int9 = calculator1.getResult();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
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
        calculator1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        calculator1.divide((int) (short) 1);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide((-25));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.add((int) '4');
        calculator1.add(100);
        calculator1.divide(1);
        int int8 = calculator1.getResult();
        calculator1.divide((int) '4');
        calculator1.clear();
        int int12 = calculator1.getResult();
        calculator1.substract(39);
        calculator1.multiply((-51));
        calculator1.substract(11);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 151 + "'", int8 == 151);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(0);
        calculator1.add((int) (short) 100);
        calculator1.substract(10);
        calculator1.clear();
        int int7 = calculator1.getResult();
        calculator1.clear();
        int int9 = calculator1.getResult();
        calculator1.add(39);
        calculator1.divide((int) (short) 1);
        calculator1.substract(96);
        java.lang.Class<?> wildcardClass16 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        int int4 = calculator1.getResult();
        java.lang.Class<?> wildcardClass5 = calculator1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-6000000));
        java.lang.Class<?> wildcardClass2 = calculator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-312000000));
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) 1);
        int int2 = calculator1.getResult();
        calculator1.divide((int) (byte) -1);
        calculator1.multiply((-1));
        calculator1.clear();
        int int8 = calculator1.getResult();
        calculator1.divide(4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (short) -1);
        calculator1.divide((int) (byte) 10);
        calculator1.clear();
        calculator1.divide((-100));
        calculator1.divide(78);
        java.lang.Class<?> wildcardClass9 = calculator1.getClass();
        int int10 = calculator1.getResult();
        calculator1.multiply(4);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator(30);
        calculator1.multiply((int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide((-785));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((int) (byte) 0);
        calculator1.multiply(0);
        java.lang.Class<?> wildcardClass4 = calculator1.getClass();
        calculator1.divide((int) 'a');
        calculator1.substract(40);
        calculator1.multiply((-10));
        calculator1.substract(500);
        int int13 = calculator1.getResult();
        int int14 = calculator1.getResult();
        calculator1.multiply((-146));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-100) + "'", int13 == (-100));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-100) + "'", int14 == (-100));
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        jbhembise.testauto.example1.Calculator calculator1 = new jbhembise.testauto.example1.Calculator((-100));
        calculator1.substract(100);
        calculator1.add((int) (byte) 10);
        calculator1.divide((-39));
        int int8 = calculator1.getResult();
        calculator1.add((int) 'a');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }
}

