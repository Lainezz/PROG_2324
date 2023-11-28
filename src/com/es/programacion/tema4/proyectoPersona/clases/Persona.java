package com.es.programacion.tema4.proyectoPersona.clases;

public class Persona {

    // ATRIBUTOS DE CLASE
    public String nombre, dni, apellidos, colorPiel, colorPelo;
    public int edad;
    public double altura;

    /**
     * Añadir un atributo publico "estaTrabajando"
     * Atributo de tipo boolean inicializado por defecto a false.
     */


    // CONSTRUCTOR DE CLASE
    /**
     * Definir un constructor de clase para Persona
     * Se le pasa el nombre, dni, apellidos y edad
     */


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

    /**
     * Método que comprueba si esta persona es mayor de edad
     * El método devuelve un boolean
     */

    /**
     * Método que comprueba si dos personas son iguales
     * El método devuelve un boolean
     */

    /**
     * Método que da de alta y de baja a la persona en un trabajo
     * El método se llama cambiarEstadoTrabajo
     *
     * Si está trabajando -> Se pone a que ya no está trabajando
     * Si no está trabajando -> Se pone a que sí está trabajando
     */






}
