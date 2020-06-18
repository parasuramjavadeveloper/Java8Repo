package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SequentialVsParallelStreams {
    public static void main(String[] args) {
        long startNanoSec=0;
        long endNanoSec=0;
        int maxElements = 9992999;
        List<Integer> numberArr = new ArrayList<>();
        for(int i=0;i<maxElements;i++){
            numberArr.add(i);
        }
        System.out.println("No of elements to be counted using streams " + maxElements);
        //stream() method - Returns sequential Stream with this collection
        startNanoSec=System.nanoTime();
        Stream<Integer> sequentialStream = numberArr.stream();
        System.out.println("\n1. No of elements counted using sequential streams " + sequentialStream.count());
        endNanoSec=System.nanoTime();
        System.out.println("Time taken to count elements using sequential streams "+ (endNanoSec-startNanoSec)+" nanoSeconds");

        //parallelStream() method - Returns parallel Stream with this collection
        Stream<Integer> parallelStream = numberArr.parallelStream();
        startNanoSec=System.nanoTime();
        System.out.println("\n2. No of elements counted using PARALLEL streams " + parallelStream.count());
        endNanoSec=System.nanoTime();
        System.out.print("Time taken to count elements using PARALLEL streams "+   (endNanoSec-startNanoSec)+" nanoSeconds");



    }

    /*OUTPUT

No of elements to be counted using streams 9992999

1. No of elements counted using sequential streams 9992999
Time taken to count elements using sequential streams 50535819 nanoSeconds

2. No of elements counted using PARALLEL streams 9992999
Time taken to count elements using PARALLEL streams 14420674 nanoSeconds
*/
}
