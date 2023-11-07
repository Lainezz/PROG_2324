package com.es.programacion.tema4.funciones;

public class TeoriaFuncionesII {


    /**
     * Método para sumar dos variables
     * @param a sumando 1
     * @param b sumando 2
     * @return resultado de la suma (int)
     */
    public static int sumar (int a, int b) {
        return a + b;
    }

    /**
     * Método para realizar resta
     * @param a numero 1
     * @param b numero 2
     * @return resultado de la resta
     */
    private static int restar (int a, int b) {
        return a-b;
    }

    /**
     * Imprime por pantalla un mensaje
     */
    protected static void imprimirOperaciones() {
        System.out.println("Esta clase puede sumar y restar");
    }


}
