package com.java8;

@FunctionalInterface
interface CalcInterface<A,B> {
    A sum(B val1,B val2);
}

class MySum{

    int sum(Integer i1,Integer i2){
        return (i1+i2);
    }

}
public class LambdaExpression_FunctionalInterface_calculatorSum__ReferenceToInstanceMethod {
    public static void main(String[] args) {
        MySum mySum = new MySum();

     CalcInterface<Integer,Integer> calcInterface = mySum::sum;
     Integer result = calcInterface.sum(2,3);
     System.out.println("sumResult = " + result); // 5

    }
}
/* OUTPUT

1 - Find sum of two numbers using > Reference to an instance method of a particular object
2 - The myInteger::sum  is a reference to instance method sum of object myInteger
sumResult = 5

*/