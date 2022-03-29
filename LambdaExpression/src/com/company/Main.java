package com.company;

public class Main {

    public static void main(String[] args) {
        //We are passing different parameters for the same method using lambda expression
        Calculate addition = (a,b) -> a+b;
        Calculate multiply = (a,b) -> a*b;
        Calculate division = (a,b) -> a/b;

        System.out.println(addition.cal(12,12));
        System.out.println(multiply.cal(10,10));
        System.out.println(division.cal(12,2));

    }
}
