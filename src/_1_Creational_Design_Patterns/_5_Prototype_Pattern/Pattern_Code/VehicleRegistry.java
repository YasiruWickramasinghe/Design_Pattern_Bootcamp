package _1_Creational_Design_Patterns._5_Prototype_Pattern._1_Daily_Code_Buffer;

import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {
    private static Map<String,Vehicle> mapVehicles = new HashMap<>();
    static {
        mapVehicles.put("TWO", new TwoWheelerVehicle("120","royal",100000,false));
        mapVehicles.put("FOUR", new FourWheelerVehicle("120","bmw", false,100000,false));

    }
    public Vehicle getVehicle(String vehicle) throws CloneNotSupportedException {
        return mapVehicles.get(vehicle).clone();
    }
}
