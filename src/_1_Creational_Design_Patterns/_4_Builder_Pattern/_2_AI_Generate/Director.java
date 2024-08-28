package _1_Creational_Design_Patterns._4_Builder_Pattern._2_AI_Generate;

public class Director {
    public Product construct(Builder builder) {
        builder.buildPart1("Part 1");
        builder.buildPart2("Part 2");
        builder.buildPart3("Part 3");
        return builder.getResult();
    }
}
