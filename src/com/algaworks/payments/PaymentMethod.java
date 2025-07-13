package com.algaworks.payments;

public interface PaymentMethod {

    void pay(PayableDocument document);
}
