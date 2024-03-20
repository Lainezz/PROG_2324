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

    /**
     * Método leerFicheroAlojamientos
     * @param ruta
     * @return
     */
    public ArrayList<Alojamiento> leerFicheroAlojamientos(String ruta) {

        ArrayList<Alojamiento> alojamientosTemporal = new ArrayList<>();

        // Al haber pasado la ruta por parámetros, podemos usar varios ficheros (malaga.csv o sevilla.csv)
        System.out.println("RUTA: " + ruta);

        // 1º Abrimos el fichero
        File fichero = new File(ruta);

        // 2º Comprobamos que existe
        if (fichero.exists()) {

            FileReader fr = null;
            BufferedReader br = null;

            try {
                // 3º Abrimos los flujos de escrtura
                fr = new FileReader(fichero);
                br = new BufferedReader(fr);


                // 4º 0peramos con el fichero
                String linea = br.readLine();
                int i = 0;
                while (linea != null) {
                    if (i == 0) {
                        i++;
                    } else {

                        // Variables auxiliares
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

                br.close();
                fr.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return alojamientosTemporal;
    }
}
