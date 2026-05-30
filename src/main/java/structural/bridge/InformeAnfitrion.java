package structural.bridge;

public abstract class InformeAnfitrion {
    protected final ExportadorFormato exportador;

    public InformeAnfitrion(ExportadorFormato exportador) {
        this.exportador = exportador;
    }

    public abstract void generar();
}
