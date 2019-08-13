package jbhembise.testauto.mutation;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {

    @Test
    public void empty_string_should_return_true() {
        Palindrome palindrome = new Palindrome();
        boolean isPalindrome = palindrome.isPalindrome("");
        //Assert.assertTrue(isPalindrome);
    }

}
