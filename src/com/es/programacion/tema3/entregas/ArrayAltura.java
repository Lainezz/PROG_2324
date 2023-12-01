package com.es.programacion.tema3.entregas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayAltura {
    public static void main(String[] args) {

        /**
         Raquel
         Ardila Atienza

         Ejercicio 2 Array de alturas

         Crea un programa para realizar cálculos relacionados con la altura (en
         metros) de personas. Pedirá un valor N y luego almacenará en un array
         N alturas introducidas por teclado. Luego mostrará la altura media,
         máxima y mínima, el número de personas con altura mayor a la media y
         el número de personas con altura por debajo de la media.
         Controla las posibles excepciones que se puedan producir:
         • Se intenta introducir un valor diferente a un número -> InputMismatchException
         • Se intenta acceder a una posición del array que no existe -> IndexOutOfBoundsException

         */

        Scanner scan = new Scanner(System.in);

        System.out.print("¿Cuantas alturas quiere introducir?: "); //Pedimos al usuario cuantas alturas quiere introducir
        int num = scan.nextInt();

        //Declaramos e inicializamos
        double alturas[] = new double[num];


        try {
            //Pedimos alturas al usuario e introducimos en array
            System.out.print("Introduce las alturas de una en una: ");
            for (int i = 0; i < alturas.length; i++) {
                alturas[i] = scan.nextDouble();
            }


            //Calculamos la altura media, máxima y mínima
            double suma = 0;
            double media = 0;

            double maximo = alturas[0];
            double minim = alturas[0];


            for (int i = 0; i <= alturas.length - 1; i++) {
                suma = suma + alturas[i];

                if (alturas[i] > maximo) {
                    maximo = alturas[i];
                }
                if (alturas[i] < minim) {
                    minim = alturas[i];
                }
            }
            media = suma / num;

            //Calculamos cuántas personas miden por encima y por debajo de la media.
            int porEncima = 0;
            int porDebajo = 0;

            for (int i = 0; i < alturas.length - 1; i++) {
                if (alturas[i] > media) {
                    porEncima++;
                }
                if (alturas[i] < media) {
                    porDebajo++;
                }
            }


            //Mostramos todos los datos
            System.out.println("Altura media: " + media);
            System.out.println("Altura máxima: " + maximo);
            System.out.println("Altura mínima: " + minim);
            System.out.println("Alturas por encima de la media: " + porEncima);
            System.out.println("Alturas por debajo de la media: " + porDebajo);


        } catch (InputMismatchException e) { //si introduce un valor diferente a un número
            System.out.print("Tipo de dato incorrecto"); //muestra este mensaje
            scan.nextLine();

        } catch (IndexOutOfBoundsException e) { //Si se intenta acceder a una posición del array que no existe
            System.out.print("Posicion Incorrecta"); //muestra este mensaje
            scan.nextLine();
        }

    }
}
