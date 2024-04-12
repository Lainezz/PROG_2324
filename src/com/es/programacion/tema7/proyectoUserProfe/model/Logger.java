package com.es.programacion.tema7.proyectoUserProfe.model;

import java.time.LocalDateTime;

public class Logger {

    private String infoUser;
    private String accion;
    private String estado;
    private LocalDateTime time;

    public Logger(String infoUser, String accion, String estado) {
        this.infoUser = infoUser;
        this.accion = accion;
        this.estado = estado;
        this.time = LocalDateTime.now();
    }

    public String getInfoUser() {
        return infoUser;
    }

    public void setInfoUser(String infoUser) {
        this.infoUser = infoUser;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "["+this.getAccion().toUpperCase()+"] " + time.toString()+" "+this.getInfoUser() +"-"+ this.getEstado();
    }
}
