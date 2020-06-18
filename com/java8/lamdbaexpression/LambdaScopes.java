package com.java8.lamdbaexpression;

interface MathsSummation<A> {
    A sumTwoNumbers(A a, A b);
}

public class LambdaScopes {
    // Instance variable can be accessed in lambda expression in java 8
    int instanceVariable = 1; // Instance variable
    // Static variable can be accessed in lambda expression in java 8
    static int staticVariable = 2; // Static variable

    public static void main(String[] args) {
        LambdaScopes lambdaScopes = new LambdaScopes();
        // Final Local variable can be accessed in lambda expression in java 8
        int x = 1; //final local variable
        MathsSummation<Integer> mathsSummation = (a1, a2) -> {
            lambdaScopes.instanceVariable = 2;
            staticVariable = 5;
            return a1 + a2 + x + lambdaScopes.instanceVariable + staticVariable;
        };
        Integer sum = mathsSummation.sumTwoNumbers(4, 2);
        System.out.println("sum of two numbers are" + sum);


    }
}
