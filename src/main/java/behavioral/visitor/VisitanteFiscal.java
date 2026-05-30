package behavioral.visitor;

public class VisitanteFiscal implements Visitante {
    private static final double IVA = 0.21;

    @Override
    public void visitar(Habitacion h) {
        System.out.println("[Fiscal] " + h.getNombre()
                + " → Base: $" + h.getPrecioPorNoche()
                + " | IVA: $" + String.format("%.2f", h.getPrecioPorNoche() * IVA));
    }
    @Override
    public void visitar(Apartamento a) {
        System.out.println("[Fiscal] " + a.getNombre()
                + " → Base: $" + a.getPrecioPorNoche()
                + " | Gastos comunidad: $" + a.getGastosComunidad()
                + " | IVA: $" + String.format("%.2f", a.getPrecioPorNoche() * IVA));
    }
    @Override
    public void visitar(CasaRural c) {
        System.out.println("[Fiscal] " + c.getNombre()
                + " → Municipio: " + c.getMunicipio()
                + " | Base: $" + c.getPrecioPorNoche()
                + " | IVA: $" + String.format("%.2f", c.getPrecioPorNoche() * IVA));
    }
}
