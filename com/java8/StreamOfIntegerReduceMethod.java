package com.java8;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamOfIntegerReduceMethod {
    public static void main(String[] args) {

        System.out.println("Create Stream of Integers");
        Stream<Integer> intStream = Stream.of(1, 2, 3, 4);
        System.out.println("Use reduce method to calculate sum of Integers");
        // reduce() method will reduce stream to calculate sum of numbers
        Optional<Integer> optionalInteger = intStream.reduce((i1, i2) -> i1 + i2);
        // Display OptionalInteger
        System.out.println("sum=" + optionalInteger.get());
    }
}

/* OUTPUT

Create Stream of Integers
Use reduce() method - to calculate sum of Integers in IntStream
sum = 10

*/