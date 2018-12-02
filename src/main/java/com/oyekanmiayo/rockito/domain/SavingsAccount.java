package com.oyekanmiayo.rockito.domain;

import java.math.BigDecimal;
import java.util.List;

public class SavingsAccount {
    private long id;

    private int accountNumber;

    private BigDecimal accountBalance;

    private List<SavingsTransaction> primaryTransactionList;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public List<SavingsTransaction> getPrimaryTransactionList() {
        return primaryTransactionList;
    }

    public void setPrimaryTransactionList(List<SavingsTransaction> primaryTransactionList) {
        this.primaryTransactionList = primaryTransactionList;
    }
}
