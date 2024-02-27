package org.example;

import junit.framework.TestCase;
import org.junit.Test;


public class FizzBuzzTest extends TestCase {
 @Test
    public void testCreateFizzBuzz (){
     FizzBuzz fizzBuzz = new FizzBuzz();
 }
 @Test
    public void testNumberReturneToString(){
     assertEquals("1",FizzBuzz.fizzBuzz(1));
     assertEquals("2", FizzBuzz.fizzBuzz(2));
 }

// @Test
//    public void testMultiplicationOfThree(){
//     assertEquals(0,FizzBuzz.multiplicationOfThree(3));
//     assertEquals(0, FizzBuzz.multiplicationOfThree(6));
//     assertEquals(0,FizzBuzz.multiplicationOfThree(21));
// }
 @Test
    public void testMultiplicationOfThreeReturneFizz(){
     assertEquals("Fizz",FizzBuzz.fizzBuzz(3));
 }
// @Test
//    public void testMultiplicationOfFive(){
//     assertEquals(0,FizzBuzz.multiplicationOfFive(5));
//     assertEquals(-1,FizzBuzz.multiplicationOfFive(9));
//     assertEquals(0,FizzBuzz.multiplicationOfFive(10));
//     assertEquals(0,FizzBuzz.multiplicationOfFive(125));
// }

 @Test
    public void testMultiplicationOfFiveReturneBuzz(){
     assertEquals("Buzz",FizzBuzz.fizzBuzz(5));
     assertEquals("Buzz", FizzBuzz.fizzBuzz(110));
 }

 @Test
    public void testMultiplicationOfFiveAndThreeReturneFizzBuzz(){
     assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(120));
 }



}
