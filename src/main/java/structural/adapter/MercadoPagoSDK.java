package structural.adapter;

public class MercadoPagoSDK {
    public void createPaymentIntent(double valor, String divisa) {
        System.out.println("[MercadoPago] createPaymentIntent() — " + valor + " " + divisa);
    }
}
