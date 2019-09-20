package jbhembise.testauto.example6;

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
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example6.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example6.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "hi!");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getFirstName();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.String str7 = user2.getFirstName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example6.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList12 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example6.Media> mediaList13 = user2.getBorrowedMedias();
        java.lang.String str14 = user2.getLastName();
        java.lang.String str15 = user2.getLastName();
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.String str7 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.util.List<jbhembise.testauto.example6.Media> mediaList10 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList10);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        jbhembise.testauto.example6.Media media9 = null;
        user2.borrow(media9);
        jbhembise.testauto.example6.Media media11 = null;
        user2.borrow(media11);
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.util.List<jbhembise.testauto.example6.Media> mediaList15 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example6.Media> mediaList16 = user2.getBorrowedMedias();
        java.lang.String str17 = user2.getLastName();
        java.lang.String str18 = user2.getFirstName();
        java.lang.String str19 = user2.getFirstName();
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example6.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getLastName();
        java.lang.String str14 = user2.getLastName();
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        jbhembise.testauto.example6.Media media4 = null;
        user2.borrow(media4);
        java.lang.String str6 = user2.getLastName();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList10 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(mediaList10);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.util.List<jbhembise.testauto.example6.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example6.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getFirstName();
        jbhembise.testauto.example6.Media media6 = null;
        user2.borrow(media6);
        java.util.List<jbhembise.testauto.example6.Media> mediaList8 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example6.Media> mediaList9 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(mediaList9);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example6.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getFirstName();
        java.lang.String str14 = user2.getLastName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList15 = user2.getBorrowedMedias();
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
        org.junit.Assert.assertNotNull(mediaList15);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.util.List<jbhembise.testauto.example6.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example6.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        jbhembise.testauto.example6.Media media7 = null;
        user2.borrow(media7);
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.lang.String str12 = user2.getLastName();
        java.lang.String str13 = user2.getFirstName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        jbhembise.testauto.example6.Media media12 = null;
        user2.borrow(media12);
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.util.List<jbhembise.testauto.example6.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        java.util.List<jbhembise.testauto.example6.Media> mediaList17 = user2.getBorrowedMedias();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(mediaList17);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example6.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getFirstName();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        jbhembise.testauto.example6.Media media13 = null;
        user2.borrow(media13);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example6.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList11 = user2.getBorrowedMedias();
        jbhembise.testauto.example6.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getFirstName();
        java.lang.String str15 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example6.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example6.Media> mediaList7 = user2.getBorrowedMedias();
        jbhembise.testauto.example6.Media media8 = null;
        user2.borrow(media8);
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example6.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example6.Media media8 = null;
        user2.borrow(media8);
        java.lang.String str10 = user2.getLastName();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.lang.String str12 = user2.getFirstName();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example6.Media media5 = null;
        user2.borrow(media5);
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example6.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getFirstName();
        java.lang.String str12 = user2.getLastName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList13 = user2.getBorrowedMedias();
        jbhembise.testauto.example6.Media media14 = null;
        user2.borrow(media14);
        java.util.List<jbhembise.testauto.example6.Media> mediaList16 = user2.getBorrowedMedias();
        jbhembise.testauto.example6.Media media17 = null;
        user2.borrow(media17);
        java.lang.Class<?> wildcardClass19 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertNotNull(mediaList16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example6.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        java.lang.String str13 = user2.getFirstName();
        java.lang.String str14 = user2.getLastName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.String str16 = user2.getLastName();
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
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example6.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList11 = user2.getBorrowedMedias();
        jbhembise.testauto.example6.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example6.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.util.List<jbhembise.testauto.example6.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList12 = user2.getBorrowedMedias();
        jbhembise.testauto.example6.Media media13 = null;
        user2.borrow(media13);
        java.util.List<jbhembise.testauto.example6.Media> mediaList15 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertNotNull(mediaList15);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example6.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        jbhembise.testauto.example6.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getLastName();
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList14 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList14);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.util.List<jbhembise.testauto.example6.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example6.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getLastName();
        jbhembise.testauto.example6.Media media7 = null;
        user2.borrow(media7);
        java.lang.String str9 = user2.getLastName();
        jbhembise.testauto.example6.Media media10 = null;
        user2.borrow(media10);
        jbhembise.testauto.example6.Media media12 = null;
        user2.borrow(media12);
        jbhembise.testauto.example6.Media media14 = null;
        user2.borrow(media14);
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getLastName();
        java.lang.String str9 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.String str11 = user2.getLastName();
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getLastName();
        java.lang.String str14 = user2.getFirstName();
        jbhembise.testauto.example6.Media media15 = null;
        user2.borrow(media15);
        java.util.List<jbhembise.testauto.example6.Media> mediaList17 = user2.getBorrowedMedias();
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
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList17);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList6 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example6.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getLastName();
        jbhembise.testauto.example6.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getLastName();
        java.lang.String str13 = user2.getLastName();
        jbhembise.testauto.example6.Media media14 = null;
        user2.borrow(media14);
        java.lang.String str16 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example6.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList14 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass15 = mediaList14.getClass();
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
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        jbhembise.testauto.example6.Media media9 = null;
        user2.borrow(media9);
        jbhembise.testauto.example6.Media media11 = null;
        user2.borrow(media11);
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.util.List<jbhembise.testauto.example6.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        java.lang.String str17 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList18 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example6.Media> mediaList19 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass20 = mediaList19.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList18);
        org.junit.Assert.assertNotNull(mediaList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example6.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example6.Media media8 = null;
        user2.borrow(media8);
        jbhembise.testauto.example6.Media media10 = null;
        user2.borrow(media10);
        jbhembise.testauto.example6.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass16 = mediaList15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("", "hi!");
        java.util.List<jbhembise.testauto.example6.Media> mediaList3 = user2.getBorrowedMedias();
        java.lang.String str4 = user2.getLastName();
        jbhembise.testauto.example6.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.util.List<jbhembise.testauto.example6.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getLastName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example6.Media media8 = null;
        user2.borrow(media8);
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getFirstName();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        java.lang.String str13 = user2.getLastName();
        java.lang.String str14 = user2.getFirstName();
        java.lang.String str15 = user2.getFirstName();
        jbhembise.testauto.example6.Media media16 = null;
        user2.borrow(media16);
        java.util.List<jbhembise.testauto.example6.Media> mediaList18 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass19 = mediaList18.getClass();
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.util.List<jbhembise.testauto.example6.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example6.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        jbhembise.testauto.example6.Media media7 = null;
        user2.borrow(media7);
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getFirstName();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        java.util.List<jbhembise.testauto.example6.Media> mediaList14 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(mediaList14);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList6 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example6.Media> mediaList7 = user2.getBorrowedMedias();
        jbhembise.testauto.example6.Media media8 = null;
        user2.borrow(media8);
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "hi!");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.Class<?> wildcardClass4 = user2.getClass();
        java.lang.String str5 = user2.getFirstName();
        java.lang.String str6 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("", "hi!");
        java.util.List<jbhembise.testauto.example6.Media> mediaList3 = user2.getBorrowedMedias();
        java.lang.String str4 = user2.getLastName();
        jbhembise.testauto.example6.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example6.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getLastName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList9 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.String str6 = user2.getLastName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList11 = user2.getBorrowedMedias();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(mediaList11);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example6.Media media9 = null;
        user2.borrow(media9);
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        jbhembise.testauto.example6.Media media12 = null;
        user2.borrow(media12);
        java.util.List<jbhembise.testauto.example6.Media> mediaList14 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example6.Media> mediaList15 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example6.Media> mediaList16 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(mediaList14);
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertNotNull(mediaList16);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example6.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.util.List<jbhembise.testauto.example6.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.String str11 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList12 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example6.Media> mediaList13 = user2.getBorrowedMedias();
        jbhembise.testauto.example6.Media media14 = null;
        user2.borrow(media14);
        java.lang.String str16 = user2.getFirstName();
        java.lang.String str17 = user2.getLastName();
        jbhembise.testauto.example6.Media media18 = null;
        user2.borrow(media18);
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
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList6 = user2.getBorrowedMedias();
        jbhembise.testauto.example6.Media media7 = null;
        user2.borrow(media7);
        jbhembise.testauto.example6.Media media9 = null;
        user2.borrow(media9);
        java.lang.String str11 = user2.getLastName();
        jbhembise.testauto.example6.Media media12 = null;
        user2.borrow(media12);
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.lang.Class<?> wildcardClass15 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        jbhembise.testauto.example6.Media media4 = null;
        user2.borrow(media4);
        java.lang.String str6 = user2.getLastName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getLastName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.util.List<jbhembise.testauto.example6.Media> mediaList10 = user2.getBorrowedMedias();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList10);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        jbhembise.testauto.example6.Media media9 = null;
        user2.borrow(media9);
        jbhembise.testauto.example6.Media media11 = null;
        user2.borrow(media11);
        java.lang.String str13 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList5 = user2.getBorrowedMedias();
        jbhembise.testauto.example6.Media media6 = null;
        user2.borrow(media6);
        jbhembise.testauto.example6.Media media8 = null;
        user2.borrow(media8);
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getLastName();
        java.lang.String str12 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example6.Media media10 = null;
        user2.borrow(media10);
        java.util.List<jbhembise.testauto.example6.Media> mediaList12 = user2.getBorrowedMedias();
        jbhembise.testauto.example6.Media media13 = null;
        user2.borrow(media13);
        java.lang.String str15 = user2.getLastName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList16 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNotNull(mediaList16);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example6.Media media9 = null;
        user2.borrow(media9);
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        jbhembise.testauto.example6.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getLastName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList15 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(mediaList15);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example6.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getLastName();
        jbhembise.testauto.example6.Media media12 = null;
        user2.borrow(media12);
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.util.List<jbhembise.testauto.example6.Media> mediaList15 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example6.Media> mediaList16 = user2.getBorrowedMedias();
        jbhembise.testauto.example6.Media media17 = null;
        user2.borrow(media17);
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
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getFirstName();
        jbhembise.testauto.example6.Media media8 = null;
        user2.borrow(media8);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.util.List<jbhembise.testauto.example6.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example6.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList6 = user2.getBorrowedMedias();
        jbhembise.testauto.example6.Media media7 = null;
        user2.borrow(media7);
        java.util.List<jbhembise.testauto.example6.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass10 = mediaList9.getClass();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getFirstName();
        java.lang.String str6 = user2.getLastName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.util.List<jbhembise.testauto.example6.Media> mediaList8 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example6.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getFirstName();
        jbhembise.testauto.example6.Media media11 = null;
        user2.borrow(media11);
        java.lang.String str13 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList9 = user2.getBorrowedMedias();
        jbhembise.testauto.example6.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getLastName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList13 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example6.Media> mediaList14 = user2.getBorrowedMedias();
        java.lang.String str15 = user2.getFirstName();
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.util.List<jbhembise.testauto.example6.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example6.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        jbhembise.testauto.example6.Media media7 = null;
        user2.borrow(media7);
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        jbhembise.testauto.example6.Media media10 = null;
        user2.borrow(media10);
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        java.lang.String str9 = user2.getLastName();
        java.lang.String str10 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList11 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example6.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getLastName();
        java.lang.String str14 = user2.getFirstName();
        jbhembise.testauto.example6.Media media15 = null;
        user2.borrow(media15);
        java.lang.Class<?> wildcardClass17 = user2.getClass();
        java.util.List<jbhembise.testauto.example6.Media> mediaList18 = user2.getBorrowedMedias();
        java.lang.String str19 = user2.getFirstName();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(mediaList18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList4 = user2.getBorrowedMedias();
        jbhembise.testauto.example6.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example6.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        jbhembise.testauto.example6.Media media9 = null;
        user2.borrow(media9);
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.util.List<jbhembise.testauto.example6.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getLastName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList14 = user2.getBorrowedMedias();
        jbhembise.testauto.example6.Media media15 = null;
        user2.borrow(media15);
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
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example6.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example6.Media> mediaList7 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example6.Media> mediaList8 = user2.getBorrowedMedias();
        jbhembise.testauto.example6.Media media9 = null;
        user2.borrow(media9);
        java.util.List<jbhembise.testauto.example6.Media> mediaList11 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example6.Media> mediaList12 = user2.getBorrowedMedias();
        jbhembise.testauto.example6.Media media13 = null;
        user2.borrow(media13);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertNotNull(mediaList12);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example6.Media media5 = null;
        user2.borrow(media5);
        java.util.List<jbhembise.testauto.example6.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getLastName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.String str13 = user2.getFirstName();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.lang.String str15 = user2.getFirstName();
        java.lang.String str16 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList17 = user2.getBorrowedMedias();
        java.lang.String str18 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList19 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass20 = user2.getClass();
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
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example6.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getLastName();
        jbhembise.testauto.example6.Media media12 = null;
        user2.borrow(media12);
        java.lang.String str14 = user2.getFirstName();
        java.lang.String str15 = user2.getLastName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList16 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example6.Media> mediaList17 = user2.getBorrowedMedias();
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
        org.junit.Assert.assertNotNull(mediaList17);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example6.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList9 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example6.Media> mediaList10 = user2.getBorrowedMedias();
        jbhembise.testauto.example6.Media media11 = null;
        user2.borrow(media11);
        java.lang.String str13 = user2.getFirstName();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.lang.String str15 = user2.getLastName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList16 = user2.getBorrowedMedias();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList9);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNotNull(mediaList16);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example6.Media media5 = null;
        user2.borrow(media5);
        jbhembise.testauto.example6.Media media7 = null;
        user2.borrow(media7);
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example6.Media media10 = null;
        user2.borrow(media10);
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        java.util.List<jbhembise.testauto.example6.Media> mediaList13 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example6.Media> mediaList14 = user2.getBorrowedMedias();
        jbhembise.testauto.example6.Media media15 = null;
        user2.borrow(media15);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertNotNull(mediaList14);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example6.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList9 = user2.getBorrowedMedias();
        java.lang.String str10 = user2.getLastName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList11 = user2.getBorrowedMedias();
        java.lang.String str12 = user2.getFirstName();
        java.lang.String str13 = user2.getLastName();
        java.lang.String str14 = user2.getFirstName();
        java.lang.String str15 = user2.getFirstName();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        jbhembise.testauto.example6.Media media17 = null;
        user2.borrow(media17);
        jbhembise.testauto.example6.Media media19 = null;
        user2.borrow(media19);
        java.util.List<jbhembise.testauto.example6.Media> mediaList21 = user2.getBorrowedMedias();
        java.lang.String str22 = user2.getFirstName();
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
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getFirstName();
        java.lang.String str7 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.util.List<jbhembise.testauto.example6.Media> mediaList10 = user2.getBorrowedMedias();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList10);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example6.Media media8 = null;
        user2.borrow(media8);
        java.util.List<jbhembise.testauto.example6.Media> mediaList10 = user2.getBorrowedMedias();
        java.lang.String str11 = user2.getLastName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example6.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example6.Media media8 = null;
        user2.borrow(media8);
        java.util.List<jbhembise.testauto.example6.Media> mediaList10 = user2.getBorrowedMedias();
        jbhembise.testauto.example6.Media media11 = null;
        user2.borrow(media11);
        java.util.List<jbhembise.testauto.example6.Media> mediaList13 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.util.List<jbhembise.testauto.example6.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(mediaList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(mediaList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.util.List<jbhembise.testauto.example6.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example6.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getLastName();
        jbhembise.testauto.example6.Media media7 = null;
        user2.borrow(media7);
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.lang.String str10 = user2.getFirstName();
        jbhembise.testauto.example6.Media media11 = null;
        user2.borrow(media11);
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example6.Media media10 = null;
        user2.borrow(media10);
        java.util.List<jbhembise.testauto.example6.Media> mediaList12 = user2.getBorrowedMedias();
        jbhembise.testauto.example6.Media media13 = null;
        user2.borrow(media13);
        java.lang.String str15 = user2.getFirstName();
        java.lang.Class<?> wildcardClass16 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getLastName();
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        jbhembise.testauto.example6.Media media11 = null;
        user2.borrow(media11);
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        java.lang.String str14 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getLastName();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getLastName();
        java.lang.Class<?> wildcardClass7 = user2.getClass();
        java.lang.String str8 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "hi!");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.Class<?> wildcardClass4 = user2.getClass();
        java.util.List<jbhembise.testauto.example6.Media> mediaList5 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass6 = mediaList5.getClass();
        java.lang.Class<?> wildcardClass7 = mediaList5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(mediaList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList6 = user2.getBorrowedMedias();
        jbhembise.testauto.example6.Media media7 = null;
        user2.borrow(media7);
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        java.util.List<jbhembise.testauto.example6.Media> mediaList10 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example6.Media> mediaList11 = user2.getBorrowedMedias();
        jbhembise.testauto.example6.Media media12 = null;
        user2.borrow(media12);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mediaList10);
        org.junit.Assert.assertNotNull(mediaList11);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("", "hi!");
        jbhembise.testauto.example6.Media media3 = null;
        user2.borrow(media3);
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        jbhembise.testauto.example6.Media media6 = null;
        user2.borrow(media6);
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "hi!");
        java.lang.String str3 = user2.getLastName();
        jbhembise.testauto.example6.Media media4 = null;
        user2.borrow(media4);
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.lang.String str7 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList8 = user2.getBorrowedMedias();
        java.lang.String str9 = user2.getLastName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example6.Media media5 = null;
        user2.borrow(media5);
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList9 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example6.Media> mediaList10 = user2.getBorrowedMedias();
        jbhembise.testauto.example6.Media media11 = null;
        user2.borrow(media11);
        java.util.List<jbhembise.testauto.example6.Media> mediaList13 = user2.getBorrowedMedias();
        java.lang.String str14 = user2.getLastName();
        jbhembise.testauto.example6.Media media15 = null;
        user2.borrow(media15);
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
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getFirstName();
        java.lang.String str9 = user2.getFirstName();
        java.lang.String str10 = user2.getFirstName();
        java.lang.String str11 = user2.getFirstName();
        java.lang.String str12 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.lang.String str4 = user2.getFirstName();
        jbhembise.testauto.example6.Media media5 = null;
        user2.borrow(media5);
        jbhembise.testauto.example6.Media media7 = null;
        user2.borrow(media7);
        java.lang.String str9 = user2.getFirstName();
        jbhembise.testauto.example6.Media media10 = null;
        user2.borrow(media10);
        java.lang.String str12 = user2.getLastName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList13 = user2.getBorrowedMedias();
        jbhembise.testauto.example6.Media media14 = null;
        user2.borrow(media14);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(mediaList13);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.String str3 = user2.getLastName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass5 = user2.getClass();
        java.lang.String str6 = user2.getLastName();
        jbhembise.testauto.example6.Media media7 = null;
        user2.borrow(media7);
        java.lang.Class<?> wildcardClass9 = user2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.Class<?> wildcardClass8 = user2.getClass();
        jbhembise.testauto.example6.Media media9 = null;
        user2.borrow(media9);
        jbhembise.testauto.example6.Media media11 = null;
        user2.borrow(media11);
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        java.lang.Class<?> wildcardClass14 = user2.getClass();
        java.util.List<jbhembise.testauto.example6.Media> mediaList15 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example6.Media> mediaList16 = user2.getBorrowedMedias();
        java.lang.String str17 = user2.getLastName();
        java.lang.String str18 = user2.getFirstName();
        java.lang.String str19 = user2.getLastName();
        java.lang.String str20 = user2.getLastName();
        java.lang.String str21 = user2.getFirstName();
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
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.util.List<jbhembise.testauto.example6.Media> mediaList3 = user2.getBorrowedMedias();
        java.util.List<jbhembise.testauto.example6.Media> mediaList4 = user2.getBorrowedMedias();
        java.lang.String str5 = user2.getLastName();
        java.lang.String str6 = user2.getLastName();
        jbhembise.testauto.example6.Media media7 = null;
        user2.borrow(media7);
        java.lang.String str9 = user2.getLastName();
        jbhembise.testauto.example6.Media media10 = null;
        user2.borrow(media10);
        java.util.List<jbhembise.testauto.example6.Media> mediaList12 = user2.getBorrowedMedias();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        jbhembise.testauto.example6.Media media14 = null;
        user2.borrow(media14);
        java.lang.String str16 = user2.getLastName();
        org.junit.Assert.assertNotNull(mediaList3);
        org.junit.Assert.assertNotNull(mediaList4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(mediaList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        jbhembise.testauto.example6.Media media4 = null;
        user2.borrow(media4);
        java.lang.Class<?> wildcardClass6 = user2.getClass();
        java.util.List<jbhembise.testauto.example6.Media> mediaList7 = user2.getBorrowedMedias();
        java.lang.String str8 = user2.getFirstName();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(mediaList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        java.lang.String str8 = user2.getLastName();
        jbhembise.testauto.example6.Media media9 = null;
        user2.borrow(media9);
        java.lang.Class<?> wildcardClass11 = user2.getClass();
        java.lang.String str12 = user2.getLastName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList13 = user2.getBorrowedMedias();
        jbhembise.testauto.example6.Media media14 = null;
        user2.borrow(media14);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(mediaList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(mediaList13);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        jbhembise.testauto.example6.User user2 = new jbhembise.testauto.example6.User("hi!", "");
        java.lang.Class<?> wildcardClass3 = user2.getClass();
        java.lang.String str4 = user2.getFirstName();
        java.lang.String str5 = user2.getFirstName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList6 = user2.getBorrowedMedias();
        java.lang.String str7 = user2.getLastName();
        jbhembise.testauto.example6.Media media8 = null;
        user2.borrow(media8);
        java.lang.Class<?> wildcardClass10 = user2.getClass();
        java.lang.String str11 = user2.getFirstName();
        java.lang.Class<?> wildcardClass12 = user2.getClass();
        java.lang.Class<?> wildcardClass13 = user2.getClass();
        java.lang.String str14 = user2.getLastName();
        java.util.List<jbhembise.testauto.example6.Media> mediaList15 = user2.getBorrowedMedias();
        java.lang.String str16 = user2.getLastName();
        jbhembise.testauto.example6.Media media17 = null;
        user2.borrow(media17);
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
    }
}

