package com.es.programacion.tema8.teoriaEventos;

import com.es.programacion.pruebas.pokemon.frame.FramePrincipal;

import javax.swing.*;

public class AppEventos {

    public static void main(String[] args) {


        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                EventosListener e = new EventosListener();
            }
        });

    }
}
