package com.es.programacion.tema8.proyectMiniCalculadora;

import com.es.programacion.tema8.proyectMiniCalculadora.ui.FrameCalculadoraI;

import javax.swing.*;

public class MiniCalculadoraI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                FrameCalculadoraI fc = new FrameCalculadoraI();
            }
        });
    }
}
