package Ejercicio10;

import java.util.Scanner;

public class Frase {

    public String RecibirFrase(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese frase para eliminar espacios: ");
        return EliminarEspacios(sc.nextLine());
    }

    public String EliminarEspacios(String frase){
        frase = frase.replaceAll("\\s+","");
        return frase;
    }

}
