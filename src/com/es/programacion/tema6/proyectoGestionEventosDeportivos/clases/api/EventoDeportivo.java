package com.es.programacion.tema6.proyectoGestionEventosDeportivos.clases.api;

import com.es.programacion.tema6.proyectoGestionEventosDeportivos.clases.impl.Participante;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class EventoDeportivo implements Ganador {

    private String nombre;
    private String lugar;
    private LocalDate fecha;
    private ArrayList<Participante> participantes;

    public EventoDeportivo(String nombre, String lugar, LocalDate fecha) {
        this.participantes = new ArrayList<Participante>();
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
    }

    /**
     * Inscribe a un Participante dentro del ArrayList de Participante
     * @param participante objeto de tipo {@link Participante}
     * @return boolean true si se ha podido inscribir, y false si no
     */
    public boolean inscribirParticipante(Participante participante) {

        // El método .contains se puede usar aquí porque la clase Participante
        // implementa el método equals, con lo que ahora tenemos la capacidad de comparar
        // participantes. Estos se comparan por el dni.
        if(!participantes.contains(participante)) {
            participantes.add(participante);

            System.out.printf("Participante añadido:" +
                    "\n\t-dni: %s" +
                    "\n\t-nombre: %s" +
                    "\nEvento:" +
                    "\n\t- %s" +
                    "\n\t- %s" +
                    "\n\t- %s",
                    participante.getDni(), participante.getNombre(),
                    this.getNombre(), this.getLugar(), this.getFecha() );
        } else {
            System.out.printf("No se ha podido inscribir al participante: \n\t-dni: %s\n\t-nombre: %s", participante.getDni(), participante.getNombre());
        }
        // Devuelvo true si el ArrayList contiene al participante y false si no lo contiene
        return participantes.contains(participante);
    }

    /**
     * Método abstracto que será implementado por las clases que hereden de esta
     * @return
     */
    public abstract ArrayList<Participante> obtenerGanador();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Participante> participantes) {
        this.participantes = participantes;
    }
}
