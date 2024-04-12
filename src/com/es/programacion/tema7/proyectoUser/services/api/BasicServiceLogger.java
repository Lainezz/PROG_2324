package com.es.programacion.tema7.proyectoUser.services.api;

public interface BasicServiceLogger {

    public void registrarLog(String infoUser, String accion, String estado);
    public void anadirFicheroLogger(String mensaje);


}
