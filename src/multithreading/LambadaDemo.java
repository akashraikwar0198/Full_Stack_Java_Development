package multithreading;

public class LambadaDemo {

    public static void main(String[] args)
    {
        LambadaInterface s = (str1,str2) -> str1+str2;
        System.out.println(s.concat("Pune"," the Best City"));
    }
}

@FunctionalInterface
interface LambadaInterface{             //only one abstract method (functional interface)
    String concat(String a, String b);
}
