package com.es.programacion.pruebas.otro;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        //properties.forEach((k, v) -> System.out.println(k + ":" + v));


        Map<String, String> mapaPrueba = new HashMap<>();
        mapaPrueba.put("1", "Diego");
        mapaPrueba.put("2", "Pepe");

        mapaPrueba.forEach(
                (key, value) -> {
                    System.out.println("Clave: "+key);
                    System.out.println("Valor: "+value);
                }
        );

        ArrayList<Prueba> arrPrueba = new ArrayList<>();
        Prueba p = new Prueba("diego");
        Prueba p2 = new Prueba("diegooooo");
        Prueba p3 = new Prueba("diooo");
        Prueba p4 = new Prueba("o");
        Prueba p5 = new Prueba("diegoooo2e22s2s2o");
        Prueba p6 = new Prueba("diegooooo");

        arrPrueba.add(p);
        arrPrueba.add(p2);
        arrPrueba.add(p3);
        arrPrueba.add(p4);
        arrPrueba.add(p5);
        arrPrueba.add(p6);


        Comparator<Prueba> comparator = Comparator.comparingInt(obj -> obj.cadena.length());

        arrPrueba.forEach((value) -> {
            System.out.println("Valor: "+value);
        });

        Collections.sort(arrPrueba, comparator);

        arrPrueba.forEach((value) -> {
            System.out.println("Valor: "+value);
        });


    }
}
