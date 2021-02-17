package exceptionhandling;

public class ExceptionPropagation {

    public static void main(String[] args) {
        ExceptionPropagation e = new ExceptionPropagation();
        e.c();
    }

    public void a(){
        int i = 10 / 0;
    }

    public void b(){
        this.a();
    }

    public void c(){
        try{
            this.b();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
