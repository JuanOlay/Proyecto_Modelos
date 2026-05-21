package behavioral.chainofresponsability;

public class VerificadorFotos extends Verificador {

    private static final int MIN_CANTIDAD_FOTOS = 3;
    private static final int MIN_ANCHO_PX = 1024;
    private static final int MIN_ALTO_PX = 768;

    @Override
    public ResultadoVerificacion verificar(Anuncio anuncio) {
        if (anuncio.getFotos().size() < MIN_CANTIDAD_FOTOS) {
            return new ResultadoVerificacion(false,
                    "Se requieren al menos " + MIN_CANTIDAD_FOTOS + " fotografias.");
        }

        for (Foto foto : anuncio.getFotos()) {
            if (foto.getAncho() < MIN_ANCHO_PX || foto.getAlto() < MIN_ALTO_PX) {
                return new ResultadoVerificacion(false,
                        "Resolucion minima requerida: " + MIN_ANCHO_PX + "x" + MIN_ALTO_PX + " pixeles.");
            }
        }

        return continuarCadena(anuncio);
    }
}
