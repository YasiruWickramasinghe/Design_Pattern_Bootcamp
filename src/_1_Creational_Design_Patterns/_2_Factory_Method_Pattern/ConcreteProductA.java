package _1_Creational_Design_Patterns._2_Factory_Method_Pattern;

// ConcreteProductA class
public class ConcreteProductA implements Product {
    @Override
    public void create() {
        System.out.println("Product A created.");
    }
}

