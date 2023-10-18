package com.es.programacion.tema1.entregas;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        /*Rafael Sánchez Sánchez
        Actividad 02
         */

        int a;
        int b;

        Scanner scan = new Scanner(System.in);
        System.out.println("Dime el número a");

        a = scan.nextInt();

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Dime el número b");

        b = scan1.nextInt();

        int suma = a + b ;
        System.out.println("La suma es" + suma);

        int resta = a - b ;
        System.out.println("La resta es" +resta);

        int producto = a * b;
        System.out.println("El producto es" +producto);

        double division = a / b;
        System.out.println("La división es" +division);














    }
}




