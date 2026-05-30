package structural.bridge;

public class InformeIngresos extends InformeAnfitrion {
    private final double totalIngresos;

    public InformeIngresos(ExportadorFormato exportador, double totalIngresos) {
        super(exportador);
        this.totalIngresos = totalIngresos;
    }

    @Override
    public void generar() {
        exportador.exportar("Resumen de Ingresos", "Total: $" + totalIngresos);
    }
}
