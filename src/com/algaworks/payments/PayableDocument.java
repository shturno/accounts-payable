package com.algaworks.payments;

public interface PayableDocument {

    public abstract double getTotalAmount();

    Beneficiary getBeneficiary();

}
