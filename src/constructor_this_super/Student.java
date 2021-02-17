package constructor_this_super;

import java.util.ArrayList;
import java.util.List;

public class Student {

    //instance variables
    int id;
    String name;
    String address;

    public Student(int id, String name, String address)     //local variables
    {
        this.id = id;
        this.name = name;
        this.address = address;
        System.out.println("In constructor.");
    }

    public Student()
    { }

    public static void main(String[] args) {
        Student student = new Student(1, "Harry", "London ");
        Student student1 = new Student(2, "Liam", "London");
        Student student2 = new Student(3, "Niall", "London");
        Student student3 = new Student(4, "Louis", "London");
        student.show();

        List <Student> list = new ArrayList<>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);

        list.forEach(s->{
            System.out.println("id -> "+s.id+"\t Name ->"+s.name+"\t Address ->"+s.address);
        });
    }

    private void show() {
        System.out.println("id->" + id + " Name->" + name + " Address->" + address);
    }
}
