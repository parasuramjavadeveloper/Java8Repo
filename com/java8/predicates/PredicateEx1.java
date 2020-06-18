package com.java8.predicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-1, 2, 3, 4, -7, -3, 9);
        List<Integer> filteredPostiveNums = getNums(numbers, IntegerPredicate.positiveIntPredicate);
        System.out.println("Print Positive Numbers");
        filteredPostiveNums.forEach(System.out::println);
        System.out.println("Print Negative Numbers");
        List<Integer> filteredNegativeNums = getNums(numbers, IntegerPredicate.negativeIntPredicate);
        filteredNegativeNums.forEach(System.out::println);
        System.out.println("Print Specific Number");
        List<Integer> filteredSpecificNums = getNums(numbers, IntegerPredicate.getSpecificNumber(3));
        filteredSpecificNums.forEach(System.out::println);
    }

    private static List<Integer> getNums(List<Integer> nums, Predicate<Integer> integerPredicatePredicate) {
        List<Integer> filteredPostiveNums = new ArrayList<>();
        nums.forEach(num -> {
            if (integerPredicatePredicate.test(num)) {
                filteredPostiveNums.add(num);
            }
        });
        return filteredPostiveNums;
    }


}
