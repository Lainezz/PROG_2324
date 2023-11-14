package com.es.programacion.pruebas.pokemon.panel.hijos.selEquipo.hijos;

import com.es.programacion.pruebas.pokemon.boton.BotonPokemon;
import com.es.programacion.pruebas.pokemon.panel.PanelEquipo;
import com.es.programacion.pruebas.pokemon.utils.Utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZonaEleccion extends JPanel {

    private static Dimension size = new Dimension(Utils.PREF_WIDTH_IMG, Utils.PREF_HEIGHT_IMG);
    public PanelEquipo parent;
    private GridLayout grid;
    private BotonPokemon[] pokemons;


    public ZonaEleccion(PanelEquipo parent) {
        this.parent = parent;

        this.setPreferredSize(this.size);

        grid = new GridLayout(2, 5);
        this.setLayout(grid);

        pokemons = new BotonPokemon[10];

        for (int i = 0; i <= pokemons.length - 1; i++) {
            pokemons[i] = new BotonPokemon(Utils.NOMBRES_POKEMON[i], Utils.MD, this);
            this.add(pokemons[i]);
        }

    }


}
