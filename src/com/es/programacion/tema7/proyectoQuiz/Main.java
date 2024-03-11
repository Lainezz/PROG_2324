package com.es.programacion.tema7.proyectoQuiz;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Vamos a leer un fichero que va a contener preguntas y respuestas, separadas por :
        String ls = File.separator;
        File fichero = new File("src"+ls+"main"+ls+"resources"+ls+"archivosTema7"+ls+"proyectoQuiz"+ls+"preguntas_respuestas.txt");

        ArrayList<String> preguntas = new ArrayList<>();
        ArrayList<String> respuestas = new ArrayList<>();

        try {
            // 1º Comprobar que el fichero existe
            if(fichero.exists() && fichero.isFile() && fichero.canRead()) {

                // 2º Abrir los flujos de lectura (Vamos a trabajar con un BufferedReader)
                FileReader fr = new FileReader(fichero);
                BufferedReader br = new BufferedReader(fr);

                // 3º Operar con el fichero
                String pregunta = "";
                String respuesta = "";

                String linea = br.readLine();
                while (linea != null) {
                    //System.out.println(linea);
                    String[] lineaSeparada = linea.split(":");
                    pregunta = lineaSeparada[0];
                    respuesta = lineaSeparada[1];
                    preguntas.add(pregunta);
                    respuestas.add(respuesta);
                    linea = br.readLine();
                }

                // Recorrer preguntas e imprimo cada elemento
                for(int i=0; i<preguntas.size(); i++) {
                    System.out.println("Pregunta "+i+": "+preguntas.get(i));
                }

                // Recorrer respuestas e imprimo cada elemento
                for(int i=0; i<respuestas.size(); i++) {
                    System.out.println("Respuesta "+i+": "+respuestas.get(i));
                }

                // 4º Cerrar flujos
                br.close();
                fr.close();
            }


        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al operar con el fichero");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error general... eliminando todos sus archivos");
        }

        /*
        Hacer un pequeño programa que te pregunte todas las preguntas,
        compruebe si la respuesta es correcta.
        (Opc) Que vaya sumando el nº de respuestas correctas y que muestre la puntuación al final
         */


    }
}
