package creational.abstractfactory;

class FabricaAndroid implements FabricaUI {
    public Boton crearBoton() { return new BotonAndroid(); }
    public TarjetaPropiedad crearTarjetaPropiedad() { return new TarjetaAndroid(); }
    public FormularioReserva crearFormularioReserva() { return new FormularioAndroid(); }
}
