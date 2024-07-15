package com.preparation;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class Test {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5,6,3,3,7,1);
        Map<Object, List<Integer>> booleanifo = numbers.stream().collect(groupingBy(i->i%2==0 ? "Even Number" : "Odd number"));
        System.out.println(booleanifo);

     List<Integer> info =    numbers.stream().filter(i->i%2==0)
             .sorted(Comparator.naturalOrder()).sorted(Comparator.naturalOrder())
             .collect(Collectors.toList());
        System.out.println(info);


       Optional<Integer> num = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(num.get());

       String str = "kiran kumar";

      //  boolean b = IntStream.range(0, str.split("")).filter(i -> str.indexOf(i), str.indexOf(str)).anyMatch();

        String string = Arrays.stream(str.split("")).filter(i -> str.indexOf(i) == str.lastIndexOf(str)).findFirst().orElse("Not available");
        System.out.println(string);


        Stream.generate(new Random():: nextInt).limit(5).forEach(System.out::println);

        int sum = IntStream.rangeClosed(1, 5).sum();
        System.out.println(sum);
    }


}
