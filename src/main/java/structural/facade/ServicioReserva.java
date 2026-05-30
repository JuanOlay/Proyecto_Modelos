package structural.facade;

public class ServicioReserva {
    private final MotorDisponibilidad    disponibilidad  = new MotorDisponibilidad();
    private final ServicioPagos          pagos           = new ServicioPagos();
    private final ServicioNotificaciones notificaciones  = new ServicioNotificaciones();
    private final GeneradorContratos     contratos       = new GeneradorContratos();
    private final SistemaCalendario      calendario      = new SistemaCalendario();

    public String confirmarReserva(String propiedad, String anfitrion, String huesped,
                                   String fechaEntrada, String fechaSalida, double monto) {
        if (!disponibilidad.verificar(propiedad, fechaEntrada, fechaSalida))
            throw new IllegalStateException("Propiedad no disponible en las fechas indicadas.");

        if (!pagos.autorizar(huesped, monto))
            throw new IllegalStateException("Pago no autorizado.");

        String contrato = contratos.generar(huesped, propiedad);
        calendario.bloquearFechas(propiedad, fechaEntrada, fechaSalida);
        notificaciones.notificarAnfitrion(anfitrion, propiedad);

        return contrato;
    }
}
