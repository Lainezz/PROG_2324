package com.es.programacion.tema6.proyectoEmpresa;

import java.util.ArrayList;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        Proveedor p1 = new Proveedor("B12326", "Construcciones Diego", "SL", "Calle falsa, 123", "666333000");
        Proveedor p2 = new Proveedor("B12326", "Construcciones Diego", "SL", "Calle falsa, 123", "666333000");


        Articulo vaper = new Articulo("1", "Vaper de melocoton",
                p1, 5, 100);
        Articulo vaper2 = new Articulo("1", "Vaper de melocoton",
                p2, 5, 100);

        System.out.print(vaper.equals(vaper2));

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1.equals(p2));


        ArrayList<Articulo> articulos = new ArrayList<>();

        articulos.add(vaper);

        // estamos añadiendo un vaper que ya existe
        // Queremos añadir vaper2
        System.out.println(articulos.get(0));
        for (int i=0; i<= articulos.size(); i++) {
            if(vaper2.equals(articulos.get(i))) {
                articulos.get(i).setStock( articulos.get(i).getStock() + vaper2.getStock() );
                break;
            }
        }
        System.out.println(articulos.get(0));
    }
}
