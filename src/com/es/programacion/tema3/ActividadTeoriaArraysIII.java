package com.es.programacion.tema3;

public class ActividadTeoriaArraysIII {

    public static void main(String[] args) {

        /**
         * Corregir los siguientes códigos para que hagan lo que dice el enunciado.
         */

        System.out.println("*******Actividad 1*************");

        /**
         * Actividad 1.
         * Recorrer el array desde el primer elemento hasta el último y mostrar por pantalla cada uno de los elementos
         */
        String[] arrDeSt = {"uno", "dos", "tres", "cuatro", "cinco"};
        for (int i=0; i<arrDeSt.length-1; i++) {
            System.out.println(i);
        }


        System.out.println("*******Actividad 2*************");

        /**
         * Actividad 2.
         * Recorrer el array desde el primer elemento hasta el último y mostrar por pantalla cada uno de los elementos
         */
        String[] equipoPokemon = {"Butterfly", "Pigeot", "Charizard", "Zapdos", "Gyarados"};
        for (int i=1; i<equipoPokemon.length; i++) {
            System.out.println(i);
        }

        System.out.println("*******Actividad 3*************");
        /**
         * Actividad 3.
         * Dado un array de double, realizar la sumatoria de todos los elementos del array y sacar la media aritmética
         */
        int[] notas = {5, 7, 5, 6, 5, 8, 5, 5, 8, 6, 7, 8, 4, 8, 2, 9, 4, 5};
        int sumatoria = 0;
        for (int i=1; i<notas.length-1; i++) {
            sumatoria = notas[i];
        }
        double notaMedia = sumatoria / notas.length;
        System.out.println("La nota media es: "+notaMedia);





    }

}
