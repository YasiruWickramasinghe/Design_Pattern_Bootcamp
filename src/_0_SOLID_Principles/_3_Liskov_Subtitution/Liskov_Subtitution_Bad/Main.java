package _0_SOLID_Principles._3_Liskov_Subtitution.Liskov_Subtitution_Bad;

import java.util.List;
import java.util.ArrayList;

interface Bird {
    void fly();
    void walk();
}

class Eagle implements Bird {
    @Override
    public void walk() {
        System.out.println("Eagles can walk!");
    }

    @Override
    public void fly() {
        System.out.println("Eagles can fly!");
    }
}

class Penguin implements Bird {
    @Override
    public void walk() {
        System.out.println("Penguins can walk!");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly!");
    }
}

public class Main {
    public static void shooShoo(List<Bird> birds) {
        for (Bird bird : birds) {
            bird.walk();
            bird.fly();
        }
    }

    public static void main(String[] args) {
        List<Bird> birds = new ArrayList<>();
        birds.add(new Eagle());
        birds.add(new Penguin());
        shooShoo(birds);
    }
}
