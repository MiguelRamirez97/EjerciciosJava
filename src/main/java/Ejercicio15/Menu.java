package Ejercicio15;

import java.util.Scanner;

public class Menu {
    private Integer Opcion = 0;

    public void EscogerOpcion(){
        while (CondicionMostrarMenu()){
            if (Opcion > 8){
                System.out.println("Opcion Incorrecta");
                MostrarMenu();
                PedirNumero();
            }else {
                MostrarMenu();
                PedirNumero();
            }
        }
    }

    public void PedirNumero(){
        Scanner sc = new Scanner(System.in);
        Opcion = sc.nextInt();
    }

    public void MostrarMenu(){
        System.out.println("******GESTION CINEMATOGRAFICA******");
        System.out.println("1-NUEVO ACTOR");
        System.out.println("2-BUSCAR ACTOR");
        System.out.println("3-ELIMINAR ACTOR");
        System.out.println("4-MODIFICAR ACTOR");
        System.out.println("5-VER TODOS LOS ACTORES");
        System.out.println("6-VER PELICULAS DE LOS ACTORES");
        System.out.println("7-VER CATEGORIAS DE LAS PELICULAS DE LOS ACTORES");
        System.out.println("8-SALIR");
    }

    public boolean CondicionMostrarMenu(){
        return Opcion != 8;
    }

}
