package behavioral.chainofresponsability;

public class Foto {

    private final int ancho;
    private final int alto;

    public Foto(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }
}
