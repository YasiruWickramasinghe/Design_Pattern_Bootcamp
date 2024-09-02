package _3_Behavioral_Design_Patterns._1_Chain_of_Responsibility_Pattern._1_Daily_Code_Buffer;

public class BankPaymentHandler extends PaymentHandler{
    public void handlePayment(double amount) {
        if (amount <= 500) {
            System.out.println("Paid using bank account: $" + amount);
        } else {
            next.handlePayment(amount);
        }
    }
}
