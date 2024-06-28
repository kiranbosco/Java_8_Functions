package com.preparation;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewCls {

    public static void stringInfor(String str) {


    }
    public static void main(String[] args) {

        String str = "My namse is kiran";

        List<String> strs = Arrays.asList(str);

        String name =      Arrays.stream(str.split(" ")).reduce(" ",(s1,s2)->s2+" "+ s1);

        System.out.println(name);

        Map<String, Long> collect = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);




    }

}
