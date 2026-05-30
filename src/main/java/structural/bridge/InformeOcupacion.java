package structural.bridge;

public class InformeOcupacion extends InformeAnfitrion {
    private final double porcentajeOcupacion;

    public InformeOcupacion(ExportadorFormato exportador, double porcentajeOcupacion) {
        super(exportador);
        this.porcentajeOcupacion = porcentajeOcupacion;
    }

    @Override
    public void generar() {
        exportador.exportar("Estadísticas de Ocupación", "Ocupación: " + porcentajeOcupacion + "%");
    }
}
