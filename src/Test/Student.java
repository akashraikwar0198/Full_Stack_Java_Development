package Test;

public class Student {
    int rollno;
    String name;
    long contactno;
    float marks;

    public Student(int rollno, String name, double contactno, float marks)
    {
        this.rollno = rollno;
        this.name = name;
        this.contactno = (long) contactno;
        this.marks = marks;
    }

    public void display()
    {
        System.out.println("Roll No. -> " + rollno);
        System.out.println("Name -> " + name);
        System.out.println("Contact No. -> " + contactno);
        System.out.println("Marks -> " + marks);
    }
}

class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student(1, "Akash", 1234567890, 98);
        student.display();
    }
}