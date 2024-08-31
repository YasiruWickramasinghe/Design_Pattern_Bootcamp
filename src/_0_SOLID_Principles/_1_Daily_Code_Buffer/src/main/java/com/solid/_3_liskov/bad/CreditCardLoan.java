package _0_SOLID_Principles._1_Daily_Code_Buffer.src.main.java.com.solid._3_liskov.bad;

public class CreditCardLoan implements LoanPayment{
    @Override
    public void doPayment(int amount) {

    }

    @Override
    public void foreCloseLoan() {
        throw new UnsupportedOperationException("Fore closure is not allowed.");
    }

    @Override
    public void doRepayment(int amount) {
        throw new UnsupportedOperationException("Repayment is not allowed.");
    }
}
