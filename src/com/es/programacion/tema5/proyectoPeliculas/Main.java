package com.es.programacion.tema5.proyectoPeliculas;

import com.es.programacion.tema5.proyectoPeliculas.clases.Pelicula;
import com.es.programacion.tema5.proyectoPeliculas.utils.JsonReaderUtil;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String pelisPath = "IMDB-api/Top250Movies.json";
        ArrayList<Pelicula> peliculas = JsonReaderUtil.loadJsonFile(pelisPath);


        for (Pelicula peli: peliculas){
            System.out.println(peli.getFullTitle());
        }





    }
}
