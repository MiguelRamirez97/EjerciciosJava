package Ejercicio14;

import java.util.Scanner;

public class Numero {
    private int num = 0;

    public void PedirNumero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero: ");
        num = sc.nextInt();
        Saltos();
    }

    public void Saltos(){
        while (CondicionMenorA1000()){
            num += 2;
            if(Condicion1001()){
                num -= 1;
            }
            System.out.println(num);
        }
    }

    public boolean Condicion1001(){
        return num == 1001;
    }

    public boolean CondicionMenorA1000(){
        return num < 1000;
    }

}
