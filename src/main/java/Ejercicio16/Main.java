package Ejercicio16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader sc = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(sc);

        System.out.println("Ingrese el nombre: ");
        String nombre = bf.readLine();
        System.out.println("Ingrese la edad en años: ");
        Integer edad = Integer.parseInt(bf.readLine());
        System.out.println("Ingrese el sexo H o M: ");
        Character sexo = bf.readLine().charAt(0);
        System.out.println("Ingrese el peso el Kilogramos: ");
        Double peso = Double.parseDouble(bf.readLine());
        System.out.println("Ingrese la altura en metros: ");
        Double altura = Double.parseDouble(bf.readLine());

        Persona persona1 = new Persona(nombre,edad,sexo,peso,altura);
        persona1.setSexo(persona1.ComprobarSexo(sexo));
        Persona persona2 = new Persona(nombre,edad,sexo);
        persona2.setSexo(persona2.ComprobarSexo(sexo));

        Persona persona3 = new Persona();
        persona3.setNombre("Persona3");
        persona3.setEdad(26);
        persona3.setSexo('M');
        persona3.setPeso(70.0);
        persona3.setAltura(1.66);

        persona1.CalcularIMC();
        persona2.CalcularIMC();
        persona3.CalcularIMC();

        System.out.println(persona1.EsMayorDeEdad());
        System.out.println(persona2.EsMayorDeEdad());
        System.out.println(persona3.EsMayorDeEdad());

        System.out.println(persona1.ToString());
        System.out.println(persona2.ToString());
        System.out.println(persona3.ToString());

    }
}
