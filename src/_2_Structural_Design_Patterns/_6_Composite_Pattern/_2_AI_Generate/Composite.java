package _2_Structural_Design_Patterns._6_Composite_Pattern;

import java.util.ArrayList;
import java.util.List;

// Composite
public class Composite implements Component {
    private List<Component> children = new ArrayList<>();

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void operation() {
        System.out.println("Composite - Performing operation");
        for (Component child : children) {
            child.operation();
        }
    }
}
