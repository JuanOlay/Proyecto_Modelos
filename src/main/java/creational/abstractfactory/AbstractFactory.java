package creational.abstractfactory;

class AbstractFactory {
    public static void main(String[] args) {
        Cliente clienteWEB = new Cliente(new FabricaWeb());
        Cliente clienteIOS = new Cliente(new FabricaIOS());
        Cliente clienteAndroid = new Cliente(new FabricaAndroid());

        Cliente[] clientes = {clienteWEB, clienteIOS, clienteAndroid};

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
            System.out.println(cliente.obtenerVista());
            System.out.println();
        }
    }
}
