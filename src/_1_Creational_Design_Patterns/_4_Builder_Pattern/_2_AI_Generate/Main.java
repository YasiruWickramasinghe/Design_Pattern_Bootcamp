package _1_Creational_Design_Patterns._4_Builder_Pattern._2_AI_Generate;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();

        Product product = director.construct(builder);
        System.out.println(product);
    }
}

