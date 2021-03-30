package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Funciones funcion = new Funciones();
        funcion.PedirNumeros();
        System.out.println(funcion.CondicionIguales()?funcion.Iguales():funcion.Mayor());
    }
}
