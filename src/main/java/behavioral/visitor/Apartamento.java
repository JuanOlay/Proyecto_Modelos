package behavioral.visitor;

public class Apartamento implements Alojamiento {
    private final String nombre;
    private final double precioPorNoche;
    private final int    diasDisponibles;
    private final int    puntajeCalidad;
    private final double gastosComunidad;

    public Apartamento(String nombre, double precioPorNoche, int diasDisponibles,
                       int puntajeCalidad, double gastosComunidad) {
        this.nombre          = nombre;
        this.precioPorNoche  = precioPorNoche;
        this.diasDisponibles = diasDisponibles;
        this.puntajeCalidad  = puntajeCalidad;
        this.gastosComunidad = gastosComunidad;
    }

    @Override public void aceptar(Visitante visitante) { visitante.visitar(this); }
    @Override public String getNombre()                { return nombre; }
    public double getPrecioPorNoche()                  { return precioPorNoche; }
    public int getDiasDisponibles()                    { return diasDisponibles; }
    public int getPuntajeCalidad()                     { return puntajeCalidad; }
    public double getGastosComunidad()                 { return gastosComunidad; }
}
