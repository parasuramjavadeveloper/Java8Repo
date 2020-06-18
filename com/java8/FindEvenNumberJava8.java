package com.java8.streams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class FindEvenNumberJava8 {
    public static void main(String... args) {

        //In Java 8 - Find all even numbers between 1 to 5
        //Use streams
       /* System.out.println("--");
        IntStream.range(1, 11).filter(n -> n % 2 == 0).forEach(System.out::println);
        // OR
        System.out.println("--");
        System.out.println("find all even numbers between 1 to 5 start");
        IntStream.of(1, 2, 3, 4, 5).filter(n -> n % 2 == 0).forEach(System.out::println);
        System.out.println("find all even numbers between 1 to 5 end");
        // find all numbers greater than 2
        System.out.println("--");
        IntStream.of(1, 2, 3, 4, 5).filter(n -> n > 2).forEach(System.out::println);
        // find all even numbers greater than 2
        System.out.println("--");
        System.out.println("find all even numbers greater than 2");
        IntStream.range(1, 101).filter(n -> n > 2).filter(n -> n % 2 == 0).forEach(System.out::println);
        System.out.println("--");
        System.out.println("find all even numbers greater than 2 for long datatype numbers");
        LongStream.range(1,20).filter(n -> n > 2).filter(n -> n % 2 == 0).forEach(System.out::println);*/

        // Find whether any record greater than 2
        boolean isGreaterThanTwo = IntStream.of(1,2,3,4,5,6).anyMatch(n-> n>2);
        System.out.println("Any Record greater than 2  = " + isGreaterThanTwo); //true

    }
}
