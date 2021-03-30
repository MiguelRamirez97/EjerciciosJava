package Ejercicio5;

public class Numero {
    private Integer Numero = 1;

    public void MostrarNumerosParEImparHastaEl100(){
        while (Numero <= 100){
            System.out.println((CondicionPar() ? "El numero "+Numero+" es par" :
                    "El numero "+Numero+" es impar"));
            Numero ++;
        }
    }

    public boolean CondicionPar(){
        return (Numero % 2)==0;
    }
}
