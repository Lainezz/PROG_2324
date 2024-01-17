package com.es.programacion.tema5.proyectoPeliculas;

import com.es.programacion.tema5.proyectoPeliculas.clases.Pelicula;
import com.es.programacion.tema5.proyectoPeliculas.services.PeliculasService;
import com.es.programacion.tema5.proyectoPeliculas.utils.JsonReaderUtil;

import java.util.ArrayList;

public class MainCreacion {

    public static ArrayList<Pelicula> peliculas = null;

    public static void main(String[] args) {
        String pelisPath = "IMDB-api/Top250Movies.json";
        peliculas = JsonReaderUtil.loadJsonFile(pelisPath);

        // Opcion para anadir una peli
        PeliculasService.addPelicula();


        for (int i=0; i<peliculas.size(); i++) {
            System.out.println("\t- "+peliculas.get(i).getFullTitle());
        }







    }
}
