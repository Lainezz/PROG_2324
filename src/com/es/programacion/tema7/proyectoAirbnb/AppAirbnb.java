package com.es.programacion.tema7.proyectoAirbnb;

import com.es.programacion.tema7.proyectoAirbnb.services.GestionFicheroAirbnb;

public class AppAirbnb {

    public static void main(String[] args) {

        GestionFicheroAirbnb gestion = new GestionFicheroAirbnb();

        String ruta = "src/main/resources/archivosTema7/airbnb/malaga.csv";

        gestion.leerFicheroAlojamientos(ruta);


    }
}
