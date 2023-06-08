class Student
{
    private int roll_no;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Student s = new Student();
        s.setRoll_no(101);
        s.setName("Abhay");
        System.out.println(s.getRoll_no());
        System.out.println(s.getName());
    }
}
