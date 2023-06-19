package TestExample;

public class NumberFormatExample {
    public static void main(String [] args) {
        NumberFormatExample numberFormatExample = new NumberFormatExample();
        numberFormatExample.test();
    }
    public int test()
    {
        String s = "42";

            s = s.concat(".5");
            double d = Double.parseDouble(s);
            s = Double.toString(d);
            int x = (int) Math.ceil(Double.valueOf(s).doubleValue());
            System.out.println(x);
       return x;
    }
}
