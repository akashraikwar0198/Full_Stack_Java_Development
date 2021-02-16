package exceptionhandling;

public class ThrowThrowsDemo {

    public static void main(String[] args) throws Exception{

        int i = 17;

        if (i<18){
            throw new Exception("You cannot vote.");
        }
        else
            System.out.println("You can vote.");
    }
}
