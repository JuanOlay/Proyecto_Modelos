package structural.facade;

public class SistemaCalendario {
    public void bloquearFechas(String propiedad, String fechaEntrada, String fechaSalida) {
        System.out.println("[Calendario] Bloqueando " + propiedad + " del " + fechaEntrada + " al " + fechaSalida);
    }
}
