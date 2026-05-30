package structural.bridge;

public class ExportadorCSV implements ExportadorFormato {
    @Override
    public void exportar(String titulo, String contenido) {
        System.out.println("[CSV] " + titulo + " | " + contenido);
    }
}
