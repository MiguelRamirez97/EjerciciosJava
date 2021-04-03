package Ejercicio17;

public class Main {
    private static Double PrecioElectrodomesticos = 0.0;
    private static Double PrecioTelevisores = 0.0;
    private static Double PrecioLavadoras = 0.0;

    public static void main(String[] args) {
        Electrodomestico ArregloElectrodomesticos[] = new Electrodomestico[10];
        ArregloElectrodomesticos[0] = new Television();
        ArregloElectrodomesticos[1] = new Lavadora();
        ArregloElectrodomesticos[2] = new Electrodomestico(150.0,"amarillo",
                'U',52.0);
        ArregloElectrodomesticos[3] = new Television(200.0,"gris",'A',
                50.0, 50.0,true);
        ArregloElectrodomesticos[4] = new Lavadora(50.0,"amarillo",'B',
                100.0,35.0);
        ArregloElectrodomesticos[5] = new Lavadora(100.0,100.0);
        ArregloElectrodomesticos[6] = new Electrodomestico();
        ArregloElectrodomesticos[7] = new Lavadora(150.0,"rojo",'H',
                200.0,10.0);
        ArregloElectrodomesticos[8] = new Lavadora();
        ArregloElectrodomesticos[9] = new Electrodomestico(24.0,10.0);

        for (Electrodomestico iterador : ArregloElectrodomesticos){
            Television(iterador);
            Lavadora(iterador);
            Electrodomestico(iterador);
        }

       System.out.println("El precio total de televisores es de: "+PrecioTelevisores+
               " , el precio total de lavadoras es de: "+PrecioLavadoras+
               " , el precio total de electrodomesticos es de: "+PrecioElectrodomesticos);
        System.out.println("El precio final es de: "+(PrecioElectrodomesticos+PrecioLavadoras+
                PrecioTelevisores));
    }

    public static void Television(Electrodomestico iterador){
        if (CondicionTelevisor(iterador)){
            System.out.println("El precio del televisor es: "+iterador.PrecioFinal());
            PrecioTelevisores += iterador.PrecioFinal();
        }
    }

    public static void Lavadora(Electrodomestico iterador){
        if (CondicionLavadora(iterador)){
            System.out.println("El precio de la lavadora es: "+iterador.PrecioFinal());
            PrecioLavadoras += iterador.PrecioFinal();
        }
    }

    public static void Electrodomestico(Electrodomestico iterador){
        if (CondicionElectrodomestico(iterador)){
            System.out.println("El precio del electrodomestico es: "+iterador.PrecioFinal());
            PrecioElectrodomesticos += iterador.PrecioFinal();
        }
    }

    public static Boolean CondicionTelevisor(Electrodomestico iterador){
        return iterador instanceof Television;
    }

    public static Boolean CondicionLavadora(Electrodomestico iterador){
        return iterador instanceof Lavadora;
    }

    public static Boolean CondicionElectrodomestico(Electrodomestico iterador){
        return !(iterador instanceof Television) && !(iterador instanceof Lavadora);
    }

}
