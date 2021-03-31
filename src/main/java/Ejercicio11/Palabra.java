package Ejercicio11;

import java.util.Scanner;

public class Palabra {
    private String vocales = "aeiou";
    private int contador[] = {0,0,0,0,0};

    public String RecibirPalabra() {
        String frase = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese palabra: ");
        frase = sc.nextLine();
        System.out.println(Tamaño(frase));
        return frase;
    }

    public String Tamaño(String frase){
        return "La frase tiene "+frase.length()+" caracteres";
    }

    public void ContadorVocales(String frase){
        for (int i = 0 ; i < frase.length() ; i++){
            for (int j = 0 ; j < vocales.length() ; j++){
                if(frase.charAt(i)==vocales.charAt(j)){
                   contador[j] += 1;
                }
            }
        }
        ImprimirCantidadVocales();
    }

    public void ImprimirCantidadVocales(){
        System.out.println("Tiene "+contador[0]+" 'a'");
        System.out.println("Tiene "+contador[1]+" 'e'");
        System.out.println("Tiene "+contador[2]+" 'i'");
        System.out.println("Tiene "+contador[3]+" 'o'");
        System.out.println("Tiene "+contador[4]+" 'u'");
    }

}
