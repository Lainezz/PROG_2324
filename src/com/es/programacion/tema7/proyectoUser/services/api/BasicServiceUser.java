package com.es.programacion.tema7.proyectoUser.services.api;

import com.es.programacion.tema7.proyectoUser.model.User;

public interface BasicServiceUser {

    public String altaUsuario();
    public String loginUsuario();
    public boolean checkUser(String idUser, String password);
    public boolean userExists(String idUser);
    public void leerFicheroUsers();
    public void anadirFicheroUsers(User u);
    public void modificarFicheroUsers();

}
