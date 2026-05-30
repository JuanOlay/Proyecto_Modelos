package behavioral.chainofresponsability;

public class VerificadorLicenciaTuristica extends Verificador {

    @Override
    public ResultadoVerificacion verificar(Anuncio anuncio) {
        String licencia = anuncio.getLicenciaTuristica();

        if (licencia == null || licencia.isBlank()) {
            return new ResultadoVerificacion(false,
                    "Se requiere un numero de licencia turistica valido para "
                    + "publicar en esta ciudad.");
        }

        return continuarCadena(anuncio);
    }
}
