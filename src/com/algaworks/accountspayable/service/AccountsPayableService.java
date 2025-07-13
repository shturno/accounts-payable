package com.algaworks.accountspayable.service;

import com.algaworks.payments.PayableDocument;
import com.algaworks.payments.PaymentMethod;

public class AccountsPayableService {

    private PaymentMethod paymentMethod;

    public AccountsPayableService(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void pay(PayableDocument document) {

        // poderia ter outras regras como registrar no db,
        // enviar notificação por email, etc

        paymentMethod.pay(document);
    }
}
