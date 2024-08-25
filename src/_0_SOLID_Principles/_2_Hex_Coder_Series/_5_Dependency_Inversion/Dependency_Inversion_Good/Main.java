package _0_SOLID_Principles._2_Hex_Coder_Series._5_Dependency_Inversion.Dependency_Inversion_Good;

import java.util.Scanner;

interface Switchable {
    void turnOn();
    void turnOff();
}

class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off");
    }
}

class TV implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Turning on TV");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off TV");
    }
}

class Switch {
    private boolean on;
    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
        this.on = false;
    }

    public void press() {
        if (on) {
            device.turnOff();
        } else {
            device.turnOn();
        }
        on = !on;
    }
}

public class Main {
    public static void main(String[] args) {
        Switchable bulb = new LightBulb();
        Switchable tv = new TV();

        Switch switch1 = new Switch(bulb);
        switch1.press();
        switch1.press();

        Switch switch2 = new Switch(tv);
        switch2.press();
        switch2.press();
    }
}

