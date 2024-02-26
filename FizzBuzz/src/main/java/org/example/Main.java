package org.example;

import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        long start = System.nanoTime();
// CODE HERE
        FizzBuzz.fizzBuzz(3);

        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        System.out.println("this is the measure time: "+timeElapsed +"ns");
    }
}