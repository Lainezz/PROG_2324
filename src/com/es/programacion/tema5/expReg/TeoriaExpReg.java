package com.es.programacion.tema5.expReg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TeoriaExpReg {


    public static void main(String[] args) {


        /*
        ¿QUÉ ES UNA EXPRESIÓN REGULAR?

        Una expresión regular no es otra cosa que un patrón para encontrar una cadena de texto. En Java, este patrón
        se representa siempre con un String

        ¿Qué se necesita para comprobar expresiones regulares?

        1º Necesitamos la clase Pattern
        La clase Patter se encarga de compilar la expresión regular. Dicho de otra manera,
        esta clase sería la encargada de preparar/comprender/compilar la expresión regular para
        que se pueda usar.

        2º Necesitamos (es muy recomendable) la clase Matcher
        Esta clase nos permite hacer match sobre la secuencia de caracteres que nos define el Pattern.
        Con esta clase conseguimos una serie de métodos para buscar la expresión regular en un texto dado.
        Dicho con otras palabras, con esta clase ya podemos buscar un patrón en una cadena de texto.

        3º El método .find() de la clase Matcher
        El método .find() devuelve true si encuentra el patrón dado en la cadena de texto dada.

        EJEMPLO:
        Pattern pattern = Pattern.compile("expReg");
        Matcher matcher = pattern.matcher("cadena de texto donde buscar nuestra expReg");
        System.out.println(matcher.find());
         */



    }
}
