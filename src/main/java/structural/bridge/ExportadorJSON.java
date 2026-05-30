package structural.bridge;

public class ExportadorJSON implements ExportadorFormato {
    @Override
    public void exportar(String titulo, String contenido) {
        System.out.println("[JSON] {\"informe\":\"" + titulo + "\",\"datos\":\"" + contenido + "\"}");
    }
}
