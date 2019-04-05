package streams;

import data.Student;
import data.StudentDataBase;
import streams_terminal.StreamsMinByMaxByExample;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsGroupByMethod {


    public static void groupByMethod() {
        Map<String, List<Student>> list = StudentDataBase.getAllStudents()
                .stream().collect(Collectors.groupingBy(Student::getGender));
        System.out.println(list);
    }
// customized grouping method()

    public  static  void customizedMethod(){

      Map<String ,List<Student>> list =  StudentDataBase.getAllStudents()
              .stream().collect(Collectors.groupingBy(stu->stu.getGpa()>3.8 ? "OutStanding" : "Average"));
        System.out.println(list);
            }
// tow level grouping method is possible in stream

    public static void towLevelgrouping_1(){
       Map<Integer,Map<String, List<Student>>> list = StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGradeLevel
        , Collectors.groupingBy(stu->stu.getGpa()>=3.9 ? "OutStanding" : "Average")));
        System.out.println(list);
    }

    public static void towLevelgrouping_2() {
       Map<List<String> , Map<String ,List<Student>>>   list = StudentDataBase.getAllStudents().stream()
               .collect(Collectors.groupingBy(Student::getActivities,
                Collectors.groupingBy(Student::getGender)));
        System.out.println(list);
    }
   /* public static void towLevelgrouping_3() {
        Map<List<String> , Map<String ,List<Student>>>   list = StudentDataBase.getAllStudents()
                .stream().collect(groupingBy(Student::getGradeLevel,summingInt(Student::getNoteBooks)));
        System.out.println(list);
    }*/


    public static void towLevelgrouping_4() {

        Map<String, Map<Integer, List<Student>>> list = StudentDataBase.getAllStudents()
                .stream().collect(Collectors.groupingBy(Student::getName, Collectors.groupingBy(Student::getNoteBooks)));
        System.out.println(list);

    }

    // using max method in grouping this maxBy method always return opitional
  /*  public static void groupingByMaxByMethod(){

         Map<Integer, Optional> list = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel, maxBy(Comparator.comparing(Student::getGpa))));
        System.out.println(list);
    }
*/
    /*public static void groupingByMinByMethod() {

        Map<Integer, Optional> list = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel, minBy(Comparator.comparing(Student::getGpa))));
        System.out.println(list);
    }*/
        public static void main(String[] args) {
     //   groupByMethod();
       // customizedMethod();
       towLevelgrouping_1();
       //     towLevelgrouping_2();
        //    towLevelgrouping_4();
        //    groupingByMaxMethod();
           //groupingByMinByMethod();

    }


}
