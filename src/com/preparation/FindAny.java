package com.preparation;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;


public class FindAny {

    public static Optional<Student>findAllMatch(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter((student -> student.getName().equals("Adam")))
                .findFirst();
    }

    public static Optional<Student> findAnyStudent(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter((student -> student.getGpa()>13.5))
                .findAny();
    }

    public static void main(String[] args) {
//        Optional<Student> studentOptional = findAllMatch();
//            if(studentOptional.isPresent()){
//                System.out.println("Student data is available {} " + studentOptional.get());
//            }
//            else {
//                System.out.println("Not available..{} ");
//            }

            Optional<Student> studentOptional1 = findAnyStudent();
            if(studentOptional1.isPresent()){
                System.out.println("student Available + {} " + studentOptional1.get());
            }
            else {
                System.out.println("Sorry {} ");
            }
        }

}
