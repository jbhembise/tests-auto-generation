package jbhembise.testauto.example2;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        int int1 = jbhembise.testauto.example2.DiscountCalculator.calculatePercentage((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        int int1 = jbhembise.testauto.example2.DiscountCalculator.calculatePercentage((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        int int1 = jbhembise.testauto.example2.DiscountCalculator.calculatePercentage(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        int int1 = jbhembise.testauto.example2.DiscountCalculator.calculatePercentage((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        int int1 = jbhembise.testauto.example2.DiscountCalculator.calculatePercentage((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        int int1 = jbhembise.testauto.example2.DiscountCalculator.calculatePercentage(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        int int1 = jbhembise.testauto.example2.DiscountCalculator.calculatePercentage((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        int int1 = jbhembise.testauto.example2.DiscountCalculator.calculatePercentage(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        int int1 = jbhembise.testauto.example2.DiscountCalculator.calculatePercentage((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        int int1 = jbhembise.testauto.example2.DiscountCalculator.calculatePercentage((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        int int1 = jbhembise.testauto.example2.DiscountCalculator.calculatePercentage((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        int int1 = jbhembise.testauto.example2.DiscountCalculator.calculatePercentage((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        int int1 = jbhembise.testauto.example2.DiscountCalculator.calculatePercentage((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        int int1 = jbhembise.testauto.example2.DiscountCalculator.calculatePercentage((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        int int1 = jbhembise.testauto.example2.DiscountCalculator.calculatePercentage((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        int int1 = jbhembise.testauto.example2.DiscountCalculator.calculatePercentage((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        int int1 = jbhembise.testauto.example2.DiscountCalculator.calculatePercentage((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        int int1 = jbhembise.testauto.example2.DiscountCalculator.calculatePercentage((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        int int1 = jbhembise.testauto.example2.DiscountCalculator.calculatePercentage(6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        int int1 = jbhembise.testauto.example2.DiscountCalculator.calculatePercentage(9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        int int1 = jbhembise.testauto.example2.DiscountCalculator.calculatePercentage(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class<?> wildcardClass2 = obj0.getClass();
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        java.lang.Class<?> wildcardClass5 = obj0.getClass();
        java.lang.Class<?> wildcardClass6 = obj0.getClass();
        java.lang.Class<?> wildcardClass7 = obj0.getClass();
        java.lang.Class<?> wildcardClass8 = obj0.getClass();
        java.lang.Class<?> wildcardClass9 = obj0.getClass();
        java.lang.Class<?> wildcardClass10 = obj0.getClass();
        java.lang.Class<?> wildcardClass11 = obj0.getClass();
        java.lang.Class<?> wildcardClass12 = obj0.getClass();
        java.lang.Class<?> wildcardClass13 = obj0.getClass();
        java.lang.Class<?> wildcardClass14 = obj0.getClass();
        java.lang.Class<?> wildcardClass15 = obj0.getClass();
        java.lang.Class<?> wildcardClass16 = obj0.getClass();
        java.lang.Class<?> wildcardClass17 = obj0.getClass();
        java.lang.Class<?> wildcardClass18 = obj0.getClass();
        java.lang.Class<?> wildcardClass19 = obj0.getClass();
        java.lang.Class<?> wildcardClass20 = obj0.getClass();
        java.lang.Class<?> wildcardClass21 = obj0.getClass();
        java.lang.Class<?> wildcardClass22 = obj0.getClass();
        java.lang.Class<?> wildcardClass23 = obj0.getClass();
        java.lang.Class<?> wildcardClass24 = obj0.getClass();
        java.lang.Class<?> wildcardClass25 = obj0.getClass();
        java.lang.Class<?> wildcardClass26 = obj0.getClass();
        java.lang.Class<?> wildcardClass27 = obj0.getClass();
        java.lang.Class<?> wildcardClass28 = obj0.getClass();
        java.lang.Class<?> wildcardClass29 = obj0.getClass();
        java.lang.Class<?> wildcardClass30 = obj0.getClass();
        java.lang.Class<?> wildcardClass31 = obj0.getClass();
        java.lang.Class<?> wildcardClass32 = obj0.getClass();
        java.lang.Class<?> wildcardClass33 = obj0.getClass();
        java.lang.Class<?> wildcardClass34 = obj0.getClass();
        java.lang.Class<?> wildcardClass35 = obj0.getClass();
        java.lang.Class<?> wildcardClass36 = obj0.getClass();
        java.lang.Class<?> wildcardClass37 = obj0.getClass();
        java.lang.Class<?> wildcardClass38 = obj0.getClass();
        java.lang.Class<?> wildcardClass39 = obj0.getClass();
        java.lang.Class<?> wildcardClass40 = obj0.getClass();
        java.lang.Class<?> wildcardClass41 = obj0.getClass();
        java.lang.Class<?> wildcardClass42 = obj0.getClass();
        java.lang.Class<?> wildcardClass43 = obj0.getClass();
        java.lang.Class<?> wildcardClass44 = obj0.getClass();
        java.lang.Class<?> wildcardClass45 = obj0.getClass();
        java.lang.Class<?> wildcardClass46 = obj0.getClass();
        java.lang.Class<?> wildcardClass47 = obj0.getClass();
        java.lang.Class<?> wildcardClass48 = obj0.getClass();
        java.lang.Class<?> wildcardClass49 = obj0.getClass();
        java.lang.Class<?> wildcardClass50 = obj0.getClass();
        java.lang.Class<?> wildcardClass51 = obj0.getClass();
        java.lang.Class<?> wildcardClass52 = obj0.getClass();
        java.lang.Class<?> wildcardClass53 = obj0.getClass();
        java.lang.Class<?> wildcardClass54 = obj0.getClass();
        java.lang.Class<?> wildcardClass55 = obj0.getClass();
        java.lang.Class<?> wildcardClass56 = obj0.getClass();
        java.lang.Class<?> wildcardClass57 = obj0.getClass();
        java.lang.Class<?> wildcardClass58 = obj0.getClass();
        java.lang.Class<?> wildcardClass59 = obj0.getClass();
        java.lang.Class<?> wildcardClass60 = obj0.getClass();
        java.lang.Class<?> wildcardClass61 = obj0.getClass();
        java.lang.Class<?> wildcardClass62 = obj0.getClass();
        java.lang.Class<?> wildcardClass63 = obj0.getClass();
        java.lang.Class<?> wildcardClass64 = obj0.getClass();
        java.lang.Class<?> wildcardClass65 = obj0.getClass();
        java.lang.Class<?> wildcardClass66 = obj0.getClass();
        java.lang.Class<?> wildcardClass67 = obj0.getClass();
        java.lang.Class<?> wildcardClass68 = obj0.getClass();
        java.lang.Class<?> wildcardClass69 = obj0.getClass();
        java.lang.Class<?> wildcardClass70 = obj0.getClass();
        java.lang.Class<?> wildcardClass71 = obj0.getClass();
        java.lang.Class<?> wildcardClass72 = obj0.getClass();
        java.lang.Class<?> wildcardClass73 = obj0.getClass();
        java.lang.Class<?> wildcardClass74 = obj0.getClass();
        java.lang.Class<?> wildcardClass75 = obj0.getClass();
        java.lang.Class<?> wildcardClass76 = obj0.getClass();
        java.lang.Class<?> wildcardClass77 = obj0.getClass();
        java.lang.Class<?> wildcardClass78 = obj0.getClass();
        java.lang.Class<?> wildcardClass79 = obj0.getClass();
        java.lang.Class<?> wildcardClass80 = obj0.getClass();
        java.lang.Class<?> wildcardClass81 = obj0.getClass();
        java.lang.Class<?> wildcardClass82 = obj0.getClass();
        java.lang.Class<?> wildcardClass83 = obj0.getClass();
        java.lang.Class<?> wildcardClass84 = obj0.getClass();
        java.lang.Class<?> wildcardClass85 = obj0.getClass();
        java.lang.Class<?> wildcardClass86 = obj0.getClass();
        java.lang.Class<?> wildcardClass87 = obj0.getClass();
        java.lang.Class<?> wildcardClass88 = obj0.getClass();
        java.lang.Class<?> wildcardClass89 = obj0.getClass();
        java.lang.Class<?> wildcardClass90 = obj0.getClass();
        java.lang.Class<?> wildcardClass91 = obj0.getClass();
        java.lang.Class<?> wildcardClass92 = obj0.getClass();
        java.lang.Class<?> wildcardClass93 = obj0.getClass();
        java.lang.Class<?> wildcardClass94 = obj0.getClass();
        java.lang.Class<?> wildcardClass95 = obj0.getClass();
        java.lang.Class<?> wildcardClass96 = obj0.getClass();
        java.lang.Class<?> wildcardClass97 = obj0.getClass();
        java.lang.Class<?> wildcardClass98 = obj0.getClass();
        java.lang.Class<?> wildcardClass99 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertNotNull(wildcardClass88);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNotNull(wildcardClass90);
        org.junit.Assert.assertNotNull(wildcardClass91);
        org.junit.Assert.assertNotNull(wildcardClass92);
        org.junit.Assert.assertNotNull(wildcardClass93);
        org.junit.Assert.assertNotNull(wildcardClass94);
        org.junit.Assert.assertNotNull(wildcardClass95);
        org.junit.Assert.assertNotNull(wildcardClass96);
        org.junit.Assert.assertNotNull(wildcardClass97);
        org.junit.Assert.assertNotNull(wildcardClass98);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }
}

