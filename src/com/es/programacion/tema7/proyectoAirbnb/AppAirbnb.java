package com.es.programacion.tema7.proyectoAirbnb;

import com.es.programacion.tema7.proyectoAirbnb.model.Alojamiento;
import com.es.programacion.tema7.proyectoAirbnb.services.GestionFicheroAirbnb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AppAirbnb {

    public static void main(String[] args) {

        GestionFicheroAirbnb gestion = new GestionFicheroAirbnb();

        String ruta = "src/main/resources/archivosTema7/airbnb/malaga.csv";
        String rutaEscritura = "src/main/resources/archivosTema7/airbnb/datos_malaga.csv";

        ArrayList<Alojamiento> alojamientosTemporal = new ArrayList<>();

        alojamientosTemporal = gestion.leerFicheroAlojamientos(ruta);

        //gestion.escribirFicheroDatos(alojamientosTemporal, rutaEscritura);

        Scanner scan = new Scanner(System.in);
        System.out.print("""
                Bienvenid@ a Airbnb
                
                1. Mostrar 20 más baratos
                2. Mostrar 20 más caros
                3. Filtrar por presupuesto
                4. Modificar precio alojamiento
                5. Modificar propietario
                0. Salir
                
                Elige una opción:
                """);

        String opc = "";
        opc = scan.nextLine();

        switch (opc) {

            case "1":
                Collections.sort(alojamientosTemporal);
                for(int i=0; i<20; i++) {
                    System.out.println(alojamientosTemporal.get(i));
                }
                break;
            case "2":
                Collections.sort(alojamientosTemporal, Collections.reverseOrder());
                for(int i=0; i<20; i++) {
                    System.out.println(alojamientosTemporal.get(i));
                }
                break;
            case "3":
                System.out.print("Dime tu presupuesto: ");
                double presupuesto = 0.0;
                try {
                    presupuesto = scan.nextDouble();

                    for (int i=0; i<alojamientosTemporal.size(); i++) {
                        Alojamiento alojamiento = alojamientosTemporal.get(i);

                        if(alojamiento.getPrecio() <= presupuesto) {
                            System.out.println(alojamiento);
                        }

                    }

                } catch (Exception e) {
                    System.out.println("Presupuesto incorrecto...");
                }


                break;
            case "4":break;
            case "5":break;
            case "0":break;
            default:
                System.out.println("Error");
                break;
        }


    }
}
