package _1_Creational_Design_Patterns._4_Builder_Pattern._1_Daily_Code_Buffer;

public class VegMealBuilder extends MealBuilder{
    private Meal meal;
    public VegMealBuilder() {
        meal = new Meal();
    }
    @Override
    public void addBriyani() {
        this.meal.setBriyani("Veg");
    }

    @Override
    public void addBread() {
        this.meal.setBread("Naan");

    }

    @Override
    public void addColdDrink() {
        this.meal.setColdDrink("Sprite");

    }

    @Override
    public void addCurry() {
        this.meal.setCurry("Veg");
    }

    @Override
    public Meal build() {
        return meal;
    }
}
