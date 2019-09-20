package jbhembise.testauto.example4;

public class FizzBuzz {

    private FizzBuzz() {}

    public static String fizzbuzz(int number) {
        if (number > 0 && number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number > 0 && number % 3 == 0) {
            return "Fizz";
        } else if (number > 0 && number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
