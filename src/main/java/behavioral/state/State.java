package behavioral.state;

public class State {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Reserva reserva = new Reserva("María", "Apartamento Eixample 4A");

        cliente.mostrar(reserva);
        cliente.ejecutar(reserva, reserva::confirmar,   "Confirmar reserva");
        cliente.ejecutar(reserva, reserva::completar,   "Iniciar estancia");
        cliente.ejecutar(reserva, reserva::cancelar,    "Cancelar en curso (inválido)");
        cliente.ejecutar(reserva, reserva::completar,   "Completar estancia");
        cliente.ejecutar(reserva, reserva::dejarResena, "Dejar reseña");
        cliente.ejecutar(reserva, reserva::cancelar,    "Cancelar completada (inválido)");
    }
}
