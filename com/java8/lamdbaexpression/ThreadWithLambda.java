package com.java8.lamdbaexpression;

public class ThreadWithLambda {
    public static void main(String[] args) {
        System.out.println("1 - Implement Runnable interface using > Lambda expression");
        // Implement Runnable interface using > Lambda expression
        new Thread(()->{
            System.out.println("Thread-1");
        }).start();
    }
}
