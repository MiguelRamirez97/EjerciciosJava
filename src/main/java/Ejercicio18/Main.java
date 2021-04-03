package Ejercicio18;

public class Main {
    private static Integer CantidadSeriesEntregadas = 0;
    private static Integer CantidadVideojuegosEntregados = 0;
    private static Serie SerieMayor;
    private static Videojuego VideojuegoMayor;
    private static Serie seriePrueba = new Serie();
    private static Videojuego juegoPrueba = new Videojuego();

    public static void main(String[] args) {
        Serie ArregloSeries[] = new Serie[5];
        Videojuego ArregloVideojuegos[] = new Videojuego[5];

        ArregloSeries[0] = new Serie();
        ArregloSeries[1] = new Serie("Lucifer", 6, "Comedia", "Tom Kapinos");
        ArregloSeries[2] = new Serie("Flash", "Greg Berlanti");
        ArregloSeries[3] = new Serie("Naruto", 2, "Anime", "Masashi Kishimoto");
        ArregloSeries[4] = new Serie("DragonBallZ", 4, "Anime", "Akira Toriyama");

        ArregloVideojuegos[0] = new Videojuego();
        ArregloVideojuegos[1] = new Videojuego("Call Of Duty", 100, "Shooter", "Activision");
        ArregloVideojuegos[2] = new Videojuego("Valorant", 20);
        ArregloVideojuegos[3] = new Videojuego("Uncharted4", 10, "Accion-Aventura", "Naughty Dog");
        ArregloVideojuegos[4] = new Videojuego("Cyberpunk 2077", 175, "Estrategia", "CD Projekt");

        ArregloSeries[1].Entregar();
        ArregloSeries[3].Entregar();
        ArregloSeries[4].Entregar();
        ArregloVideojuegos[1].Entregar();
        ArregloVideojuegos[3].Entregar();

        for (Object iterador : ArregloSeries) {
            EntregaDeSeries((Serie) iterador,ArregloSeries);
            SerieMayor((Serie) iterador);
        }
        for (Object iterador : ArregloVideojuegos) {
            EntregaDeVideojuegos((Videojuego) iterador,ArregloVideojuegos);
            VideojuegoMayor((Videojuego) iterador);
        }
        System.out.println("Hay " + CantidadSeriesEntregadas + " series entregadas");
        System.out.println("Hay " + CantidadVideojuegosEntregados + " videojuegos entregados");
        System.out.println("La serie con mas temporadas es: "+SerieMayor);
        System.out.println("El videojuego con mas horas estimadas es: "+VideojuegoMayor);
        }

    public static void EntregaDeSeries (Serie iterador,Serie[]ArregloSeries){
        CantidadSeriesEntregadas = ((Serie) iterador).IsEntregado() ? CantidadSeriesEntregadas + 1 :
                CantidadSeriesEntregadas;
        ((Serie) iterador).Devolver();
    }

    public static void EntregaDeVideojuegos (Videojuego iterador,Videojuego[]ArregloVideojuegos){
        CantidadVideojuegosEntregados = ((Videojuego) iterador).IsEntregado() ? CantidadVideojuegosEntregados + 1 :
                CantidadVideojuegosEntregados;
        ((Videojuego) iterador).Devolver();
    }

    public static void SerieMayor(Serie iterador) {
        if(iterador.CompareTo(seriePrueba)) {
            SerieMayor = iterador;
            seriePrueba = iterador;
        }
    }

    public static void VideojuegoMayor(Videojuego iterador) {
        if(iterador.CompareTo(juegoPrueba)) {
            VideojuegoMayor = iterador;
            juegoPrueba = iterador;
        }
    }
}
