package com.es.programacion.tema7.proyectoUser;

import com.es.programacion.tema7.proyectoUser.model.User;
import com.es.programacion.tema7.proyectoUser.services.impl.ServiceUser;

public class Main {

    public static void main(String[] args) {

        // Primero declaro los dos objetos que me van a permitir llamar a los diferentes métodos que tengo en las
        // clases GestionFicheroUser y UsersService.

        ServiceUser service = new ServiceUser();

        User u = new User("123", "", "", false);

        service.altaUsuario();
        service.loginUsuario();




    }
}
