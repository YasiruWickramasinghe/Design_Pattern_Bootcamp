package _1_Creational_Design_Patterns._2_Factory_Method_Pattern;

// ConcreteCreatorB class
public class ConcreteCreatorB implements Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
