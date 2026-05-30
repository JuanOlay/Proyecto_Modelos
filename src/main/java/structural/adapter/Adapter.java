package structural.adapter;

public class Adapter {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.realizarPago(new AdaptadorStripe(),      120.00, "USD");
        cliente.realizarPago(new AdaptadorPayPal(),      95.50,  "EUR");
        cliente.realizarPago(new AdaptadorMercadoPago(), 850.00, "ARS");
    }
}
