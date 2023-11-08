package com.es.programacion.tema4.funciones;

import com.es.programacion.tema4.funcionesII.DniValidator;
import com.es.programacion.tema4.funcionesII.CypherUtils;

public class TeoriaFuncionesI {


    public static void main(String[] args) {

        // VAMOS A VER LO QUE PODEMOS HACER DE LA OTRA CLASE

        boolean esValido = DniValidator.checkDNI("12345678A");
        if (esValido) {
            System.out.println("El DNI es valido");
        } else {
            System.out.println("El DNI no es valido");
        }


        String unaCadenaParaCifrar = "pass123";
        CypherUtils.cifrarPass(unaCadenaParaCifrar);



    } // FIN DE MAIN


    /**
     * Método que imprime por pantalla el nombre del usuario
     * @param nombreUsuario (String) Nombre del usuario a imprimir por pantalla
     */
    public static void imprimirNombre(String nombreUsuario) {
        System.out.println("Hola "+nombreUsuario);
    }



} // FIN DE CLASE
