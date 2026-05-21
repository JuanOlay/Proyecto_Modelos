package behavioral.chainofresponsability;

import java.util.List;

public class Cliente {

    public ResultadoVerificacion procesar(Anuncio anuncio) {
        Verificador fotos       = new VerificadorFotos();
        Verificador descripcion = new VerificadorContenidoDescripcion();
        Verificador precio      = new VerificadorCoherenciaPrecio();
        Verificador licencia    = new VerificadorLicenciaTuristica();

        fotos.setSiguiente(descripcion)
                .setSiguiente(precio)
                .setSiguiente(licencia);

        return fotos.verificar(anuncio);
    }

    public Anuncio crearAnuncioValido() {
        return new Anuncio(
                "Apartamento en el centro historico",
                List.of(new Foto(1920, 1080), new Foto(1280, 960), new Foto(1600, 900)),
                "Precioso apartamento con todas las comodidades. Ideal para parejas.",
                80.0, 100.0, "LIC-2024-BCN-00412"
        );
    }

    public Anuncio crearAnuncioSinFotosSuficientes() {
        return new Anuncio(
                "Estudio acogedor",
                List.of(new Foto(1920, 1080)),
                "Estudio luminoso en zona tranquila.",
                60.0, 100.0, "LIC-2024-BCN-00999"
        );
    }

    public Anuncio crearAnuncioConContactoDirecto() {
        return new Anuncio(
                "Piso moderno",
                List.of(new Foto(1920, 1080), new Foto(1280, 960), new Foto(1600, 900)),
                "Piso muy bonito. Contactame por whatsapp para mas info.",
                90.0, 100.0, "LIC-2024-BCN-00300"
        );
    }

    public Anuncio crearAnuncioConPrecioBajo() {
        return new Anuncio(
                "Habitacion en piso compartido",
                List.of(new Foto(1920, 1080), new Foto(1280, 960), new Foto(1600, 900)),
                "Habitacion amplia con bano privado.",
                10.0, 100.0, "LIC-2024-BCN-00555"
        );
    }

    public Anuncio crearAnuncioSinLicencia() {
        return new Anuncio(
                "Villa con piscina",
                List.of(new Foto(1920, 1080), new Foto(1280, 960), new Foto(1600, 900)),
                "Impresionante villa con jardin y piscina privada.",
                250.0, 200.0, ""
        );
    }
}
