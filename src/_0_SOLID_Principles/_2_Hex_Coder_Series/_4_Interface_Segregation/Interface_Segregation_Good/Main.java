package _0_SOLID_Principles._4_Interface_Segregation.Interface_Segregation_Good;

interface Vehicle {
    void move();
}

interface VehicleWithEngine extends Vehicle {
    void startEngine();
}

interface FlyingVehicle extends Vehicle {
    void fly();
}

class Bicycle implements Vehicle {
    @Override
    public void move() {
        System.out.println("I like to move it move it!");
    }
}

class Car implements VehicleWithEngine {
    @Override
    public void move() {
        System.out.println("move!");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting!");
    }
}

class Plane implements VehicleWithEngine, FlyingVehicle {
    @Override
    public void move() {
        System.out.println("I can move");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle bicycle = new Bicycle();
        bicycle.move();

        VehicleWithEngine car = new Car();
        car.move();
        ((Car) car).startEngine();

        VehicleWithEngine plane = new Plane();
        plane.move();
        ((Plane) plane).startEngine();
        ((FlyingVehicle) plane).fly();
    }
}
