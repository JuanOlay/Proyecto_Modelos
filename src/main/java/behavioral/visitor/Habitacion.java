package behavioral.visitor;

public class Habitacion implements Alojamiento {
    private final String nombre;
    private final double precioPorNoche;
    private final int    diasDisponibles;
    private final int    puntajeCalidad;

    public Habitacion(String nombre, double precioPorNoche, int diasDisponibles, int puntajeCalidad) {
        this.nombre          = nombre;
        this.precioPorNoche  = precioPorNoche;
        this.diasDisponibles = diasDisponibles;
        this.puntajeCalidad  = puntajeCalidad;
    }

    @Override public void aceptar(Visitante visitante) { visitante.visitar(this); }
    @Override public String getNombre()                { return nombre; }
    public double getPrecioPorNoche()                  { return precioPorNoche; }
    public int getDiasDisponibles()                    { return diasDisponibles; }
    public int getPuntajeCalidad()                     { return puntajeCalidad; }
}
