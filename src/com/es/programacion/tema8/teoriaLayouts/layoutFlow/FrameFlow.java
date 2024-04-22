package com.es.programacion.tema8.teoriaLayouts.layoutFlow;

import javax.swing.*;
import java.awt.*;

public class FrameFlow extends JFrame {

    public FrameFlow() {

        this.setSize(600, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Primera Ventana");
        ImageIcon image = new ImageIcon("src/main/resources/pokemonMedia/images/dratini.png");
        this.setIconImage(image.getImage());


        // JFrame tiene un layout por defecto de BorderLayout (CENTER, NORTH, SOUTH, WEST, EAST)
        JLabel titulo = new JLabel("CALCULADORA");
        titulo.setPreferredSize(new Dimension(100,100));
        titulo.setFont(new Font("Consolas", Font.BOLD, 32));
        titulo.setHorizontalAlignment(JLabel.CENTER);

        JPanel panelCentro = new JPanel();
        panelCentro.setLayout(new BorderLayout());

        JTextField textFieldOperacion = new JTextField("Prueba");
        textFieldOperacion.setPreferredSize(new Dimension(100,50));
        textFieldOperacion.setFont(new Font("Consolas", Font.BOLD, 20));
        textFieldOperacion.setHorizontalAlignment(JTextField.CENTER);
        textFieldOperacion.setEditable(false);
        textFieldOperacion.setBackground(new Color(0,0,100));
        textFieldOperacion.setForeground(new Color(255,255,255));

        JPanel panelBotonesCalculadora = new JPanel(new GridLayout(5, 4));
        JButton b1 = new JButton("C");
        JButton b2 = new JButton("<-");
        JButton b3 = new JButton("%");
        JButton b4 = new JButton("/");
        JButton b5 = new JButton("7");
        JButton b6 = new JButton("8");
        JButton b7 = new JButton("9");
        JButton b8 = new JButton("*");
        JButton b9 = new JButton("4");
        JButton b10 = new JButton("5");
        JButton b11 = new JButton("6");
        JButton b12 = new JButton("-");
        JButton b13 = new JButton("1");
        JButton b14 = new JButton("2");
        JButton b15 = new JButton("3");
        JButton b16 = new JButton("+");
        JButton b17 = new JButton("+/-");
        JButton b18 = new JButton("0");
        JButton b19 = new JButton(",");
        JButton b20 = new JButton("=");



        panelBotonesCalculadora.add(b1);
        panelBotonesCalculadora.add(b2);
        panelBotonesCalculadora.add(b3);
        panelBotonesCalculadora.add(b4);
        panelBotonesCalculadora.add(b5);
        panelBotonesCalculadora.add(b6);
        panelBotonesCalculadora.add(b7);
        panelBotonesCalculadora.add(b8);
        panelBotonesCalculadora.add(b9);
        panelBotonesCalculadora.add(b10);
        panelBotonesCalculadora.add(b11);
        panelBotonesCalculadora.add(b12);
        panelBotonesCalculadora.add(b13);
        panelBotonesCalculadora.add(b14);
        panelBotonesCalculadora.add(b15);
        panelBotonesCalculadora.add(b16);
        panelBotonesCalculadora.add(b17);
        panelBotonesCalculadora.add(b18);
        panelBotonesCalculadora.add(b19);
        panelBotonesCalculadora.add(b20);


        panelCentro.add(textFieldOperacion, BorderLayout.NORTH);
        panelCentro.add(panelBotonesCalculadora, BorderLayout.CENTER);


        // this es el JFrame
        this.add(titulo, BorderLayout.NORTH);
        this.add(panelCentro, BorderLayout.CENTER);
        this.setVisible(true);
    }
}
