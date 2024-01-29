package _1_Creational_Design_Patterns._4_Prototype_Pattern;

// ConcretePrototype1 class implementing the Prototype interface
public class ConcretePrototype1 implements Prototype {
    private String name;

    public ConcretePrototype1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype1(this.name);
    }
}
