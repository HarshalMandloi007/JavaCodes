package com.oops;
class Animal{
    void eat(){System.out.println("eating...");}
    
}
class Lion extends Animal{
    void roar(){System.out.println("roaring...");}
}

public class InheritanceExample1 {
    public static void main(String[] args) {
        Lion l = new Lion();
        l.roar();
        l.eat();
    }
}
