package Embarcaciones;

public class Embarcacion {
    private Capitan capitan;
    private double precioBase;
    private double valorAdicional;
    private int yearDeFabricacion;
    private double eslora;

    public Embarcacion(Capitan capitan, double precioBase, double valorAdicional, int yearDeFabricacion, double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.yearDeFabricacion = yearDeFabricacion;
        this.eslora = eslora;
    }

    public Capitan getCapitan() {
        return capitan;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public int getYearDeFabricacion() {
        return yearDeFabricacion;
    }

    public double getEslora() {
        return eslora;
    }

    public double calcularAlquiler(){
        double alquiler = precioBase;
        if (yearDeFabricacion > 2020){
            alquiler = precioBase + 20000;
        }
        return alquiler;
    }


}
