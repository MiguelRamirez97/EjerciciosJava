package Ejercicio6;

public class Numero {
    Integer Numero = 1;

    public void MostrarNumerosParEImparHastaEl100(){
        for (Numero = 1 ; Numero <= 100 ; Numero++){
            System.out.println((CondicionPar() ? "El numero "+Numero+" es par" :
                    "El numero "+Numero+" es impar"));
        }
    }

    public boolean CondicionPar(){
        return (Numero % 2)==0;
    }
}
