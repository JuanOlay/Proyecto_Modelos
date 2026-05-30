package structural.facade;

public class MotorDisponibilidad {
    public boolean verificar(String propiedad, String fechaEntrada, String fechaSalida) {
        System.out.println("[Disponibilidad] Verificando " + propiedad + " del " + fechaEntrada + " al " + fechaSalida);
        return true;
    }
}
