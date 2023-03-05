package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListCompare {
  public static void main(String[] args) {
    List<String> l1 = Collections.synchronizedList(new ArrayList<>());
    l1.add("JAI");
    l1.add("Karan");
    l1.add("JAI");
    l1.add("Amit");

    List<String> l2 = Collections.synchronizedList(new ArrayList<>());
    l2.add("JAI");
    l2.add("Karan");
    l2.add("JAI");
    l2.add("Amit");

    Collections.sort(l2);
  }
}
