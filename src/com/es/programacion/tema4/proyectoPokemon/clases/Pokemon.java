package com.es.programacion.tema4.proyectoPokemon.clases;

import java.util.Scanner;

public class Pokemon {

    // Variable global
    static String pikachu = "Pikachu";

    // Declarar un array de String de tamaño 20


    /**
     * Implementar un método que rellene el array de pokemons
     * @param args
     */

    /**
     * Implementar un método que reciba por parametros un String (un pokemon) y compruebe que ese
     * pokemon existe
     * @param args
     */

    /**
     * Implementar un método que reciba por parámetros dos Strings (dos pokemon) y que compruebe la efectividad
     * de uno contra otro
     *
     * @param pokemon1 Pokemon atacante
     * @param pokemo2 Pokemon recibeAtaque
     * @return double multiplicador de daño
     */



    /**
     * Metodo que comprueba si el pokemon es pikachu
     * @param pokemon
     * @return
     */
    public static boolean esValido(String pokemon) {

        if(pokemon.equalsIgnoreCase(pikachu)){
            return true;
        } else {
            return false;
        }
    }

    public static void setRaichu(String nombreRaichu){
        pikachu = nombreRaichu;
    }


}
