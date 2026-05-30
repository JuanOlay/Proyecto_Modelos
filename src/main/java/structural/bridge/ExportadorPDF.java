package structural.bridge;

public class ExportadorPDF implements ExportadorFormato {
    @Override
    public void exportar(String titulo, String contenido) {
        System.out.println("[PDF] " + titulo + " | " + contenido);
    }
}
