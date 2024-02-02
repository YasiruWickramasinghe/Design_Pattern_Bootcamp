package _2_Structural_Design_Patterns._2_Decorator_Pattern;

// SimpleCoffee.java
public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}

