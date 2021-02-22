package multithreading;

public class ThreadDemo {

    public static void main(String[] args) {
        Hi hi = new Hi();
        Hello hello = new Hello();

        hi.show();
        hello.show();
    }
}


class Hi{

    public void show(){
        for(int i=1; i<=5; i++){
            System.out.println("Hi..!!");
            try{
                Thread.sleep(500);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class Hello extends Thread{
    public void show() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello..!!");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
