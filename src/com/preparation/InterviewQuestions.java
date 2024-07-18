package com.preparation;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InterviewQuestions {

    public static void main(String[] args) {

        // List<String> list = Arrays.asList("A","B","A");
        List<Integer> listInfo = Arrays.asList(1,1,2,3,4,2);
        listInfo.stream().filter(i-> Collections.frequency(listInfo,i)>1)
                .collect(Collectors.toList()).forEach(System.out::println);

        List<String> stringList = Arrays.asList("A","A","B");
        stringList.stream().filter(x->Collections.frequency(stringList,x)>1).collect(Collectors.toList())
                .forEach(System.out::println);

        String name ="madam";
        IntStream.range(0, name.length() / 2).allMatch(i -> name.charAt(i) == name.charAt(name.length() - i - 1));

//   //D/w Intstream and stream<Integer>
//List<Integer> integerList = Arrays.asList(1,2,3,4);
//integerList.stream().su

//        IntStream intStream = IntStream.of(1, 2, 3);
//
//        System.out.println(  intStream.average().getAsDouble());



    }

}
