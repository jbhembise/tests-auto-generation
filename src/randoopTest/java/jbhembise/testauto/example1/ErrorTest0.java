package jbhembise.testauto.example1;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.divide((int) (byte) 0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.multiply((int) (byte) 100);
        calculator0.divide((int) (short) 0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.divide((int) (short) 0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        calculator0.add((int) ' ');
        calculator0.divide((int) (byte) 0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        int int9 = calculator0.getResult();
        calculator0.divide((int) (byte) 0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.divide(0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.add((int) '#');
        calculator0.divide((int) (short) 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.divide((int) (short) 1);
        calculator0.multiply(52);
        int int9 = calculator0.getResult();
        calculator0.divide(0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        calculator0.multiply(1);
        calculator0.add(1);
        calculator0.add(100);
        calculator0.divide(0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide(0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply((int) (short) -1);
        calculator0.divide((int) (byte) 0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        int int6 = calculator0.getResult();
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.divide(0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-100));
        int int7 = calculator0.getResult();
        calculator0.add(52);
        calculator0.divide(0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((int) (byte) 100);
        calculator0.clear();
        calculator0.divide(0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) (byte) -1);
        calculator0.divide((int) (byte) 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.clear();
        calculator0.multiply((int) (short) 0);
        calculator0.clear();
        calculator0.add(10);
        calculator0.clear();
        calculator0.divide((int) (byte) 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.divide((-1));
        calculator0.divide(0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.divide((int) (byte) -1);
        calculator0.substract(10);
        calculator0.clear();
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        calculator0.divide((int) (byte) 0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
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
        calculator0.divide((int) (byte) 0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.divide((int) (short) 10);
        calculator0.divide((int) (byte) 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.multiply((int) (byte) 100);
        calculator0.substract(42);
        calculator0.divide(0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((-1));
        calculator0.multiply((-100));
        calculator0.multiply((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.divide((int) (short) -1);
        calculator0.divide((int) (byte) 10);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        calculator0.divide(0);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
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
        calculator0.divide(0);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
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
        calculator0.divide(0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.clear();
        int int5 = calculator0.getResult();
        calculator0.add(100);
        calculator0.divide(0);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
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
        calculator0.divide(0);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(42);
        calculator0.substract((int) (short) 100);
        calculator0.substract(10);
        calculator0.multiply((int) (short) 100);
        calculator0.divide(0);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
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
        calculator0.divide(0);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide((int) ' ');
        calculator0.substract((int) (byte) 100);
        int int9 = calculator0.getResult();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        int int11 = calculator0.getResult();
        java.lang.Class<?> wildcardClass12 = calculator0.getClass();
        calculator0.divide(0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.multiply((int) (short) 0);
        int int9 = calculator0.getResult();
        calculator0.add((int) '#');
        calculator0.add(152);
        calculator0.divide(0);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.divide((int) (short) -1);
        calculator0.divide((int) (byte) 0);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
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
        calculator0.divide(0);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) 'a');
        calculator0.clear();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.multiply((int) (short) -1);
        calculator0.multiply((-42));
        calculator0.divide(0);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.divide((-1));
        int int8 = calculator0.getResult();
        calculator0.divide((int) (byte) 0);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.divide(160);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.substract((int) '4');
        calculator0.add(1000);
        calculator0.divide((int) (byte) 0);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        calculator0.add((int) '4');
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        calculator0.divide((int) (byte) 0);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.substract(42);
        calculator0.divide((int) 'a');
        calculator0.multiply(1612);
        calculator0.divide((int) (byte) 0);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.divide((-1));
        int int8 = calculator0.getResult();
        calculator0.substract(43);
        calculator0.divide(0);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        java.lang.Class<?> wildcardClass3 = calculator0.getClass();
        int int4 = calculator0.getResult();
        calculator0.add((int) 'a');
        calculator0.substract((int) (short) 1);
        calculator0.divide(0);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        int int5 = calculator0.getResult();
        calculator0.clear();
        calculator0.clear();
        calculator0.divide((int) (short) 0);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
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
        calculator0.divide(0);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide(1);
        int int3 = calculator0.getResult();
        calculator0.divide((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        calculator0.substract((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.divide(1612);
        calculator0.add(100);
        calculator0.clear();
        calculator0.divide((-142));
        calculator0.divide(0);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
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
        calculator0.divide((int) (byte) 0);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.substract((int) (byte) 100);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.divide((-1));
        calculator0.divide(0);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.divide((int) (short) 100);
        calculator0.multiply(100);
        calculator0.divide((-100));
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        calculator0.divide(0);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.add((int) (short) 1);
        calculator0.add((int) '#');
        calculator0.clear();
        int int8 = calculator0.getResult();
        java.lang.Class<?> wildcardClass9 = calculator0.getClass();
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        calculator0.divide(0);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
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
        calculator0.divide((int) (byte) 0);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.substract((int) (short) 100);
        calculator0.divide((int) (byte) 10);
        calculator0.clear();
        calculator0.substract(10);
        calculator0.divide(9);
        int int12 = calculator0.getResult();
        calculator0.divide(1612);
        calculator0.clear();
        calculator0.divide(0);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
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
        calculator0.divide(0);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        int int3 = calculator0.getResult();
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        calculator0.add((int) (byte) 100);
        calculator0.multiply((int) (byte) 1);
        int int9 = calculator0.getResult();
        calculator0.divide(42);
        calculator0.divide(0);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.substract((int) (byte) 100);
        calculator0.divide(42);
        int int7 = calculator0.getResult();
        calculator0.add((int) (byte) 10);
        int int10 = calculator0.getResult();
        calculator0.divide((int) ' ');
        calculator0.divide(0);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.clear();
        calculator0.clear();
        calculator0.clear();
        calculator0.divide((int) '4');
        calculator0.multiply((int) (byte) -1);
        calculator0.divide(0);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.clear();
        calculator0.clear();
        calculator0.divide(2);
        calculator0.multiply((-9));
        calculator0.divide((int) (byte) 0);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
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
        calculator0.divide(0);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) '4');
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.multiply((-1));
        calculator0.substract((int) '4');
        int int13 = calculator0.getResult();
        int int14 = calculator0.getResult();
        calculator0.divide((int) (short) 0);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.add((int) ' ');
        calculator0.clear();
        calculator0.divide(9);
        calculator0.divide(0);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) -1);
        calculator0.add((int) '4');
        calculator0.multiply((int) (short) 10);
        calculator0.add((int) ' ');
        calculator0.divide(0);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
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
        calculator0.divide((int) (byte) 0);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        int int1 = calculator0.getResult();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        calculator0.multiply((int) (byte) 10);
        calculator0.substract(100);
        calculator0.substract(42);
        calculator0.divide(0);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
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
        calculator0.divide((int) (short) 0);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
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
        calculator0.clear();
        int int16 = calculator0.getResult();
        int int17 = calculator0.getResult();
        calculator0.divide((int) (short) 0);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.clear();
        calculator0.divide((int) (short) 1);
        calculator0.divide(0);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
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
        calculator0.divide(0);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.clear();
        calculator0.substract((int) '4');
        java.lang.Class<?> wildcardClass8 = calculator0.getClass();
        calculator0.multiply((-1));
        calculator0.divide(8);
        calculator0.divide(0);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.clear();
        calculator0.clear();
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.multiply((-1));
        calculator0.divide(0);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.clear();
        calculator0.clear();
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        calculator0.multiply((-1));
        calculator0.add(1);
        int int10 = calculator0.getResult();
        calculator0.substract(8);
        calculator0.divide(0);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.divide((int) 'a');
        calculator0.multiply((int) (short) 100);
        calculator0.divide(100);
        calculator0.add((int) (short) 10);
        calculator0.clear();
        calculator0.divide((int) (short) 1);
        int int12 = calculator0.getResult();
        calculator0.multiply(0);
        calculator0.divide(0);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.multiply((int) (byte) 0);
        calculator0.multiply((int) (byte) 10);
        calculator0.divide((int) (short) 1);
        calculator0.multiply(1000);
        int int9 = calculator0.getResult();
        calculator0.multiply(1000);
        calculator0.divide(0);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
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
        calculator0.divide(0);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        jbhembise.testauto.example1.Calculator calculator0 = new jbhembise.testauto.example1.Calculator();
        calculator0.add((int) '4');
        calculator0.divide((int) '4');
        calculator0.substract(100);
        calculator0.multiply(1);
        calculator0.multiply((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = calculator0.getClass();
        calculator0.clear();
        calculator0.multiply(0);
        calculator0.divide((int) (short) 0);
    }
}

