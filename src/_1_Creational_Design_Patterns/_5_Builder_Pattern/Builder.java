package _1_Creational_Design_Patterns._5_Builder_Pattern;

public interface Builder {
    void buildPart1(String part1);
    void buildPart2(String part2);
    void buildPart3(String part3);
    Product getResult();
}

