package behavioral.templatemethod;

public abstract class ProcesoPublicacion {

    public final void publicar() {
        validarDatosBasicos();
        verificarFotografias();
        validacionEspecifica();
        configurarCalendario();
        definirPrecioBase();
        publicarAnuncio();
    }

    private void validarDatosBasicos() {
        System.out.println("[Validación] Datos básicos verificados.");
    }

    private void verificarFotografias() {
        System.out.println("[Fotos] Fotografías verificadas.");
    }

    private void publicarAnuncio() {
        System.out.println("[Publicación] Anuncio publicado exitosamente.");
    }

    protected abstract void validacionEspecifica();
    protected abstract void configurarCalendario();
    protected abstract void definirPrecioBase();
}
