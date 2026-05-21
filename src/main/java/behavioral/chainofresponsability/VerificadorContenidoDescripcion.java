package behavioral.chainofresponsability;

public class VerificadorContenidoDescripcion extends Verificador {

    private static final String[] TERMINOS_CONTACTO_DIRECTO = {
            "@", "whatsapp", "telegram", "llamar al", "contactame", "tel:", "movil:"
    };

    @Override
    public ResultadoVerificacion verificar(Anuncio anuncio) {
        String descripcionNormalizada = anuncio.getDescripcion().toLowerCase();

        for (String termino : TERMINOS_CONTACTO_DIRECTO) {
            if (descripcionNormalizada.contains(termino)) {
                return new ResultadoVerificacion(false,
                        "La descripcion contiene informacion de contacto directo no permitida.");
            }
        }

        return continuarCadena(anuncio);
    }
}
