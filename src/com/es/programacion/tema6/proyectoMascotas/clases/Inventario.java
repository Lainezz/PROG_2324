package com.es.programacion.tema6.proyectoMascotas.clases;

import java.util.ArrayList;

public class Inventario {

    private ArrayList<Mascota> mascotas;

    public Inventario() {
        mascotas = new ArrayList<>();
    }


    public void mostrarDatosAnimales() {

        // 1º Recorrer el arrayList para poder mostrar los datos de todos los animales
        for (int i=0; i<mascotas.size(); i++) {
            mascotas.get(i).muestra();
        }

    }

    public void anadirMascota(Mascota m) {

        mascotas.add(m);

    }

    public boolean eliminarMascota(String nombre) {

        boolean mascotaEliminada = false;
        for (int i=0; i<mascotas.size(); i++) {

            // Comparamos el nombre de la mascota del arraylist con el nombre que nos
            // viene por parámetros
            if(mascotas.get(i).nombre.equalsIgnoreCase(nombre)) {
                // Si encontramos ese nombre, eliminamos el objeto de la posicion i
                mascotas.remove(i);
                mascotaEliminada = true;
                break;
            }
        }
        return mascotaEliminada;
    }


}
