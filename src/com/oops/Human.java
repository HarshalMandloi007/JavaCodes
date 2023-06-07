package com.oops;
// Classes and Objects
public class Human {

    public void eat()
    {
        System.out.println("Eating");
    }

    public void walk()
    {
        System.out.println("Walking");
    }

    public static void main(String[] args) {
        Human h = new Human();
        h.eat();
        h.walk();
    }
}
