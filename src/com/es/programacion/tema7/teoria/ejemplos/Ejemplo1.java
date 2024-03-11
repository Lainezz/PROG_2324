package com.es.programacion.tema7.teoria.ejemplos;

import java.util.ArrayList;

public class Ejemplo1 {


    public static void main(String[] args) {

        /*
        Enunciado
        Crear un programa que lea un fichero de texto plano y cuente las
        palabras que hay en él.
        El programa debe mostrar el número de palabras que hay.
        (Opcional) Mostrar las palabras también.
         */

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Diego");
        arr.add("adyheudhe");
        arr.add("depiode");

        arr.forEach((item)->{
            System.out.println(item);
        });




    }
}
