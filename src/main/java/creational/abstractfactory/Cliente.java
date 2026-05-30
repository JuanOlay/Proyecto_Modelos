package creational.abstractfactory;

class Cliente {
    private final Boton boton;
    private final TarjetaPropiedad tarjeta;
    private final FormularioReserva formulario;

    private final FabricaUI fabrica;

    Cliente(FabricaUI fabrica) {
        this.boton = fabrica.crearBoton();
        this.tarjeta = fabrica.crearTarjetaPropiedad();
        this.formulario = fabrica.crearFormularioReserva();
        this.fabrica = fabrica;
    }

    String obtenerVista() {
        return tarjeta.render() + "\n" + formulario.render() + "\n" + boton.render();
    }

    @Override
    public String toString() {
        if (fabrica instanceof FabricaWeb) {
            return "WEB";
        } else if (fabrica instanceof FabricaIOS) {
            return "IOS";
        } else if (fabrica instanceof FabricaAndroid) {
            return "ANDROID";
        }

        return "DESCONOCIDO";
    }
}