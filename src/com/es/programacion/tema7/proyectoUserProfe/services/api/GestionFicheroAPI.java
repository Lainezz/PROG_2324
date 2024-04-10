package com.es.programacion.tema7.proyectoUserProfe.services.api;

import java.util.ArrayList;

public interface GestionFicheroAPI<T> {


    ArrayList<T> leerFichero(String ruta);
    void modificarFichero(ArrayList<T> objs, String ruta);
    void anadirFichero(T obj, String ruta);


}
