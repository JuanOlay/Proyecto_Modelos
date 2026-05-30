package structural.decorator;

public class ReservaBase implements Reserva {
    private final String propiedad;
    private final double precioPorNoche;
    private final int noches;

    public ReservaBase(String propiedad, double precioPorNoche, int noches) {
        this.propiedad      = propiedad;
        this.precioPorNoche = precioPorNoche;
        this.noches         = noches;
    }

    @Override
    public String getDescripcion() {
        return propiedad + " x" + noches + " noches";
    }

    @Override
    public double getPrecio() {
        return precioPorNoche * noches;
    }
}
