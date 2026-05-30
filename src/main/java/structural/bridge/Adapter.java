package structural.bridge;

public class Adapter {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.exportarInforme(new InformeIngresos  (new ExportadorPDF(),  15400.0));
        cliente.exportarInforme(new InformeOcupacion (new ExportadorCSV(),  87.5));
        cliente.exportarInforme(new InformeResenas   (new ExportadorJSON(), 4.8, 312));
        cliente.exportarInforme(new InformeIngresos  (new ExportadorJSON(), 15400.0));
    }
}
