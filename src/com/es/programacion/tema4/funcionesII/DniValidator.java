package com.es.programacion.tema4.funcionesII;

public class DniValidator {

    /**
     * Método que comprueba la validez de un DNI
     * @param dni
     * @return true -> DNI valido / False -> DNI invalido
     */
    public static boolean checkDNI(String dni){

        char letraDNI = dni.charAt(dni.length()-1);
        if (comprobarLength(dni) && checkCaracteres(dni) && comprobarSiEsLetra(letraDNI)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Comprueba la longitud del DNI
     * @return
     */
    protected static boolean comprobarLength(String dni) {

        if (dni.length() == 9) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo que comprueba que la ultima posicion es una letra
     * @param letraDNI caracter del dni
     * @return
     */
    protected static boolean comprobarSiEsLetra(char letraDNI) {

        if((letraDNI >= 65 && letraDNI <= 90) || (letraDNI >= 97 && letraDNI <= 122)){
            return true;
        } else {
            return false;
        }

    }


    /**
     * Método que compruebe que todos los caracteres del DNI son válidos.
     * Comprobar que tiene 8 numeros y 1 letra
     */
    private static boolean checkCaracteres(String dni) {
        boolean dniEsValido = true;
        for(int i=0; i<=dni.length()-2; i++) {

            try{

                // Intentar parsear a entero el caracter
                char letraEnI = dni.charAt(i); // Obtenemos el caracter en esa posicion
                String letraEnPosicionI = Character.toString(letraEnI); // Convertir ese caracter a String
                int num = Integer.parseInt(letraEnPosicionI); // Intentamos convertir el String a int

            } catch (NumberFormatException e) {
                System.out.println("El dni no es valido");
                dniEsValido = false;
                break;
            }
        }
        return dniEsValido;
    }



} // FIN DE LA CLASE
