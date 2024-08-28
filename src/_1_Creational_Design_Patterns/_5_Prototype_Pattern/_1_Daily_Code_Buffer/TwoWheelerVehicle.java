package _1_Creational_Design_Patterns._5_Prototype_Pattern._1_Daily_Code_Buffer;

public class TwoWheelerVehicle extends Vehicle {
    private boolean isElectric;


    public TwoWheelerVehicle(String engine, String model, long price, boolean isElectric) {
        super(engine, model, price);
        this.isElectric = isElectric;
    }
}
