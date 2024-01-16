package com.es.programacion.tema5.proyectoPeliculas;

import com.es.programacion.tema5.proyectoPeliculas.clases.Pelicula;
import com.es.programacion.tema5.proyectoPeliculas.utils.JsonReaderUtil;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String pelisPath = "IMDB-api/Top250Movies.json";
        ArrayList<Pelicula> peliculas = JsonReaderUtil.loadJsonFile(pelisPath);


        // PARA LA CLASE DEL 16/01
        // Buscar las películas de antes de los 2000
        // 1º un for para recorrer la lista de peliculas
        for(int i=0; i<peliculas.size(); i++) {

            // Ahora tengo que hacer una condición para comprobar el anio
            if(Integer.parseInt(peliculas.get(i).getYear()) < 2000) {
                System.out.println("- "+peliculas.get(i).getFullTitle());
            }

        }





        // Buscar las películas que tengan de nota menos que 8.5
        // Buscar la película más antigua de la lista
        // Buscar la película más moderna de la lista
        // Buscar las películas protagonizadas por Emma Stone
        // Buscar las películas protagonizadas por Robin Williams








    }
}
