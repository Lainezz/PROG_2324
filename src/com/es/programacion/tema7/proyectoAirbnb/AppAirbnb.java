package com.es.programacion.tema7.proyectoAirbnb;

import com.es.programacion.tema7.proyectoAirbnb.model.Alojamiento;
import com.es.programacion.tema7.proyectoAirbnb.services.GestionFicheroAirbnb;

import java.util.ArrayList;

public class AppAirbnb {

    public static void main(String[] args) {

        GestionFicheroAirbnb gestion = new GestionFicheroAirbnb();

        String ruta = "src/main/resources/archivosTema7/airbnb/malaga.csv";

        ArrayList<Alojamiento> alojamientosTemporal = new ArrayList<>();

        alojamientosTemporal = gestion.leerFicheroAlojamientos(ruta);


        for (Alojamiento a : alojamientosTemporal) {
            System.out.println(a);
        }

    }
}
