package com.company;

import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        //Take something and return something
        Predicate<String> predicate = (s)-> s.length() < 10;
        System.out.println(predicate.test("Vinay")+" - VinayFartyal is less than 10");

        //Take something return nothing
        Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());
        consumer.accept("vinayfartyal");

        //We are converting integer into string and then finding its length
        Function<Integer, String> function = (num)-> Integer.toString(num);
        System.out.println("length of 26: " + function.apply(26).length());

        //It is used to supply
        Supplier<String > supplier = () -> "Java is fun";
        System.out.println(supplier.get());

        BinaryOperator<Integer> add = (num1,num2) -> num1+num2;
        System.out.println("add 10+35: " +add.apply(10,35));

    }
}
