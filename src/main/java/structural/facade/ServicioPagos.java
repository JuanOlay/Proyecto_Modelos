package structural.facade;

public class ServicioPagos {
    public boolean autorizar(String huesped, double monto) {
        System.out.println("[Pagos] Autorizando $" + monto + " para " + huesped);
        return true;
    }
}
