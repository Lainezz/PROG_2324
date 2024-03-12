package com.es.programacion.tema7.proyectoQuiz;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Quiz {

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


        // EMPIEZA EN PROGRAMA
        // Hacer 10 preguntas random
        // Almacenar la puntuacion del usuario
        // Escribir el nombre del usuario junto con su puntuacion en un fichero

        // CÓDIGO PARA ESCOGER 10 PREGUNTAS AL AZAR
        ArrayList<String> preguntasParaJuego = new ArrayList<>();
        ArrayList<String> respuestasParaJuego = new ArrayList<>();
        Random r = new Random();
        while (preguntasParaJuego.size() < 10) {
            int nRandom = r.nextInt(preguntas.size()); // Genera un numero Random entre 0 y el nº de preguntas que haya
            String pregunta = preguntas.get(nRandom);
            String respuesta = respuestas.get(nRandom);

            if(!preguntasParaJuego.contains(pregunta)) {
                preguntasParaJuego.add(pregunta);
                respuestasParaJuego.add(respuesta);
            }
        }


        // JUEGO NORMAL -> HACER LAS 10 PREGUNTAS (preguntad el nombre del usuario)
        // Creo 3 variables para almacenar, el nombre del usuario, la respuesta que da el usuario y la puntacion del usuario
        String nombreUsuario = "";
        String respuestaUsuario = "";
        int puntuacion = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Dime tu nombre:");
        nombreUsuario = scan.nextLine();

        // Recorro el arrayList que contiene las preguntas para el juego
        for(int i=0; i<preguntasParaJuego.size(); i++) {
            // Almaceno temporalmente la pregunta y la respuesta que se va a hacer
            String pregunta = preguntasParaJuego.get(i);
            String respuesta = respuestas.get(i);

            // Formulo la pregunta
            System.out.println(pregunta);
            respuestaUsuario = scan.nextLine();

            // Compruebo si la respuesta es correcta
            if(respuestaUsuario.equalsIgnoreCase(respuesta)) {
                System.out.println("Respuesta correcta");
                puntuacion++;
            } else {
                System.out.println("Respuesta incorrecta, la respuesta correcta era..."+respuesta);
            }
        }
        System.out.println(nombreUsuario+ ", tu puntuacion ha sido de..."+puntuacion);


        // ESCRIBIR EN EL FICHERO EL NOMBRE:PUNTUACION
        // OJO 1: No sobreescribir la información que haya en el fichero (Lo del append true)
        // OJO 2: El fichero quizá no existe... si no existe deberíais crearlo (Lo de .createNewFile())

        // 1º Obtener el fichero
        File ficheroPuntuaciones = new File("src"+ls+"main"+ls+"resources"+ls+"archivosTema7"+ls+"proyectoQuiz"+ls+"puntuaciones.txt");
        // 2º Comprobar que el fichero existe
        if(!ficheroPuntuaciones.exists()) {
            try {
                ficheroPuntuaciones.createNewFile();
            } catch (IOException e){
                e.printStackTrace();
                System.exit(0);
            }
        }

        // 3º Abrir flujos de escritura
        try {
            FileWriter fw = new FileWriter(ficheroPuntuaciones, true);
            BufferedWriter bw = new BufferedWriter(fw);

            // 4º Operar con el fichero
            bw.write(nombreUsuario+":"+puntuacion+"\n");

            // 5º Cerrar los flujos
            bw.close();
            fw.close();


        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
