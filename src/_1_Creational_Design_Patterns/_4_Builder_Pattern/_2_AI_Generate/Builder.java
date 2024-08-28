package _1_Creational_Design_Patterns._4_Builder_Pattern._2_AI_Generate;

public interface Builder {
    void buildPart1(String part1);
    void buildPart2(String part2);
    void buildPart3(String part3);
    Product getResult();
}

