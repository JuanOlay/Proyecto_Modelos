package behavioral.strategy;

public class DescuentoEstanciaProlongada implements EstrategiaPrecios {
    private static final int    MINIMO_NOCHES   = 7;
    private static final double DESCUENTO       = 0.15;

    @Override
    public double calcularPrecio(double precioBase, int noches) {
        double precio = precioBase * noches;
        if (noches >= MINIMO_NOCHES)
            precio *= (1 - DESCUENTO);
        return precio;
    }
}
