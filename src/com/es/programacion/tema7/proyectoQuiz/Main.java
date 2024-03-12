package com.es.programacion.tema7.proyectoQuiz;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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
        y que compruebe si la respuesta es correcta.

        Debe preguntar, comprobar si la respuesta dada es correcta, y mostrar
        -> Respuesta correcta
        -> Respuesta incorrecta, la respuesta correcta es..."respuesta correcta"

        (Opc.1) Que vaya sumando el nº de respuestas correctas y que muestre la puntuación al final
        (Opc.2) Que se elijan preguntas random
         */
        Scanner scan = new Scanner(System.in);
        String respuestaUsuario = "";
        int nCorrectas = 0;
        for(int i=0; i< preguntas.size(); i++) {
            String pregunta = preguntas.get(i);
            String respuesta = respuestas.get(i);
            System.out.println(pregunta);
            respuestaUsuario = scan.nextLine();

            if(respuestaUsuario.equalsIgnoreCase(respuesta)) {
                System.out.println("Respuesta correcta");
                nCorrectas++;
            } else {
                System.out.println("Respuesta incorrecta, la respuesta correcta era..."+respuesta);
            }
        }
        System.out.println("Has acertado "+nCorrectas+" preguntas");

        // Manera RANDOM
        String respuestaUsuarioR = "";
        String salir = "";
        int nCorrectasR = 0;
        Random r = new Random();

        while (!salir.equalsIgnoreCase("si")) {
            int nRandom = r.nextInt(preguntas.size());
            String pregunta = preguntas.get(nRandom);
            String respuesta = respuestas.get(nRandom);

            System.out.println(pregunta);
            respuestaUsuarioR = scan.nextLine();

            if(respuestaUsuarioR.equalsIgnoreCase(respuesta)) {
                System.out.println("Respuesta correcta");
                nCorrectasR++;
            } else {
                System.out.println("Respuesta incorrecta, la respuesta correcta era..."+respuesta);
            }

            System.out.println("¿Salir? si/no");
            salir = scan.nextLine();
        }

        System.out.println("Has acertado "+nCorrectasR+" preguntas");


    }
}
