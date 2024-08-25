package _0_SOLID_Principles._1_Daily_Code_Buffer_Series.src.main.java.com.solid._1_singleresponsiblity;

import java.math.BigDecimal;

public class TransactionOperations {
    // This is good as it does transactions and at right place.
    public void deposit(BigDecimal amount , int accountNumber){
        //Getting account details it is job of account operations
        AccountOperations accountOperations = new AccountOperations();
        Account account = accountOperations.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().add(amount));
    }

    public void withdraw(BigDecimal amount , int accountNumber){
        AccountOperations accountOperations = new AccountOperations();
        Account account = accountOperations.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().subtract(amount));
    }
}
