package behavioral.state;

public class Cliente {

    public void mostrar(Reserva reserva) {
        System.out.println("Reserva [" + reserva.getPropiedad() + "] "
                + "— Huésped: " + reserva.getHuesped()
                + " — Estado: " + reserva.getEstado());
    }

    public void ejecutar(Reserva reserva, Runnable accion, String descripcion) {
        try {
            accion.run();
            System.out.println("[OK] " + descripcion);
        } catch (IllegalStateException e) {
            System.out.println("[ERROR] " + descripcion + " → " + e.getMessage());
        }
        mostrar(reserva);
    }
}
