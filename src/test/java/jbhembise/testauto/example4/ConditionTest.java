package jbhembise.testauto.example4;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConditionTest {

    @Test
    public void fizzbuzz_should_return_original_number_for_other_numbers() {
        assertEquals("1", FizzBuzz.fizzbuzz(1));
        assertEquals("2", FizzBuzz.fizzbuzz(2));
        assertEquals("4", FizzBuzz.fizzbuzz(4));
        assertEquals("7", FizzBuzz.fizzbuzz(7));
    }

    @Test
    public void fizzbuzz_should_return_fizz_for_3() {
        assertEquals("Fizz", FizzBuzz.fizzbuzz(3));
    }

    @Test
    public void fizzbuzz_should_return_buzz_for_5() {
        assertEquals("Buzz", FizzBuzz.fizzbuzz(5));
    }

    @Test
    public void fizzbuzz_should_return_fizzbuzz_for_15() {
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(15));
    }
}
