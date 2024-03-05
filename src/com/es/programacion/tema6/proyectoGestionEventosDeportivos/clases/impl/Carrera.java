package com.es.programacion.tema6.proyectoGestionEventosDeportivos.clases.impl;

import com.es.programacion.tema6.proyectoGestionEventosDeportivos.clases.api.EventoDeportivo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Carrera extends EventoDeportivo {

    private double distancia;
    public Carrera(String nombre, String lugar, LocalDate fecha) {
        super(nombre, lugar, fecha);
        setDistancia(distancia);
    }


    /**
     * Método para obtener el ganador de una carrera.
     * @return ArrayList<Participante> con el ganador de la carrera
     */
    @Override
    public ArrayList<Participante> obtenerGanador() {

        ParticipanteCarrera ganador = null;
        ArrayList<Participante> arrGanador = new ArrayList<>();

        // 1er for para conocer al ParticipanteCarrera con un menor tiempo
        for (Participante p : this.getParticipantes()) {

            if(p instanceof ParticipanteCarrera) {

                ParticipanteCarrera participanteCarrera = (ParticipanteCarrera) p;

                // Si ganador es null significa que aún no se ha determinado un ganador, así que cogemos el primer participante de la carrera como posible ganador
                // Si no es null, significa que estamos comparando dos Participantes.
                if(ganador == null || participanteCarrera.getTiempo().compareTo(ganador.getTiempo()) < 0) {
                    ganador = participanteCarrera;
                }
            }
        }

        // 2º for para añadir todos los ParticipantesCarrera que tengan el mismo tiempo que el ganador
        for (Participante p : this.getParticipantes()) {

            if(p instanceof ParticipanteCarrera) {

                ParticipanteCarrera participanteCarrera = (ParticipanteCarrera) p;

                // Puede haber diferentes ParticipantesCarrera con el mismo tiempo, así que recorro de nuevo la lista para añadir a todos esos ParticipantesCarrera
                // a la lista de Ganadores
                if(participanteCarrera.getTiempo().compareTo(ganador.getTiempo()) == 0) {
                    arrGanador.add(ganador);
                }
            }
        }
        return arrGanador;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {

        if(distancia >= 0) {
            this.distancia = distancia;
        }

    }
}
