package com.java8;


@FunctionalInterface
interface MyInterface<A,B> {
    A convertStringToInteger(B str);
}
public class LambdaExpression_ReferenceToStaticMethod {

    public static void main(String[] args) {
        // The method reference Integer::valueOf is a reference to a static method
        MyInterface<Integer,String> intVal= Integer::valueOf;
        // call ConvertStringToInteger
        Integer result = intVal.convertStringToInteger("12");
        System.out.println(result);
    }

}
