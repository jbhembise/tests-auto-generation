package jbhembise.testauto.example5;

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
        java.lang.String str14 = user2.getFirstName();
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
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
        java.lang.String str19 = user2.getLastName();
        java.lang.String str20 = user2.getLastName();
        jbhembise.testauto.example5.Media media21 = null;
        user2.borrow(media21);
        java.lang.String str23 = user2.getFirstName();
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
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
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
        java.lang.Class<?> wildcardClass18 = user2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
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
        java.lang.String str12 = user2.getLastName();
        java.lang.String str13 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.String str7 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass9 = mediaList8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.Class<?> wildcardClass4 = user2.getClass();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getFirstName();
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getFirstName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.String str10 = user2.getLastName();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.lang.String str13 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "hi!");
        java.lang.String str3 = user2.getFirstName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
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
        java.lang.String str14 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.String str16 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList5 = user2.getBorrowedMedias();
        java.lang.String str6 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(mediaList7);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.String str7 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "hi!");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList8);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.String str6 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getFirstName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
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
        java.lang.String str15 = user2.getFirstName();
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
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
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        java.lang.String str17 = user2.getFirstName();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
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
        java.lang.String str14 = user2.getFirstName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
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
        java.lang.String str14 = user2.getFirstName();
        java.lang.String str15 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
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
        java.lang.String str13 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
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
        java.lang.String str12 = user2.getFirstName();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
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
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass9 = mediaList8.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.String str6 = user2.getLastName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        java.lang.String str14 = user2.getFirstName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
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
        jbhembise.testauto.example5.Media media15 = null;
        user2.borrow(media15);
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
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass9 = mediaList8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
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
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        java.lang.String str16 = user2.getLastName();
        java.lang.String str17 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList18 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertNotNull(mediaList18);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(mediaList12);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
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
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
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
        jbhembise.testauto.example5.Media media15 = null;
        user2.borrow(media15);
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
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
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
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        java.lang.String str16 = user2.getFirstName();
        java.lang.Class<?> wildcardClass17 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        java.util.List<jbhembise.testauto.example5.Media> mediaList16 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertNotNull(mediaList16);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList4);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.String str6 = user2.getLastName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
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
        java.lang.String str12 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(mediaList13);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
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
        jbhembise.testauto.example5.Media media18 = null;
        user2.borrow(media18);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
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
        java.lang.String str14 = user2.getFirstName();
        jbhembise.testauto.example5.Media media15 = null;
        user2.borrow(media15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getFirstName();
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getFirstName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(mediaList9);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.String str6 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(mediaList10);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "hi!");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.lang.String str4 = user2.getLastName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getFirstName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass10 = mediaList9.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
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
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
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
        java.lang.String str14 = user2.getFirstName();
        java.lang.String str15 = user2.getFirstName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList5 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList5);
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(mediaList11);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
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
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        jbhembise.testauto.example5.Media media15 = null;
        user2.borrow(media15);
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
        java.lang.String str12 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
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
        java.lang.String str13 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(mediaList14);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
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
        java.lang.Class<?> wildcardClass16 = user2.getClass();
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
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getFirstName();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        java.lang.String str14 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
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
        java.lang.String str19 = user2.getLastName();
        java.lang.String str20 = user2.getLastName();
        jbhembise.testauto.example5.Media media21 = null;
        user2.borrow(media21);
        java.util.List<jbhembise.testauto.example5.Media> mediaList23 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass24 = mediaList23.getClass();
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
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertNotNull(mediaList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
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
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(mediaList10);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.Class<?> wildcardClass4 = user2.getClass();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getLastName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "hi!");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.lang.String str4 = user2.getLastName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass12 = mediaList11.getClass();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
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
        java.lang.String str15 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList16 = user2.getBorrowedMedias();
        java.lang.String str17 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList18 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNotNull(mediaList16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList18);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
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
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        java.util.List<jbhembise.testauto.example5.Media> mediaList16 = user2.getBorrowedMedias();
        java.lang.String str17 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList18 = user2.getBorrowedMedias();
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
        org.junit.Assert.assertNotNull(mediaList16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList18);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getFirstName();
        java.lang.String str12 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
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
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
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
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        java.lang.String str16 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
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
        java.lang.String str16 = user2.getFirstName();
        jbhembise.testauto.example5.Media media17 = null;
        user2.borrow(media17);
        java.lang.String str19 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getLastName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(mediaList8);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.lang.String str13 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
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
        java.lang.String str14 = user2.getLastName();
        jbhembise.testauto.example5.Media media15 = null;
        user2.borrow(media15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
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
        java.lang.String str14 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
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
        jbhembise.testauto.example5.Media media17 = null;
        user2.borrow(media17);
        java.lang.Class<?> wildcardClass19 = user2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getFirstName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.String str10 = user2.getFirstName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(mediaList10);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
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
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        java.lang.String str16 = user2.getFirstName();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.lang.String str9 = user2.getFirstName();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.String str6 = user2.getFirstName();
        java.lang.String str7 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList8);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getLastName();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(mediaList11);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
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
        java.lang.String str16 = user2.getFirstName();
        java.lang.String str17 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList18 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertNotNull(mediaList18);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
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
        java.lang.String str12 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList16 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertNotNull(mediaList16);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass16 = mediaList15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.String str10 = user2.getLastName();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
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
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        jbhembise.testauto.example5.Media media18 = null;
        user2.borrow(media18);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(mediaList15);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList10);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
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
        java.lang.String str15 = user2.getLastName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(mediaList11);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(mediaList7);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.lang.String str7 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getLastName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(mediaList14);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(mediaList10);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList13);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.Class<?> wildcardClass4 = user2.getClass();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNotNull(mediaList6);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
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
        java.lang.String str14 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass16 = mediaList15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "");
        java.lang.String str3 = user2.getLastName();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        java.lang.String str6 = user2.getFirstName();
        java.lang.String str7 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getLastName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
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
        java.lang.String str13 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList14);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
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
        java.lang.String str12 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList19 = user2.getBorrowedMedias();
        java.lang.String str20 = user2.getFirstName();
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
        org.junit.Assert.assertNotNull(mediaList19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
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
        java.lang.String str15 = user2.getFirstName();
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertNotNull(mediaList14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getFirstName();
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getFirstName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.String str11 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.String str10 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.String str16 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
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
        java.lang.Class<?> wildcardClass12 = mediaList11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
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
        java.lang.String str15 = user2.getFirstName();
        java.lang.String str16 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
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
        java.lang.String str14 = user2.getLastName();
        java.lang.String str15 = user2.getLastName();
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        jbhembise.testauto.example5.Media media17 = null;
        user2.borrow(media17);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.String str11 = user2.getFirstName();
        java.lang.String str12 = user2.getLastName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList5 = user2.getBorrowedMedias();
        java.lang.String str6 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(mediaList5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
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
        java.lang.String str15 = user2.getFirstName();
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getLastName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass15 = mediaList14.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertNotNull(mediaList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getLastName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
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
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        java.lang.String str14 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.String str16 = user2.getLastName();
        java.lang.Class<?> wildcardClass17 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.String str6 = user2.getLastName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getFirstName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
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
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.lang.String str15 = user2.getFirstName();
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        java.lang.Class<?> wildcardClass18 = user2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.Class<?> wildcardClass4 = user2.getClass();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getLastName();
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getFirstName();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        java.lang.String str6 = user2.getFirstName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "hi!");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        java.lang.String str6 = user2.getLastName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
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
        java.lang.String str15 = user2.getFirstName();
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
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
        java.lang.String str16 = user2.getLastName();
        java.lang.String str17 = user2.getLastName();
        java.lang.Class<?> wildcardClass18 = user2.getClass();
        jbhembise.testauto.example5.Media media19 = null;
        user2.borrow(media19);
        java.lang.String str21 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(mediaList8);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
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
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.lang.String str15 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.Class<?> wildcardClass4 = user2.getClass();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getLastName();
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList10);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getLastName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        java.lang.String str16 = user2.getLastName();
        java.lang.String str17 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.String str6 = user2.getLastName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        java.lang.String str14 = user2.getFirstName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
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
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        jbhembise.testauto.example5.Media media15 = null;
        user2.borrow(media15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        java.lang.String str6 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(mediaList11);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
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
        java.lang.String str16 = user2.getLastName();
        java.lang.Class<?> wildcardClass17 = user2.getClass();
        jbhembise.testauto.example5.Media media18 = null;
        user2.borrow(media18);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
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
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        java.lang.String str16 = user2.getFirstName();
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getFirstName();
        java.lang.String str6 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass12 = mediaList11.getClass();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getLastName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass12 = mediaList11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = mediaList7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
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
        java.lang.Class<?> wildcardClass12 = mediaList11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
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
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getFirstName();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.lang.String str12 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList13);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
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
        java.lang.String str15 = user2.getFirstName();
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        jbhembise.testauto.example5.Media media18 = null;
        user2.borrow(media18);
        java.lang.String str20 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
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
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
        jbhembise.testauto.example5.Media media15 = null;
        user2.borrow(media15);
        java.util.List<jbhembise.testauto.example5.Media> mediaList17 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(mediaList17);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
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
        java.lang.String str13 = user2.getFirstName();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
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
        java.lang.String str15 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList16 = user2.getBorrowedMedias();
        java.lang.String str17 = user2.getFirstName();
        java.lang.String str18 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNotNull(mediaList16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getLastName();
        java.lang.String str12 = user2.getLastName();
        java.lang.String str13 = user2.getLastName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(mediaList14);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(mediaList14);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getLastName();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.lang.String str13 = user2.getFirstName();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(mediaList12);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.String str11 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
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
        java.lang.String str14 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
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
        java.lang.String str13 = user2.getLastName();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(mediaList15);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
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
        java.lang.String str12 = user2.getLastName();
        java.lang.String str13 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
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
        java.lang.String str14 = user2.getFirstName();
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(mediaList8);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getFirstName();
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getFirstName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getLastName();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(mediaList11);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
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
        java.lang.String str12 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(mediaList13);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.String str16 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "hi!");
        java.lang.String str3 = user2.getLastName();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        java.lang.String str8 = user2.getLastName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getLastName();
        java.lang.String str13 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList11);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.lang.String str13 = user2.getLastName();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.String str6 = user2.getLastName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
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
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        java.lang.String str14 = user2.getFirstName();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
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
        java.lang.String str17 = user2.getLastName();
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
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getFirstName();
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getFirstName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        jbhembise.testauto.example5.Media media18 = null;
        user2.borrow(media18);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
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
        java.lang.String str15 = user2.getFirstName();
        java.lang.String str16 = user2.getFirstName();
        java.lang.String str17 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
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
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.lang.String str15 = user2.getFirstName();
        java.lang.String str16 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList17 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList18 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass19 = mediaList18.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList17);
        org.junit.Assert.assertNotNull(mediaList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "hi!");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.lang.String str6 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList5 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(mediaList13);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getFirstName();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getLastName();
        java.lang.String str12 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
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
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass15 = mediaList14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(mediaList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
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
        java.lang.String str12 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
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
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
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
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList5 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.String str10 = user2.getLastName();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.lang.String str13 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList14);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass15 = mediaList14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertNotNull(mediaList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getLastName();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        java.lang.String str14 = user2.getLastName();
        jbhembise.testauto.example5.Media media15 = null;
        user2.borrow(media15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        java.lang.String str6 = user2.getFirstName();
        java.lang.String str7 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(mediaList13);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.String str10 = user2.getLastName();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.lang.String str12 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
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
        java.lang.String str15 = user2.getLastName();
        java.lang.String str16 = user2.getFirstName();
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.String str11 = user2.getLastName();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getFirstName();
        java.lang.String str6 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.String str11 = user2.getLastName();
        java.lang.String str12 = user2.getFirstName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
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
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
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
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getLastName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
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
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.lang.String str15 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
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
        java.lang.String str13 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(mediaList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(mediaList9);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "hi!");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getFirstName();
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        java.lang.String str8 = user2.getLastName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getFirstName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getFirstName();
        java.lang.String str12 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getLastName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getFirstName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getFirstName();
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getFirstName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getFirstName();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getFirstName();
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
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertNotNull(mediaList14);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
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
        jbhembise.testauto.example5.Media media15 = null;
        user2.borrow(media15);
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
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.String str16 = user2.getLastName();
        java.lang.String str17 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList18 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertNotNull(mediaList18);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getFirstName();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getLastName();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.lang.String str12 = user2.getLastName();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.String str6 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList10);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
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
        java.lang.String str16 = user2.getLastName();
        java.lang.String str17 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
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
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getLastName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        org.junit.Assert.assertNotNull(mediaList15);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        java.lang.String str15 = user2.getLastName();
        java.lang.String str16 = user2.getFirstName();
        java.lang.String str17 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList17 = user2.getBorrowedMedias();
        java.lang.String str18 = user2.getFirstName();
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
        org.junit.Assert.assertNotNull(mediaList17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getFirstName();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass10 = mediaList9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
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
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        java.lang.String str13 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
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
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
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
        java.lang.String str13 = user2.getFirstName();
        java.lang.String str14 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
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
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
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
        java.lang.String str13 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getFirstName();
        java.lang.String str6 = user2.getLastName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getFirstName();
        java.lang.String str6 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getLastName();
        java.lang.String str12 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.String str16 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
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
        java.lang.String str16 = user2.getFirstName();
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getFirstName();
        java.lang.String str12 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
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
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.lang.String str15 = user2.getFirstName();
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        java.lang.Class<?> wildcardClass18 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        java.lang.String str14 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        org.junit.Assert.assertNotNull(mediaList3);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getFirstName();
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getFirstName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        java.lang.String str6 = user2.getFirstName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(mediaList12);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.Class<?> wildcardClass4 = user2.getClass();
        java.lang.String str5 = user2.getFirstName();
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "hi!");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
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
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        java.lang.String str16 = user2.getLastName();
        jbhembise.testauto.example5.Media media17 = null;
        user2.borrow(media17);
        jbhembise.testauto.example5.Media media19 = null;
        user2.borrow(media19);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getLastName();
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.lang.String str13 = user2.getFirstName();
        java.lang.String str14 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
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
        java.lang.String str15 = user2.getLastName();
        java.lang.String str16 = user2.getFirstName();
        java.lang.Class<?> wildcardClass17 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList19 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass20 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList21 = user2.getBorrowedMedias();
        java.lang.String str22 = user2.getFirstName();
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
        org.junit.Assert.assertNotNull(mediaList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(mediaList21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
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
        java.lang.String str14 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList16 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media17 = null;
        user2.borrow(media17);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertNotNull(mediaList16);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getFirstName();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
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
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
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
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getFirstName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass10 = mediaList9.getClass();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
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
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
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
        java.lang.String str17 = user2.getLastName();
        jbhembise.testauto.example5.Media media18 = null;
        user2.borrow(media18);
        java.lang.String str20 = user2.getFirstName();
        jbhembise.testauto.example5.Media media21 = null;
        user2.borrow(media21);
        java.lang.String str23 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList5 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getFirstName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList5 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "hi!");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass4 = user2.getClass();
        java.lang.String str5 = user2.getLastName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList16 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertNotNull(mediaList16);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
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
        java.lang.Class<?> wildcardClass13 = mediaList12.getClass();
        java.lang.Class<?> wildcardClass14 = mediaList12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getLastName();
        java.lang.String str12 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
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
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.lang.String str15 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "hi!");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        java.lang.String str14 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList5 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(mediaList10);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
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
        java.lang.String str15 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
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
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass11 = mediaList10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
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
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
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
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.String str11 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.lang.String str12 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
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
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getFirstName();
        java.lang.String str12 = user2.getLastName();
        java.lang.String str13 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getLastName();
        java.lang.String str13 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
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
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        java.lang.String str18 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
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
        java.lang.String str15 = user2.getFirstName();
        java.lang.String str16 = user2.getFirstName();
        java.lang.String str17 = user2.getFirstName();
        java.lang.String str18 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getFirstName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList5 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getLastName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        java.lang.String str14 = user2.getFirstName();
        java.lang.String str15 = user2.getFirstName();
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getFirstName();
        java.lang.String str6 = user2.getLastName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
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
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList16 = user2.getBorrowedMedias();
        java.lang.String str17 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(mediaList16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.String str11 = user2.getLastName();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        java.lang.String str13 = user2.getFirstName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.String str6 = user2.getFirstName();
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.String str10 = user2.getFirstName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
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
        java.lang.String str15 = user2.getLastName();
        java.lang.String str16 = user2.getFirstName();
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
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
        java.lang.String str14 = user2.getLastName();
        jbhembise.testauto.example5.Media media15 = null;
        user2.borrow(media15);
        jbhembise.testauto.example5.Media media17 = null;
        user2.borrow(media17);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
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
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.lang.String str15 = user2.getFirstName();
        java.lang.String str16 = user2.getLastName();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
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
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.String str16 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(mediaList7);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList17 = user2.getBorrowedMedias();
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
        org.junit.Assert.assertNotNull(mediaList17);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
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
        java.lang.String str14 = user2.getFirstName();
        jbhembise.testauto.example5.Media media15 = null;
        user2.borrow(media15);
        java.lang.Class<?> wildcardClass17 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.Class<?> wildcardClass4 = user2.getClass();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(mediaList7);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
        java.lang.String str12 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
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
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        java.lang.String str16 = user2.getFirstName();
        java.lang.String str17 = user2.getLastName();
        java.lang.Class<?> wildcardClass18 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
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
        java.lang.String str14 = user2.getFirstName();
        java.lang.String str15 = user2.getLastName();
        java.lang.String str16 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
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
        java.lang.String str14 = user2.getLastName();
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getLastName();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
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
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList5 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getLastName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList12);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getFirstName();
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getFirstName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
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
        java.lang.String str13 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
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
        java.lang.String str12 = user2.getFirstName();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
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
        jbhembise.testauto.example5.Media media15 = null;
        user2.borrow(media15);
        java.util.List<jbhembise.testauto.example5.Media> mediaList17 = user2.getBorrowedMedias();
        java.lang.String str18 = user2.getFirstName();
        java.lang.String str19 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(mediaList17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.lang.String str15 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList16 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList17 = user2.getBorrowedMedias();
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList16);
        org.junit.Assert.assertNotNull(mediaList17);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.String str11 = user2.getFirstName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
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
        java.lang.String str13 = user2.getFirstName();
        java.lang.String str14 = user2.getLastName();
        java.lang.String str15 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
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
        java.lang.Class<?> wildcardClass18 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "hi!");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.Class<?> wildcardClass4 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList5 = user2.getBorrowedMedias();
        java.lang.String str6 = user2.getFirstName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(mediaList5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getLastName();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass15 = mediaList14.getClass();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getFirstName();
        java.lang.String str4 = user2.getLastName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getFirstName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getFirstName();
        java.lang.String str6 = user2.getLastName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
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
        java.lang.String str12 = user2.getLastName();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass15 = mediaList14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(mediaList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
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
        jbhembise.testauto.example5.Media media17 = null;
        user2.borrow(media17);
        java.lang.Class<?> wildcardClass19 = user2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
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
        java.lang.Class<?> wildcardClass15 = user2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass11 = mediaList10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList12);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "hi!");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.lang.String str4 = user2.getLastName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getLastName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
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
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "hi!");
        java.lang.String str3 = user2.getLastName();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
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
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
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
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList16 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass17 = mediaList16.getClass();
        java.lang.Class<?> wildcardClass18 = mediaList16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(mediaList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
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
        java.lang.String str18 = user2.getFirstName();
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
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(mediaList11);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
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
        jbhembise.testauto.example5.Media media15 = null;
        user2.borrow(media15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "hi!");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.Class<?> wildcardClass4 = user2.getClass();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getFirstName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
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
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(mediaList12);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
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
        java.lang.String str14 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.lang.String str13 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
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
        java.lang.String str13 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
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
        java.lang.String str17 = user2.getLastName();
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        java.lang.String str6 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(mediaList10);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
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
        java.lang.String str17 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList18 = user2.getBorrowedMedias();
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertNotNull(mediaList18);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
        jbhembise.testauto.example5.Media media15 = null;
        user2.borrow(media15);
        java.util.List<jbhembise.testauto.example5.Media> mediaList17 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media18 = null;
        user2.borrow(media18);
        java.lang.String str20 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList17);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList5 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
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
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        java.lang.String str16 = user2.getLastName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "hi!");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.lang.String str4 = user2.getLastName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getLastName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getLastName();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
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
        java.lang.Class<?> wildcardClass13 = mediaList12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(mediaList12);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
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
        java.lang.String str14 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertNotNull(mediaList14);
        org.junit.Assert.assertNotNull(mediaList15);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
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
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        jbhembise.testauto.example5.Media media17 = null;
        user2.borrow(media17);
        jbhembise.testauto.example5.Media media19 = null;
        user2.borrow(media19);
        java.util.List<jbhembise.testauto.example5.Media> mediaList21 = user2.getBorrowedMedias();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(mediaList21);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.String str10 = user2.getLastName();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.lang.String str12 = user2.getLastName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
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
        java.lang.String str14 = user2.getLastName();
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
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
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
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getFirstName();
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getFirstName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
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
        java.lang.String str12 = user2.getLastName();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.String str16 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList17 = user2.getBorrowedMedias();
        java.lang.String str18 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNotNull(mediaList17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getFirstName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "hi!");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getLastName();
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.String str10 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
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
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList14);
        org.junit.Assert.assertNotNull(mediaList15);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass9 = mediaList8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
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
        java.lang.String str18 = user2.getFirstName();
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
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
        java.lang.Class<?> wildcardClass18 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
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
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        jbhembise.testauto.example5.Media media17 = null;
        user2.borrow(media17);
        jbhembise.testauto.example5.Media media19 = null;
        user2.borrow(media19);
        java.lang.String str21 = user2.getLastName();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getLastName();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.lang.String str12 = user2.getLastName();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        java.lang.String str14 = user2.getFirstName();
        java.lang.String str15 = user2.getFirstName();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList18);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
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
        java.lang.String str15 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
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
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getFirstName();
        java.lang.String str15 = user2.getFirstName();
        java.lang.String str16 = user2.getFirstName();
        java.lang.String str17 = user2.getFirstName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getLastName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(mediaList15);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        java.lang.String str17 = user2.getFirstName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
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
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        java.lang.String str16 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
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
        java.lang.String str14 = user2.getLastName();
        java.lang.String str15 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList16 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass17 = user2.getClass();
        java.lang.String str18 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNotNull(mediaList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList17 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass18 = mediaList17.getClass();
        java.lang.Class<?> wildcardClass19 = mediaList17.getClass();
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
        org.junit.Assert.assertNotNull(mediaList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "hi!");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.lang.String str4 = user2.getLastName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.String str10 = user2.getLastName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
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
        java.lang.String str12 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        java.lang.String str14 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "hi!");
        java.lang.String str3 = user2.getLastName();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.String str7 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass9 = mediaList8.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
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
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList16 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList17 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(mediaList16);
        org.junit.Assert.assertNotNull(mediaList17);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(mediaList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
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
        java.lang.String str17 = user2.getLastName();
        jbhembise.testauto.example5.Media media18 = null;
        user2.borrow(media18);
        java.lang.String str20 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList21 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media22 = null;
        user2.borrow(media22);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList21);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "hi!");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.lang.String str4 = user2.getLastName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
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
        java.lang.String str12 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(mediaList13);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
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
        java.lang.String str17 = user2.getFirstName();
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass7 = mediaList6.getClass();
        java.lang.Class<?> wildcardClass8 = mediaList6.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getFirstName();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getFirstName();
        java.lang.String str6 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getLastName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
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
        java.lang.String str13 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        java.lang.String str15 = user2.getLastName();
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
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
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getFirstName();
        java.lang.String str15 = user2.getFirstName();
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "hi!");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.lang.String str4 = user2.getLastName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        java.lang.String str14 = user2.getLastName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.Class<?> wildcardClass4 = user2.getClass();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.String str6 = user2.getLastName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList20 = user2.getBorrowedMedias();
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
        org.junit.Assert.assertNotNull(mediaList20);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList5 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.String str7 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getFirstName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(mediaList10);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getLastName();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.lang.String str12 = user2.getLastName();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        java.lang.String str14 = user2.getFirstName();
        java.lang.String str15 = user2.getFirstName();
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
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
        org.junit.Assert.assertNotNull(mediaList13);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getFirstName();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getFirstName();
        java.lang.String str6 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(mediaList7);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
        java.lang.Class<?> wildcardClass15 = user2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
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
        java.lang.String str13 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(mediaList14);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList11);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getFirstName();
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getFirstName();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.lang.String str15 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getLastName();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.lang.String str12 = user2.getLastName();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        java.lang.String str14 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.String str16 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
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
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass14 = mediaList13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "hi!");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getLastName();
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList8);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
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
        java.lang.String str13 = user2.getLastName();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
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
        java.lang.String str12 = user2.getLastName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass11 = mediaList10.getClass();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getLastName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        java.lang.String str17 = user2.getLastName();
        java.lang.String str18 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getLastName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
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
        java.lang.String str12 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList13);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
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
        org.junit.Assert.assertNotNull(mediaList13);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.String str6 = user2.getLastName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
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
        java.lang.String str14 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
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
        java.lang.Class<?> wildcardClass17 = user2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass14 = mediaList13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getFirstName();
        java.lang.String str6 = user2.getLastName();
        jbhembise.testauto.example5.Media media7 = null;
        user2.borrow(media7);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
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
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        java.lang.String str16 = user2.getLastName();
        java.lang.String str17 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        jbhembise.testauto.example5.Media media4 = null;
        user2.borrow(media4);
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getLastName();
        java.lang.String str13 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList14 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList14);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
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
        jbhembise.testauto.example5.Media media17 = null;
        user2.borrow(media17);
        java.lang.String str19 = user2.getLastName();
        jbhembise.testauto.example5.Media media20 = null;
        user2.borrow(media20);
        java.lang.String str22 = user2.getFirstName();
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
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        java.lang.String str11 = user2.getLastName();
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
        java.util.List<jbhembise.testauto.example5.Media> mediaList16 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList16);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
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
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        jbhembise.testauto.example5.Media media15 = null;
        user2.borrow(media15);
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
        jbhembise.testauto.example5.Media media19 = null;
        user2.borrow(media19);
        java.util.List<jbhembise.testauto.example5.Media> mediaList21 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media22 = null;
        user2.borrow(media22);
        java.lang.Class<?> wildcardClass24 = user2.getClass();
        java.lang.Class<?> wildcardClass25 = user2.getClass();
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
        org.junit.Assert.assertNotNull(mediaList21);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
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
        java.lang.String str15 = user2.getFirstName();
        java.lang.String str16 = user2.getLastName();
        java.lang.Class<?> wildcardClass17 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
        java.lang.String str13 = user2.getLastName();
        jbhembise.testauto.example5.Media media14 = null;
        user2.borrow(media14);
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example5.Media media8 = null;
        user2.borrow(media8);
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList10);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
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
        java.lang.String str13 = user2.getFirstName();
        java.lang.String str14 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.String str16 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
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
        java.lang.String str16 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(mediaList13);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
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
        jbhembise.testauto.example5.Media media20 = null;
        user2.borrow(media20);
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
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("", "hi!");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getLastName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
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
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media16 = null;
        user2.borrow(media16);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
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
        java.lang.Class<?> wildcardClass12 = mediaList11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        jbhembise.testauto.example5.Media media10 = null;
        user2.borrow(media10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
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
        java.lang.String str12 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList6 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.String str11 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        jbhembise.testauto.example5.Media media6 = null;
        user2.borrow(media6);
        java.util.List<jbhembise.testauto.example5.Media> mediaList8 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.util.List<jbhembise.testauto.example5.Media> mediaList11 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(mediaList11);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
        jbhembise.testauto.example5.Media media15 = null;
        user2.borrow(media15);
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
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example5.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getFirstName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList13 = user2.getBorrowedMedias();
        java.lang.String str14 = user2.getFirstName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList10 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        java.lang.String str13 = user2.getFirstName();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.util.List<jbhembise.testauto.example5.Media> mediaList15 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(mediaList15);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
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
        jbhembise.testauto.example5.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getLastName();
        java.lang.String str15 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getLastName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
        java.lang.String str17 = user2.getFirstName();
        java.lang.String str18 = user2.getLastName();
        java.lang.String str19 = user2.getFirstName();
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example5.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        jbhembise.testauto.example5.Media media11 = null;
        user2.borrow(media11);
        jbhembise.testauto.example5.Media media13 = null;
        user2.borrow(media13);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        jbhembise.testauto.example5.User user2 = new jbhembise.testauto.example5.User("hi!", "");
        java.util.List<jbhembise.testauto.example5.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example5.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example5.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass13 = mediaList12.getClass();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
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
        java.util.List<jbhembise.testauto.example5.Media> mediaList17 = user2.getBorrowedMedias();
        jbhembise.testauto.example5.Media media18 = null;
        user2.borrow(media18);
        java.util.List<jbhembise.testauto.example5.Media> mediaList20 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example5.Media> mediaList21 = user2.getBorrowedMedias();
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
        org.junit.Assert.assertNotNull(mediaList17);
        org.junit.Assert.assertNotNull(mediaList20);
        org.junit.Assert.assertNotNull(mediaList21);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
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
        java.lang.String str13 = user2.getFirstName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }
}

