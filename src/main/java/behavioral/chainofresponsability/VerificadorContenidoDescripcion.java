package behavioral.chainofresponsability;

public class VerificadorContenidoDescripcion extends Verificador {

    private static final String[] terminos_contacto = {
            "@", "whatsapp", "telegram", "llamar al", "contactame", "tel:", "movil:"
    };

    @Override
    public ResultadoVerificacion verificar(Anuncio anuncio) {
        String descripcionNormalizada = anuncio.getDescripcion().toLowerCase();

        for (String termino : terminos_contacto) {
            if (descripcionNormalizada.contains(termino)) {
                return new ResultadoVerificacion(false,
                        "La descripcion contiene informacion de contacto no permitida.");
            }
        }

        return continuarCadena(anuncio);
    }
}
