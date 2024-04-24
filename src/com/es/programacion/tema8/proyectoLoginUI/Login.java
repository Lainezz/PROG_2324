package com.es.programacion.tema8.proyectoLoginUI;

import com.es.programacion.tema8.proyectMiniCalculadora.ui.FrameCalculadoraI;
import com.es.programacion.tema8.proyectoLoginUI.ui.FrameLogin;

import javax.swing.*;

public class Login {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                FrameLogin fc = new FrameLogin();
            }
        });
    }
}
