package com.es.programacion.tema7.proyectoUserProfe.services.impl;

import com.es.programacion.tema7.proyectoUserProfe.model.Logger;
import com.es.programacion.tema7.proyectoUserProfe.services.api.GestionFicheroAPI;
import com.es.programacion.tema7.proyectoUserProfe.services.api.Service;
import com.es.programacion.tema7.proyectoUserProfe.services.api.ServiceAPI;

import java.time.LocalDateTime;

public class LoggerService extends Service<Logger> {


    public LoggerService(GestionFicheroAPI<Logger> gestionFichero, String ruta) {
        super(gestionFichero, ruta);
    }

    @Override
    public Logger find(String id) {
        return null;
    }

    @Override
    public boolean exists(String id) {
        return false;
    }

    @Override
    public boolean alta(Logger newObj) {
        this.anadirFichero(newObj);
        return true;
    }
}
