package com.es.programacion.tema7.proyectoUser.services.api;

import com.es.programacion.tema7.proyectoUser.model.Butaca;
import com.es.programacion.tema7.proyectoUser.model.User;

public interface BasicServiceCine {

    public void mostrarButacas();
    public boolean comprarEntrada();
    public boolean devolverEntrada();

    public boolean checkComprador(String idUser);

    public void leerFicheroCine();
    public void anadirFicheroCine(Butaca b);
    public void modificarFicheroCine();

}
