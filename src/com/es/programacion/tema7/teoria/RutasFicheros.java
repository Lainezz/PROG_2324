package com.es.programacion.tema7.teoria;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class RutasFicheros {

    public static void main(String[] args) {

        // Para conocer la línea separadora hacemos uso de
        String lineaSeparadora = File.separator;
        System.out.println("La linea separadora es: "+lineaSeparadora);

        // Rutas absolutas vs Rutas relativas
        File fichAbsoluto = new File("C:"+lineaSeparadora+"Users"+lineaSeparadora+"diego"+lineaSeparadora+"Desktop"+lineaSeparadora+"Workspaces"+lineaSeparadora+"workspace_2324"+lineaSeparadora+"src"+lineaSeparadora+"main"+lineaSeparadora+"resources"+lineaSeparadora+"archivosTema7"+lineaSeparadora+"fich.txt");
        System.out.println("¿El fichero existe? "+fichAbsoluto.exists());

        File fichRelative = new File("src"+lineaSeparadora+"main"+lineaSeparadora+"resources"+lineaSeparadora+"archivosTema7"+lineaSeparadora+"fich.txt");
        System.out.println("¿El fichero existe? "+fichRelative.exists());

        // LECTURA FICHERO
        // 0º primero comprobamos que exista el fichero
        if(fichRelative.exists()) {
            // 1º Abrir el flujo de lectura -> Al leer/escribir en ficheros, se lanzan excepciones
            // esas excepciones son de IOException y FileNotFoundException
            FileReader fl = null;
            try {
                // Aquí abrimos el flujo de lectura en sí, al crear un objeto de tipo FileReader
                fl = new FileReader(fichRelative, StandardCharsets.UTF_8);

                // 2º Operar con el fichero... en este caso, leemos la información
                int caracter = fl.read();
                while (caracter != -1) {
                    System.out.print((char) caracter);
                    caracter = fl.read();
                }

                // 3º Cerramos los flujos
                fl.close();


            } catch (IOException e) {
                e.printStackTrace();

            }

            // ESCRITURA en fichero
            // 0º
            if(fichRelative.exists() && fichRelative.isFile()) {
                // 1º Abrir flujo de escritura
                FileWriter fw = null;
                try {
                    fw = new FileWriter(fichRelative, false);

                    // 2º Operar con el fichero
                    Scanner scan = new Scanner(System.in);
                    String lineaAEscribir = scan.nextLine();
                    fw.write(lineaAEscribir+"\n");
                    lineaAEscribir = scan.nextLine();
                    fw.write(lineaAEscribir+"\n");
                    lineaAEscribir = scan.nextLine();
                    fw.write(lineaAEscribir+"\n");
                    lineaAEscribir = scan.nextLine();
                    fw.write(lineaAEscribir+"\n");

                    // 3º Cerrar el flujo
                    fw.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }




    }
}
