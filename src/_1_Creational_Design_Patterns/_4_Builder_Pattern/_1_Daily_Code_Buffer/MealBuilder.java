package _1_Creational_Design_Patterns._4_Builder_Pattern._1_Daily_Code_Buffer;

public abstract class MealBuilder {
    public abstract void addBriyani();
    public  abstract  void  addBread();
    public abstract void  addColdDrink();
    public abstract void addCurry();
    public abstract Meal build();
}
