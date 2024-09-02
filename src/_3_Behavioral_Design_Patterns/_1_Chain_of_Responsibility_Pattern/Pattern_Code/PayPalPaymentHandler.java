package _3_Behavioral_Design_Patterns._1_Chain_of_Responsibility_Pattern._1_Daily_Code_Buffer;

public class PayPalPaymentHandler extends PaymentHandler{
    public void handlePayment(double amount) {
        if (amount <= 1500) {
            System.out.println("Paid using PayPal: $" + amount);
        } else {
            next.handlePayment(amount);
        }
    }
}
