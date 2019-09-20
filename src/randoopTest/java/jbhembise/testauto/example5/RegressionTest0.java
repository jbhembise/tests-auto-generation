package jbhembise.testauto.example5;

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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass12 = mediaList11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = mediaList7.getClass();
        java.lang.Class<?> wildcardClass9 = mediaList7.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass7 = mediaList6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = mediaList7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass5 = mediaList4.getClass();
        java.lang.Class<?> wildcardClass6 = mediaList4.getClass();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass13 = mediaList12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass4 = mediaList3.getClass();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass10 = mediaList9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass12 = mediaList11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(mediaList7);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.String str6 = user2.getFirstName();
        java.lang.String str7 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass14 = mediaList13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass12 = mediaList11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "hi!");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass4 = mediaList3.getClass();
        java.lang.Class<?> wildcardClass5 = mediaList3.getClass();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "hi!");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.Class<?> wildcardClass4 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList5 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass6 = mediaList5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(mediaList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList5 = user2.getBorrowedMedias();
        java.lang.String str6 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "hi!");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass4 = user2.getClass();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass10 = mediaList9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = mediaList7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList5 = user2.getBorrowedMedias();
        java.lang.String str6 = user2.getFirstName();
        java.lang.String str7 = user2.getLastName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        java.lang.String str6 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getLastName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList11);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "hi!");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.lang.String str4 = user2.getLastName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "hi!");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getLastName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        java.lang.String str14 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(mediaList13);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getFirstName();
        java.lang.String str12 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "hi!");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.Class<?> wildcardClass4 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList5 = user2.getBorrowedMedias();
        java.lang.String str6 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(mediaList5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "hi!");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.lang.String str4 = user2.getLastName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getLastName();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.Class<?> wildcardClass4 = user2.getClass();
        java.lang.String str5 = user2.getLastName();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass11 = mediaList10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList5 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(mediaList7);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass12 = mediaList11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.String str10 = user2.getLastName();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList5 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getFirstName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass12 = mediaList11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.String str6 = user2.getLastName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = mediaList7.getClass();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getLastName();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        jbhembise.testauto.example5.Media media15 = null;
        user2.borrow(media15);
        java.util.List<jbhembise.testauto.example5.Media> mediaList17 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(mediaList17);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getFirstName();
        java.lang.String str14 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList16 = user2.getBorrowedMedias();
        java.lang.String str17 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertNotNull(mediaList16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass9 = mediaList8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "hi!");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getFirstName();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass11 = mediaList10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.String str6 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = mediaList7.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.String str7 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertNotNull(mediaList13);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getFirstName();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        java.lang.String str16 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getFirstName();
        java.lang.String str14 = user2.getLastName();
        java.lang.String str15 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList16 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass17 = mediaList16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getLastName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getFirstName();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.lang.String str15 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList11);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        java.lang.String str14 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList5 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = mediaList7.getClass();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList10);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getFirstName();
        java.lang.String str6 = user2.getLastName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(mediaList8);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getFirstName();
        java.lang.String str12 = user2.getLastName();
        java.lang.String str13 = user2.getLastName();
        java.lang.String str14 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "hi!");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getFirstName();
        java.lang.String str14 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        java.lang.String str13 = user2.getFirstName();
        java.lang.String str14 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(mediaList15);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getLastName();
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        java.lang.String str8 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        java.lang.String str14 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(mediaList15);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.String str6 = user2.getLastName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(mediaList12);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getFirstName();
        java.lang.String str14 = user2.getLastName();
        java.lang.String str15 = user2.getFirstName();
        java.lang.String str16 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        java.lang.String str6 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "hi!");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.Class<?> wildcardClass4 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList5 = user2.getBorrowedMedias();
        java.lang.String str6 = user2.getFirstName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(mediaList5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.String str11 = user2.getFirstName();
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(mediaList14);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(mediaList9);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getFirstName();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.lang.String str15 = user2.getLastName();
        java.lang.String str16 = user2.getFirstName();
        java.lang.String str17 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList11);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getFirstName();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        java.lang.String str16 = user2.getLastName();
        java.lang.String str17 = user2.getFirstName();
        java.lang.String str18 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(mediaList12);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getFirstName();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getFirstName();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "hi!");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.lang.String str4 = user2.getLastName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getLastName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.lang.String str13 = user2.getLastName();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(mediaList14);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getLastName();
        java.lang.String str14 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList5 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.lang.String str9 = user2.getLastName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getFirstName();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.String str16 = user2.getLastName();
        java.lang.String str17 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList18 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass19 = mediaList18.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getLastName();
        java.lang.String str13 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getFirstName();
        java.lang.String str12 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass14 = mediaList13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getFirstName();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getLastName();
        java.lang.String str12 = user2.getFirstName();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getLastName();
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getFirstName();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList14);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getFirstName();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList5 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getLastName();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getLastName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(mediaList9);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "hi!");
        jbhembise.testauto.example5.Media media3 = null;
        user2.borrow(media3);
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.String str6 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass13 = mediaList12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getFirstName();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getLastName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getLastName();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        java.lang.String str16 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(mediaList11);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getFirstName();
        java.lang.String str6 = user2.getLastName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(mediaList9);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getLastName();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList16 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass17 = mediaList16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList14);
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertNotNull(mediaList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getLastName();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getLastName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.lang.String str12 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        java.lang.String str14 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass9 = mediaList8.getClass();
        java.lang.Class<?> wildcardClass10 = mediaList8.getClass();
        java.lang.Class<?> wildcardClass11 = mediaList8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.lang.String str15 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getFirstName();
        java.lang.String str12 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        java.lang.String str14 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        java.lang.Class<?> wildcardClass17 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getFirstName();
        java.lang.String str14 = user2.getLastName();
        java.lang.String str15 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList16 = user2.getBorrowedMedias();
        java.lang.String str17 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getLastName();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getLastName();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getFirstName();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getLastName();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        java.lang.Class<?> wildcardClass17 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList18 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(mediaList18);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getLastName();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        java.lang.String str17 = user2.getFirstName();
        java.lang.String str18 = user2.getLastName();
        java.lang.String str19 = user2.getFirstName();
        java.lang.String str20 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.String str11 = user2.getLastName();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.String str11 = user2.getFirstName();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.lang.String str15 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getFirstName();
        java.lang.String str14 = user2.getLastName();
        jbhembise.testauto.example5.Media media15 = null;
        user2.borrow(media15);
        java.lang.String str17 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.lang.String str13 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.lang.String str12 = user2.getFirstName();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getFirstName();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        java.lang.String str16 = user2.getFirstName();
        java.lang.String str17 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(mediaList13);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getLastName();
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass12 = mediaList11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.lang.String str12 = user2.getLastName();
        java.lang.String str13 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getFirstName();
        java.lang.String str12 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        java.lang.String str14 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.String str16 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList5 = user2.getBorrowedMedias();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList5);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass12 = mediaList11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass14 = mediaList13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getFirstName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getLastName();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getFirstName();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(mediaList12);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = mediaList7.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getLastName();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.lang.String str15 = user2.getFirstName();
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        jbhembise.testauto.example5.Media media18 = null;
        user2.borrow(media18);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "hi!");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.lang.String str4 = user2.getLastName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getLastName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getLastName();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getFirstName();
        java.lang.String str15 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList16 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNotNull(mediaList16);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getFirstName();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.lang.String str15 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList16 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList17 = user2.getBorrowedMedias();
        java.lang.String str18 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList16);
        org.junit.Assert.assertNotNull(mediaList17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getFirstName();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList13);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass13 = mediaList12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getLastName();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.String str16 = user2.getLastName();
        java.lang.String str17 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getFirstName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.String str10 = user2.getLastName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getFirstName();
        java.lang.String str14 = user2.getLastName();
        jbhembise.testauto.example5.Media media15 = null;
        user2.borrow(media15);
        jbhembise.testauto.example5.Media media17 = null;
        user2.borrow(media17);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        java.lang.String str8 = user2.getLastName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getFirstName();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.lang.String str15 = user2.getFirstName();
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.lang.String str7 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getFirstName();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getFirstName();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.String str16 = user2.getLastName();
        java.lang.String str17 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList18 = user2.getBorrowedMedias();
        java.lang.String str19 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getFirstName();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getLastName();
        java.lang.String str15 = user2.getLastName();
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "hi!");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.lang.String str4 = user2.getLastName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getFirstName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getFirstName();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.lang.String str15 = user2.getFirstName();
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.String str7 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList8);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getLastName();
        java.lang.String str13 = user2.getLastName();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.String str10 = user2.getLastName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getFirstName();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.lang.String str12 = user2.getFirstName();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "hi!");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.lang.String str4 = user2.getLastName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getLastName();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getLastName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getFirstName();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        java.lang.String str14 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList16 = user2.getBorrowedMedias();
        java.lang.String str17 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertNotNull(mediaList16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.lang.String str12 = user2.getLastName();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        jbhembise.testauto.example5.Media media15 = null;
        user2.borrow(media15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList5 = user2.getBorrowedMedias();
        java.lang.String str6 = user2.getLastName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getFirstName();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        java.lang.String str13 = user2.getLastName();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(mediaList9);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getLastName();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        java.util.List<jbhembise.testauto.example5.Media> mediaList16 = user2.getBorrowedMedias();
        java.lang.String str17 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(mediaList16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getLastName();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getLastName();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        java.lang.String str16 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getFirstName();
        java.lang.String str6 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = mediaList7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getLastName();
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        java.lang.String str8 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getLastName();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        java.lang.Class<?> wildcardClass17 = user2.getClass();
        java.lang.Class<?> wildcardClass18 = user2.getClass();
        java.lang.String str19 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList20 = user2.getBorrowedMedias();
        java.lang.String str21 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.lang.String str13 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.String str11 = user2.getLastName();
        java.lang.String str12 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass14 = mediaList13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getFirstName();
        java.lang.String str12 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        java.lang.String str14 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        java.lang.String str17 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getLastName();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.lang.String str15 = user2.getFirstName();
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        java.lang.Class<?> wildcardClass18 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(mediaList13);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getLastName();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        java.lang.String str13 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getFirstName();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getLastName();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getFirstName();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass9 = mediaList8.getClass();
        java.lang.Class<?> wildcardClass10 = mediaList8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.String str16 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getFirstName();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.String str16 = user2.getLastName();
        java.lang.String str17 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList18 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList19 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList18);
        org.junit.Assert.assertNotNull(mediaList19);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "hi!");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList8);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "hi!");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getFirstName();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getLastName();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        java.lang.String str17 = user2.getFirstName();
        java.lang.String str18 = user2.getLastName();
        java.lang.Class<?> wildcardClass19 = user2.getClass();
        java.lang.String str20 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(mediaList12);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getFirstName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.lang.String str4 = user2.getLastName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getFirstName();
        java.lang.String str6 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.lang.String str12 = user2.getLastName();
        java.lang.String str13 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(mediaList14);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertNotNull(mediaList13);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.Class<?> wildcardClass4 = user2.getClass();
        java.lang.String str5 = user2.getFirstName();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.String str7 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "hi!");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getFirstName();
        java.lang.String str12 = user2.getLastName();
        java.lang.String str13 = user2.getLastName();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        java.lang.String str16 = user2.getLastName();
        java.lang.String str17 = user2.getLastName();
        java.lang.String str18 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        java.lang.String str13 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        java.lang.String str15 = user2.getFirstName();
        java.lang.String str16 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getLastName();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass16 = mediaList15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        java.lang.String str15 = user2.getLastName();
        java.lang.String str16 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "hi!");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.lang.String str4 = user2.getLastName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getFirstName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getLastName();
        java.lang.String str14 = user2.getFirstName();
        java.lang.String str15 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList16 = user2.getBorrowedMedias();
        java.lang.String str17 = user2.getLastName();
        java.lang.String str18 = user2.getLastName();
        java.lang.String str19 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNotNull(mediaList16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.lang.String str12 = user2.getLastName();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(mediaList15);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.String str11 = user2.getFirstName();
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getLastName();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getLastName();
        java.lang.String str15 = user2.getFirstName();
        java.lang.String str16 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getFirstName();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        java.lang.String str13 = user2.getLastName();
        java.lang.String str14 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getLastName();
        java.lang.String str15 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        java.lang.String str6 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getLastName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        jbhembise.testauto.example5.Media media15 = null;
        user2.borrow(media15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass13 = mediaList12.getClass();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getLastName();
        java.lang.String str12 = user2.getLastName();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(mediaList14);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.lang.String str13 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(mediaList14);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getFirstName();
        java.lang.String str14 = user2.getFirstName();
        jbhembise.testauto.example5.Media media15 = null;
        user2.borrow(media15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getLastName();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getFirstName();
        java.lang.String str15 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList16 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList17 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNotNull(mediaList16);
        org.junit.Assert.assertNotNull(mediaList17);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertNotNull(mediaList15);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList5 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getFirstName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.lang.String str12 = user2.getLastName();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(mediaList14);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getFirstName();
        java.lang.String str6 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.lang.String str15 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getLastName();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.lang.String str13 = user2.getFirstName();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.lang.String str13 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media15 = null;
        user2.borrow(media15);
        java.lang.String str17 = user2.getLastName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertNotNull(mediaList14);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.Class<?> wildcardClass4 = user2.getClass();
        java.lang.String str5 = user2.getFirstName();
        java.lang.String str6 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media15 = null;
        user2.borrow(media15);
        java.util.List<jbhembise.testauto.example5.Media> mediaList17 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList14);
        org.junit.Assert.assertNotNull(mediaList17);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getFirstName();
        java.lang.String str12 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList5 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass6 = mediaList5.getClass();
        java.lang.Class<?> wildcardClass7 = mediaList5.getClass();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getLastName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.String str11 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList12);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList11);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getLastName();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getLastName();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getLastName();
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getFirstName();
        java.lang.String str14 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(mediaList14);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getFirstName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getLastName();
        java.lang.String str14 = user2.getFirstName();
        java.lang.String str15 = user2.getFirstName();
        java.lang.String str16 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.String str6 = user2.getFirstName();
        java.lang.String str7 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList8);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.lang.String str15 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getFirstName();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        java.lang.String str13 = user2.getLastName();
        java.lang.String str14 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(mediaList13);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getLastName();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.lang.String str15 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList16 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList16);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getFirstName();
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getFirstName();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getFirstName();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.lang.String str15 = user2.getFirstName();
        java.lang.String str16 = user2.getFirstName();
        java.lang.String str17 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getFirstName();
        java.lang.String str12 = user2.getFirstName();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getFirstName();
        java.lang.String str14 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList16 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media17 = null;
        user2.borrow(media17);
        java.lang.String str19 = user2.getFirstName();
        java.lang.String str20 = user2.getFirstName();
        java.lang.Class<?> wildcardClass21 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertNotNull(mediaList16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "hi!");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getLastName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.String str6 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList5 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.lang.String str9 = user2.getFirstName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass16 = mediaList15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(mediaList14);
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getLastName();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.lang.String str15 = user2.getLastName();
        java.lang.String str16 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "hi!");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.lang.String str4 = user2.getLastName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass4 = mediaList3.getClass();
        java.lang.Class<?> wildcardClass5 = mediaList3.getClass();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.String str11 = user2.getFirstName();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        java.util.List<jbhembise.testauto.example5.Media> mediaList16 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media17 = null;
        user2.borrow(media17);
        java.util.List<jbhembise.testauto.example5.Media> mediaList19 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(mediaList16);
        org.junit.Assert.assertNotNull(mediaList19);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getFirstName();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getFirstName();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(mediaList11);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getLastName();
        java.lang.String str14 = user2.getFirstName();
        jbhembise.testauto.example5.Media media15 = null;
        user2.borrow(media15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getFirstName();
        java.lang.String str6 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass11 = mediaList10.getClass();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getLastName();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getFirstName();
        java.lang.String str15 = user2.getLastName();
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        java.lang.String str18 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getLastName();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getFirstName();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        java.lang.String str16 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList17 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList18 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList19 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList17);
        org.junit.Assert.assertNotNull(mediaList18);
        org.junit.Assert.assertNotNull(mediaList19);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass16 = mediaList15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList5 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getLastName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.lang.String str12 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass10 = mediaList9.getClass();
        java.lang.Class<?> wildcardClass11 = mediaList9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.lang.String str13 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.String str11 = user2.getLastName();
        java.lang.String str12 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(mediaList13);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getFirstName();
        java.lang.String str12 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        java.lang.String str14 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.String str16 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getFirstName();
        java.lang.String str14 = user2.getLastName();
        jbhembise.testauto.example5.Media media15 = null;
        user2.borrow(media15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getLastName();
        java.lang.String str13 = user2.getLastName();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getFirstName();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.lang.String str12 = user2.getLastName();
        java.lang.String str13 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(mediaList14);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getLastName();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.lang.String str13 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getFirstName();
        java.lang.String str12 = user2.getLastName();
        java.lang.String str13 = user2.getLastName();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        java.lang.String str16 = user2.getLastName();
        jbhembise.testauto.example5.Media media17 = null;
        user2.borrow(media17);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getFirstName();
        java.lang.String str12 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertNotNull(mediaList14);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getLastName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.lang.String str12 = user2.getFirstName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        java.lang.String str6 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = mediaList7.getClass();
        java.lang.Class<?> wildcardClass9 = mediaList7.getClass();
        java.lang.Class<?> wildcardClass10 = mediaList7.getClass();
        java.lang.Class<?> wildcardClass11 = mediaList7.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        java.lang.String str13 = user2.getFirstName();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.lang.String str15 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getFirstName();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.lang.String str12 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getLastName();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getLastName();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.lang.String str12 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(mediaList13);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        java.lang.String str13 = user2.getFirstName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media15 = null;
        user2.borrow(media15);
        jbhembise.testauto.example5.Media media17 = null;
        user2.borrow(media17);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList14);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.String str11 = user2.getLastName();
        java.lang.String str12 = user2.getFirstName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.lang.String str12 = user2.getLastName();
        java.lang.String str13 = user2.getLastName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.lang.String str7 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getFirstName();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getFirstName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        java.lang.String str6 = user2.getLastName();
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getFirstName();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.lang.String str15 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList16 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass17 = user2.getClass();
        java.lang.String str18 = user2.getLastName();
        java.lang.String str19 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getFirstName();
        java.lang.String str14 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        java.lang.String str13 = user2.getLastName();
        java.lang.String str14 = user2.getLastName();
        java.lang.String str15 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "hi!");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.lang.String str4 = user2.getLastName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(mediaList10);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(mediaList12);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getFirstName();
        java.lang.String str12 = user2.getLastName();
        java.lang.String str13 = user2.getLastName();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        java.lang.String str15 = user2.getLastName();
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getFirstName();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        java.lang.String str16 = user2.getFirstName();
        jbhembise.testauto.example5.Media media17 = null;
        user2.borrow(media17);
        java.lang.String str19 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getLastName();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getFirstName();
        java.lang.String str15 = user2.getLastName();
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        java.util.List<jbhembise.testauto.example5.Media> mediaList18 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNotNull(mediaList18);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        java.util.List<jbhembise.testauto.example5.Media> mediaList16 = user2.getBorrowedMedias();
        java.lang.String str17 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(mediaList16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(mediaList8);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.lang.String str13 = user2.getLastName();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getFirstName();
        java.lang.String str6 = user2.getLastName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getFirstName();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList13);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getFirstName();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getLastName();
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getFirstName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.lang.String str12 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        java.lang.String str14 = user2.getFirstName();
        java.lang.String str15 = user2.getFirstName();
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        java.util.List<jbhembise.testauto.example5.Media> mediaList18 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList18);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getFirstName();
        java.lang.String str14 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getLastName();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.String str16 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList14);
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getLastName();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertNotNull(mediaList13);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media15 = null;
        user2.borrow(media15);
        jbhembise.testauto.example5.Media media17 = null;
        user2.borrow(media17);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList14);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.lang.String str12 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getFirstName();
        java.lang.String str12 = user2.getLastName();
        java.lang.String str13 = user2.getLastName();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        java.lang.String str17 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(mediaList10);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getFirstName();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(mediaList13);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList14);
        org.junit.Assert.assertNotNull(mediaList15);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertNotNull(mediaList13);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getLastName();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(mediaList15);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.String str11 = user2.getFirstName();
        java.lang.String str12 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getFirstName();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.lang.String str15 = user2.getLastName();
        java.lang.String str16 = user2.getFirstName();
        java.lang.Class<?> wildcardClass17 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.lang.String str12 = user2.getLastName();
        java.lang.String str13 = user2.getFirstName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getFirstName();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getLastName();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.lang.String str15 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getFirstName();
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList8);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList5 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList5);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(mediaList13);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(mediaList11);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getLastName();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        java.lang.String str16 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getFirstName();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.Class<?> wildcardClass4 = user2.getClass();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getFirstName();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.String str16 = user2.getLastName();
        java.lang.Class<?> wildcardClass17 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getFirstName();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.lang.String str15 = user2.getLastName();
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        jbhembise.testauto.example5.Media media18 = null;
        user2.borrow(media18);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList14);
        org.junit.Assert.assertNotNull(mediaList15);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getFirstName();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertNotNull(mediaList14);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getFirstName();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(mediaList12);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getFirstName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.lang.String str15 = user2.getFirstName();
        java.lang.String str16 = user2.getLastName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass14 = mediaList13.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.lang.String str15 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.String str7 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(mediaList9);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getLastName();
        java.lang.String str13 = user2.getFirstName();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getLastName();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getFirstName();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media15 = null;
        user2.borrow(media15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(mediaList14);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getFirstName();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.lang.String str15 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList16 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList17 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass18 = user2.getClass();
        java.lang.String str19 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList16);
        org.junit.Assert.assertNotNull(mediaList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getFirstName();
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.String str6 = user2.getLastName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getFirstName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        java.lang.String str14 = user2.getLastName();
        jbhembise.testauto.example5.Media media15 = null;
        user2.borrow(media15);
        java.lang.Class<?> wildcardClass17 = user2.getClass();
        java.lang.String str18 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "hi!");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getFirstName();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(mediaList12);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getFirstName();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.lang.String str15 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList16 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass17 = user2.getClass();
        jbhembise.testauto.example5.Media media18 = null;
        user2.borrow(media18);
        jbhembise.testauto.example5.Media media20 = null;
        user2.borrow(media20);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertNotNull(mediaList14);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getLastName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getLastName();
        java.lang.String str14 = user2.getLastName();
        jbhembise.testauto.example5.Media media15 = null;
        user2.borrow(media15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.String str6 = user2.getLastName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getLastName();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.lang.String str12 = user2.getLastName();
        java.lang.String str13 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList14);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getLastName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertNotNull(mediaList13);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getLastName();
        java.lang.String str12 = user2.getLastName();
        java.lang.String str13 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.Class<?> wildcardClass4 = user2.getClass();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(mediaList6);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getFirstName();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        java.util.List<jbhembise.testauto.example5.Media> mediaList16 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList16);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getLastName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getFirstName();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList14);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getFirstName();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getFirstName();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        java.lang.String str16 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList17 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList18 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass19 = user2.getClass();
        java.lang.String str20 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList17);
        org.junit.Assert.assertNotNull(mediaList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.lang.String str12 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(mediaList13);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertNotNull(mediaList14);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getFirstName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "hi!");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getLastName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getLastName();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getFirstName();
        java.lang.String str15 = user2.getLastName();
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        java.lang.Class<?> wildcardClass18 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(mediaList14);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList16 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(mediaList16);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList10);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.lang.String str12 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass14 = mediaList13.getClass();
        java.lang.Class<?> wildcardClass15 = mediaList13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(mediaList14);
        org.junit.Assert.assertNotNull(mediaList15);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        java.lang.String str14 = user2.getFirstName();
        java.lang.String str15 = user2.getFirstName();
        java.lang.String str16 = user2.getFirstName();
        java.lang.Class<?> wildcardClass17 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList18 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(mediaList18);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList11);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getFirstName();
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList8);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "hi!");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.Class<?> wildcardClass4 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList5 = user2.getBorrowedMedias();
        java.lang.String str6 = user2.getFirstName();
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(mediaList5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getFirstName();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.lang.String str13 = user2.getLastName();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getFirstName();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList10);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.lang.String str12 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "hi!");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "hi!");
        jbhembise.testauto.example5.Media media3 = null;
        user2.borrow(media3);
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.String str11 = user2.getFirstName();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.lang.String str15 = user2.getLastName();
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getFirstName();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.lang.String str12 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.String str11 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        java.lang.String str16 = user2.getFirstName();
        java.lang.String str17 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getLastName();
        java.lang.String str13 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(mediaList14);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(mediaList6);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getFirstName();
        java.lang.String str6 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getLastName();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        jbhembise.testauto.example5.Media media15 = null;
        user2.borrow(media15);
        java.lang.Class<?> wildcardClass17 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList5 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getLastName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList10);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "hi!");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.Class<?> wildcardClass4 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList5 = user2.getBorrowedMedias();
        java.lang.String str6 = user2.getFirstName();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(mediaList5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertNotNull(mediaList14);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getLastName();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        java.lang.Class<?> wildcardClass17 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getLastName();
        java.lang.String str12 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getLastName();
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.lang.String str9 = user2.getLastName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        java.lang.String str14 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getLastName();
        java.lang.String str15 = user2.getLastName();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.lang.String str9 = user2.getLastName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getLastName();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getFirstName();
        java.lang.String str14 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList16 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media17 = null;
        user2.borrow(media17);
        java.util.List<jbhembise.testauto.example5.Media> mediaList19 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media20 = null;
        user2.borrow(media20);
        java.lang.String str22 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList23 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertNotNull(mediaList16);
        org.junit.Assert.assertNotNull(mediaList19);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList23);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getLastName();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList13);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getFirstName();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.lang.String str15 = user2.getLastName();
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        java.lang.Class<?> wildcardClass18 = user2.getClass();
        jbhembise.testauto.example5.Media media19 = null;
        user2.borrow(media19);
        java.lang.String str21 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        java.lang.String str16 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getFirstName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "hi!");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.lang.String str4 = user2.getLastName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = mediaList7.getClass();
        java.lang.Class<?> wildcardClass9 = mediaList7.getClass();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getFirstName();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList13);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getFirstName();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        java.lang.String str18 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList11);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getLastName();
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.lang.String str9 = user2.getLastName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getFirstName();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        jbhembise.testauto.example5.Media media15 = null;
        user2.borrow(media15);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getLastName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getLastName();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getLastName();
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.String str6 = user2.getLastName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getLastName();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        java.lang.String str13 = user2.getLastName();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getLastName();
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.String str10 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList12);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getLastName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }
}

