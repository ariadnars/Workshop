package Embarcaciones;

public class Velero extends Embarcacion{
    private int cantidadMastil;

    public Velero(Capitan capitan, double precioBase, double valorAdicional, int yearDeFabricacion, double eslora, int cantidadMastil) {
        super(capitan, precioBase, valorAdicional, yearDeFabricacion, eslora);
        this.cantidadMastil = cantidadMastil;
    }

    public boolean isBig() {
        return (cantidadMastil > 4);
    }

    public int getCantidadMastil() {
        return cantidadMastil;
    }
}
