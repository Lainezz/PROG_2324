package com.es.programacion.tema6.proyectoMascotas.clases;

import java.time.LocalDate;

public class Mascota {

    protected String nombre;
    protected int edad;
    protected boolean estado;
    protected LocalDate fechaNac;


    public void muestra() {

        if(this.estado == true){
            System.out.println("Hola mi nombre es "+this.nombre+" y tengo "+this.edad+" anios");

            if(fechaNac.getMonthValue() == LocalDate.now().getMonthValue()
                    &&
            fechaNac.getDayOfMonth() == LocalDate.now().getDayOfMonth()) {
                System.out.printf("Y es mi cumpleaños!!!");
            }
        } else {
            System.out.printf("Las mascotas fallecidas no hablan...");
        }

    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }
}
