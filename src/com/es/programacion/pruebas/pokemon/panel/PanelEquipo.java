package com.es.programacion.pruebas.pokemon.panel;

import com.es.programacion.pruebas.pokemon.assets.Media;
import com.es.programacion.pruebas.pokemon.label.LabelPokemon;
import com.es.programacion.pruebas.pokemon.panel.hijos.selEquipo.hijos.ZonaEleccion;
import com.es.programacion.pruebas.pokemon.utils.Utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class PanelEquipo extends JPanel {

    private ZonaEleccion zonaEleccion;
    private JPanel zonaSeleccion;

    public String[] equipo = new String[6];

    ComponentListener cl = new ComponentAdapter() {
        @Override
        public void componentShown(ComponentEvent e) {
            //Media.PALLET_TOWN.start();
        }

        @Override
        public void componentHidden(ComponentEvent e) {
            Media.PALLET_TOWN.stop();
            Media.emptyBuffer(Media.PALLET_TOWN);
        }
    };


    public PanelEquipo() {
        inicializarEquipo();

        // Seteo de propiedades del JPanel
        this.setSize(new Dimension(Utils.PREF_WIDTH, Utils.PREF_HEIGHT));
        this.setLayout(new BorderLayout());

        this.zonaEleccion = new ZonaEleccion(this);
        this.add(zonaEleccion, BorderLayout.NORTH);

        this.zonaSeleccion = new JPanel();
        zonaSeleccion.setLayout(new FlowLayout());
        this.add(zonaSeleccion, BorderLayout.CENTER);

        this.addComponentListener(cl);
    }

    private void inicializarEquipo() {
        for (int i = 0; i <= equipo.length - 1; i++) {
            equipo[i] = "";
        }
    }

    public void addPokemonToEquipo(String pokemon) {
        for (int i = 0; i <= equipo.length - 1; i++) {
            if ("".equalsIgnoreCase(equipo[i])) {
                equipo[i] = pokemon;
                break;
            }
        }
        updateZonaSeleccion();
    }

    public void removePokemonFromEquipo(String pokemon) {
        for (int i = 0; i <= equipo.length - 1; i++) {
            if (pokemon.equalsIgnoreCase(equipo[i])) {
                equipo[i] = "";
                break;
            }
        }
        updateZonaSeleccion();
    }


    private void updateZonaSeleccion() {

        zonaSeleccion.removeAll();
        for (int i = 0; i <= equipo.length - 1; i++) {
            LabelPokemon label = new LabelPokemon(equipo[i], Utils.MD, this);
            zonaSeleccion.add(label);
        }
        zonaSeleccion.revalidate();
    }

}
