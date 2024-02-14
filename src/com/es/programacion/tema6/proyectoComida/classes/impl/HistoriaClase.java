package com.es.programacion.tema6.proyectoComida.classes.impl;

import com.es.programacion.tema6.proyectoComida.classes.api.Historia;

public class HistoriaClase implements Historia {


    @Override
    public void contarHistoria() {

        try {
            Thread.sleep(1000);
            System.out.print("Te levantas legaños@.");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(". ");
            Thread.sleep(500);
            System.out.print("el autobús sale en 30 minutos y aún no has desayunado");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.println(".");
            Thread.sleep(2000);

            System.out.print("Llegas al instituto");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(". ");
            Thread.sleep(500);
            System.out.print("Tienes energía");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print("por ahora");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.println(".");
            Thread.sleep(2000);


            System.out.print("Intenta sobrevivir al día en ");
            Thread.sleep(500);
            System.out.print("3.");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print("2.");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print("1.");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.println("¡Suerte!");





        } catch (Exception e) {

            System.out.println("Llegas a clase de forma inesperada...");

        }

    }

    public void queHoraEs(int hora) {
        try {
            System.out.println("---------------------------");
            Thread.sleep(2000);
            System.out.print("Ya es "+hora+"ª hora");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.println(". ");
            Thread.sleep(500);

        } catch (Exception e) {
            System.out.println("Estas confundid@");
        }
    }

    public void muertoCansancio(int hora) {
        try {
            Thread.sleep(1000);
            System.out.print("Has muerto de cansancio");
            Thread.sleep(1000);
            System.out.print(" a "+hora+"ª hora");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.println(". ");
            Thread.sleep(500);

        } catch (Exception e) {
            System.out.println("Estas confundid@");
        }
    }
}
