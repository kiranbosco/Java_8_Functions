package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class ParllelStreamExample {

    //sequential stream in java
    public static List<String> streamsExe() {
Long startTime = System.currentTimeMillis();
        List<String> list = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities).flatMap(List::stream)
                .distinct().sorted().collect(Collectors.toList());
        Long endTime = System.currentTimeMillis();
        System.out.println("Duration time to Excutions stream" + (startTime-endTime));
        return list;

    }

    // parllelStream exe it is using the parllel the stream of object in the studentDatabase
    public static List<String>parllellyStreamExe(){

        Long startTime =System.currentTimeMillis();
        List<String> list = StudentDataBase.getAllStudents().parallelStream()
                .map(Student::getActivities).flatMap(List::stream)
                .distinct().sorted().collect(Collectors.toList());
        Long endTime = System.currentTimeMillis()-startTime;
        System.out.println("Duration time to excutions  parllellyStream" + (startTime-endTime));
        return  null;
    }
    public static void main(String[] args) {
        streamsExe();
        parllellyStreamExe();


    }
}

