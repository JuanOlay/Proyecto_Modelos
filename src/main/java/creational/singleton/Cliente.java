package creational.singleton;

public class Cliente {

    public void actualizarComision(double nuevaComision) {
        ConfiguracionGlobal.getInstance().setComisionServicio(nuevaComision);
    }

    public void actualizarPolitica(String nuevaPolitica) {
        ConfiguracionGlobal.getInstance().setPoliticaReembolso(nuevaPolitica);
    }

    public void mostrarConfiguracion(String modulo) {
        ConfiguracionGlobal cfg = ConfiguracionGlobal.getInstance();
        System.out.println("=== " + modulo + " ===");
        System.out.println("Comisión      : " + cfg.getComisionServicio());
        System.out.println("Monedas       : " + cfg.getMonedasAceptadas());
        System.out.println("Penalización  : " + cfg.getUmbralPenalizacion());
        System.out.println("Reembolso     : " + cfg.getPoliticaReembolso());
        System.out.println("Misma instancia: " + (cfg == ConfiguracionGlobal.getInstance()));
        System.out.println("---");
    }
}
