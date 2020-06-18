package com.java8.predicates;

import java.util.function.Predicate;

public class IntegerPredicate {
    public static Predicate<Integer> positiveIntPredicate = num->num > 0;
    public static Predicate<Integer> negativeIntPredicate = num->num < 0;
    public static Predicate<Integer> getSpecificNumber(Integer argument){
        return num-> num==argument;
    }
}
