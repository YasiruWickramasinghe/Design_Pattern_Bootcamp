package _3_Behavioral_Design_Patterns._1_Chain_of_Responsibility_Pattern._1_Daily_Code_Buffer;

public class ChainOfResponsibilityApplication {

	public static void main(String[] args) {
		PaymentHandler bank = new BankPaymentHandler();
		PaymentHandler creditCard = new CreditCardPaymentHandler();
		PaymentHandler paypal = new PayPalPaymentHandler();
		bank.setNext(creditCard);
		creditCard.setNext(paypal);

		bank.handlePayment(600);
		bank.handlePayment(200);
		bank.handlePayment(1200);
		bank.handlePayment(600);
	}

}
