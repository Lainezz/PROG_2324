package com.es.programacion.tema7.proyectoUserProfe.utils;

import com.es.programacion.tema7.proyectoUserProfe.model.Logger;
import com.es.programacion.tema7.proyectoUserProfe.model.User;
import com.es.programacion.tema7.proyectoUserProfe.services.api.GestionFicheroAPI;
import com.es.programacion.tema7.proyectoUserProfe.services.api.Service;
import com.es.programacion.tema7.proyectoUserProfe.services.impl.GestionFicheroLogger;
import com.es.programacion.tema7.proyectoUserProfe.services.impl.GestionFicheroUser;
import com.es.programacion.tema7.proyectoUserProfe.services.impl.LoggerService;
import com.es.programacion.tema7.proyectoUserProfe.services.impl.UserService;

public class ServiceFactory {

    private static final String RUTA_USER = "src/main/resources/archivosTema7/users/users.txt";
    private static final String RUTA_LOGGER = "src/main/resources/archivosTema7/logs/logs.txt";
    private static final String RUTA_CINE = "src/main/resources/archivosTema7/ubriCine/entradas_vendidas.txt";

    public static Service<?> getService(String tipo) {

        try {
            if(tipo.equalsIgnoreCase("user")) {
                GestionFicheroAPI<User> gestion = new GestionFicheroUser();
                GestionFicheroAPI<Logger> gestionLogger = new GestionFicheroLogger();
                Service<Logger> loggerService = new LoggerService(gestionLogger, RUTA_LOGGER);
                return new UserService(gestion, loggerService, RUTA_USER);
            } else if (tipo.equalsIgnoreCase("logger")) {
                GestionFicheroAPI<Logger> gestion = new GestionFicheroLogger();
                return new LoggerService(gestion, RUTA_LOGGER);
            } else if(tipo.equalsIgnoreCase("cine")) {
                /*GestionFicheroAPI<Cine> gestion = new GestionFicheroCine();
                return new CineService(gestion, RUTA_CINE);*/
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        return null;
    }
}
