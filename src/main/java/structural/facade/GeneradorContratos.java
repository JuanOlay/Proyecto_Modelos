package structural.facade;

public class GeneradorContratos {
    public String generar(String huesped, String propiedad) {
        System.out.println("[Contratos] Generando contrato para " + huesped + " en " + propiedad);
        return "CONTRATO-" + huesped.toUpperCase() + "-" + propiedad.toUpperCase();
    }
}
