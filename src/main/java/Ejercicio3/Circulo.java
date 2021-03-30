package Ejercicio3;

import java.util.Scanner;

public class Circulo {
    private Double Radio;

    public void PedirRadio(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio del circulo :");
        this.Radio = Double.parseDouble(sc.nextLine());
    }

    public String Area(){
        return "El Area del circulo de radio "+Radio+" es: "+Math.PI*Math.pow(Radio,2);
    }

}
