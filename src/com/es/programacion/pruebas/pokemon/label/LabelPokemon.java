package com.es.programacion.pruebas.pokemon.label;

import com.es.programacion.pruebas.pokemon.assets.Media;
import com.es.programacion.pruebas.pokemon.panel.PanelEquipo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class LabelPokemon extends JLabel {

    private BufferedImage image;
    private Dimension size;
    private PanelEquipo parent;
    public String nombrePokemon = "";

    MouseListener ml = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            parent.removePokemonFromEquipo(nombrePokemon);
        }
    };



    public LabelPokemon(String nombrePokemon, Dimension size, PanelEquipo parent) {
        this.nombrePokemon = nombrePokemon;
        this.size = size;
        this.parent = parent;

        image = Media.imageFactory(this.nombrePokemon);

        this.setPreferredSize(this.size);
        this.addMouseListener(ml);
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(image, 0,0, getWidth(), getHeight(), null);
    }

}