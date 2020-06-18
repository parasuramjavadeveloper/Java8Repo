package com.java8.lamdbaexpression;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringArrayWithLambdaExpression {
    public static void main(String... args) {
        String[] stringArray = {"ab", "ef", "cd"};
        //After Java 8 -  Sort String using Using Lambda expression
        System.out.println("After Java 8 - Sort StringArray using Using "
                + " Lambda expression");
        Arrays.sort(stringArray,(val1,val2)->val1.compareTo(val2));
        //Display StringArray
        for (String str : stringArray) {
            System.out.print(str + " ");
        }

    }
}
/* Output

After Java 8 - Sort StringArray using Using Lambda expression
ab cd ef

*/