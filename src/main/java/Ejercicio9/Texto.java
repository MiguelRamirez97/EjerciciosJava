package Ejercicio9;

public class Texto {
    private String texto = "La sonrisa sera la mejor arma contra la tristeza";

    public String ReemplazarYConcatenar(){
        texto = texto.replace('a','e');
        texto +="+Texto adicionado";
        return texto;
    }

}
