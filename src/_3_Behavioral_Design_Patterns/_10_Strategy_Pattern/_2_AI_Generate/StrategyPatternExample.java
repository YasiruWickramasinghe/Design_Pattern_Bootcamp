package _3_Behavioral_Design_Patterns._10_Strategy_Pattern;

// StrategyPatternExample.java
public class StrategyPatternExample {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Use Credit Card payment strategy
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456", "John Doe");
        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(100);

        // Use PayPal payment strategy
        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com");
        cart.setPaymentStrategy(payPalPayment);
        cart.checkout(50);
    }
}

