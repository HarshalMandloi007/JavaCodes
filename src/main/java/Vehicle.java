abstract class Vehicle {
    abstract Object start();
}

class Car extends Vehicle
{
    @Override
    Object start() {
        return "Car start with key";
    }
}

class Bike extends Vehicle {
    Object start() {
        return "Bike start with kick";
    }


    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        Bike b = new Bike();
        b.start();
    }
}