package _1_Creational_Design_Patterns._5_Prototype_Pattern._2_AI_Generate;

// ConcretePrototype2 class implementing the Prototype interface
public class ConcretePrototype2 implements Prototype {
    private int number;

    public ConcretePrototype2(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype2(this.number);
    }
}

