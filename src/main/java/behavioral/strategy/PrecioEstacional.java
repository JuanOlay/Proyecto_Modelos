package behavioral.strategy;

public class PrecioEstacional implements EstrategiaPrecios {
    private final double multiplicador;

    public PrecioEstacional(double multiplicador) {
        this.multiplicador = multiplicador;
    }

    @Override
    public double calcularPrecio(double precioBase, int noches) {
        return precioBase * multiplicador * noches;
    }
}
