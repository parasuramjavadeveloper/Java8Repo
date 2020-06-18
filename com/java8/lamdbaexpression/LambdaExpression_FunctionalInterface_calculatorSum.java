package com.java8.lamdbaexpression;

interface CalculatorInterface<A>{
    public abstract A sumMethod(A val1,A val2);
}
public class LambdaExpression_FunctionalInterface_calculatorSum {
    public static void main(String... args) {

        CalculatorInterface<Integer> sum = (Integer val1,Integer val2)->{
            return  val1+val2;
        };

        Integer result = sum.sumMethod(1,2);
        System.out.println("result is"+ result);


    }
}
