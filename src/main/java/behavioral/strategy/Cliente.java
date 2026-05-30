package behavioral.strategy;

public class Cliente {

    public void mostrarPrecio(Propiedad propiedad, int noches) {
        double total = propiedad.calcularPrecio(noches);
        System.out.println(propiedad.getNombre()
                + " | Base: $" + propiedad.getPrecioBase()
                + " | Noches: " + noches
                + " | Total: $" + String.format("%.2f", total));
    }

    public void cambiarEstrategia(Propiedad propiedad, EstrategiaPrecios estrategia) {
        propiedad.setEstrategia(estrategia);
    }
}
