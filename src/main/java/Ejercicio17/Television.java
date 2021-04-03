package Ejercicio17;

public class Television extends Electrodomestico{
    private Double Resolucion;
    private Boolean SintonizadorTDT;
    private final Double ResolucionPorDefecto = 20.0;
    private final Boolean SintonizadorTDTPorDefecto = false;


    public Television() {
        this.Resolucion = ResolucionPorDefecto;
        this.SintonizadorTDT = SintonizadorTDTPorDefecto;
    }


    public Television(Double PrecioBase, Double Peso) {
        super(PrecioBase, Peso);
        this.Resolucion = ResolucionPorDefecto;
        this.SintonizadorTDT = SintonizadorTDTPorDefecto;
    }


    public Television(Double PrecioBase, String Color, Character ConsumoEnergetico, Double Peso,
                      Double resolucion, Boolean sintonizadorTDT) {
        super(PrecioBase, Color, ConsumoEnergetico, Peso);
        this.Resolucion = resolucion;
        this.SintonizadorTDT = sintonizadorTDT;
    }

    public Double getResolucion() {
        return Resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return SintonizadorTDT;
    }

    public double PrecioFinal(){
        double PrecioFinalTelevision = super.PrecioFinal();
        if (CondicionResolucionMayorA40()){
            PrecioFinalTelevision += (PrecioFinalTelevision*0.3);
        }
        if (CondicionSintonizador()){
            PrecioFinalTelevision += 50;
        }
        return PrecioFinalTelevision;
    }

    public Boolean CondicionResolucionMayorA40(){
        return getResolucion() > 40;
    }

    public Boolean CondicionSintonizador(){
        return getSintonizadorTDT() == true;
    }

}
