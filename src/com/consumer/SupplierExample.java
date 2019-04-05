package com.consumer;

import data.Student;
import data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/*
this method is complitly oppsite to consumer method consumer can take the input but never retrun any thing
but supplier cant take any input but it will be return out put
*/

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> {
            return new Student("Adam", 2, 3.6, "male", 10, Arrays.asList("swimming", "basketball", "volleyball"));
        };
        System.out.println(studentSupplier.get());


    }
}
