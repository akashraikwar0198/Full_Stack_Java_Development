package java8;

interface MyInterface {

    static String msg() {
        return "In static method";
    }

    String show();

    default String display() {
        return "In display";
    }

}

public class DefaultAndStatic implements MyInterface {

    public static void main(String[] args) {
        DefaultAndStatic obj = new DefaultAndStatic();
        System.out.println(obj.show());
        System.out.println(obj.display());
        System.out.println(MyInterface.msg());
    }

    @Override
    public String show() {
        return "Hii";
    }
}