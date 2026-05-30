package structural.bridge;

public class InformeResenas extends InformeAnfitrion {
    private final double puntuacionPromedio;
    private final int totalResenas;

    public InformeResenas(ExportadorFormato exportador, double puntuacionPromedio, int totalResenas) {
        super(exportador);
        this.puntuacionPromedio = puntuacionPromedio;
        this.totalResenas       = totalResenas;
    }

    @Override
    public void generar() {
        exportador.exportar("Historial de Reseñas",
                "Promedio: " + puntuacionPromedio + " | Total: " + totalResenas);
    }
}
