package org.example.list;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String... arg){

        // Immutability List creation
        List<String> immutableStringList = List.of("Apple","Bat","Cat");
        System.out.println(immutableStringList);
//        immutableStringList.add("Jai"); //if add this list then give exception throw name is UnsupportedOperationException
//        System.out.println(immutableStringList);

        // mutability List creation
        List<String> mutableStringList = new ArrayList<>(immutableStringList);
        mutableStringList.add("Jai");
        System.out.println(mutableStringList);
    }
}
