package com.oops;
// Classes and Objects
public class Human {

    public String eat()
    {

        return "Eating";
    }

    public String walk()
    {
        return "Walking";
    }

    public static void main(String[] args) {
        Human h = new Human();
        h.eat();
        h.walk();
    }
}
