package com.es.programacion.tema4.proyectoPersona;

import com.es.programacion.tema4.proyectoPersona.clases.Direccion;
import com.es.programacion.tema4.proyectoPersona.clases.Persona;

public class Main {

    public static void main(String[] args) {


        Direccion direccionDePersonaDePrueba = new Direccion("Calle Falsa", 123, "11600", "Mojacar", "Almeria");

        Persona personaDePrueba = new Persona("12345678L", "Antonia", "Pérez Pérez", 67, direccionDePersonaDePrueba);

        if(personaDePrueba.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else  {
            System.out.println("La persona no es mayor de edad");
        }




    }
}
