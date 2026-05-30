package creational.abstractfactory;

class FabricaIOS implements FabricaUI {
    public Boton crearBoton() { return new BotonIOS(); }
    public TarjetaPropiedad crearTarjetaPropiedad() { return new TarjetaIOS(); }
    public FormularioReserva crearFormularioReserva() { return new FormularioIOS(); }
}
