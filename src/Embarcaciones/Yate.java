package Embarcaciones;

public class Yate extends Embarcacion  {
    private int cantidadCamarotes;
    private boolean estaVendido;

    public Yate (Capitan capitan, double precioBase, double valorAdicional, int yearDeFabricacion, double eslora, int cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, yearDeFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
        this.estaVendido = false;
    }

    public int getCantidadCamarotes() {
        return cantidadCamarotes;
    }

    public boolean isEstaVendido() {
        return estaVendido;
    }

    public boolean isLuxury() {
        return (cantidadCamarotes > 7);
    }

    public boolean comprarYate() {
        if(estaVendido) return  false;
        estaVendido = true;
        return true;
    }


}
