package com.preparation;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InterviewCls {

    public static void checkispallendram(String str){

  Boolean ispalendram = IntStream
          .range(0,str.length()/2).allMatch(i->str.charAt(i)==str.charAt(str.length()-i-1));
   if(ispalendram){
       System.out.println("yes");
   }
   else {
       System.out.println("No");
   }
    }

    public static void stringInfor(String str) {


    }
    public static void main(String[] args) {

        String str = "My namse is kiran";

        String name = Arrays.stream(str.split(" "))
                .reduce(" ",(s1,s2)->s2+" "+ s1);

        System.out.println(name);

        Map<String, Long> collect = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //System.out.println(collect);

        List<Integer> clsList = Arrays.asList(1,1,2,3,4,4,4);
        Set<Integer> set = new HashSet<>();
        System.out.println( clsList.stream().filter(x->!set.add(x)).collect(Collectors.toSet()));

        checkispallendram("madam");
    }

}
