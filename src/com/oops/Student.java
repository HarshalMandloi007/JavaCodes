package com.oops;

public class Student {
    int roll_no;
    String name;

    Student()
    {
        System.out.println("Default value");
    }

    Student(String name)
    {
        this.name = name;
        System.out.println("The name of student is: " +name );
    }
    Student(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name = name;
        System.out.println("The roll_no and name of student is: " +roll_no + "  " + name);
    }


    public static void main(String[] args) {
        Student s1 = new Student(101, "Rahul");
        Student s2 = new Student();
        Student s3 = new Student("Rohit");

    }
}
