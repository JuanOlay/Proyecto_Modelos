package structural.decorator;

public class Cliente {

    public void mostrar(Reserva reserva) {
        System.out.println("Descripción : " + reserva.getDescripcion());
        System.out.println("Total       : $" + reserva.getPrecio());
        System.out.println("---");
    }
}
