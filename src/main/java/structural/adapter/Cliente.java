package structural.adapter;

public class Cliente {

    public void realizarPago(PasarelaPago pasarela, double monto, String moneda) {
        pasarela.procesarPago(monto, moneda);
    }
}
