package com.es.programacion.tema6.proyectoGestionEventosDeportivos.clases.impl;

import java.time.Duration;

public class ParticipanteCarrera extends Participante{

    private Duration tiempo;

    public ParticipanteCarrera(String dni, String nombre, String apellidos, int edad, Duration tiempo) {
        super(dni, nombre, apellidos, edad);

        this.tiempo = tiempo;
    }

    public Duration getTiempo() {
        return tiempo;
    }

    public void setTiempo(Duration tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {

        return "Participante{" +
                "dni='" + getDni() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", apellidos='" + getApellidos() + '\'' +
                ", edad=" + getEdad() +
                ", tiempo=" + getTiempo() +
                '}';
    }
}
