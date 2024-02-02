package _2_Structural_Design_Patterns._2_Decorator_Pattern;

// MilkDecorator.java
public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Milk";
    }

    @Override
    public double cost() {
        return super.cost() + 0.5;
    }
}
