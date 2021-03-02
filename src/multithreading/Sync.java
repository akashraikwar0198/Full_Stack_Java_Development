package multithreading;

public class Sync {

    int num;

    public static void main(String[] args) throws InterruptedException {
        Sync sync = new Sync();
        Thread thread1 = new Thread(new Runnable() {

            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    sync.show();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    sync.show();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println(sync.num);
    }

    public synchronized void show(){            //synchronized keyword will give the exact correct output.
        num++;
    }
}