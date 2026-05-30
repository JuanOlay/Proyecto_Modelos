package behavioral.visitor;

public class CasaRural implements Alojamiento {
    private final String nombre;
    private final double precioPorNoche;
    private final int    diasDisponibles;
    private final int    puntajeCalidad;
    private final String municipio;

    public CasaRural(String nombre, double precioPorNoche, int diasDisponibles,
                     int puntajeCalidad, String municipio) {
        this.nombre          = nombre;
        this.precioPorNoche  = precioPorNoche;
        this.diasDisponibles = diasDisponibles;
        this.puntajeCalidad  = puntajeCalidad;
        this.municipio       = municipio;
    }

    @Override public void aceptar(Visitante visitante) { visitante.visitar(this); }
    @Override public String getNombre()                { return nombre; }
    public double getPrecioPorNoche()                  { return precioPorNoche; }
    public int getDiasDisponibles()                    { return diasDisponibles; }
    public int getPuntajeCalidad()                     { return puntajeCalidad; }
    public String getMunicipio()                       { return municipio; }
}