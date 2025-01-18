package org.interview.common.code;

class ThreadRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("ThreadRunnable1 is running");
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread t1 is running");
        });
        Thread t2 = new Thread(() -> {
            try {
                t1.join();
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Thread t2 is running");
        });
        Thread t3 = new Thread(() -> {
            try {
                t2.join();
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Thread t3 is running");
        });
        t1.start();
        t2.start();
        t3.start();
        // using runnable
        Thread tr = new Thread(new ThreadRunnable() {
            @Override
            public void run() {
                System.out.println("ThreadRunnable2 is running");
            }
        });
        tr.start();
        Thread tr2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("ThreadRunnable3 is running");
            }
        });
        tr2.start();
    }
}
