package org.example.payment;

public class CryptoPayment implements PaymentMethod {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cryptocurrency payment of $" + amount);
    }
}
