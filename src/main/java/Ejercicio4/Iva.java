package Ejercicio4;

import java.util.Scanner;

public class Iva {
    private final Double Iva = 0.21;

    public String SumarIva(){
        Double valor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        valor = sc.nextDouble();
        return "El precio del producto con el iva es: "+(valor+(valor*Iva));
    }
}
