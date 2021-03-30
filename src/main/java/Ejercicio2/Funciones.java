package Ejercicio2;

import java.util.Scanner;

public class Funciones {
    private Integer Numero1;
    private Integer Numero2;

    public void PedirNumeros(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor del numero1: ");
        this.Numero1=sc.nextInt();
        System.out.println("Ingrese el valor del numero2: ");
        this.Numero2=sc.nextInt();
    }

    public boolean CondicionIguales(){
        return Numero1 == Numero2;
    }

    public String Iguales(){
        return "Los numeros son iguales";
    }

    public String Mayor(){
        return (Numero1>Numero2)?"El Numero1 es mayor":"El Numero2 es mayor";
    }
}
