package encapsulation;

public class Student {
    private int id;
    private String name;
    private String city;

    public static void main(String[] args) {

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}

class Main{
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(3);
        student.setName("Akash Raikwar");
        student.setCity("Amravati");
        System.out.println("ID is "+student.getId()+". Name is "+student.getName()+". City is "+student.getCity()+".");
    }
}
