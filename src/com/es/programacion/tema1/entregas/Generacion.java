package com.es.programacion.tema1.entregas;

import java.util.Scanner;

public class Generacion {
    public static void main(String[] args) {
        int ani;

        Scanner scan = new Scanner(System.in);
        System.out.println("¿En qué año naciste?");
        ani = scan.nextInt();

        if (ani < 1930) {
            System.out.println("Demasiado viejo");
        }

        if (ani >= 1930 & ani <= 1948) {
            System.out.println("Eres niño de la posguerra");
        }

        if (ani >= 1949 & ani <= 1968) {
            System.out.println("Eres baby boomer");
        }
        if (ani >= 1969 & ani <= 1980) {
            System.out.println("Eres Generación X");
        }
        if (ani >= 1981 & ani <= 1993) {
            System.out.println("Eres Millennial");
        }
        if (ani >= 1994 & ani <= 2010) {
            System.out.println("Eres Generación Z");
        }
        if (ani >= 2011 & ani <= 2023) {
            System.out.println("Eres alfa");
        }
        if (ani > 2023) {
            System.out.println("¿No has nacido?");
        }

    }
}
