package collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DuplicatesAvoid {

    public static void main(String[] args) {
// distinct()
        List<Integer> integerList = Arrays.asList(1,5,1,1,5,4,2,3);
        List<Integer>  list = integerList.stream().distinct().collect(Collectors.toList());
        System.out.println(list);

        //count()
       Long li=  integerList.stream().count();
        System.out.println(li);
//sum()
    int ins=  IntStream.of(1,5,10).sum();
        System.out.println(ins);

        //max()
        int num = Stream.of(10,2,5,6,0,10).max(Comparator.comparing(Integer::intValue)).get();
        System.out.println(num);

        //Min()
        int num1 =Stream.of(10,2,5,6,0,10).min(Comparator.comparing(Integer::intValue)).get();
        System.out.println(num1);

        //avg




    }

}
