package com.java8.lamdbaexpression;

import java.util.ArrayList;
import java.util.List;

public class ListStreams {
    public static void main(String... args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("ank");
        stringList.add("sam");
        stringList.add("az");
        stringList.add("neh");
        stringList.add("ad");
        // In one line display all records that start with 'a' in stringList
        System.out.println("\n1. Use stream for filtering and display");
        //stringList.stream().filter(a->a.startsWith("a")).sorted().forEach(System.out::println);
        //sort the list in descending order
        stringList.stream().filter(a->a.startsWith("a")).map(String::toUpperCase).sorted((a,b)->b.compareTo(a)).forEach(System.out::println);



    }
}
