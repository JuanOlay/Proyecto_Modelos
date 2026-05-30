package creational.abstractfactory;

class FabricaWeb implements FabricaUI {
    public Boton crearBoton() { return new BotonWeb(); }
    public TarjetaPropiedad crearTarjetaPropiedad() { return new TarjetaWeb(); }
    public FormularioReserva crearFormularioReserva() { return new FormularioWeb(); }
}
