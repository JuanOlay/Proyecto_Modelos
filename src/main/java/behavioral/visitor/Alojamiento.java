package behavioral.visitor;

public interface Alojamiento {
    void aceptar(Visitante visitante);
    String getNombre();
}
