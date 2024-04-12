package com.es.programacion.tema7.proyectoUser.services.impl;

import com.es.programacion.tema7.proyectoUser.model.Butaca;
import com.es.programacion.tema7.proyectoUser.services.api.BasicServiceCine;

public class ServiceCine implements BasicServiceCine {

    private String nombreCine;
    private static final int NFILAS = 10;
    private static final int NASIENTOS = 10;

    private Butaca[][] salaDeCine;
    private GestionFicheroCine gestion;

    // Constructor
    public ServiceCine(String nombreCine) {

        this.nombreCine = nombreCine;
        this.gestion = new GestionFicheroCine();
        this.salaDeCine = new Butaca[NFILAS][NASIENTOS]; // Aquí, tendríamos un array bidimensional de Butaca, lleno de nulls
        /*
        [null,null,null]
        [null,null,null]
        [null,null,null]
         */

        this.salaDeCine = gestion.leerFicheroCine(""); //aquí vamos a leer el fichero para llenar el array de objetos Butaca
        /*
        [null,Butaca,Butaca]
        [null,null,null]
        [null,Butaca,null]
         */

    }


    @Override
    public void mostrarButacas() {

    }

    @Override
    public boolean comprarEntrada() {
        return false;
    }

    @Override
    public boolean devolverEntrada() {
        return false;
    }

    @Override
    public boolean checkComprador(String idUser) {
        return false;
    }

    @Override
    public void leerFicheroCine() {

    }

    @Override
    public void anadirFicheroCine(Butaca b) {

    }

    @Override
    public void modificarFicheroCine() {

    }
}
