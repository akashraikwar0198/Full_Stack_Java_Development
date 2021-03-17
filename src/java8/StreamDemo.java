package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * intermediate -> map(),filter(),sorted()
 * termination -> forEach(), collect(), reduce();
 */

public class StreamDemo {

    public static void main(String[] args) {

        Student student = new Student();
        student.id = 1;
        student.name = "Sachin";
        student.marks = 90;

        Student student1 = new Student();
        student1.id = 2;
        student1.name = "Akash";
        student1.marks = 70;

        Student student2 = new Student();
        student2.id = 3;
        student2.name = "Yogesh";
        student2.marks = 50;

        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student1);
        list.add(student2);


        list.stream()
                .filter(f -> f.marks >= 70)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        List<Integer> mapEx = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        mapEx.stream()
                .map(m -> m * 2)        //maps and performs operation on each element
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println();

        List<Integer> sortedEx = Arrays.asList(12, 22, 32, 4, 5, 6, 71);
        sortedEx
                .stream()
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);

        List<String> reduceEx = Arrays.asList("work","is","worship");
        reduceEx.stream().reduce((e1,e2)->e1.length()>e2.length()?e1:e2);
    }
}

class Student {

    int id;
    String name;
    int marks;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}