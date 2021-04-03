package Ejercicio18;

public class Serie implements Entregable {
    private String Titulo;
    private Integer NumeroDeTemporadas;
    private Boolean Entregado;
    private String Genero;
    private String Creador;
    private final String TituloPorDefecto = "Supernatural";
    private final Integer NumeroDeTemporadasPorDefecto = 3;
    private final Boolean EntregadoPorDefecto = false;
    private final String GeneroPorDefecto = "Terror";
    private final String CreadorPorDefecto = "Eric Kripke";


    public Serie() {
        this.Titulo = TituloPorDefecto;
        this.NumeroDeTemporadas = NumeroDeTemporadasPorDefecto;
        this.Entregado = EntregadoPorDefecto;
        this.Genero = GeneroPorDefecto;
        this.Creador = CreadorPorDefecto;
    }

    public Serie(String titulo, String creador) {
        this.Titulo = titulo;
        this.NumeroDeTemporadas = NumeroDeTemporadasPorDefecto;
        this.Entregado = EntregadoPorDefecto;
        this.Genero = GeneroPorDefecto;
        this.Creador = creador;
    }


    public Serie(String titulo, Integer numeroDeTemporadas, String genero, String creador) {
        this.Titulo = titulo;
        this.NumeroDeTemporadas = numeroDeTemporadas;
        this.Entregado = EntregadoPorDefecto;
        this.Genero = genero;
        this.Creador = creador;
    }


    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public Integer getNumeroDeTemporadas() {
        return NumeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(Integer numeroDeTemporadas) {
        NumeroDeTemporadas = numeroDeTemporadas;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getCreador() {
        return Creador;
    }

    public void setCreador(String creador) {
        Creador = creador;
    }

    public String toString(){
        return getTitulo()+" ,tiene "+getNumeroDeTemporadas()+
                " temporadas, su genero es: "+getGenero()+" y su creador es: "+getCreador();
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
        return this.NumeroDeTemporadas > ((Serie) a).NumeroDeTemporadas;
    }

}
