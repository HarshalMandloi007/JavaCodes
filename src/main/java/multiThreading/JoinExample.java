package multiThreading;

public class JoinExample extends Thread{
    @Override
    public void run() {
        try{
            for(int i=1;i<=5;i++){
                System.out.println("child thread : "+i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JoinExample2 j = new JoinExample2();
        j.start();
        j.join();
            try{
                for(int i=1;i<=5;i++){
                    System.out.println("main thread : "+i);
                    Thread.sleep(1000);
                }
            }
            catch (Exception e){
                System.out.println(e);
        }
    }
}
