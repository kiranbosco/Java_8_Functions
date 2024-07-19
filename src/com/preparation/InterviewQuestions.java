package com.preparation;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InterviewQuestions {

    public static void weekdays_sorting_using_HashMpa() {
        //    Map<Integer, List> id1 = new HashMap<Integer,List>();
        Map<Integer, String> id1 = new HashMap<Integer, String>();
        id1.put(2, "Monday");
        id1.put(5, "Thursday");
        id1.put(7, "Saturday");
        id1.put(3, "Tuesday");
        id1.put(4, "Wednesday");
        id1.put(1, "Sunday");
        id1.put(5, "Thursday");
        id1.put(6, "Friday");
        List<Map.Entry<Integer, String>> collect = id1.entrySet().stream().collect(Collectors.toList());
        System.out.println(collect);
    }

    public static void main(String[] args) {

        // List<String> list = Arrays.asList("A","B","A");
        List<Integer> listInfo = Arrays.asList(1, 1, 2, 3, 4, 2);
        listInfo.stream().filter(i -> Collections.frequency(listInfo, i) > 1)
                .collect(Collectors.toList()).forEach(System.out::println);

        List<String> stringList = Arrays.asList("A", "A", "B");
        stringList.stream().filter(x -> Collections.frequency(stringList, x) > 1).collect(Collectors.toList())
                .forEach(System.out::println);

        String name = "madam";
        IntStream.range(0, name.length() / 2).allMatch(i -> name.charAt(i) == name.charAt(name.length() - i - 1));

//   //D/w Intstream and stream<Integer>
//List<Integer> integerList = Arrays.asList(1,2,3,4);
//integerList.stream().su

//        IntStream intStream = IntStream.of(1, 2, 3);
//
//        System.out.println(  intStream.average().getAsDouble());

        //repeat values print
        String str = "kiran kumar";
        String string = Arrays.stream(str.split("")).filter(x -> x.indexOf(str) == x.lastIndexOf(str)).findFirst().orElse("NOT");

        System.out.println(string);

        Arrays.stream(Arrays.stream(str.split("")).reduce("", (s1, s2) -> s2 + " " + s1)
                .split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(Arrays.stream(Arrays.stream(str.split("")).reduce("", (s1, s2) -> s2 + " " + s1)
                .split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

    }

}
