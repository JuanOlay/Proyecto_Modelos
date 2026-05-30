package structural.adapter;

public class StripeSDK {
    public void charge(double amount, String currency) {
        System.out.println("[Stripe] charge() — " + amount + " " + currency);
    }
}
