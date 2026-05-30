package behavioral.templatemethod;

public class TemplateMethod {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.iniciarPublicacion("Experiencia", new PublicacionExperiencia());
        cliente.iniciarPublicacion("Propiedad de Lujo", new PublicacionPropiedadLujo());
    }
}