package com.es.programacion.tema6.proyectoGestionEventosDeportivos.clases.impl;

import com.es.programacion.tema6.proyectoGestionEventosDeportivos.utils.ValidatorUtils;

public class Participante {

    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    public Participante(String dni, String nombre, String apellidos, int edad) {
        setDni(dni);
        this.nombre = nombre;
        this.apellidos = apellidos;
        setEdad(edad);
    }


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if(ValidatorUtils.validateDni(dni)) {
            this.dni = dni;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad >= 0) {
            this.edad = edad;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Participante) {
            Participante p = (Participante) obj;
            return p.getDni().equals(this.getDni());

        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Participante{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }
}
