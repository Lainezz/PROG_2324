package com.es.programacion.tema7.proyectoAirbnb.services;

import com.es.programacion.tema7.proyectoAirbnb.model.Alojamiento;
import com.es.programacion.tema7.proyectoAirbnb.model.Propietario;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestionFicheroAirbnb {

    /*
    2 métodos.
    1 para leer el fichero csv y extraer la informacion que queremos
    y otro para escribir esa informacion en otro fichero aparte
     */

    public ArrayList<Alojamiento> leerFicheroAlojamientos(String ruta) {

        ArrayList<Alojamiento> alojamientosTemporal = new ArrayList<>();

        System.out.println("RUTA: " + ruta);
        File fichero = new File(ruta);

        if (fichero.exists()) {

            FileReader fr = null;
            BufferedReader br = null;

            try {
                fr = new FileReader(fichero);
                br = new BufferedReader(fr);

                String linea = br.readLine();
                int i = 0;
                while (linea != null) {
                    if (i == 0) {
                        i++;
                    } else {

                        String id = "";
                        String name = "";
                        String host_id = "";
                        String host_name = "";
                        String price = "";

                        String[] valores = linea.split(",");

                        id = valores[0];
                        name = valores[1];
                        host_id = valores[2];
                        host_name = valores[3];
                        price = valores[9];

                        double price_d = 0;
                        try {
                            price_d = Double.parseDouble(price);
                        } catch (NumberFormatException e) {
                            e.printStackTrace();
                        }

                        Propietario p = new Propietario(host_id, host_name);
                        Alojamiento a = new Alojamiento(id, name, p, price_d);

                        alojamientosTemporal.add(a);

                    }

                    linea = br.readLine();


                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        return alojamientosTemporal;
    }
}
