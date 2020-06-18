package com.java8.predicates;

import com.java8.utility.Person;
import com.java8.utility.PersonFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx2 {
    public static void main(String[] args) {
        List<Person> persons = PersonFactory.createPersons();
        List<Person> filteredList = getFilteredGenderTypes(persons, PersonPredicates.malePersonPredicate);
        System.out.println("Male Persons");
        filteredList.forEach(System.out::println);
        filteredList = getFilteredGenderTypes(persons, PersonPredicates.femalePersonPredicate);
        System.out.println("FeMale Persons");
        filteredList.forEach(System.out::println);
    }

    private static List<Person> getFilteredGenderTypes(List<Person> persons, Predicate<Person> personPredicate) {
        List<Person> filteredPersons = new ArrayList<>();
        persons.forEach(person -> {
            if (personPredicate.test(person)) {
                filteredPersons.add(person);
            }
        });
        return filteredPersons;
    }
}
