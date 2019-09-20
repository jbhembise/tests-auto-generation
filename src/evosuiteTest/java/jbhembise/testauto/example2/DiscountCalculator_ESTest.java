/*
 * This file was automatically generated by EvoSuite
 * Mon Sep 16 08:11:36 GMT 2019
 */

package jbhembise.testauto.example2;

import org.junit.Test;
import static org.junit.Assert.*;
import jbhembise.testauto.example2.DiscountCalculator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DiscountCalculator_ESTest extends DiscountCalculator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = DiscountCalculator.calculatePercentage(2000);
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = DiscountCalculator.calculatePercentage(1000);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = DiscountCalculator.calculatePercentage(10);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = DiscountCalculator.calculatePercentage(3966);
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int int0 = DiscountCalculator.calculatePercentage(5);
      assertEquals(0, int0);
  }
}
