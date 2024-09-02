package _2_Structural_Design_Patterns._3_Decorator_Pattern._1_Daily_Code_Buffer;

public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String bake() {
        return pizza.bake();
    }
}
