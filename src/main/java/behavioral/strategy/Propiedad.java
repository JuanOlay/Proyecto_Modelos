package behavioral.strategy;

public class Propiedad {
    private final String nombre;
    private final double precioBase;
    private EstrategiaPrecios estrategia;

    public Propiedad(String nombre, double precioBase, EstrategiaPrecios estrategia) {
        this.nombre     = nombre;
        this.precioBase = precioBase;
        this.estrategia = estrategia;
    }

    public void setEstrategia(EstrategiaPrecios estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularPrecio(int noches) {
        return estrategia.calcularPrecio(precioBase, noches);
    }

    public String getNombre()    { return nombre; }
    public double getPrecioBase(){ return precioBase; }
}
