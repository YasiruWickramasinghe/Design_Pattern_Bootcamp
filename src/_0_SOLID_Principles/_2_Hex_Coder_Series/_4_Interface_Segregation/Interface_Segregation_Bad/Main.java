package _0_SOLID_Principles._2_Hex_Coder_Series._4_Interface_Segregation.Interface_Segregation_Bad;

interface Vehicle {
    void startEngine();
    void move();
    void fly();
}

class Bicycle implements Vehicle {
    @Override
    public void move() {
        System.out.println("I like to move it move it!");
    }

    @Override
    public void startEngine() {
        // Bicycle doesn't have an engine to start, so leave it empty
    }

    @Override
    public void fly() {
        // Bicycle cannot fly, so leave it empty
    }
}

class Plane implements Vehicle {
    @Override
    public void fly() {
        System.out.println("I believe I can fly!");
    }

    @Override
    public void startEngine() {
        // Plane has an engine that needs to be started, but for simplicity, we'll leave it empty
    }

    @Override
    public void move() {
        // Plane can move on the ground, but for simplicity, we'll leave it empty
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle bicycle = new Bicycle();
        bicycle.move();

        Vehicle plane = new Plane();
        plane.fly();
    }
}

