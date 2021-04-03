package Ejercicio17;

import java.util.*;

public class Electrodomestico {
    private Double PrecioBase;
    private String Color;
    private Character ConsumoEnergetico;
    private Double Peso;
    private final Double PrecioBasePorDefecto = 100.0;
    private final String ColorPorDefecto = "blanco";
    private final Character ConsumoEnergeticoPorDefecto = 'F';
    private final Double PesoPorDefecto = 5.0;
    private static List<String> Colores = Arrays.asList(new String[] {"blanco","negro","rojo","azul"
        ,"gris"});
    private static List<Character> Letras = Arrays.asList(new Character[] {'A','B','C','D','E','F'});

    //Constructor Por Defecto
    public Electrodomestico() {
        this.PrecioBase = PrecioBasePorDefecto;
        this.Color = ColorPorDefecto;
        this.ConsumoEnergetico = ConsumoEnergeticoPorDefecto;
        this.Peso = PesoPorDefecto;
    }

    //Constructor Precio y peso, el resto por defecto
    public Electrodomestico(Double PrecioBase, Double Peso){
        this.PrecioBase = PrecioBase;
        this.Peso = Peso;
        this.Color = ColorPorDefecto;
        this.ConsumoEnergetico = ConsumoEnergeticoPorDefecto;
    }

    //Constructor con todos los atributos
    public Electrodomestico(Double PrecioBase, String Color, Character ConsumoEnergetico, Double Peso){
        this.PrecioBase = PrecioBase;
        this.Color = ComprobarColor(Color);
        this.ConsumoEnergetico = ComprobarConsumoEnergetico(ConsumoEnergetico);
        this.Peso = Peso;
    }

    public Double getPrecioBase() {
        return PrecioBase;
    }

    public String getColor() {
        return Color;
    }

    public Character getConsumoEnergetico() {
        return ConsumoEnergetico;
    }

    public Double getPeso() {
        return Peso;
    }

    public Character ComprobarConsumoEnergetico(Character ConsumoEnergetico) {
        return Letras.contains(ConsumoEnergetico) ? ConsumoEnergetico :
                ConsumoEnergeticoPorDefecto;
    }

    public String ComprobarColor(String Color) {
        return Colores.contains(Color.toLowerCase()) ? Color : ColorPorDefecto;
    }

    public double PrecioFinal() {
        Double PrecioLetra = PrecioLetra(getConsumoEnergetico());
        Double PrecioPeso = PrecioPeso();
        return PrecioLetra + PrecioPeso + getPrecioBase();
    }

    public Double PrecioLetra(Character letra){
        Map<Character, Double> map = new HashMap<Character, Double>();
        map.put('A', 100.0);	map.put('B', 80.0);
        map.put('C', 60.0);		map.put('D', 50.0);
        map.put('E', 30.0);	    map.put('F', 10.0);
        return map.get(letra);
    }

    public Double PrecioPeso() {
        Double PrecioPeso = 0.0;
        if(PesoMenorA19()) {
            PrecioPeso = 10.0;
        }
        if(PesoEntre20Y49()) {
            PrecioPeso = 50.0;
        }
        if(PesoEntre50Y79()) {
            PrecioPeso = 80.0;
        }
        if(PesoMayorA80()) {
            PrecioPeso = 100.0;
        }
        return PrecioPeso;
    }

    public boolean PesoMenorA19() {
        return getPeso() <= 19;
    }

    public boolean PesoEntre20Y49() {
        return getPeso() >=20 && getPeso() <= 49;
    }

    public boolean PesoEntre50Y79() {
        return getPeso() >=50 && getPeso() <= 79;
    }

    public boolean PesoMayorA80() {
        return getPeso() >= 80;
    }

}

