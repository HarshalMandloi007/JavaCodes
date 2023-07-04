package multiThreading;

public class MultithreadingExample extends Thread{
    public void run() {
        System.out.println("Thread Safe");
    }

    public static void main(String[] args) {
        MultithreadingExample m = new MultithreadingExample();
        m.start();
    }
}
