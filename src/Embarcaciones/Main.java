package Embarcaciones;

public class Main {
    public static void main(String[] args) {

        Capitan ariadna = new Capitan("Ariadna","Rodriguez","123456");
        Capitan jhon = new Capitan("Jhon", "Hernandez","12345678");
        Yate yate1 = new Yate(ariadna,30000,20000,2010, 15,5);
        Yate yate2 = new Yate(jhon,30000,20000,2023, 15,14);
        Velero velero1 = new Velero(ariadna,30000,20000,2010, 15,3);
        Velero velero2 = new Velero(jhon,30000,20000,2023, 15,5);
        System.out.println(yate1.comprarYate());

        System.out.println("EL yate del capitan "+ ariadna.getNombre() + yate2.comprarYate());

        System.out.println(yate1.isLuxury());

        System.out.println(yate2.isLuxury());

        System.out.println(velero1.isBig());

        System.out.println(velero2.isBig());




    }
}

