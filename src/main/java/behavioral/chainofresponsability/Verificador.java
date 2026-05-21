package behavioral.chainofresponsability;

public abstract class Verificador {

    private Verificador siguiente;

    public Verificador setSiguiente(Verificador siguiente) {
        this.siguiente = siguiente;
        return siguiente;
    }

    protected ResultadoVerificacion continuarCadena(Anuncio anuncio) {
        if (siguiente != null) {
            return siguiente.verificar(anuncio);
        }
        return new ResultadoVerificacion(true, "Anuncio aprobado para publicacion.");
    }

    public abstract ResultadoVerificacion verificar(Anuncio anuncio);
}
