package com.es.programacion.tema6.proyectoMascotas.clases;

public class Perro extends Mascota {

    private String raza;
    private boolean pulgas;


    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isPulgas() {
        return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }
}
