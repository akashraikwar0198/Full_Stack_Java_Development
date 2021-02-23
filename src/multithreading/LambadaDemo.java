package multithreading;

public class LambadaDemo {

    public static void main(String[] args)
    {
        LambadaInterface s =(str1,str2)-> str1+str2;
        System.out.println(s.concat("Pune","Mumbai"));

    }
}

@FunctionalInterface
interface LambadaInterface{
    public String concat(String a, String b);
}
