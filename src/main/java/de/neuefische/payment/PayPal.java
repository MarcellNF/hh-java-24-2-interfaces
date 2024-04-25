package de.neuefische.payment;

public class PayPal implements PaymentMethod{
    @Override
    public boolean authorize(double amount) {
        System.out.println("Payed with PayPal!");
        return true;
    }
}
