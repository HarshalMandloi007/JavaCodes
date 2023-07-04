package multiThreading;

class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("Playing video");
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        System.out.println("Playing music");
    }
}

class MyThread3 extends Thread{
    @Override
    public void run() {
        System.out.println("Progress bar is executing");
    }
}

public class MultithreadingExample3 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.start();
        MyThread2 t2 = new MyThread2();
        t2.start();
        MyThread3 t3 = new MyThread3();
        t3.start();
    }
}
