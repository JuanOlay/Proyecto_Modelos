package structural.adapter;

public class AdaptadorMercadoPago implements PasarelaPago {
    private final MercadoPagoSDK mercadoPago = new MercadoPagoSDK();

    @Override
    public void procesarPago(double monto, String moneda) {
        mercadoPago.createPaymentIntent(monto, moneda);
    }
}
