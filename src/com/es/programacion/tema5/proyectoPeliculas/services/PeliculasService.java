package com.es.programacion.tema5.proyectoPeliculas.services;

import com.es.programacion.tema5.proyectoPeliculas.MainCreacion;
import com.es.programacion.tema5.proyectoPeliculas.clases.Pelicula;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.UUID;

public class PeliculasService {


    public static boolean addPelicula() {
        // Adicion de una pelicula nueva
        Scanner scan = new Scanner(System.in);

        System.out.print("Dime el nombre de la pelicula: ");
        String nombrePeli = scan.nextLine();

        int anio = 0;
        try {
            System.out.print("Dime el anio de publicación de la pelicula: ");
            anio = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Anio erroneo...");
        }

        System.out.print("Dime el nombre del director/a: ");
        String dir = scan.nextLine();
        scan.nextLine();

        System.out.print("Dime el nombre del/a actor/actriz 1: ");
        String act1 = scan.nextLine();


        System.out.print("Dime el nombre del/a actor/actriz 2: ");
        String act2 = scan.nextLine();

        String id = UUID.randomUUID().toString();

        double nota = 0.0;
        try {
            System.out.print("Dime la nota de la pelicula: ");
            nota = scan.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Nota erronea...");
        }

        Pelicula peliNueva = new Pelicula(id, nombrePeli, anio+"",
                dir, act1, act2, nota+"");



        boolean peliExiste = false;
        for(int i=0; i<MainCreacion.peliculas.size(); i++) {

            if(MainCreacion.peliculas.get(i).getId().equals(peliNueva.getId())) {
                System.out.println("Pelicula ya existente");
                peliExiste = true;
                break;
            }

        }

        if(!peliExiste){
            MainCreacion.peliculas.add(peliNueva);
            System.out.println("Pelicula correctamente anadida...");
            return true;
        }



        return false;
    }


}
