package behavioral.chainofresponsability;

public class VerificadorCoherenciaPrecio extends Verificador {

    private static final double FACTOR_MINIMO_SOBRE_PROMEDIO = 0.5;

    @Override
    public ResultadoVerificacion verificar(Anuncio anuncio) {
        double umbralMinimo = anuncio.getPrecioPromedioZona() * FACTOR_MINIMO_SOBRE_PROMEDIO;

        if (anuncio.getPrecioBase() < umbralMinimo) {
            return new ResultadoVerificacion(false,
                    "El precio base (" + anuncio.getPrecioBase()
                            + ") es anomalamente bajo respecto al promedio de la zona ("
                            + anuncio.getPrecioPromedioZona() + ").");
        }

        return continuarCadena(anuncio);
    }
}
