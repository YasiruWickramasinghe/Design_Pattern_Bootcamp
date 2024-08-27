package _1_Creational_Design_Patterns._2_Factory_Method_Pattern;
public class ConcreteProductB implements Product {
    @Override
    public void create() {
        System.out.println("Product B created.");
    }
}
