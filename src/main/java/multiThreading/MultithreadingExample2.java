package multiThreading;

public class MultithreadingExample2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread task");
    }


    public static void main(String[] args) {
        MultithreadingExample2 m2 = new MultithreadingExample2();
        Thread t = new Thread(m2);
        t.start();
    }
}
