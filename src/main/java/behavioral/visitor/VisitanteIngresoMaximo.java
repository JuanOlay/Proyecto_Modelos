package behavioral.visitor;

public class VisitanteIngresoMaximo implements Visitante {
    @Override
    public void visitar(Habitacion h) {
        System.out.println("[Ingreso] " + h.getNombre()
                + " → $" + (h.getPrecioPorNoche() * h.getDiasDisponibles()));
    }
    @Override
    public void visitar(Apartamento a) {
        System.out.println("[Ingreso] " + a.getNombre()
                + " → $" + (a.getPrecioPorNoche() * a.getDiasDisponibles()));
    }
    @Override
    public void visitar(CasaRural c) {
        System.out.println("[Ingreso] " + c.getNombre()
                + " → $" + (c.getPrecioPorNoche() * c.getDiasDisponibles()));
    }
}
