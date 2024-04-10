package com.es.programacion.tema7.proyectoUser.services.api;

public interface BasicServiceLogger {

    public boolean logAlta(String idUser);
    public boolean logLogin(String idUser);
    public void anadirFicheroLogger(String mensaje);


}
