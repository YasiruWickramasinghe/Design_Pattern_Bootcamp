package _2_Structural_Design_Patterns._3_Decorator_Pattern._1_Daily_Code_Buffer;

public class CheeseBurstDecorator extends PizzaDecorator{
    public CheeseBurstDecorator(Pizza pizza) {
        super(pizza);
    }
    public String bake() {
        return pizza.bake() + addCheese();
    }

    public String addCheese(){
        return "Cheese";
    }

}
