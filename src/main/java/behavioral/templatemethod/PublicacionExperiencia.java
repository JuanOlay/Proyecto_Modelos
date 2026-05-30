package behavioral.templatemethod;

public class PublicacionExperiencia extends ProcesoPublicacion {

    @Override
    protected void validacionEspecifica() {
        System.out.println("[Experiencia] Credenciales del anfitrión-guía validadas.");
    }

    @Override
    protected void configurarCalendario() {
        System.out.println("[Experiencia] Calendario configurado con sesiones por franja horaria.");
    }

    @Override
    protected void definirPrecioBase() {
        System.out.println("[Experiencia] Precio base definido por persona y sesión.");
    }
}
