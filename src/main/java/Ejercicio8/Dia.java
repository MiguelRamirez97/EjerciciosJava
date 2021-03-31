package Ejercicio8;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Dia {
    private static List<String> Laborales = Arrays.asList(new String[]{"lunes", "martes", "miercoles",
            "jueves", "viernes"});
    private static List<String> NoLaborales = Arrays.asList(new String[]{"sabado", "domingo"});

    public String PedirDia() {
        int caso;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el dia: ");
        caso = CondicionLaboral(sc.nextLine());
        return Respuesta(caso);
    }

    public int CondicionLaboral(String Dia) {
        if (Laborales.contains(Dia.toLowerCase())) {
            return 0;
        } else if (NoLaborales.contains(Dia.toLowerCase())) {
            return 1;
        } else {
            return 2;
        }
    }

    public String Respuesta(int caso){
        switch (caso){
            case 0 :
                return "Es un dia laboral";
            case 1 :
                return "No es un dia laboral";
            default:
                return "No es un dia valido";
        }
    }
}

