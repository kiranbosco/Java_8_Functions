package com.preparation;


import java.util.*;
import java.util.stream.IntStream;

public class InterviewCls {

    public static List<Integer>  checkStringValue(){
        List<Integer> list = Arrays.asList(1,2,2,3);
        List<Integer> duplicate = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(Integer i : list){
            if(set.contains(i)){
                duplicate.add(i);
            }
            else {
                set.add(i);
            }
        }
        return duplicate;
    }

    public static void main(String[] args) {
        System.out.println(checkStringValue());

    }

}
