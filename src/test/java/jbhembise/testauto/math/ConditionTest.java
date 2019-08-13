package jbhembise.testauto.math;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConditionTest {

    @Test
    public void fizzbuzz_should_return_original_number_for_other_numbers() {
        assertEquals("1", Condition.fizzbuzz(1));
        assertEquals("2", Condition.fizzbuzz(2));
        assertEquals("4", Condition.fizzbuzz(4));
        assertEquals("7", Condition.fizzbuzz(7));
    }

    @Test
    public void fizzbuzz_should_return_fizz_for_3() {
        assertEquals("Fizz", Condition.fizzbuzz(3));
    }

    @Test
    public void fizzbuzz_should_return_buzz_for_5() {
        assertEquals("Buzz", Condition.fizzbuzz(5));
    }

    @Test
    public void fizzbuzz_should_return_fizzbuzz_for_15() {
        assertEquals("FizzBuzz", Condition.fizzbuzz(15));
    }
}
