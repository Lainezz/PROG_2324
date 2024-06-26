package com.es.programacion.tema7.proyectoAirbnb.services;

import com.es.programacion.tema7.proyectoAirbnb.model.Alojamiento;
import com.es.programacion.tema7.proyectoAirbnb.model.Propietario;

import java.io.*;
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
        if (fichero.exists() && fichero.isFile() && fichero.canRead()) {

            FileReader fr = null;
            BufferedReader br = null;

            try {
                // 3º Abrimos los flujos de lectura
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

                        // El tipo requerido
                        double price_d = 0;
                        try {
                            price_d = Double.parseDouble(price);
                        } catch (NumberFormatException e) {
                            //e.printStackTrace();
                            // Una opcion que tenemos es que si se produce una excepcion, que no se agregue ese registro a los datos
                            linea = br.readLine();
                            continue;
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

    public void escribirFicheroDatos(ArrayList<Alojamiento> arrAlojamientos, String ruta) {

        // 1º Abrimos el fichero
        File fichero = new File(ruta);

        // 2º Comprobamos que existe
        if (fichero.exists() && fichero.isFile() && fichero.canWrite()) {

            FileWriter fw = null;
            BufferedWriter bw = null;

            try {
                // 3º Abrimos los flujos de escritura
                fw = new FileWriter(fichero);
                bw = new BufferedWriter(fw);


                // 4º 0peramos con el fichero
                // a) Recorremos el arrayList que queremos escribir en el fichero
                for (Alojamiento a : arrAlojamientos) {
                    // b) escribrimos en el fichero
                    bw.write(a.getId());
                    bw.write(",");
                    bw.write(a.getName());
                    bw.write(",");
                    bw.write(a.getPropietario().getHost_id());
                    bw.write(",");
                    bw.write(a.getPropietario().getHost_name());
                    bw.write(",");
                    bw.write(a.getPrecio()+"");
                    bw.write("\n");
                }

                // 5º Cerrar flujos
                bw.close();
                fw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
