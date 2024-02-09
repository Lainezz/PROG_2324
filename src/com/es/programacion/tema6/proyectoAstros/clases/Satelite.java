package com.es.programacion.tema6.proyectoAstros.clases;

public class Satelite extends Astro {
    private double distanciaPlaneta;
    private double orbitaPlanetaria;

    public Satelite(double radioEcuatorial, double rotacion, long masa, double temperaturaMedia, String nombre, double distanciaPlaneta, double orbitaPlanetaria) {
        super(radioEcuatorial, rotacion, masa, temperaturaMedia, nombre);

        this.distanciaPlaneta = distanciaPlaneta;
        this.orbitaPlanetaria = orbitaPlanetaria;
    }
}
