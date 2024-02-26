package org.example;

public class FizzBuzz {
    public static String fizzBuzz(int i) {
        if (multiplicationOfThree(i) ==0 && multiplicationOfFive(i)==0) return "FizzBuzz";
        if (multiplicationOfThree(i)==0)return "Fizz";
        if (multiplicationOfFive(i)==0) return "Buzz";
        return String.valueOf(i);

    }



    public static int multiplicationOfThree(int i) {
        return ( i % 3 == 0) ? 0 : -1;

    }

    public static int multiplicationOfFive(int i) {
        return (i % 5 == 0) ? 0 : -1;
    }
}
