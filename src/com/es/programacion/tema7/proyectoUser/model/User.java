package com.es.programacion.tema7.proyectoUser.model;

public class User {

    private String id;
    private String name;
    private String pass;
    private boolean isAdmin;


    public User(String id, String name, String pass, boolean isAdmin){



    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
