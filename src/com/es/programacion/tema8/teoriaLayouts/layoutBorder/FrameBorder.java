package com.es.programacion.tema8.teoriaLayouts.layoutBorder;

import javax.swing.*;
import java.awt.*;

public class FrameBorder extends JFrame {
    // Los JFrame se inicializan por defecto con un BorderLayout

    public FrameBorder() {
        this.setSize(800, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Primera Ventana");
        ImageIcon image = new ImageIcon("src/main/resources/pokemonMedia/images/dratini.png");
        this.setIconImage(image.getImage());

        // VAMOS A CREAR 4 JPanel y a añadirlos en diferentes posiciones del BorderLayout
        JPanel panelCentro = new JPanel();
        BorderLayout layout = new BorderLayout();
//        layout.setHgap(5);
//        layout.setVgap(5);
        panelCentro.setLayout(layout);
        panelCentro.setBackground(new Color(0, 0, 0));

        JPanel panelCentroCentro = new JPanel();
        JPanel panelCentroSur = new JPanel();
        JPanel panelCentroNorte = new JPanel();
        JPanel panelCentroEste = new JPanel();
        JPanel panelCentroOeste = new JPanel();

        panelCentroCentro.setBackground(new Color(255,255, 255));
        panelCentroSur.   setBackground(new Color(0, 100, 0));
        panelCentroNorte. setBackground(new Color(100, 100, 0));
        panelCentroEste.  setBackground(new Color(255, 20, 20));
        panelCentroOeste. setBackground(new Color(255, 255, 9));

        panelCentroCentro.setPreferredSize(new Dimension(50,50));
        panelCentroSur.setPreferredSize(new Dimension(50,50));
        panelCentroNorte.setPreferredSize(new Dimension(50,50));
        panelCentroEste.setPreferredSize(new Dimension(50,50));
        panelCentroOeste.setPreferredSize(new Dimension(50,50));


        BorderLayout flow = new BorderLayout();
        JPanel panelPrueba = new JPanel();
        //panelPrueba.setPreferredSize(new Dimension(100,100));
        JLabel label1 = new JLabel("Prueba");

        panelPrueba.add(label1);
        panelCentroCentro.setLayout(flow);
        panelCentroCentro.add(panelPrueba);


        panelCentro.add(panelCentroCentro, BorderLayout.CENTER);
        panelCentro.add(panelCentroSur, BorderLayout.SOUTH);
        panelCentro.add(panelCentroNorte, BorderLayout.NORTH);
        panelCentro.add(panelCentroEste, BorderLayout.EAST);
        panelCentro.add(panelCentroOeste, BorderLayout.WEST);


        JPanel panelNorte = new JPanel();
        panelNorte.setBackground(new Color(100, 0, 255));
        panelNorte.setPreferredSize(new Dimension(100, 100));

        JPanel panelSur = new JPanel();
        panelSur.setBackground(new Color(255, 255, 0));
        panelSur.setPreferredSize(new Dimension(100, 100));

        JPanel panelOeste = new JPanel();
        panelOeste.setBackground(new Color(255, 0, 255));
        panelOeste.setPreferredSize(new Dimension(100, 100));

        JPanel panelEste = new JPanel();
        panelEste.setBackground(new Color(0, 200, 0));
        panelEste.setPreferredSize(new Dimension(100, 100));



        this.add(panelCentro, BorderLayout.CENTER);
        this.add(panelNorte, BorderLayout.NORTH);
        this.add(panelSur, BorderLayout.SOUTH);
        this.add(panelOeste, BorderLayout.WEST);
        this.add(panelEste, BorderLayout.EAST);
        this.setVisible(true);
    }


}
