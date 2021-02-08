package inheritance;

public class singlelevel {
    int a,b,c;

    public void addition(){
        c = a + b;
    }
}

class A extends singlelevel{

    public void subtraction(){
        c = a - b;
    }
    public static void main(String[] args) {
        A a = new A();
        a.a=5;
        a.b=6;
        a.addition();
        System.out.println("Addition is "+a.c);
        a.subtraction();
        System.out.println("Subtraction is "+a.c);
    }
}
