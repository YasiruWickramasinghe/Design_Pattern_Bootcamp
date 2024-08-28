package _2_Structural_Design_Patterns._3_Decorator_Pattern;

// Main.java
public class Main {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost: " + simpleCoffee.cost() + ", Description: " + simpleCoffee.getDescription());

        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println("Cost: " + milkCoffee.cost() + ", Description: " + milkCoffee.getDescription());

        Coffee sugarMilkCoffee = new SugarDecorator(milkCoffee);
        System.out.println("Cost: " + sugarMilkCoffee.cost() + ", Description: " + sugarMilkCoffee.getDescription());
    }
}
