package Ejercicio18;

public class Videojuego implements Entregable{
    private String Titulo;
    private Integer HorasEstimadas;
    private Boolean Entregado;
    private String Genero;
    private String Compañia;
    private final String TituloPorDefecto = "League Of Legends";
    private final Integer HorasEstimadasPorDefecto = 10;
    private final Boolean EntregadoPorDefecto = false;
    private final String GeneroPorDefecto = "MOBA";
    private final String CompañiaPorDefecto = "Riot Games";

    public Videojuego() {
        this.Titulo = TituloPorDefecto;
        this.HorasEstimadas = HorasEstimadasPorDefecto;
        this.Entregado = EntregadoPorDefecto;
        this.Genero = GeneroPorDefecto;
        this.Compañia = CompañiaPorDefecto;
    }

    public Videojuego(String titulo, Integer horasEstimadas) {
        this.Titulo = titulo;
        this.HorasEstimadas = horasEstimadas;
        this.Entregado = EntregadoPorDefecto;
        this.Genero = GeneroPorDefecto;
        this.Compañia = CompañiaPorDefecto;
    }

    public Videojuego(String titulo, Integer horasEstimadas, String genero, String compañia) {
        this.Titulo = titulo;
        this.HorasEstimadas = horasEstimadas;
        this.Entregado = EntregadoPorDefecto;
        this.Genero = genero;
        this.Compañia = compañia;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public Integer getHorasEstimadas() {
        return HorasEstimadas;
    }

    public void setHorasEstimadas(Integer horasEstimadas) {
        HorasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getCompañia() {
        return Compañia;
    }

    public void setCompañia(String compañia) {
        Compañia = compañia;
    }

    public String toString(){
        return getTitulo()+" ,tiene "+getHorasEstimadas()+
                " horas estimadas, su genero es: "+getGenero()+" y su compañia es: "+getCompañia();
    }

    @Override
    public void Entregar() {
        this.Entregado = true;
    }

    @Override
    public void Devolver() {
        this.Entregado = false;
    }

    @Override
    public Boolean IsEntregado() {
        return this.Entregado;
    }

    @Override
    public Boolean CompareTo(Object a) {
        return   this.HorasEstimadas > ((Videojuego) a).HorasEstimadas;
    }

}
