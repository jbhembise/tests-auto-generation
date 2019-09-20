package jbhembise.testauto.example3;

import org.junit.Test;

public class StackTest {

    @Test
    public void push_object_into_stack_must_increment_size_by_1() {
        Stack stack = new Stack();
        stack.push(new Object());
    }
}
