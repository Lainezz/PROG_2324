package com.es.programacion.tema3.entregas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GestionCine {
    public static void main(String[] args) {

        /**
         Raquel
         Ardila Atienza

         Ejercicio 1 Gestion Cine

         Crea un programa donde inicialices un array bidimensional de 10x10 con
         el valor “__” (doble barra baja) en todas sus posiciones.
         Acto seguido el programa mostrará un menú para:
         1. Comprar entrada
         0. Salir

         El programa deberá permitir comprar un número indefinido de entradas,
         es decir, hasta que no se pulse salir, el usuario debe poder seguir
         comprando entradas.

         El usuario introducirá el asiento que desee, en formato fila y
         columna, y el programa intentará reservar dicho asiento. Si ese
         asiento está libre, el programa actualizará dicha posición a “XX”. Si
         dicha posición se encuentra ocupada, el programa mostrará un mensaje
         adecuado para que el usuario quede informado.

         */

        Scanner scan = new Scanner(System.in);

        //Declaramos e inicializamos el array bidimensional
        String[][] asiento = new String[10][10];


        int opcion;
        int entrada = 0;
        int totalEntradas = 0;

        do { //Do- while para crear el menu
            System.out.println("¿Qué desea hacer?\n " +
                    "1. Comprar Entrada\n" +
                    "0. Salir\n"
            );
            opcion = scan.nextInt();

            if (opcion == 1) { // Opcion 1 comprar entrada
                System.out.println("Ha comprado una entrada");
                entrada++;
                totalEntradas = entrada;
            } else if (opcion == 0) { // opcion 0 salir
                System.out.println("Saliendo del programa");
            }
            System.out.println("Usted ha comprado: " + totalEntradas + "entradas"); //Mostrar el total de entradas compradas


            for (int i = 0; i <= asiento.length - 1; i++) {  //recorremos las filas
                for (int j = 0; j <= asiento[i].length - 1; j++) { // recorremos las columnas
                    asiento[i][j] = "__";


                    if (asiento[i][j].equals("__")) {
                        asiento[i][j] = "XX";
                    }

                }
            }
        } while (opcion >= 1);
    }
}
