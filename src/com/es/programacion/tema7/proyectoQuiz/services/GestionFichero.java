package com.es.programacion.tema7.proyectoQuiz.services;

import com.es.programacion.tema7.proyectoQuiz.model.Participante;
import com.es.programacion.tema7.proyectoQuiz.model.Pregunta;

import java.util.ArrayList;

public class GestionFichero {

    /*

    Va a tener 2 métodos.
    1º Va a ser para leer un fichero y volcar la información en en ArrayList de Preguntas

    2º Va a ser para escribir en un fichero LA INFORMACIÓN que viene desde el arrayList de participantes

     */


    public ArrayList<Pregunta> leerFicheroPreguntas() {

        // 0º Crear e inicializar el ArrayList que al final pasaremos a la clase Trivial
        ArrayList<Pregunta> arrDePreguntasTemporal = new ArrayList<>();

        // 1º Abrir el file (la ruta es la misma que en el ejercicio anterior)

        // 2º Comprobar si el file existe, tiene modo lectura, etc.

        // 3º Abrir flujos de lectura (QUEREMOS TRABAJAR CON BUFFEREDREADER)

        // 4º Operar con el fichero
        // Lo que hay que hacer es:
            // a) Separar la línea en pregunta y respuesta (con el .split)
            // b) Crear un objeto de tipo Pregunta
            // c) Si el objeto se ha creado correctamente, añadirlo al ArrayList arrDePreguntasTemporal

        // 5º Cerrar los flujos
        // 6º Devolver el arrDePreguntasTemporal
        return null;


    }

    public void escribirFicheroPuntuaciones(ArrayList<Participante> arrPar) {

        // 1º Abrir el File (la ruta del fichero de puntuaciones)
        // 2º Comprobar que existe y está modo escritura
        // 3º Abrir los flujos de Escritura (con BufferedWriter)

        // 4º Operar con el fichero
            // a) Recorrer el ArrayList arrPar
            // b) Escribir todos los registros de arrPar en el fichero
            // El formato para escribir va a ser:
            // id:[fecha,puntuacion;fecha,puntuacion]

        // 5º Cerrar los flujos de escritura

    }

}
