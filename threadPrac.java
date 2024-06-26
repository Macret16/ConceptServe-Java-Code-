import java.lang.Thread;

class A implements Runnable {
    synchronized public void run() {
        System.out.println("Thread ran");
        System.out.println("run run run run");
        System.out.println("Thread A Ended!");
    }
}

class B implements Runnable {
    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread A: i=" + i);
            }
            System.out.println("Thread B Ended!");
        }
    }
}

class A1 {
}

public class threadPrac extends Thread {
    public static void main(String[] args) throws InterruptedException {
        A t1 = new A();
        B t2 = new B();
        // t1.run();
        // t2.run();

        int q = 5; // Number of threads
        for (int i = 0; i < q; i++) {
            Thread t3 = new Thread(t2);
            t3.start();
        }

        // Thread thread = new Thread();
        // thread.start();
    }
}
