class Employee{
    void work()
    {
        System.out.println("Employee is working");
    }
}

class Programmer extends Employee{
    void work()
    {
        System.out.println("Programmer is doing coding");
    }
}
public class PolymorphismExample {
    public static void main(String[] args) {
    Employee e = new Employee();
    e.work();
    Programmer p = new Programmer();
    p.work();

    }
}
