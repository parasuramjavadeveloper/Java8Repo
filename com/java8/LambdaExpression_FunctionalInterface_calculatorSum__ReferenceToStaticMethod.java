package com.java8;

@FunctionalInterface
interface CalculatorInterface<A,B> {
    A sumMethod(B val1,B val2);
}

class MyInteger {
    static  int sum(Integer i1,Integer i2){
        return (i1+i2);
    }
}
public class LambdaExpression_FunctionalInterface_calculatorSum__ReferenceToStaticMethod {

    public static void main(String[] args) {

        // Provide implementation (definition) of sumMethod in java 8
        System.out.println("1 - Find sum of two numbers using > reference to static method ");
        System.out.println("2 - Here MyInteger::sum is a reference to "
                + "> static method sum"
                + "> of class MyInteger");
        CalculatorInterface<Integer,Integer> sum = MyInteger::sum;
        //call sumMethod
        Integer sumResult = sum.sumMethod(2,3);
        System.out.println("sumResult = " + sumResult); // 5
    }




}
