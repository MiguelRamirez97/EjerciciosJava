package Ejercicio17;

public class Lavadora extends Electrodomestico{
    private Double Carga;
    private final Double CargaPorDefecto = 5.0;

    public Lavadora(){
        this.Carga = CargaPorDefecto;
    }

    public Lavadora(Double PrecioBase, Double Peso) {
        super(PrecioBase, Peso);
        this.Carga = CargaPorDefecto;
    }

    public Lavadora(Double PrecioBase, String Color, Character ConsumoEnergetico,
                    Double Peso, Double carga) {
        super(PrecioBase, Color, ConsumoEnergetico, Peso);
        Carga = carga;
    }


    public Double getCarga() {
        return Carga;
    }

    public double PrecioFinal(){
        Double PrecioFinalLavadora = 0.0;
        if (getCarga() > 30){
            PrecioFinalLavadora = 50.0;
        }
        PrecioFinalLavadora += super.PrecioFinal();
        return PrecioFinalLavadora;
    }

}
