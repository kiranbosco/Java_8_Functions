package com.preparation;

import java.util.*;

import static java.lang.System.*;

public class InterviewCls {
    public static List<Integer> findDuplicateValues() {

        List<Integer> list = Arrays.asList(1,2,3,2);
        Set<Integer> set = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for(Integer i : list){
            if(set.contains(i)){
                duplicates.add(i);
            }
            else {
                set.add(i);
            }
        }
        return duplicates;
    }


    public static void main(String[] args) {
        System.out.println(findDuplicateValues());



        //Palendram program
        String x = "kiran";
        int i =0;
        int j=x.length()-1;
        while (i<j){
            if(x.charAt(i)!=x.charAt(j)){
                out.println("Sorry Not pallendram");
              //  System.exit(0);
            }
            i++;
            j--;
        }
        out.println("it's pallendram ..!{} ");
    }

}
