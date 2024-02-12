package com.es.programacion.tema6.proyectoMascotas;

import com.es.programacion.tema6.proyectoMascotas.clases.Gato;
import com.es.programacion.tema6.proyectoMascotas.clases.Inventario;
import com.es.programacion.tema6.proyectoMascotas.clases.Loro;
import com.es.programacion.tema6.proyectoMascotas.clases.Perro;

public class Main {


    public static void main(String[] args) {

        Perro oreo = new Perro("Oreo", "Schnauzer", false);
        Perro goku = new Perro("Goku", "Yorkshire", false);
        Gato pulga = new Gato("Pulga", "Marron", false);
        Loro pirri = new Loro("Pirri", "Granívoro", true, "Sudamérica");

        Inventario invent = new Inventario();

        invent.anadirMascota(oreo);
        invent.anadirMascota(goku);
        invent.anadirMascota(pulga);
        invent.anadirMascota(pirri);

        invent.mostrarDatosAnimales();


    }

}
