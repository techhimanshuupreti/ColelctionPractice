package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>
            (Arrays.asList(1,2,3,4,5,1,1,4,3,2,5,6,7,7,8,9));
    System.out.println(numbers);
//    1. LinkedHashSet
    System.out.println("Starting LinkedHashSet and Time "+ System.currentTimeMillis());
    LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);
    System.out.println("end LinkedHashSet and Time "+ System.currentTimeMillis());
    ArrayList<Integer> duplicateNumberRemove = new ArrayList<>(linkedHashSet);
    System.out.println("end ArrayList and Time "+ System.currentTimeMillis()); // 16 millis second
    System.out.println(duplicateNumberRemove);

//    2. JDK 1.8 - Stream
    System.out.println("Starting Stream and Time "+ System.currentTimeMillis());
    ArrayList<Integer> markNumber = new ArrayList<>
            (Arrays.asList(1,2,3,4,5,1,1,4,3,2,5,6,7,7,8,9));
    System.out.println(numbers);
    List<Integer> duplicateNumberRemoveList =  markNumber.stream().distinct().collect(Collectors.toList());
    System.out.println(duplicateNumberRemoveList);
    System.out.println("Starting Stream and Time "+ System.currentTimeMillis());








  }
}
