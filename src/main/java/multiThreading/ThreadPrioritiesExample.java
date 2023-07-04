package multiThreading;

import static java.lang.Thread.MIN_PRIORITY;

class Test1 extends Thread {
    @Override
    public void run() {
        System.out.println("child thread");
        System.out.println("Child thread priority : " + Thread.currentThread().getPriority());
    }
}

public class ThreadPrioritiesExample {
    public static void main(String[] args) {
        System.out.println("main thread");
        System.out.println("Main thread old priority : " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(MIN_PRIORITY);
        System.out.println("Main thread new priority : " + Thread.currentThread().getPriority());
        Test1 t1 = new Test1();
        t1.start();
        t1.setPriority(10);
    }
}
