package com.es.programacion.pruebas.pokemon.panel;

import com.es.programacion.pruebas.pokemon.assets.Media;
import com.es.programacion.pruebas.pokemon.panel.zonas.ZonaEleccion;
import com.es.programacion.pruebas.pokemon.panel.zonas.ZonaSeleccion;
import com.es.programacion.pruebas.pokemon.utils.Utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class PanelEquipo extends JPanel {

    private ZonaEleccion zonaEleccion;

    private ZonaSeleccion zonaSeleccion;

    private String[] equipoJ1 = new String[6];
    private String[] equipoJ2 = new String[6];

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

        this.zonaSeleccion = new ZonaSeleccion(this);


        JPanel otro = new JPanel();
        otro.setLayout(new GridLayout(1,2));
        otro.setSize(new Dimension(Utils.PREF_WIDTH_HALF, Utils.PREF_HEIGHT_HALF));
        JLabel i = new JLabel("Hola");
        otro.add(i);
        otro.add(zonaSeleccion);


        this.add(otro, BorderLayout.CENTER);
        this.addComponentListener(cl);
    }

    private void inicializarEquipo() {
        for (int i = 0; i <= equipoJ1.length - 1; i++) {
            equipoJ1[i] = "";
        }
    }

    public ZonaSeleccion getZonaSeleccion() {
        return zonaSeleccion;
    }

    public String[] getEquipoJ1() {
        return this.equipoJ1;
    }
    public String[] getEquipoJ2() {
        return this.equipoJ2;
    }


}
