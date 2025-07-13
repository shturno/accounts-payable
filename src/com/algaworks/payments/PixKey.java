package com.algaworks.payments;

public class PixKey implements PaymentMethod {

    private String type;

    @Override
    public void pay(PayableDocument document) {
        Beneficiary beneficiary = document.getBeneficiary();

        if (beneficiary.hasPixKey()) {
            throw new RuntimeException("Beneficiary does not have PixKey");
        }

        System.out.printf("DEBUG: Efetuando PIX para %s no valor de R$%.2f com " +
                        "a chave %s%n", beneficiary.getName(),
                document.getTotalAmount(), beneficiary.getPixKey());
    }
}
