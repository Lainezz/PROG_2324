package com.es.programacion.tema6.proyectoGestionEventosDeportivos;

import com.es.programacion.tema6.proyectoGestionEventosDeportivos.clases.impl.Carrera;
import com.es.programacion.tema6.proyectoGestionEventosDeportivos.clases.impl.TorneoFutbol;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Carrera laDesertica = new Carrera("La desertica", "Almeria", LocalDate.of(2024,5,1));
        TorneoFutbol laLiga = new TorneoFutbol("La liga Endesa", "España", LocalDate.of(2024,5,1));

    }
}
