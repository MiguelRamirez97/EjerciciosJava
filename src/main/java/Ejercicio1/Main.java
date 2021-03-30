package Ejercicio1;

public class Main {
    private static final Integer Numero1 = 10;
    private static final Integer Numero2 = 5;

    public static void main(String[] args) {
        String Resultado = (CondicionIguales())? Iguales():Mayor();
        System.out.println(Resultado);
    }

    public static boolean CondicionIguales(){
        return Numero1 == Numero2;
    }

    public static String Iguales(){
        return "Los numeros son iguales";
    }

    public static String Mayor(){
        return (Numero1>Numero2)?"El Numero1 es mayor":"El Numero2 es mayor";
    }
}
