package _0_SOLID_Principles._5_Dependency_Inversion.Dependency_Inversion_Bad;

class LightBulb {
    public void turnOn() {
        System.out.println("Turning on");
    }

    public void turnOff() {
        System.out.println("Turning off");
    }
}

class Switch {
    private boolean on;
    private LightBulb bulb;

    public Switch(LightBulb bulb) {
        this.bulb = bulb;
        this.on = false;
    }

    public void press() {
        if (on) {
            bulb.turnOff();
        } else {
            bulb.turnOn();
        }
        on = !on;
    }
}

public class Main {
    public static void main(String[] args) {
        LightBulb bulb = new LightBulb();
        Switch switcher = new Switch(bulb);
        switcher.press();
        switcher.press();
    }
}
