package com.es.programacion.tema6.proyectoGestionEventosDeportivos.clases.impl;

import com.es.programacion.tema6.proyectoGestionEventosDeportivos.clases.api.EventoDeportivo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
public class TorneoFutbol extends EventoDeportivo {

    private ArrayList<Equipo> equipos;

    public TorneoFutbol(String nombre, String lugar, LocalDate fecha) {
        super(nombre, lugar, fecha);

        this.equipos = new ArrayList<Equipo>();
    }

    @Override
    public ArrayList<Participante> obtenerGanador() {
        // Primero hago una copia de equipos para no afectar al ArrayList original
        ArrayList<Equipo> equiposOrdenados = (ArrayList<Equipo>) equipos.clone();

        // Como la clase Equipo implementa la interfaz Comparable, podemos ordenar la lista directamente
        Collections.sort(equiposOrdenados);

        // El ganador es el que se encuentra en la primera posición de la lista
        // Recorro ese ArrayList (equipos) y voy llenando el arrayList con los Participantes ganadores
        Equipo equipoGanador = equiposOrdenados.get(0);
        // JugadoresGanadores es un ArrayList<Participantes>
        ArrayList<Participante> jugadoresGanadores = new ArrayList<>();
        for (Participante p : equipoGanador.getJugadores()) {
            jugadoresGanadores.add(p);}

        return jugadoresGanadores;

    }

    public boolean inscribirEquipo(Equipo eq) {

        // el método .contains funcionaria porque se ha sobreescrito el método .equals de la clase Object
        if (this.equipos.contains(eq)) {
            return false;
        } else {
            this.equipos.add(eq);

            // Yo creo que esto es importante, ya que si sólo se añade el equipo pero no los participantes, estos al final no cuentan.
            for (Participante p : eq.getJugadores()){
                inscribirParticipante(p);
            }

            return this.equipos.contains(eq);
        }
    }
}
