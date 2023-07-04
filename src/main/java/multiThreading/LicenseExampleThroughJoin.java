package multiThreading;

class Medical extends Thread{
    public void run() {
        try {
            System.out.println("Medical starts");
            Thread.sleep(2000);
            System.out.println("Medical Completed");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

class TestDriver extends Thread{
    public void run() {
        try{
            System.out.println("Test drive starts");
            Thread.sleep(2000);
            System.out.println("Test drive completed");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

class OfficerSign extends Thread{
    public void run() {
        try{
            System.out.println("Officer takes the file");
            Thread.sleep(2000);
            System.out.println("Officer works completed");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

public class LicenseExampleThroughJoin {
    public static void main(String[] args) throws InterruptedException {
    Medical m = new Medical();
    m.start();
    m.join();
    TestDriver td = new TestDriver();
    td.start();
    td.join();
    OfficerSign os = new OfficerSign();
    os.start();
    }
}
