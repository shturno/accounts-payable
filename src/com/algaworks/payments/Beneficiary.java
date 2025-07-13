package com.algaworks.payments;

public class Beneficiary {

    private String name;
    private String pixKey;
    private String bankAccount;

    public Beneficiary(String name, String pixKey, String bankAccount) {
        this.name = name;
        this.pixKey = pixKey;
        this.bankAccount = bankAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPixKey() {
        return pixKey;
    }

    public void setPixKey(String pixKey) {
        this.pixKey = pixKey;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public boolean hasPixKey() {
        return getPixKey() == null || getPixKey().isEmpty();
    }

    public boolean hasBankAccount() {
        return getBankAccount() == null || getBankAccount().isEmpty();
    }
}
