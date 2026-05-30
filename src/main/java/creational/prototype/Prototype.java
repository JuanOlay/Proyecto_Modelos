package creational.prototype;

import java.util.List;

public class Prototype {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        Propiedad base = new Propiedad(
                "Apartamento Eixample 4A",
                95.0,
                new Ubicacion("Barcelona", "Carrer de Provença 123", "4A"),
                List.of("WiFi", "Cocina", "Lavadora")
        );

        PropiedadPrototipo original = new PropiedadPrototipo(base);
        PropiedadPrototipo clon     = cliente.duplicar(original);

        clon.getPropiedad().setTitulo("Apartamento Eixample 4B");
        clon.getPropiedad().setPrecioBase(110.0);
        clon.getPropiedad().getUbicacion().setPiso("4B");

        cliente.mostrar("Original", original);
        cliente.mostrar("Clon modificado", clon);
    }
}
