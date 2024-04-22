package com.es.programacion.tema7.proyectoUser.services.impl;

import com.es.programacion.tema7.proyectoUser.model.Butaca;
import com.es.programacion.tema7.proyectoUser.model.User;

import java.io.*;
import java.util.Arrays;

public class GestionFicheroCine {


    public Butaca[][] leerFicheroCine(String ruta) {

        Butaca[][] arrButacaTemporal = new Butaca[ServiceCine.NFILAS][ServiceCine.NASIENTOS];

        try {
            // 1º Abrir File
            File fichero = new File(ruta);

            if (fichero.exists()) {
                // 2º Abrir flujos
                FileReader fr = new FileReader(fichero);
                BufferedReader br = new BufferedReader(fr);

                // 3º Operar con el fichero
                String linea = br.readLine();
                while (linea != null) {
                    String nFila = "";
                    String nAsiento = "";
                    String idUser = "";

                    String[] valores = linea.split(":");

                    nFila = valores[0];
                    nAsiento = valores[1];
                    idUser = valores[2];

                    try {
                        int nFilaI = Integer.parseInt(nFila);
                        int nAsientoI = Integer.parseInt(nAsiento);

                        Butaca b = new Butaca(nFilaI, nAsientoI, idUser);
                        arrButacaTemporal[nFilaI][nAsientoI] = b;

                    } catch (Exception e) {
                        System.out.println("Error en el fichero en linea: " + nFila + ":" + nAsiento + ":" + idUser);
                    }

                    linea = br.readLine();
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return arrButacaTemporal;
    }

    public void modificarFicheroCine(Butaca[][] salaDeCine, String ruta) {

        // 1º Abrimos el fichero
        File fichero = new File(ruta);

        // 2º Comprobamos que existe
        if (fichero.exists() && fichero.isFile() && fichero.canWrite()) {

            FileWriter fw = null;
            BufferedWriter bw = null;

            try {
                // 3º Abrimos los flujos de escritura -> Con el append a false
                fw = new FileWriter(fichero, false);
                bw = new BufferedWriter(fw);


                // 4º 0peramos con el fichero
                // a) Recorremos el arrayList que queremos escribir en el fichero
                for (int i = 0; i < salaDeCine.length; i++) {
                    for (int j = 0; j < salaDeCine[i].length; j++) {
                        Butaca b = salaDeCine[i][j];

                        if (b != null) {
                            bw.write(b.toString());
                            bw.write("\n");
                        }
                    }
                }

                // 5º Cerrar flujos
                bw.close();
                fw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public void anadirFicheroCine(Butaca b, String ruta) {

        // 1º Abrimos el fichero
        File fichero = new File(ruta);

        // 2º Comprobamos que existe
        if (fichero.exists() && fichero.isFile() && fichero.canWrite()) {

            FileWriter fw = null;
            BufferedWriter bw = null;

            try {
                // 3º Abrimos los flujos de escritura -> Con el append a false
                fw = new FileWriter(fichero, true);
                bw = new BufferedWriter(fw);


                // 4º 0peramos con el fichero
                bw.write(b.toString());
                bw.write("\n");

                // 5º Cerrar flujos
                bw.close();
                fw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
