// ChainOfResponsability
package behavioral.chainofresponsability;

import java.util.List;

class ChainOfResponsability {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        Anuncio[] anuncios = {
                new Anuncio("Apartamento en el centro historico",
                        List.of(new Foto(1920, 1080), new Foto(1280, 960), new Foto(1600, 900)),
                        "Precioso apartamento con todas las comodidades. Ideal para parejas.",
                        80.0, "LIC-2024-BCN-00412"),
                new Anuncio("Estudio acogedor",
                        List.of(new Foto(1920, 1080)),
                        "Estudio luminoso en zona tranquila.",
                        60.0, "LIC-2024-BCN-00999"),
                new Anuncio("Piso moderno",
                        List.of(new Foto(1920, 1080), new Foto(1280, 960), new Foto(1600, 900)),
                        "Piso muy bonito. Contactame por whatsapp para mas info.",
                        90.0, "LIC-2024-BCN-00300"),
                new Anuncio("Villa con piscina",
                        List.of(new Foto(1920, 1080), new Foto(1280, 960), new Foto(1600, 900)),
                        "Impresionante villa con jardin y piscina privada.",
                        200.0, "")
        };

        System.out.println("VERIFICACION DE ANUNCIOS AIRBNB\n");

        for (Anuncio anuncio : anuncios) {
            ResultadoVerificacion resultado = cliente.procesar(anuncio);
            mostrarResultado(anuncio, resultado);
        }
    }

    private static void mostrarResultado(Anuncio anuncio, ResultadoVerificacion resultado) {
        System.out.println("Anuncio : " + anuncio.getTitulo());
        System.out.println("Estado  : " + (resultado.isAprobado() ? "APROBADO" : "RECHAZADO"));
        System.out.println("Motivo  : " + resultado.getMotivo());
        System.out.println("-".repeat(55));
    }
}
