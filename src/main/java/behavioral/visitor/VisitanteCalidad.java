package behavioral.visitor;

public class VisitanteCalidad implements Visitante {
    private static final int UMBRAL = 75;

    @Override
    public void visitar(Habitacion h) {
        System.out.println("[Calidad] " + h.getNombre()
                + " → " + h.getPuntajeCalidad() + "/100 — "
                + (h.getPuntajeCalidad() >= UMBRAL ? "APROBADO" : "REVISAR"));
    }
    @Override
    public void visitar(Apartamento a) {
        System.out.println("[Calidad] " + a.getNombre()
                + " → " + a.getPuntajeCalidad() + "/100 — "
                + (a.getPuntajeCalidad() >= UMBRAL ? "APROBADO" : "REVISAR"));
    }
    @Override
    public void visitar(CasaRural c) {
        System.out.println("[Calidad] " + c.getNombre()
                + " → " + c.getPuntajeCalidad() + "/100 — "
                + (c.getPuntajeCalidad() >= UMBRAL ? "APROBADO" : "REVISAR"));
    }
}
