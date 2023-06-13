package com.oops;

interface Bank1{
    float rateOfInterest();
}

class HDFC implements Bank1
{
    @Override
    public float rateOfInterest() {
        return 6.5f;
    }
}

class IDFC implements Bank1
{
    @Override
    public float rateOfInterest() {
        return 8.5f;
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Bank1 b = new HDFC();
        Bank1 b1 = new IDFC();
        System.out.println("com.oops.HDFC rate of interest is: " + b.rateOfInterest());
        System.out.println("com.oops.IDFC rate of interest is: " + b1.rateOfInterest());
    }
}
