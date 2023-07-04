package multiThreading;

public class InterruptedAndIsInterruptedExample extends Thread {
    public void run() {
        System.out.println("A: " + Thread.interrupted());
        System.out.println("B: " + Thread.interrupted());
        System.out.println("A: " + Thread.currentThread().isInterrupted());
        System.out.println("B: " + Thread.currentThread().isInterrupted());
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Thread Interrupted :- " + e);
        }
    }

    public static void main(String[] args) {
        InterruptedAndIsInterruptedExample ii = new InterruptedAndIsInterruptedExample();
        ii.start();
        ii.interrupt();
    }
}
