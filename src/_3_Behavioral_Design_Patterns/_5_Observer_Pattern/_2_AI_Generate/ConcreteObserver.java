package _3_Behavioral_Design_Patterns._5_Observer_Pattern;

public class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received an update: " + message);
    }
}

