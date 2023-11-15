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

    /**
     * Método que comprueba que la longitud de un dni dado es de 9
     * @param dni (String) dni a comprobar
     * @return true si longitud es de 9 / false si longitud no es de 9
     */
    public static boolean comprobarLongitud(String dni){
        return dni.length() == 9;
    } // FIN comprobarLongitud


    public static boolean comprobarLetraCorrecta(String dni) {
        return true;
    }// FIN COMPROBARLetraCorrecta


    /**
     * Comprueba que la parte numerica es efectivamente numérica y no contiene
     * caracteres
     * @param dni (String) dni a comprobar
     * @return true si la parte numerica es correcta
     */
    public static boolean comprobarParteNumerica(String dni) {
        String parteNumerica = ""; // String auxiliar para almacenar la parte numerica
        try {
            // Para obtener la parte numerica, hago un substring de la posicion 0 a la 8
            parteNumerica = dni.substring(0, 8);
            System.out.println("La parte numerica es: "+parteNumerica);

            // Por ultimo, voy a comprobar que EFECTIVAMENTE ES UN NUMERO
            int numero = Integer.parseInt(parteNumerica);
            System.out.println("La parte numerica como numero es: "+numero);

        } catch (Exception e) {
            // Si lanza una excepcion significa que la parte numerica del DNI
            // ES INCORRECTA
            System.out.println("Error en los datos");
            return false;
        }
        return true;
    }



}// FIN CLASE
