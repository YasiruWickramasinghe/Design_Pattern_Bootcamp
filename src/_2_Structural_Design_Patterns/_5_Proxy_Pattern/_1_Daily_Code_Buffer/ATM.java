package _2_Structural_Design_Patterns._5_Proxy_Pattern._1_Daily_Code_Buffer;

public class ATM implements Account{ // This is proxy to bank account object not real
    @Override
    public void withdraw() {
        //Access using actual object. You can also have checks on withdraw to achieve authentication or pin is correct or not.
        BankAccount bankAccount = new BankAccount();
        bankAccount.withdraw();
    }

    @Override
    public void getAccountNumber() {

    }
}
