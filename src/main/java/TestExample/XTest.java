package TestExample;

public class XTest {
    public static void main(String[] args) {
        XTest t = new XTest();
        t.test();
    }
    public String test(){
        try {
            badMethod();
            System.out.print("A");
        } catch (RuntimeException ex) {
            System.out.print("B");
        } catch (Exception ex1) {
            System.out.print("C");
        } finally {
            System.out.print("D");
        }
        System.out.print("E");
        return "BDE";
    }

    public static void badMethod() {
        throw new RuntimeException();
    }
}


