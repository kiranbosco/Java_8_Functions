package com;

import java.util.function.Predicate;

public class PredicateExemle {

    static Predicate<Integer> p = (i) -> {
        return i % 2 == 0;
    };
    static Predicate<Integer> p1=(i)-> i%2==0;


    public static void ordExe(){
        Predicate<Integer> p3 =(i)->{
            return  i%2==0;
        };

    }
    public static void main(String[] args) {

        ordExe();

        System.out.println(p.test(4));
        System.out.println(p1.test(10));
        System.out.println(p1.or(p).test(20));
    }
}
