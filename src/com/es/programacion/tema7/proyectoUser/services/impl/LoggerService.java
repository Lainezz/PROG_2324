package com.es.programacion.tema7.proyectoUser.services.impl;

import com.es.programacion.tema7.proyectoUser.services.api.BasicServiceLogger;

import java.time.LocalDateTime;

public class LoggerService implements BasicServiceLogger {

    private GestionFicheroLogger gestion;

    public LoggerService() {
        this.gestion = new GestionFicheroLogger();
    }

    public LoggerService(GestionFicheroLogger gestion) {
        this.gestion = gestion;
    }

    @Override
    public void registrarLog(String infoUser, String accion, String estado) {
        LocalDateTime time = LocalDateTime.now();
        String mensaje = "["+accion.toUpperCase()+"] " + time.toString()+" "+infoUser +"-"+ estado;
        anadirFicheroLogger(mensaje);
    }

    @Override
    public void anadirFicheroLogger(String mensaje) {

        this.gestion.anadirFicheroLog(mensaje, "src/main/resources/archivosTema7/logs/logs.txt");

    }
}
