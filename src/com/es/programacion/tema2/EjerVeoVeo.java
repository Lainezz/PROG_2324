package com.es.programacion.tema2;

import java.util.Scanner;

public class EjerVeoVeo {

    public static void main(String[] args) {
        /**
         * ADIVINAR LO QUE SE ESTA VIENDO
         * YO veo un ORDENADOR -> O
         * Yo veo un Raton -> R
         * Yo veo un Rotulador -> R
         */

        /**
         * HACER UN PROGRAMA DONDE EL PROGRAMADOR SEA EL QUE "VE" ALGO
         * ESE ALGO -> Lo declara como char cosa = '';
         *
         * El programa dice:
         * -> VEO VEO
         * -> QUÉ VES
         * -> UNA COSITA QUE EMPIEZA POR LA LETRA ...
         *
         *
         * Un compañer@ vuestro, debe introducir esa letra
         * Si acierta... BIEN HAS GANADO
         * Si no acierta... MAL, intentalo de nuevo
         *
         *
         */
        Scanner scan = new Scanner(System.in);
        char letraAAdivinar = 'O'; // Lo que vosotros veáis
        char letra = scan.next().charAt(0);


    }



}
