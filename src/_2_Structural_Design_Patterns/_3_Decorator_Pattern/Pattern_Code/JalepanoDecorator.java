package _2_Structural_Design_Patterns._3_Decorator_Pattern._1_Daily_Code_Buffer;

public class JalepanoDecorator extends PizzaDecorator{
    public JalepanoDecorator(Pizza pizza) {
        super(pizza);
    }
    public String bake() {
        return pizza.bake() + addJalepano();
    }

    public String addJalepano(){
        return "jalepeno";
    }
}
