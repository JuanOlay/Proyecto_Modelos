package behavioral.visitor;

public interface Visitante {
    void visitar(Habitacion habitacion);
    void visitar(Apartamento apartamento);
    void visitar(CasaRural casaRural);
}
