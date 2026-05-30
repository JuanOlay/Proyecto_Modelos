package behavioral.templatemethod;

public class PublicacionPropiedadLujo extends ProcesoPublicacion {

    @Override
    protected void validacionEspecifica() {
        System.out.println("[Lujo] Revisión adicional por equipo especializado completada.");
    }

    @Override
    protected void configurarCalendario() {
        System.out.println("[Lujo] Calendario configurado con estancia mínima de 3 noches.");
    }

    @Override
    protected void definirPrecioBase() {
        System.out.println("[Lujo] Precio base definido con tarifa premium y depósito de seguridad.");
    }
}