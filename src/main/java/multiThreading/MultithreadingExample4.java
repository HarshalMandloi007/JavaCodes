package multiThreading;
class Thread1 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread task: " +Thread.currentThread().getName());
    }
}

public class MultithreadingExample4 {
    public static void main(String[] args) {
        System.out.println("Hello: " +Thread.currentThread().getName());
        Thread1 t = new Thread1();
        t.setName("This one is t thread");
        t.start();
        Thread1 t2 = new Thread1();
        t2.setName("This one is t2 thread");
        t2.start();
    }
}
