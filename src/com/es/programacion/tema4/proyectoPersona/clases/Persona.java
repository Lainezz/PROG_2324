package com.es.programacion.tema4.proyectoPersona.clases;

public class Persona {

    // ATRIBUTOS DE CLASE
    public String nombre, dni, apellidos, colorPiel, colorPelo;
    public int edad;
    double altura;

    // METODOS DE CLASE

    /**
     * Método para presentar a una persona
     */
    public void presentarse() {
        System.out.println("" +
                "\nHola, mi nombre es "+this.nombre+" " +
                "\ny tengo "+this.edad+" anios.");
    }

    /**
     * Método que anade 1 anio a la edad
     */
    public void cumplirAnios() {
        this.edad = this.edad + 1; // this.edad++; this.edad += 1;
    }

    public void cambiarColorPelo(String nuevoColorPelo) {
        System.out.println("Tenia el pelo de color "+this.colorPelo);
        this.colorPelo = nuevoColorPelo;
        System.out.println("Y ahora lo tengo "+this.colorPelo);
    }


}
