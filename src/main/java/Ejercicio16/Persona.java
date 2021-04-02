package Ejercicio16;

import java.util.HashMap;
import java.util.Map;

public class Persona {
    private String Nombre = "";
    private Integer Edad = 0;
    private String DNI = generaDNI();
    private Character Sexo = 'H';
    private Double Peso = 0.0;
    private Double Altura = 0.0;
    private Double IMC;

    //Constructor por defecto
    public Persona() {
    }

    //Constructor2 nombre, edad y sexo, el resto por defecto.
    public Persona(String Nombre, Integer Edad, Character Sexo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
    }

    //Constructor3 Parametros
    public Persona(String name, Integer Edad, Character Sexo, Double Peso, Double Altura) {
        this.Nombre = name;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Peso = Peso;
        this.Altura = Altura;
    }

    public Integer CalcularIMC(){
        IMC = Peso/(Math.pow(Altura,2));
        Integer Valor;
        if(CondicionMenorA20()){
            Valor = -1;
            DebajoPesoIdeal();
        }
        else if (CondicionEntre20Y25()){
            Valor = 0;
            PesoIdeal();
        }
        else{
            Valor = 1;
            SobrePeso();
        }
        return Valor;
    }

    public boolean CondicionMenorA20(){
        return IMC < 20;
    }

    public boolean CondicionEntre20Y25(){
        return IMC >= 20 && IMC <= 25;
    }

    public String EsMayorDeEdad(){
        return Edad >= 18 ? getNombre()+" Es mayor de edad" : getNombre()+" No es mayor de edad" ;
    }

    public Character ComprobarSexo(Character sexo){
        return (CondicionSexo(sexo)) ? 'H' : sexo;
    }

    public boolean CondicionSexo(Character sexo){
        return sexo != 'H' && sexo != 'M';
    }

    public String ToString(){
        return "El nombre es: "+getNombre()+" ,la edad es: "+getEdad()+" años, El DNI es: "
                +getDNI()+" ,El sexo es: " +getSexo()+" ,el peso es: "
                +getPeso()+ " Kg ,la altura es: "+getAltura()+" Metros";

    }

    public String generaDNI(){
        Integer numero = (int) (Math.random() * 99999999) + 10000000;
        Character letra = LetraDNI(numero%23);
        String total = numero.toString()+letra;
        return total;
    }

    public Character LetraDNI(int numero){
        Map<Integer, Character> map = new HashMap<Integer, Character>();
        map.put(0, 'T');		map.put(12, 'N');
        map.put(1, 'R');		map.put(13, 'J');
        map.put(2, 'W');	    map.put(14, 'Z');
        map.put(3, 'A');	    map.put(15, 'S');
        map.put(4, 'G');		map.put(16, 'Q');
        map.put(5, 'M');        map.put(17, 'V');
        map.put(6, 'Y');		map.put(18, 'H');
        map.put(7, 'F');		map.put(19, 'L');
        map.put(8, 'P');	    map.put(20, 'C');
        map.put(9, 'D');	    map.put(21, 'K');
        map.put(10, 'X');		map.put(22, 'E');
        map.put(11, 'B');
        return map.get(numero);
    }


    public String getNombre() {
        return Nombre;
    }

    public Integer getEdad() {
        return Edad;
    }

    public String getDNI() {
        return DNI;
    }

    public Character getSexo() {
        return Sexo;
    }

    public Double getPeso() {
        return Peso;
    }

    public Double getAltura() {
        return Altura;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }

    public void setSexo(Character sexo) {
        Sexo = sexo;
    }

    public void setPeso(Double peso) {
        Peso = peso;
    }

    public void setAltura(Double altura) {
        Altura = altura;
    }

    public void DebajoPesoIdeal(){
        System.out.println(getNombre() + " Esta por debajo de su peso ideal");
    }

    private void PesoIdeal() {
        System.out.println(getNombre() + " Esta en su peso ideal");
    }

    private void SobrePeso() {
        System.out.println(getNombre() + " Tiene sobrepeso");
    }

}
