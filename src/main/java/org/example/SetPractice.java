package org.example;

import java.util.HashSet;
import java.util.Iterator;

public class SetPractice {

    public static class Student {
        //        implements Comparable<Student> {
        private int rollNo;
        private String name;
        private int age;

        public Student(int rollNo, String name, int age) {
            this.rollNo = rollNo;
            this.name = name;
            this.age = age;
        }


//        @Override
//        public int compareTo(Student o) {
//            if (this.rollNo > o.rollNo) {
//                return 1;
//            } else if (this.rollNo == o.rollNo) {
//                return 0;
//            } else {
//                return -1;
//            }

        @Override
        public int hashCode() {
            return this.rollNo;
        }
//        }

        @Override
        public String toString() {
            return "RollNo-" + this.rollNo + ", Name-" + this.name + ", Age-" + this.age;
        }
    }


    public static void main(String... arg) {

//        TreeSet<Student> students = new TreeSet<>();
        HashSet<Student> students = new HashSet<>();
//        LinkedHashSet students = new LinkedHashSet<>();
        Student studentValue = new Student(5, "Shyam", 18);
        students.add(new Student(3, "Raj", 20));
        students.add(studentValue);
        students.add(new Student(1, "Ram", 19));
        students.add(new Student(4, "Sunil", 25));
        students.add(new Student(2, "Ajay", 26));
        students.add(new Student(3, "Ajay", 26));
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            System.out.println("While " + it.next());
        }

        students.stream().forEach(ele -> System.out.println("Stream " + ele));

        for (Object student : students) {
            System.out.println("For object " + student);
        }

        System.out.println("check element found " + students.contains(studentValue));
        System.out.println("to List "+students.stream().toList());
        System.out.println(students.isEmpty());
        students.clear();
        System.out.println(students.isEmpty());
        students.stream().forEach(ele -> System.out.println("Stream " + ele));


    }

}
