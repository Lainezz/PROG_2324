package com.es.programacion.tema8.proyectMiniCalculadora.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelCalculadoraI extends JPanel {

    JTextField  textFieldValor1;
    JTextField  textFieldValor2;
    JButton     botonSuma;
    JButton     botonResta;
    JButton     botonMultiplicacion;
    JButton     botonDivision;
    JLabel      labelResultado;

    // EVENTOS
    MouseListener listenerMouse = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            JButton b = (JButton) e.getSource();
            System.out.println("Boton "+b.getText()+" clicado");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            JButton b = (JButton) e.getSource();
            b.setBackground(new Color(183, 160, 255));
            b.setBorder(new LineBorder(new Color(0,0,0), 3));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            JButton b = (JButton) e.getSource();
            b.setBackground(new Color(107, 154, 208));
            b.setBorder(new LineBorder(new Color(0,0,0), 1));
        }
    };


    public PanelCalculadoraI() {
        this.setLayout(new BorderLayout());
        this.setBackground(new Color(200,200,200));

        //Inicializamos los elementos
        textFieldValor1 = new JTextField("introduzca valor 1");
        textFieldValor2 = new JTextField("introduzca valor 2");
        botonSuma = new JButton("+");
        botonResta = new JButton("-");
        botonMultiplicacion = new JButton("x");
        botonDivision = new JButton("/");
        labelResultado = new JLabel();

        // Modificamos los atributos/valores/aspecto de los elementos
        textFieldValor1.setPreferredSize(new Dimension(300,200));
        textFieldValor2.setPreferredSize(new Dimension(300,200));
        botonSuma.setPreferredSize(new Dimension(150,200));
        botonResta.setPreferredSize(new Dimension(150,200));
        botonMultiplicacion.setPreferredSize(new Dimension(150,200));
        botonDivision.setPreferredSize(new Dimension(150,200));
        labelResultado.setPreferredSize(new Dimension(600,200));

        // Anadimos los eventos
        botonSuma.addMouseListener(listenerMouse);
        botonResta.addMouseListener(listenerMouse);
        botonMultiplicacion.addMouseListener(listenerMouse);
        botonDivision.addMouseListener(listenerMouse);

        JPanel panelNorte = new JPanel(new GridLayout(1,2));
        JPanel panelCentro = new JPanel(new GridLayout(1,4));

        // Anadimos al JPanel
        panelNorte.add(textFieldValor1);
        panelNorte.add(textFieldValor2);
        panelCentro.add(botonSuma);
        panelCentro.add(botonResta);
        panelCentro.add(botonMultiplicacion);
        panelCentro.add(botonDivision);
        this.add(panelNorte, BorderLayout.NORTH);
        this.add(panelCentro, BorderLayout.CENTER);
        this.add(labelResultado, BorderLayout.SOUTH);
    }
}
