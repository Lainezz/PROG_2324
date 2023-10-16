package com.es.programacion.tema3;

public class TeoriaI {

    public static void main(String[] args) {



        // Declaración e inicialización de un array unidimensional de enteros
        int[] numeros = {10, 20, 30, 40, 50};
        // Declaración e inicialización de un array unidimensional de números reales
        double[] reales = {1.02, 2, 3.33, 0.14, 5};
        // Declaración e inicialización de un array unidimensional de caracteres
        char[] carac = {'a','b','c','%','4'};

        // Declaramos una matriz 3x3
        int[][] matriz = {new int[3], new int[5], new int[10]};



        String[][] matrizDeCadenas = new String[2][2];
        matrizDeCadenas[0][0] = "pepito";
        matrizDeCadenas[0][1] = "menganito";
        matrizDeCadenas[1][0] = "fulanito";
        matrizDeCadenas[1][1] = "zanganito";


        char[][] matrizDeChar = {
                {'a','b','c','d'},
                {'%','f','/','*'},
                {'i','?',',','!'},
                {'1',')','n','o'}
        };

        /**
         * Si sabemos que cada posición corresponde a un módulo, podemos saber cuántos alumnos hay por módulo.
         * 0 -> Sistemas informáticos
         * 1 -> Programación
         * 2 -> Entornos de desarrollo
         * 3 -> Bases de datos
         * 4 -> Lenguajes de marcas
         */
        int[] numAlumn = {21, 17, 15, 21, 12};


        char[][] tablero = new char[8][8];

        // PIEZAS BLANCAS
        tablero[0][0] = 'T';
        tablero[0][1] = 'C';
        tablero[0][2] = 'A';
        tablero[0][3] = 'Q';
        tablero[0][4] = 'K';
        tablero[0][5] = 'A';
        tablero[0][6] = 'C';
        tablero[0][7] = 'T';

        tablero[1][0] = 'P';
        tablero[1][1] = 'P';
        tablero[1][2] = 'P';
        tablero[1][3] = 'P';
        tablero[1][4] = 'P';
        tablero[1][5] = 'P';
        tablero[1][6] = 'P';
        tablero[1][7] = 'P';

        // PIEZAS NEGRAS
        tablero[6][0] = 'P';
        tablero[6][1] = 'P';
        tablero[6][2] = 'P';
        tablero[6][3] = 'P';
        tablero[6][4] = 'P';
        tablero[6][5] = 'P';
        tablero[6][6] = 'P';
        tablero[6][7] = 'P';

        tablero[7][0] = 'T';
        tablero[7][1] = 'C';
        tablero[7][2] = 'A';
        tablero[7][3] = 'Q';
        tablero[7][4] = 'K';
        tablero[7][5] = 'A';
        tablero[7][6] = 'C';
        tablero[7][7] = 'T';

    }

}
