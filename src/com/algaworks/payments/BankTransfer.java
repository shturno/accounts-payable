package com.algaworks.payments;

public class BankTransfer implements PaymentMethod {

    @Override
    public void pay(PayableDocument document) {
        Beneficiary beneficiary = document.getBeneficiary();

        if (beneficiary.hasBankAccount()) {
            throw new RuntimeException("Beneficiary does not have a Bank Account");
        }

        System.out.printf("DEBUG: Efetuando transferência para %s no valor de R$%.2f com " +
                        "a conta bancaria %s%n", beneficiary.getName(),
                document.getTotalAmount(), beneficiary.getBankAccount());
    }
}
