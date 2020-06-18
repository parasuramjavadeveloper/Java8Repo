package com.java8.predicates;

import com.java8.utility.Gender;
import com.java8.utility.Person;

import java.util.function.Predicate;

public class PersonPredicates {
    public static Predicate<Person> malePersonPredicate = p-> p.getGender().equals(Gender.MALE);
    public static Predicate<Person> femalePersonPredicate = p-> p.getGender().equals(Gender.FEMALE);
}
