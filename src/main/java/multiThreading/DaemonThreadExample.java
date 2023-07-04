package multiThreading;

class Test extends Thread{
    @Override
    public void run() {
        System.out.println("deamon thread");
    }
}

public class DaemonThreadExample {
    public static void main(String[] args) {
        System.out.println("main thread");
        Test t = new Test();
        t.setDaemon(true);
        t.start();
    }
}
