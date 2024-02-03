package _2_Structural_Design_Patterns._3_Composite_Pattern;

// Client
public class Client {
    public static void main(String[] args) {
        // Create leaf components
        Leaf leaf1 = new Leaf("Leaf 1");
        Leaf leaf2 = new Leaf("Leaf 2");

        // Create composite components
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();

        // Build the composite structure
        composite1.add(leaf1);
        composite1.add(leaf2);
        composite2.add(new Leaf("Leaf 3"));

        Composite rootComposite = new Composite();
        rootComposite.add(composite1);
        rootComposite.add(composite2);

        // Perform operations on the composite structure
        rootComposite.operation();
    }
}

