package org.example.list;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashmapPractice {
    public static void main(String... arg){
        HashMap<String,Integer> marks = new HashMap<>();
        marks.put("Naveen",100);
        marks.put("Tom",200);
        marks.put("Lisa",300);
        marks.put("Peter",400);
        marks.put("Robby",500);
        marks.put(null,600);


        // initializing ways
        // using SimpleEntry: mutable map
        Map<String,String> map1 = Stream.of(
                new AbstractMap.SimpleEntry<>("Naveen","Java"),
                new AbstractMap.SimpleEntry<>("Tom","Python")
        ).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        map1.put("Robby","500");
        System.out.println(map1.get("Robby"));

        // using SimpleEntry: mutable     map
        Map<String,String> map2 = Stream.of(
                new AbstractMap.SimpleImmutableEntry<>("Naveen","Java"),
                new AbstractMap.SimpleImmutableEntry<>("Tom","Python")
        ).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        map2.put("Robby","500");
        System.out.println(map1.get("Robby"));
    }
}
