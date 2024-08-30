package _2_Structural_Design_Patterns._4_Facade_Pattern._1_Daily_Code_Buffer;

public class ZomatoFacade {
    private Restaurant restaurant;
    private  DeliveryBoy deliveryBoy;
    private DeliveryTeam deliveryTeam;

    public void placeOrder() {
        restaurant.prepareOrder();
        deliveryTeam.assignDeliveryBoy();
        deliveryBoy.pickUpOrder();
        deliveryBoy.deliverOrder();
    }
}
