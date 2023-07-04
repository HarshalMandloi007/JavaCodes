package multiThreading;

public class SleepExample2 extends Thread{
    @Override
    public void run() {
        for (int i=1;i<=5;i++){
            try {
                System.out.println(i + " : " + Thread.currentThread().getName());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        SleepExample2 se = new SleepExample2();
        se.start();
        SleepExample2 se2 = new SleepExample2();
        se2.start();

    }
}
