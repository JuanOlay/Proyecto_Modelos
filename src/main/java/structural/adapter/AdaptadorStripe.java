package structural.adapter;

public class AdaptadorStripe implements PasarelaPago {
    private final StripeSDK stripe = new StripeSDK();

    @Override
    public void procesarPago(double monto, String moneda) {
        stripe.charge(monto, moneda);
    }
}
