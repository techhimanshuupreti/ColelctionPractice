package org.example;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionMain {
  public static void main(String[] args) {
    System.out.println("Hello world!");
//    List<String> stringList = new ArrayList<>();
//    stringList.add("JAI");
//    stringList.add("Karan");
//    stringList.add("JAI");
//    stringList.add("Amit");
//    System.out.println("Size = " + stringList.size());
//    List<String> stringList1 = new ArrayList<>();
//    stringList1.add("Uttam");
//    stringList1.add("Kamlesh");

//    synchronize ArrayList 1. Collection.synchronizedList() - Method - return synchronized list
    List<String> stringList = Collections.synchronizedList(new ArrayList<>());
    stringList.add("JAI");
    stringList.add("Karan");
    stringList.add("JAI");
    stringList.add("Amit");

    //add, remove - we do not need explicit  synchronization

    // to fetch/ traverse the values from this list -- we have to use explicit synchronization
    synchronized (stringList){
      Iterator<String> iterator = stringList.iterator();
      while(iterator.hasNext()){
        System.out.println(iterator.next());
      }
    }


//    synchronize ArrayList 2. copyOnWriteArrayList - class - Thread Safe variant of ArrayList
    // Thread-safe/synchronized already. ( At a time only one thread will work on this list)
    CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<>();
    empList.add("Tom");
    empList.add("Steve");
    empList.add("Naveen");

    // no need to explicit synchronization for any operation: add/remove/traverse
    Iterator<String> iterator2 = empList.iterator();
    while(iterator2.hasNext()){
      System.out.println(iterator2.next());
    }



//=======================================================
//    List<String> al = new ArrayList<>();
//    al.add("jai");
//    al.add("karan");
//    al.add("amit");

    System.out.println("----------");
//    stringList1.addAll(stringList);
//    stringList1.add(1,"add_in_1");
//    stringList1.addAll(1,stringList);
//    stringList1.stream().forEach(ele->System.out.println(ele));

//    System.out.println("Test contains = "+stringList.contains("jai"));
//    System.out.println("1----------");
//    stringList.stream().forEach(ele->System.out.println(ele));
//    System.out.println("Test containsAll = "+stringList.containsAll(al));
//    System.out.println("2----------");
//    stringList.stream().forEach(ele->System.out.println(ele));
//    System.out.println("Test index = ");
//    System.out.println(stringList.indexOf("jai")>0); // check contains value
//    System.out.println("3----------");
//    stringList.stream().forEach(ele->System.out.println(ele));
//
//    System.out.println("4----------");
//    stringList.stream().forEach(ele->System.out.println(ele));
//    System.out.println(stringList.lastIndexOf("JAI")); // get index value of last repeated value from starting values
//    System.out.println("5----------");
//    stringList.stream().forEach(ele->System.out.println(ele));
//    System.out.println("6----------");
//    stringList.stream().forEach(ele->System.out.println(ele));
//    System.out.println(stringList.remove("Jai")); // remove by value
//    System.out.println("7----------");
//    stringList.stream().forEach(ele->System.out.println(ele));
//    System.out.println(stringList.remove(1)); // remove by index
//    System.out.println("8----------");
//    stringList.stream().forEach(ele->System.out.println(ele));
//    System.out.println(stringList.removeIf(num-> num.startsWith("A"))); // remove by index
//    System.out.println("9----------");
//    stringList.stream().forEach(ele->System.out.println(ele));

//    stringList.retainAll(Collections.singleton("JAI")); // only match value will be return
//    System.out.println("10----------");
//    stringList.stream().forEach(ele->System.out.println(ele));

//    ArrayList<Integer> number1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13));
//    System.out.println(number1);
//    ArrayList<Integer> subNumber1 = new ArrayList<>(number1.subList(1,6));
//    System.out.println(subNumber1);

//    ArrayList<Integer> newList = new ArrayList<>(number1.subList(2,6));
//    System.out.println(number1);


//    System.out.println("----------");
//    stringList.stream().forEach(ele->System.out.println(ele));
//
//    System.out.println("----------");
//    stringList1.stream().forEach(ele->System.out.println(ele));
//    System.out.println("clear-----");
//    stringList1.clear();
//    System.out.println("after clear = "+ stringList1.size());
//    System.out.println("End---clear-----");
//
//    System.out.println("clone-----");
//    List<String> arrayListClone = (ArrayList<String>) ((ArrayList<String>) stringList1).clone();
//    System.out.println("after clone = "+ stringList1.size());
//    System.out.println("End---clone-----");
//
//    // Iterator
//    Iterator<String> stringIterator = stringList.iterator();
//    while (stringIterator.hasNext()){
//      System.out.println("iterator "+stringIterator.next());
//    }
//    System.out.println("----------");
//    ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Jai","Karan"));
//    arrayList.stream().forEach(ele->System.out.println(ele));

//    List<Employee> employeeList = new ArrayList<>();
//    employeeList.add(new Employee("jai",10));
//    employeeList.add(new Employee("Amit",20));
//
//    List<Employee> employeeList1 = new ArrayList<>();
//    employeeList1.add(new Employee("jai",10));
//    employeeList1.add(new Employee("Arun",20));
////    if (employeeList.retainAll(Collections.singleton(employeeList1.get(1)))) {
////      System.out.println("true"+Collections.singleton(employeeList1.get(1)));
////      System.out.println("value"+employeeList.stream().collect(Collectors.toList()));
////      System.out.println("value"+employeeList1.stream().collect(Collectors.toList()));
////    }else {
////      System.out.println("False"+Collections.singleton(employeeList1.get(1)));
////      System.out.println("value"+employeeList.stream().collect(Collectors.toList()));
////      System.out.println("value"+employeeList1.stream().collect(Collectors.toList()));
////    }
//
//    employeeList.addAll(employeeList1);
//    System.out.println("False"+employeeList.stream().collect(Collectors.toList()));
//
////    if (stringList.retainAll(Collections.singleton(stringLista.get(1)))) {
////      System.out.println("true"+Collections.singleton(stringLista.get(1)));
////      System.out.println("value"+stringList.stream().collect(Collectors.toList()));
////      System.out.println("value"+stringLista.stream().collect(Collectors.toList()));
////    }else {
////      System.out.println("False"+Collections.singleton(stringLista.get(1)));
////      System.out.println("value"+stringList.stream().collect(Collectors.toList()));
////      System.out.println("value"+stringLista.stream().collect(Collectors.toList()));
////    }

  }
}