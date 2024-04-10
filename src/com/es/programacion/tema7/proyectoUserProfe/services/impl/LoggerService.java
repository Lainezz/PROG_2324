package com.es.programacion.tema7.proyectoUserProfe.services.impl;

import com.es.programacion.tema7.proyectoUserProfe.model.Logger;
import com.es.programacion.tema7.proyectoUserProfe.services.api.GestionFicheroAPI;

import java.util.ArrayList;

public class LoggerService implements GestionFicheroAPI<Logger> {


    @Override
    public ArrayList<Logger> leerFichero(String ruta) {
        return null;
    }

    @Override
    public void modificarFichero(ArrayList<Logger> objs, String ruta) {

    }

    @Override
    public void anadirFichero(Logger obj, String ruta) {

    }
}
