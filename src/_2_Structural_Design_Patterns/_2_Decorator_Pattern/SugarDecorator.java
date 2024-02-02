package _2_Structural_Design_Patterns._2_Decorator_Pattern;

// SugarDecorator.java
public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Sugar";
    }

    @Override
    public double cost() {
        return super.cost() + 0.2;
    }
}

