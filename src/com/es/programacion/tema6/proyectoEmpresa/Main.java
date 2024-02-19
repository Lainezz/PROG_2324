package com.es.programacion.tema6.proyectoEmpresa;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        Articulo vaper = new Articulo("1", "Vaper de melocoton",
                new Proveedor(), 5, 100);
        Articulo vaper2 = new Articulo("1", "Vaper de melocoton",
                new Proveedor(), 5, 100);

        System.out.print(vaper.equals(vaper2));

    }
}
