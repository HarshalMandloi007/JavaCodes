class Calculator
{
    public int add(int a, int b, int c)
    {
        return a+b+c;
    }
    public int add(int a, int b)
    {
        return a + b;
    }

    public double add(double a, double b)
    {
        return a + b;
    }
}

public class PolymorphismExample2 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int i = cal.add(10,20,30);
        int j = cal.add(20,40);
        double k = cal.add(20,10);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}
