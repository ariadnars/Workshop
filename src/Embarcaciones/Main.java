package Embarcaciones;

public class Main {
    public static void main(String[] args) {

        Capitan ariadna = new Capitan("Ariadna","Rodriguez","123456");
        Capitan jhon = new Capitan("Jhon", "Hernandez","12345678");
        Yate yate1 = new Yate(ariadna,40000,20000,2010, 15,5);
        Yate yate2 = new Yate(jhon,30000,20000,2023, 15,14);
        Velero velero1 = new Velero(ariadna,50000,20000,2010, 15,3);
        Velero velero2 = new Velero(jhon,60000,20000,2023, 15,5);

        System.out.println("EL yate1 tiene como capitan a: " + yate1.getCapitan().getNombre());
        System.out.println("EL yate2 tiene como capitan a: " + yate2.getCapitan().getNombre());

        System.out.println("El yate1 es de lujo: " + yate1.isLuxury());
        System.out.println("El yate2 es de lujo: " + yate2.isLuxury());

        System.out.println("El velero1 es grande: " + velero1.isBig());
        System.out.println("El velero2 es grande: " + velero2.isBig());

        System.out.println("Se esta tramitando la compra del yate1, esta compra se pudo hacer?: " + yate1.comprarYate());
        System.out.println("Se esta tramitando la compra del yate1, esta compra se pudo hacer?: " + yate1.comprarYate());

        System.out.println("El aquiler del yate1 es: " + yate1.calcularAlquiler());
        System.out.println("El aquiler del yate2 es: " + yate2.calcularAlquiler());

        System.out.println("El aquiler del velero1 es: " + velero1.calcularAlquiler());
        System.out.println("El aquiler del velero2 es: " + velero2.calcularAlquiler());






    }
}

