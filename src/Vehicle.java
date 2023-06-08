abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle
{
    @Override
    void start() {
        System.out.println("Car start with key");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike start with kick");
    }


    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        Bike b = new Bike();
        b.start();
    }
}