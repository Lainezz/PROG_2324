package com.es.programacion.tema6.proyectoMascotas.clases;

public class Ave extends Mascota {

    protected String pico;
    protected boolean vuela;

    public String getPico() {
        return pico;
    }

    public void setPico(String pico) {
        this.pico = pico;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }
}
