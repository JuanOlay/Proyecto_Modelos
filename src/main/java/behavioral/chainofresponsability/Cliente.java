package behavioral.chainofresponsability;

class Cliente {
    private final Verificador cadena;

    public Cliente() {
        VerificadorContenidoDescripcion descripcion = new VerificadorContenidoDescripcion();
        VerificadorFotos fotos = new VerificadorFotos();
        VerificadorLicenciaTuristica licencia = new VerificadorLicenciaTuristica();
        descripcion.setSiguiente(fotos);
        fotos.setSiguiente(licencia);
        this.cadena = descripcion;
    }

    public ResultadoVerificacion procesar(Anuncio anuncio) {
        return cadena.verificar(anuncio);
    }
}