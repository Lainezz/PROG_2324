package com.es.programacion.tema7.proyectoUserProfe.services.api;

import com.es.programacion.tema7.proyectoUserProfe.model.Logger;

import java.util.ArrayList;

public abstract class Service<T> implements ServiceAPI<T> {

    protected ArrayList<T> registros;
    protected GestionFicheroAPI<T> gestionFicheroUser;

    protected String ruta;


    public Service(GestionFicheroAPI<T> gestionFicheroUser, String ruta) {
        this.ruta = ruta;
        this.gestionFicheroUser = gestionFicheroUser;
        leerFichero();
    }

    protected void leerFichero() {
        this.registros = this.gestionFicheroUser.leerFichero(ruta);
    }

    protected void anadirFichero(T u) {
        this.gestionFicheroUser.anadirFichero(u, ruta);
    }

    protected void modificarFichero() { this.gestionFicheroUser.modificarFichero(this.registros, ruta); }

    @Override
    abstract public T find(String id);

    @Override
    abstract public boolean exists(String id);

    @Override
    abstract public boolean alta(T newObj);
}
