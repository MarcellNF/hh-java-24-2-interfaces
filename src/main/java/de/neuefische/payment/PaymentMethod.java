package de.neuefische.payment;

public interface PaymentMethod {
    boolean authorize(double amount);
}
