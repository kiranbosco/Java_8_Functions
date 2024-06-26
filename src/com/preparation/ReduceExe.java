package com.preparation;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class ReduceExe {

    public static Predicate<Student> nameSort =(s)->s.getName().equals("female");
    public static int multiplationexe(List<Integer> mulvalues){
        return    mulvalues.stream()
                .reduce(1,(a,b)->a*b);
/**initial values 1
 *  a=1
 *  b=1
 *  {1*1 =1
 *    1*3=3
 *    3*4 =12
 *    12*5 =60}
 **/
    }

    public static Optional<Student> reduceMethodInfo(){
        return StudentDataBase.getAllStudents()
                .stream()
                .reduce((s1,s2)->{
                    if(s1.getGpa()>s2.getGpa()){
                        return s1;
                    }
                    return s2;
                });
    }

    public static void main(String[] args) {
        List<Integer> valus = Arrays.asList(1,3,4,5);
      //  System.out.println(multiplationexe(valus));
        System.out.println(reduceMethodInfo());
    }
}
