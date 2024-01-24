package _1_Creational_Design_Patterns._2_Factory_Method_Pattern;

public class Client {
    public static void main(String[] args) {
        // Using Factory Method pattern
        Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.createProduct();
        productA.create();

        Creator creatorB = new ConcreteCreatorB();
        Product productB = creatorB.createProduct();
        productB.create();
    }
}
