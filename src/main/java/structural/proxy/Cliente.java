package structural.proxy;

public class Cliente {

    public void mostrarPerfil(PerfilAnfitrion perfil) {
        System.out.println("Nombre    : " + perfil.getNombre());
        System.out.println("Teléfono  : " + perfil.getTelefono());
        System.out.println("Dirección : " + perfil.getDireccion());
        System.out.println("---");
    }
}
