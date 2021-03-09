package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDemo implements Comparable<EmployeeDemo> {     //comparable -> single sorting sequence comparison like
                                                                    // only id or name or address
                                                                    //at a time
    int id;
    String name;
    String address;

    public EmployeeDemo(int id, String name, String address) {
        this.id = id ;
        this.name = name;
        this.address = address;
    }


    public static void main(String[] args) {
        EmployeeDemo employeeDemo1 = new EmployeeDemo(150, "a", "Pune");
        EmployeeDemo employeeDemo2 = new EmployeeDemo(27, "b", "Mumbai");
        EmployeeDemo employeeDemo3 = new EmployeeDemo(33, "c", "Nashik");

        List<EmployeeDemo> list = new ArrayList<>();
        list.add(employeeDemo1);
        list.add(employeeDemo2);
        list.add(employeeDemo3);


        Collections.sort(list);

        list.forEach(s -> {
            System.out.println(s.id + " " + s.name + " " + s.address);
        });
    }

    public int compareTo(EmployeeDemo employeeDemo) {           //by name
        return this.name.compareTo(employeeDemo.name);
    }

//    @Override
//    public int compareTo(EmployeeDemo employeeDemo) {         //by id
//        if (this.id == employeeDemo.id) {
//            return 0;
//        } else if (this.id > employeeDemo.id) {
//            return 1;
//        } else {
//            return -1;
//        }
//    }

}