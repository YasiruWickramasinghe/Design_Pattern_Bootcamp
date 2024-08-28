package _2_Structural_Design_Patterns._6_Composite_Pattern;

// Leaf
public class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("Leaf: " + name + " - Performing operation");
    }
}
