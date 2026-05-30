package structural.adapter;

public class PayPalSDK {
    public void executePayment(double total, String currencyCode) {
        System.out.println("[PayPal] executePayment() — " + total + " " + currencyCode);
    }
}
