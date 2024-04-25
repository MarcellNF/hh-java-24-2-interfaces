package de.neuefische.payment;

public class Main {
    public static void main(String[] args) {
        PaymentMethod payPal = new PayPal();
        PaymentMethod creditCard = new CreditCard();

        paymentProcess(payPal);
        paymentProcess(creditCard);
    }

    public static void paymentProcess(PaymentMethod paymentMethod) {
        System.out.println(paymentMethod.authorize(3.80));
    }
}
