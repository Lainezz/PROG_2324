package com.es.programacion.tema4.proyectoPokemon;

import com.es.programacion.tema4.proyectoPokemon.clases.Pokemon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca un pokemon: ");
        String pokemonDeUsuario = scan.next();

        boolean pokemonEsValido = false;
        pokemonEsValido = Pokemon.esValido(pokemonDeUsuario);

        if(pokemonEsValido == true) {
            System.out.println("Pika!");
        } else {
            System.out.println("no pika");
        }

    }
}
