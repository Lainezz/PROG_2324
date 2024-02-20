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
                articulos.get(i).setStock(vaper2.getStock());
                break;
            }
        }
        System.out.println(articulos.get(0));

        Articulo vaper3 = new Articulo("1","Vaper para sordos",p1, 5, 50);

        if (articulos.contains(vaper3)){
            articulos.get(articulos.indexOf(vaper3)).setStock(vaper3.getStock());
        }

        System.out.println(articulos.get(0));


        // Crear 5 Articulos más.
        // Los vais a añadir al arrayList
        // Vais a mostrar la lista de artículos
        // ¿La lista está ordenada?
        // ORDENA LA LISTA... (plot twist: Se puede hacer con una sola línea)
        // Muestra la lista de nuevo



    }
}
