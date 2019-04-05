package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamPartitioningByExe {

    /*this partitioningBy method is kind of groupingBy method  it is accept the input as kind of predicate
    and return type is the map<k , v> key should be boolean  and value is the list of students finaly it will be
            return the response boolean data*/

    public static void partitioningsByMethod() {

        Predicate<Student> predicateGpa = stu -> {
            return stu.getGpa() >= 3.8;
        };
        Map<Boolean, List<Student>> listGpa = StudentDataBase.getAllStudents()
                .stream().collect(Collectors.partitioningBy(predicateGpa));
        System.out.println(listGpa);
    }
    public static void main(String[] args) {
        partitioningsByMethod();

    }

}
