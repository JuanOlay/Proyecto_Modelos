package creational.singleton;

import java.util.List;

public class ConfiguracionGlobal {

    private static volatile ConfiguracionGlobal instancia;

    private double comisionServicio;
    private List<String> monedasAceptadas;
    private double umbralPenalizacion;
    private String politicaReembolso;

    private ConfiguracionGlobal() {
        this.comisionServicio   = 0.12;
        this.monedasAceptadas   = List.of("USD", "EUR", "GBP");
        this.umbralPenalizacion = 0.15;
        this.politicaReembolso  = "Estándar";
    }

    public static ConfiguracionGlobal getInstance() {
        if (instancia == null) {
            synchronized (ConfiguracionGlobal.class) {
                if (instancia == null) {
                    instancia = new ConfiguracionGlobal();
                }
            }
        }
        return instancia;
    }

    public void setComisionServicio(double comision)     { this.comisionServicio = comision; }
    public void setPoliticaReembolso(String politica)    { this.politicaReembolso = politica; }

    public double getComisionServicio()                  { return comisionServicio; }
    public List<String> getMonedasAceptadas()            { return monedasAceptadas; }
    public double getUmbralPenalizacion()                { return umbralPenalizacion; }
    public String getPoliticaReembolso()                 { return politicaReembolso; }
}
