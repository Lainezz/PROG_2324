package com.es.programacion.tema8.teoriaEventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventosListener extends JFrame {

    private int width = 600;
    private int height = 600;

    // Atributos de clase
    JButton botonEnviar;
    JTextField campoTexto;

    // Creamos los eventos
    MouseListener listenerDeBotonEnviar = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Boton pulsado");
            String texto = campoTexto.getText();

            System.out.println(texto);
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            //System.out.println("Entra el raton");
            botonEnviar.setBackground(new Color(252, 143, 136));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            //System.out.println("Sale el raton");
            botonEnviar.setBackground(new Color(200,200,200));
        }
    };



    // Constructor de clase
    public EventosListener() {

        this.setSize(width, height);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Primera Ventana");
        ImageIcon image = new ImageIcon("src/main/resources/pokemonMedia/images/dratini.png");
        this.setIconImage(image.getImage());

        // JFrame tiene un layout por defecto de BorderLayout (CENTER, NORTH, SOUTH, WEST, EAST)
        JLabel titulo = new JLabel("EVENTOS");
        titulo.setPreferredSize(new Dimension(100,100));
        titulo.setFont(new Font("Consolas", Font.BOLD, 32));
        titulo.setHorizontalAlignment(JLabel.CENTER);

        JPanel panelCentro = new JPanel();

        campoTexto = new JTextField();
        campoTexto.setPreferredSize(new Dimension(100, 32));
        campoTexto.setBackground(new Color(0,0,0));
        campoTexto.setForeground(new Color(255,255,255));
        campoTexto.setFont(new Font("Consolas", Font.BOLD, 16));

        botonEnviar = new JButton("Enviar");
        botonEnviar.setPreferredSize(new Dimension(100,32));
        // Anadimos el evento al botonEnviar
        botonEnviar.addMouseListener(listenerDeBotonEnviar);


        // Anadimos elementos al JPanel (panelCentro)
        panelCentro.add(campoTexto);
        panelCentro.add(botonEnviar);

        // Anadimos elementos al JFrame
        this.add(panelCentro, BorderLayout.CENTER);
        this.add(titulo, BorderLayout.NORTH);
        this.setVisible(true);
    }
}
