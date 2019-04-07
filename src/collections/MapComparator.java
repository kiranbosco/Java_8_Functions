package collections;

import data.Student;
import data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

public class MapComparator {

public static void main(String[] args) {


        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Amit");
        map.put(10, "Vijay");
        map.put(50, "Rahul");

       Set<Integer> set = new HashSet<>(map.keySet());
        set.forEach(j -> {
        System.out.println(j);
        });

        Set<String> set1 = new HashSet<>(map.values());
        set1.forEach(j -> {
        System.out.println(j);
        });
    System.out.println();
        // comparing;

     /* List<Student> list =   StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
   list.forEach(System.out::println);
*/
     // no need to use the map() to comparing in sorted in stream in java8

    map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    System.out.println();
    map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
    System.out.println();
    map.entrySet().stream().filter(s->s.getKey()>=10).collect(Collectors.toList()).forEach(System.out::println);

    //all values desending order in map objects
    System.out.println();
    map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
    System.out.println();
    map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);


        }

        }
