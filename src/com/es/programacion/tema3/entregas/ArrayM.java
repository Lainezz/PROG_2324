package com.es.programacion.tema3.entregas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayM {
    public static void main(String[] args) {
        /**
         Raquel
         Ardila Atienza

         Ejercicio 3 Array de Ms

         Crea un programa que pida al usuario dos valores N y M y luego cree un
         array de tamaño N que contenga M en todas sus posiciones. Luego
         muestra el array por pantalla.
         Controla las posibles excepciones que se puedan producir:
         • Se intenta introducir un valor diferente a un número ->InputMismatchException
         • Se intenta acceder a una posición del array que no existe -> IndexOutOfBoundsException

         */

        Scanner scan = new Scanner(System.in);

        //Pedimos dos valores n y m
        System.out.print("Valor de n : ");
        int n = scan.nextInt();
        System.out.print("Valor de m: ");
        int m = scan.nextInt();


        try {

            //Creamos el array
            int posiciones[] = new int[n];
            for (int i = 0; i <= posiciones.length - 1; i++) {
                posiciones[i] = m;
            }


            //Mostramos el array
            System.out.print("Array: ");
            for (int i = 0; i <= posiciones.length - 1; i++) {
                System.out.print(posiciones[i] + " ");
            }


        } catch (InputMismatchException e) { //si introduce un valor diferente a un número
            System.out.print("Tipo de dato incorrecto"); //muestra este mensaje
            scan.nextLine();

        }catch (IndexOutOfBoundsException e) { //Si se intenta acceder a una posición del array que no existe
            System.out.print("Posicion Incorrecta"); //muestra este mensaje
            scan.nextLine();
        }
    }
}
