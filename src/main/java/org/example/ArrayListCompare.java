package org.example;

import java.util.*;

public class ArrayListCompare {
    public static void main(String[] args) {
//        List<String> l1 = Collections.synchronizedList(new ArrayList<>());
        List<String> l1 = new ArrayList<>();
        l1.add("JAI");
        l1.add("Karan");
        l1.add("JAI");
        l1.add("Amit");
        ArrayList<Integer> number1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13));

        Arrays.sort(l1.toArray());// convert to List in Array
        System.out.println("Binary Search = "+Arrays.binarySearch(number1.toArray(),4));
        l1.stream().forEach(value -> System.out.println("Stream " + value));

        // using JDK 1.8 stream
        System.out.println("Start Stream -- "+System.currentTimeMillis());
        l1.stream().forEach(value -> System.out.println("Stream " + value));
        System.out.println("End Stream -- "+System.currentTimeMillis());

        // for loop normal
        System.out.println("Start for loop normal -- "+System.currentTimeMillis());
        int size = l1.size();
        for (int i = 0; i < size; i++) {
            System.out.println("For " + l1.get(i));
        }
        System.out.println("Start for loop normal -- "+System.currentTimeMillis());

        // enhance for loop
        System.out.println("Start enhance for loop "+System.currentTimeMillis());
        for(String str : l1){
            System.out.println("enhance for loop "+str);
        }
        System.out.println("end enhance for loop "+System.currentTimeMillis());

        // while loop
        System.out.println("Start While loop "+System.currentTimeMillis());
        int j = 0;
        while (j < size) {
            System.out.println("While " + l1.get(j));
            j++;
        }
        System.out.println("End While loop "+System.currentTimeMillis());

        // iterator
        System.out.println("Start iterator "+System.currentTimeMillis());
        Iterator iterator = l1.iterator();
        while(iterator.hasNext()){
            System.out.println("Iterato "+iterator.next());
        }
        System.out.println("End iterator "+System.currentTimeMillis());

//
//    List<String> l2 = Collections.synchronizedList(new ArrayList<>());
//    l2.add("JAI");
//    l2.add("Karan");
//    l2.add("JAI");
//    l2.add("Amit");
//
//    Collections.sort(l2);
    }
}
