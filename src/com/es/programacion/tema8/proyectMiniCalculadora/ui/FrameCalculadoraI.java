package com.es.programacion.tema8.proyectMiniCalculadora.ui;

import javax.swing.*;

public class FrameCalculadoraI extends JFrame {

    private static int width = 600;
    private static int height = 600;

    private PanelCalculadoraI panelCalculadoraI;

    public FrameCalculadoraI() {

        this.setSize(width, height);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Mini Calculadora Mierder I");
        ImageIcon image = new ImageIcon("src/main/resources/pokemonMedia/images/caterpie.png");
        this.setIconImage(image.getImage());


        // Aquí añadimos el panel
        panelCalculadoraI = new PanelCalculadoraI();
        this.add(panelCalculadoraI);

        this.setVisible(true);
    }

}
