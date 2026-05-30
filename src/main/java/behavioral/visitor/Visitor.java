package behavioral.visitor;

import java.util.List;

public class Visitor {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        List<Alojamiento> catalogo = List.of(
                new Habitacion("Habitación 101",         50.0, 20, 80),
                new Apartamento("Apartamento Eixample",  120.0, 15, 70, 30.0),
                new CasaRural("Casa Rural Pirineo",      90.0, 30, 88, "Broto")
        );

        cliente.ejecutarAnalisis("Ingreso Máximo", new VisitanteIngresoMaximo(), catalogo);
        cliente.ejecutarAnalisis("Índice de Calidad", new VisitanteCalidad(),    catalogo);
        cliente.ejecutarAnalisis("Reporte Fiscal",    new VisitanteFiscal(),     catalogo);
    }
}
