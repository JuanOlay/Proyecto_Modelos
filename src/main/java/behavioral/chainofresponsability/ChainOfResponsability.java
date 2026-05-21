package behavioral.chainofresponsability;

public class ChainOfResponsability {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        Anuncio[] anuncios = {
                cliente.crearAnuncioValido(),
                cliente.crearAnuncioSinFotosSuficientes(),
                cliente.crearAnuncioConContactoDirecto(),
                cliente.crearAnuncioConPrecioBajo(),
                cliente.crearAnuncioSinLicencia()
        };

        System.out.println("=== VERIFICACION DE ANUNCIOS AIRBNB ===\n");

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
