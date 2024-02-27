package org.example;

public class FizzBuzz {
    public static String fizzBuzz(int i) {
        if (i % 3 == 0 && i % 5 == 0) return "FizzBuzz";
        if (i % 3 == 0)return "Fizz";
        if (i % 5 == 0) return "Buzz";
        return String.valueOf(i);

    }



//    public static int multiplicationOfThree(int i) {
//        return ( i % 3 == 0) ? 0 : -1;
//
//    }
//
//    public static int multiplicationOfFive(int i) {
//        return (i % 5 == 0) ? 0 : -1;
//    }
}
