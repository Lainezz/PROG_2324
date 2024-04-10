package com.es.programacion.tema7.proyectoUserProfe.services.impl;

import com.es.programacion.tema7.proyectoUserProfe.model.Logger;
import com.es.programacion.tema7.proyectoUserProfe.services.api.ServiceAPI;

public class LoggerService implements ServiceAPI<Logger> {


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
        return false;
    }
}
