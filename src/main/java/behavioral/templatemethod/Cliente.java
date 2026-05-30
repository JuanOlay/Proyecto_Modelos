package behavioral.templatemethod;

public class Cliente {

    public void iniciarPublicacion(String tipo, ProcesoPublicacion proceso) {
        System.out.println("=== Publicando: " + tipo + " ===");
        proceso.publicar();
        System.out.println("---");
    }
}
