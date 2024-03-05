package com.es.programacion.tema6.proyectoGestionEventosDeportivos.clases.impl;

import java.util.ArrayList;

public class Equipo implements Comparable<Equipo> {

    private String nombre;
    private ArrayList<Participante> jugadores;
    private int puntos;

    public Equipo(String nombre) {
        setNombre(nombre);
        this.jugadores = new ArrayList<>();
        this.puntos = 0;
    }

    /**
     * Anade un jugador a la lista de jugadores
     * @param jugador
     * @return true si se ha podido añadir el jugador en la lista
     */
    public boolean anadirJugador(Participante jugador) {
        // el método .contains funciona porque se ha sobreescrito el método .equals de Object en la clase Participante
        if(this.jugadores.contains(jugador)) {
            return false;
        } else {
            return this.jugadores.add(jugador);
        }
    }

    /**
     * Elimina un jugador de tipo {@link Participante} de la lista de jugadores
     * @param jugador
     * @return true si se ha podido eliminar el jugador del ArrayList
     */
    public boolean eliminarJugador(Participante jugador) {
        try {
            // el método .remove funciona porque se ha sobreescrito el método .equals de Object en la clase Participante
            return this.jugadores.remove(jugador);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Participante> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Participante> jugadores) {
        this.jugadores = jugadores;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    /**
     * Método compareTo de la interfaz Comparable.
     * @see Comparable
     * @param o Objeto de tipo Equipo
     * @return
     */
    @Override
    public int compareTo(Equipo o) {
        return this.puntos - o.puntos;
    }


    /**
     * Método equals de cla clase object
     * @see Object
     * @param obj
     * @return true si son iguales, false si no lo son
     */
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Equipo) {
            Equipo eq = (Equipo) obj;
            return this.nombre.equals(eq.nombre);
        } else {
            return false;
        }
    }
}
