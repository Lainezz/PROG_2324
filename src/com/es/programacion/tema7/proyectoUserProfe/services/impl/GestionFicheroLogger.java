package com.es.programacion.tema7.proyectoUserProfe.services.impl;

import com.es.programacion.tema7.proyectoUserProfe.model.Logger;
import com.es.programacion.tema7.proyectoUserProfe.services.api.GestionFicheroAPI;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GestionFicheroLogger implements GestionFicheroAPI<Logger> {


    @Override
    public ArrayList<Logger> leerFichero(String ruta) {
        return null;
    }

    @Override
    public void modificarFichero(ArrayList<Logger> objs, String ruta) {

    }

    @Override
    public void anadirFichero(Logger obj, String ruta) {

        // 1º Abrimos el fichero
        File fichero = new File(ruta);

        // 2º Comprobamos que existe
        if (fichero.exists() && fichero.isFile() && fichero.canWrite()) {

            FileWriter fw = null;
            BufferedWriter bw = null;

            try {
                // 3º Abrimos los flujos de escritura -> Append a true
                fw = new FileWriter(fichero, true);
                bw = new BufferedWriter(fw);


                // 4º 0peramos con el fichero
                bw.write(obj.toString());
                bw.write("\n");


                // 5º Cerrar flujos
                bw.close();
                fw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
