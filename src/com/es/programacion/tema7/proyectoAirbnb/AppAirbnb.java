package com.es.programacion.tema7.proyectoAirbnb;

import com.es.programacion.tema7.proyectoAirbnb.model.Alojamiento;
import com.es.programacion.tema7.proyectoAirbnb.services.AlojamientoService;
import com.es.programacion.tema7.proyectoAirbnb.services.GestionFicheroAirbnb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AppAirbnb {

    public static void main(String[] args) {

        GestionFicheroAirbnb gestion = new GestionFicheroAirbnb();
        String rutaLectura = "src/main/resources/archivosTema7/airbnb/malaga.csv";
        String rutaEscritura = "src/main/resources/archivosTema7/airbnb/datos_malaga.csv";

        AlojamientoService alojamientoService = new AlojamientoService(rutaLectura, rutaEscritura, gestion);

        alojamientoService.leerDatos();
        alojamientoService.escribirDatos();

        Scanner scan = new Scanner(System.in);
        String opc = "";


        do {
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

            opc = scan.nextLine();
            switch (opc) {

                case "1":
                    alojamientoService.get20MasBaratos();
                    break;
                case "2":
                    alojamientoService.get20MasCaros();
                    break;
                case "3":
                    alojamientoService.getByPresupuesto();
                    break;
                case "4":
                    alojamientoService.modifyPrecioById();
                    break;
                case "5":
                    alojamientoService.modifyPropietarioById();
                    break;
                case "0":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }

        } while (!opc.equalsIgnoreCase("0"));
    }
}
