package _1_Creational_Design_Patterns._5_Builder_Pattern;

public class Director {
    public Product construct(Builder builder) {
        builder.buildPart1("Part 1");
        builder.buildPart2("Part 2");
        builder.buildPart3("Part 3");
        return builder.getResult();
    }
}
