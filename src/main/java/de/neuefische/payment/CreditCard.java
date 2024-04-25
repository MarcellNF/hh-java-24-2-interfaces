package de.neuefische.payment;

public class CreditCard implements PaymentMethod{
    @Override
    public boolean authorize(double amount) {
        System.out.println("Payed with CreditCard");
        return false;
    }
}
