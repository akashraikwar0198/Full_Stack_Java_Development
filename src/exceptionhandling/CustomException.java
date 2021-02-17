package exceptionhandling;

public class CustomException {

    public static void main(String[] args) {
        int i=1;

        if(i>0){
            try{
                throw new Exception("i is greater than 0.");
            } catch (Exception exception){
                exception.printStackTrace();
            }
        }
    }
}

class MyException extends Exception{

    public MyException(String msg){
        super(msg);
    }

}