package multithreading;

public class ThreadDemo2 {

    public static void main(String[] args) {
        Hi2 hi = new Hi2();
        Hello2 hello = new Hello2();
        Bye bye = new Bye();

        hi.start();
        bye.show();
        hello.start();
    }
}


class Hi2 extends Thread{

    public void run(){
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

class Hello2 extends Thread{
    public void run() {
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

class Bye{
    void show()
    {
        System.out.println("Bye..!!");
    }
}
