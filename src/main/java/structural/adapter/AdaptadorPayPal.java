package structural.adapter;

public class AdaptadorPayPal implements PasarelaPago {
    private final PayPalSDK paypal = new PayPalSDK();

    @Override
    public void procesarPago(double monto, String moneda) {
        paypal.executePayment(monto, moneda);
    }
}
