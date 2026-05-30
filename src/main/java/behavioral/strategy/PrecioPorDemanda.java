package behavioral.strategy;

public class PrecioPorDemanda implements EstrategiaPrecios {
    private final double ocupacionArea;

    public PrecioPorDemanda(double ocupacionArea) {
        this.ocupacionArea = ocupacionArea;
    }

    @Override
    public double calcularPrecio(double precioBase, int noches) {
        double ajuste = 1.0 + (ocupacionArea / 100.0);
        return precioBase * ajuste * noches;
    }
}
