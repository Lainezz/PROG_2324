package com.es.programacion.tema3.entregas;

import java.util.Scanner;

public class DniValidator {
    public static void main(String[] args) {
        /**
         Raquel
         Ardila Atienza

         Ejercicio 4 DNI validator

         Crea un programa que pida al usuario un DNI y que luego compruebe si
         dicho DNI es válido ateniéndose a las siguientes caracteristicas:
         - La longitud del DNI debe ser de 9
         - El carácter en la última posición del DNI debe ser una letra.

         */

        String dni = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce DNI: ");
        dni = scan.next();


        //Calculamos que el dni tiene 9 caracteres
        if (dni.length() == 9) {
            System.out.println("DNI es correcto");
        } else {
            System.out.println("DNI es incorrecto");
        }

        //Extraer ultimo caracter del DNI
        char letraDni = dni.charAt(8);

        //Calculamos si el ultimo caracter es una letra
        for (int i = 0; i <= dni.length() - 2; i++) {
            System.out.println(dni.charAt(i));
        }
        if (Character.isLetter(letraDni)) {
            System.out.println("DNI valido");
        } else {
            System.out.println("DNI Incorrecto, el último caracter ha de ser una letra");
        }

    }


}

