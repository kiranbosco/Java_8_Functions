package com.preparation;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
        boolean b = IntStream.range(0, name.length() / 2).allMatch(i -> name.charAt(i) == name.charAt(name.length() - i - 1));
    }
}
