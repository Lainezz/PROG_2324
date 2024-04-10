package com.es.programacion.tema7.proyectoUser.services.impl;

import com.es.programacion.tema7.proyectoUser.services.api.BasicServiceLogger;

public class LoggerService implements BasicServiceLogger {

    private GestionFicheroLogger gestion;

    public LoggerService() {
        this.gestion = new GestionFicheroLogger();
    }

    public LoggerService(GestionFicheroLogger gestion) {
        this.gestion = gestion;
    }

    @Override
    public boolean logAlta(String idUser) {
        return false;
    }

    @Override
    public boolean logLogin(String idUser) {
        return false;
    }

    @Override
    public void anadirFicheroLogger(String mensaje) {

        this.gestion.anadirFicheroLog(mensaje, "");

    }
}
