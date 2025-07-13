package com.algaworks.accountspayable.model;

import com.algaworks.payments.Beneficiary;
import com.algaworks.payments.PayableDocument;

public class ServiceOrder implements PayableDocument {

    private Beneficiary supplier;
    private double totalAmount;


    public ServiceOrder(Beneficiary supplier, double totalAmount) {
        this.supplier = supplier;
        this.totalAmount = totalAmount;
    }

    public Beneficiary getSupplier() {
        return supplier;
    }

    public void setSupplier(Beneficiary supplier) {
        this.supplier = supplier;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public Beneficiary getBeneficiary() {
        return supplier;
    }
}
