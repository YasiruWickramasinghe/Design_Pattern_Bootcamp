package _1_Creational_Design_Patterns._5_Prototype_Pattern._2_AI_Generate;

// Client class to demonstrate the Prototype pattern
public class Client {
    public static void main(String[] args) {
        // Creating prototypes
        Prototype prototype1 = new ConcretePrototype1("Prototype 1");
        Prototype prototype2 = new ConcretePrototype2(42);

        // Cloning prototypes
        Prototype clonedPrototype1 = prototype1.clone();
        Prototype clonedPrototype2 = prototype2.clone();

        // Output
        System.out.println("Original Prototype 1: " + ((ConcretePrototype1) prototype1).getName());
        System.out.println("Cloned Prototype 1: " + ((ConcretePrototype1) clonedPrototype1).getName());

        System.out.println("Original Prototype 2: " + ((ConcretePrototype2) prototype2).getNumber());
        System.out.println("Cloned Prototype 2: " + ((ConcretePrototype2) clonedPrototype2).getNumber());
    }
}

