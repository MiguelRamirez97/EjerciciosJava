package Ejercicio12;

import java.util.Scanner;

public class Comparar {

    public void PedirFrases(){
        String frase1 = "";
        String frase2 = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese frase 1: ");
        frase1 = sc.nextLine();
        System.out.println("Ingrese frase 2: ");
        frase2 = sc.nextLine();
        Comparacion(frase1,frase2);
    }

    public void Comparacion(String frase1, String frase2){
        if (!frase1.equals(frase2)) {
            System.out.println("Las frases no son iguales");
            Diferencias(frase1, frase2);
        }else{
            System.out.println("Las frases son iguales");
        }
    }

    public void Diferencias(String frase1, String frase2){
        int Tamaño ;
        Tamaño = frase1.length() < frase2.length() ? frase1.length() : frase2.length();
        for (int i = 0 ; i < Tamaño ; i++){
            System.out.println("La frase1 tiene en el caracter "+i+" una "+frase1.charAt(i));
            System.out.println("La frase2 tiene en el caracter "+i+" una "+frase2.charAt(i));
        }
    }
}
