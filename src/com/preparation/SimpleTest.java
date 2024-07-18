package com.preparation;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleTest {

    //reverse string in java8
    public static void reverseString() {
        List<String> stringList = Arrays.asList("kiran", "kumar", "purini");
        List<String> reverse = stringList
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(reverse);
    }

    public static boolean isLeapYear() {

        LocalDate localDate = LocalDate.now();
        boolean obj = localDate.isLeapYear();
        if (obj) {
            return true;
        }
        return false;
    }

    public static void streamOfTomap() {

    }

    public static void main(String[] args) {

        String str = "Purini kiran kumar";
//Reverse string
        String info = Arrays.stream(str.split("")).reduce("", ((s, s2) -> s2 + " " + s));
        System.out.println(info);

        Map<String, Long> stringMap = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(stringMap);

        reverseString();
        System.out.println(isLeapYear());

        Stream.generate(UUID::randomUUID).limit(5).forEach(System.out::println);

     Map<String, Integer> integerMap =  Stream.of("kiran", "kumar", "purini")
              .collect(Collectors.toMap(String::toUpperCase, String::length));

    }
}
