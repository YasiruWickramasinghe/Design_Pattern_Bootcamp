package _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern;

// Client code
public class Client {
    public static void main(String[] args) {
        // Create Factory 1 and use it to create products
        AbstractFactory factory1 = new ConcreteFactory1();
        ProductA productA1 = factory1.createProductA();
        ProductB productB1 = factory1.createProductB();

        productA1.display();
        productB1.show();

        System.out.println();

        // Create Factory 2 and use it to create products
        AbstractFactory factory2 = new ConcreteFactory2();
        ProductA productA2 = factory2.createProductA();
        ProductB productB2 = factory2.createProductB();

        productA2.display();
        productB2.show();
    }
}
