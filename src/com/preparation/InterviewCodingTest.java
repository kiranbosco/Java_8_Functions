package com.preparation;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.partitioningBy;

public class InterviewCodingTest {

    // hwo to dived add num and even num from the list
    public static void devideOddAndEvennum() {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Map<Boolean, List<Integer>> integerListMap = integerList.stream()
                .collect(partitioningBy(i -> i % 2 == 0));
        System.out.println(integerListMap);

//       Map<Boolean,List<Integer>> mapInt = integerList.stream()
//                .collect(Collectors.partitioningBy(i -> i%2==0 ));
//
//        System.out.println(mapInt);
    }

    public static void avoidDuplicateValues() {

        List<Integer> integerList = Arrays.asList(1, 1, 2, 2, 3, 4);
        List<Integer> integersInfo = integerList.stream()
                .distinct().collect(Collectors.toList());
        System.out.println(integersInfo);

    }

    public static void sortingInList() {
        List<String> stringList = Arrays.asList("Kiran", "Manoja", "Aarushi");
        List<String> stringList1 = stringList.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(stringList1);
    }

    public static void reverseStringOrder() {
        List<String> stringList = Arrays.asList("Az", "By", "Cx");
        List<String> reverse = stringList.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(reverse);
    }

    public static void addPrefixAndSuffix_Joins() {
        List<String> stringList = Arrays.asList("kumar", "purini", "kiran");
        List<String> prfixexe = Collections.singletonList(stringList.stream()
                .collect(Collectors.joining(",", "[", "]")));
        prfixexe.forEach(System.out::println);
    }

    public static void fid_Max_Min_Numbers() {
        List<Integer> maxMin = Arrays.asList(1, 44, 55, 66, 66);
        Optional<Integer> maxNumber = maxMin.stream().max(Comparator.naturalOrder());
        Optional<Integer> minNumber = maxMin.stream().min(Comparator.naturalOrder());

        System.out.println("MaxNumber values " + maxNumber + "MinNumber valus" + minNumber);

    }

    public static void find_second_LargestNumber() {
        // Creating a list of integers
     //   1. Create a list of integers
     //   2. Remove duplicates to ensure uniqueness of numbers
     //   3. Sort the stream in descending order
     //   4. Skip the largest number
      //  5. Find the second-largest number
     //   6. Display the second-largest number
        List<Integer> numbers = Arrays.asList(1, 3, 4, 5, 6, 6, 7, 2);
        Optional<Integer> integerOptional =  numbers.stream()
                .distinct() // take unique values first
                .sorted(Comparator.reverseOrder())
                .skip(1)// skip highest values
                .findFirst();

        integerOptional.ifPresent(x-> System.out.println( "Second Larger Number : {} " + x));
    }
    // how do you merge two arrays in singe array

    public static void mergeTwoIntegerNumbersValues() {
        int[] arrA = {1, 2, 3,};
        int[] arrB = {4, 5, 6};
        int[] arrC = IntStream.concat(Arrays.stream(arrA), Arrays.stream(arrB)).sorted().toArray();
        System.out.println(Arrays.toString(arrC));
    }

    public static void unsortedTwovaluse_Merge_without_duplicates() {

        int[] a = {4, 2, 5, 1};
        int[] b = {8, 1, 9, 5};
        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(c));

    }

    //How do you find common elements between two arrays?

    public static void findcommonelementsbetween_two_arrays() {
        List<String> stringList = Arrays.asList("kiran", "purini");
        List<String> stringList1 = Arrays.asList("kiran", "Manoja");

        List<String> list = stringList.stream()
                .filter(stringList1::contains)
                .collect(Collectors.toList());

        System.out.println(list);

    }

    public static void reverseString() {

        String reverseInput = "PURINI";
        //CONVERT STRING TO CAR-ARRAY
        char[] ch = reverseInput.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }

    }

    //Anagram : if two string are equals are not check here?
    public static Boolean isStringAnagram(String str1, String str2) {
        // check if the condition is false return false
        if (str1.length() != str2.length()) {
            return false;
        }
        // convert charArrays
        char ch[] = str1.toCharArray();
        char ch1[] = str2.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);
        return Arrays.equals(ch, ch1);
    }

    public static int sumOf2_num(List<Integer> sumNumb) {
        return sumNumb.stream().reduce(1, (a, b) -> a * b);
    }

    public static Integer fibonicSerice() {
        // each number is sum with provies number
        return IntStream.rangeClosed(1, 5)
                .map(Integer::new)
                .sum();
    }

    // find the odd number
    public static void fidnOddNumberfidnOddNumber() {


    }


    //find ovel in this method]
    public static boolean checkVovel_in_string(String str) {
        return str.matches(".*[aeiou]*.");
    }

    // find the prime number in java
    public static boolean givenNumber_is_primeOrNot(Integer num) {
// if prime number is divisible by 1 and itself
        for (int i = 2; i < num; i++) {
            if (num % 1 == 0) {
                return false; // if given number became O this is not a prime number
            }
        }
        return true;
    }


    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4);
        //   List<Integer> sumNumb =Arrays.asList(1,2,3,4);
        //    devideOddAndEvennum();
        //    avoidDuplicateValues();
        //  sortingInList();
//reverseStringOrder();
        //   addPrefixAndSuffix_Joins();
        //   fid_Max_Min_Numbers();
        //  mergeTwoIntegerNumbersValues();
        //    unsortedTwovaluse_Merge_without_duplicates();
        //  findcommonelementsbetween_two_arrays();
        // reverseStringOrder();
        // System.out.println(isStringAnagram("eat","tea"));
        //  unsortedTwovaluse_Merge_without_duplicates
        //     System.out.println(sumOf2_num(sumNumb));
        //    System.out.println(checkVovel_in_string("mano"));
        //      System.out.println(givenNumber_is_primeOrNot(3));
        //    System.out.println(fibonicSerice());
        //   fidnOddNumberfidnOddNumber();
        //   devideOddAndEvennum();
        // fidnOddNumberfidnOddNumber();
        find_second_LargestNumber();
    }
}
