package com.es.programacion.tema7.proyectoUserProfe.services.api;

public interface ServiceAPI<T> {


    T find(String id);
    boolean exists(String id);
    boolean alta(T newObj);

}
