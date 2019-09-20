package jbhembise.testauto.example3;


import org.junit.Assert;
import org.junit.Test;


public class StackTest {
    @Test(timeout = 10000)
    public void push_object_into_stack_must_increment_size_by_1() throws Exception {
        Stack stack = new Stack();
        Assert.assertTrue(((Stack) (stack)).isEmpty());
        Assert.assertFalse(((Stack) (stack)).isFull());
        stack.push(new Object());
        Assert.assertFalse(((Stack) (stack)).isEmpty());
        Assert.assertFalse(((Stack) (stack)).isFull());
    }

    @Test(timeout = 10000)
    public void push_object_into_stack_must_increment_size_by_1_mg1() throws Exception {
        Stack stack = new Stack();
        Assert.assertTrue(((Stack) (stack)).isEmpty());
        Assert.assertFalse(((Stack) (stack)).isFull());
        stack.push(new Object());
        stack.clear();
        Assert.assertTrue(((Stack) (stack)).isEmpty());
        Assert.assertFalse(((Stack) (stack)).isFull());
    }

    @Test(timeout = 10000)
    public void push_object_into_stack_must_increment_size_by_1_mg3() throws Exception {
        Stack stack = new Stack();
        Assert.assertTrue(((Stack) (stack)).isEmpty());
        Assert.assertFalse(((Stack) (stack)).isFull());
        stack.push(new Object());
        stack.pop();
        Assert.assertTrue(((Stack) (stack)).isEmpty());
        Assert.assertFalse(((Stack) (stack)).isFull());
    }

    @Test(timeout = 10000)
    public void push_object_into_stack_must_increment_size_by_1_mg2_remove103_failAssert0() throws Exception {
        try {
            Stack stack = new Stack();
            stack.last();
            org.junit.Assert.fail("push_object_into_stack_must_increment_size_by_1_mg2_remove103 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }
}

