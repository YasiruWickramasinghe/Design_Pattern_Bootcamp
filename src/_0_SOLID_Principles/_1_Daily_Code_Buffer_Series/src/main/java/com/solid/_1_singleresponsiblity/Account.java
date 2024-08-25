package _0_SOLID_Principles._1_Daily_Code_Buffer_Series.src.main.java.com.solid._1_singleresponsiblity;

import java.math.BigDecimal;

public class Account {
    private int accountNumber;
    private String firstName;
    private BigDecimal totalAmount;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }
}
