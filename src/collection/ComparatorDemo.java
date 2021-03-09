package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    int id;
    String name;
    String address;

    public ComparatorDemo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        ComparatorDemo employeeDemo1 = new ComparatorDemo(1, "a", "Pune");
        ComparatorDemo employeeDemo2 = new ComparatorDemo(1, "b", "Mumbai");
        ComparatorDemo employeeDemo3 = new ComparatorDemo(33, "c", "Nashik");


        List<ComparatorDemo> list = new ArrayList<>();
        list.add(employeeDemo1);
        list.add(employeeDemo2);
        list.add(employeeDemo3);


        Comparator<ComparatorDemo> comparator = Comparator.comparing(ComparatorDemo::getId).reversed()
                .thenComparing(ComparatorDemo::getName).thenComparing(ComparatorDemo::getAddress);

        Collections.sort(list, comparator);

        list.forEach(s -> {
            System.out.println(s.id + " " + s.name + " " + s.address);
        });


    }
}