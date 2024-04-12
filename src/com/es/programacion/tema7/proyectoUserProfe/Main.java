package com.es.programacion.tema7.proyectoUserProfe;

import com.es.programacion.tema7.proyectoUserProfe.model.User;
import com.es.programacion.tema7.proyectoUserProfe.services.impl.LoggerService;
import com.es.programacion.tema7.proyectoUserProfe.utils.ServiceFactory;
import com.es.programacion.tema7.proyectoUserProfe.services.impl.UserService;

public class Main {

    public static void main(String[] args) {

        // Primero declaro los dos objetos que me van a permitir llamar a los diferentes métodos que tengo en las
        // clases GestionFicheroUser y UsersService.

        UserService userService = (UserService) ServiceFactory.getService("user");
        LoggerService loggerService = (LoggerService) ServiceFactory.getService("logger");


        userService.altaUsuario();





    }
}
