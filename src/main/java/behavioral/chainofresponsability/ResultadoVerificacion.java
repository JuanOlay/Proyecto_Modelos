package behavioral.chainofresponsability;

public class ResultadoVerificacion {

    private final boolean aprobado;
    private final String motivo;

    public ResultadoVerificacion(boolean aprobado, String motivo) {
        this.aprobado = aprobado;
        this.motivo = motivo;
    }

    public boolean isAprobado() { return aprobado; }
    public String getMotivo() { return motivo; }
}
