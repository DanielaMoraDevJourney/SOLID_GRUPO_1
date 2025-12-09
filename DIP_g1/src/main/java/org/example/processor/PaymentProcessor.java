package org.example.processor;

import org.example.payment.PaymentMethod;

public class PaymentProcessor {

    private final PaymentMethod paymentMethod;

    // Ahora el constructor recibe la abstracción
    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void makePayment(double amount) {
        paymentMethod.processPayment(amount);
    }
}
