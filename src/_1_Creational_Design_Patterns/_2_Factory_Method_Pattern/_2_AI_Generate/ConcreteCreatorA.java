package _1_Creational_Design_Patterns._2_Factory_Method_Pattern;

// ConcreteCreatorA class
public class ConcreteCreatorA implements Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}

