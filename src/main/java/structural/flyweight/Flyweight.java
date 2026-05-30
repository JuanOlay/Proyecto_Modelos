package structural.flyweight;

import java.util.List;

public class Flyweight {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        Amenidad wifi       = cliente.obtenerAmenidad("WiFi",       "Internet de alta velocidad", "📶", "Conectividad");
        Amenidad piscina    = cliente.obtenerAmenidad("Piscina",    "Piscina exterior climatizada","🏊", "Exterior");
        Amenidad cocina     = cliente.obtenerAmenidad("Cocina",     "Cocina completamente equipada","🍳", "Interior");
        Amenidad parking    = cliente.obtenerAmenidad("Parking",    "Plaza de garaje incluida",    "🚗", "Exterior");
        Amenidad aireAcond  = cliente.obtenerAmenidad("Aire acond.","Climatización en cada sala",  "❄️", "Confort");

        Propiedad p1 = new Propiedad("Apartamento Eixample 4A", "Barcelona",
                List.of(wifi, piscina, cocina));

        Propiedad p2 = new Propiedad("Ático Gràcia", "Barcelona",
                List.of(wifi, aireAcond, cocina, parking));

        Propiedad p3 = new Propiedad("Estudio Malasaña", "Madrid",
                List.of(wifi, cocina, aireAcond));

        cliente.mostrar(p1);
        cliente.mostrar(p2);
        cliente.mostrar(p3);

        System.out.println("Propiedades creadas : 3");
        System.out.println("Amenidades declaradas en total: " +
                (p1.getAmenidades().size() + p2.getAmenidades().size() + p3.getAmenidades().size()));
        cliente.mostrarEstadoFabrica();

        System.out.println("WiFi compartido (p1 == p3): " +
                (p1.getAmenidades().get(0) == p3.getAmenidades().get(0)));
    }
}