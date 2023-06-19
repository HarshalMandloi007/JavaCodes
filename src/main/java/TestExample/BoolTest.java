package TestExample;

public class BoolTest {
    public static void main(String [] args) {
        BoolTest boolTest = new BoolTest();
        boolTest.checkBoolean();
    }
    public boolean  checkBoolean()
    {
        Boolean b1 = new Boolean("false");
        boolean b2;
        b2 = b1.booleanValue();
        if (!b2)
        {
            b2 = true;
            System.out.print("x ");
        }
        if (b1 & b2)
        {
            System.out.print("y ");
        }
        System.out.println("z");
        boolean result = !b2 && (b1&b2);
       return result ;
    }
}
