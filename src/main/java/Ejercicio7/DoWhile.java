package Ejercicio7;

import java.util.Scanner;

public class DoWhile {
    private Integer Numero ;

    public void MayorOIgualACero(){
        do{
            Numero = RecibirDato();
        }while (CondicionMenorACero());
        if (CondicionMayorIgualACero()){
            System.out.println("El numero es : "+Numero);
        }
    }

    public int RecibirDato(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        return sc.nextInt();
    }

    public boolean CondicionMayorIgualACero(){
        return Numero >= 0;
    }

    public boolean CondicionMenorACero(){
        return Numero < 0;
    }




}
