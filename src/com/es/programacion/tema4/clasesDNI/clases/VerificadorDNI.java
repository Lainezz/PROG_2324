package com.es.programacion.tema4.clasesDNI.clases;

public class VerificadorDNI {

    private static String dni = "";

    /**
     * Metodo que comprueba que la ultima posicion es una letra
     * @param dni (String) dni a comprobar
     * @return true - es una letra false - no es una letra
     */
    public static boolean comprobarLetra(String dni) {
        // Obtenemos la ultima posición del String (que debe ser la letra)
        char letraDNI = dni.charAt(dni.length()-1);
        // Comprobamos que dicha letra es EFECTIVAMENTE UNA LETRA
        if((letraDNI >= 65 && letraDNI <= 90) || (letraDNI >= 97 && letraDNI <= 122)){
            return true;
        } else {
            return false;
        }
    } // FIN comprobarLetra


    public static boolean comprobarLongitud(String dni){
        return true;
    } // FIN comprobarLongitud


    public static boolean comprobarLetraCorrecta(String dni) {
        return true;
    }// FIN COMPROBARLetraCorrecta




}// FIN CLASE
