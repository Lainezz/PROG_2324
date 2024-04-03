package com.es.programacion.tema7.proyectoAirbnb.services;

import com.es.programacion.tema7.proyectoAirbnb.model.Alojamiento;
import com.es.programacion.tema7.proyectoAirbnb.model.Propietario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AlojamientoService {

    private ArrayList<Alojamiento> alojamientos;
    private GestionFicheroAirbnb gestionFichero;
    private String rutaLectura;
    private String rutaEscritura;

    public AlojamientoService(String rutaDatosLectura, String rutaDatosEscritura, GestionFicheroAirbnb gestionFichero) {
        this.rutaLectura = rutaDatosLectura;
        this.rutaEscritura = rutaDatosEscritura;

        this.gestionFichero = gestionFichero;
        this.alojamientos = new ArrayList<>();
    }

    /**
     * Método para llenar el ArrayList de {@link Alojamiento} con los datos del fichero
     * Sería un equivalente a una sentencia SQL del tipo SELECT * FROM
     * @return
     */
    public boolean leerDatos() {

        //Lo que se hace aqui es simplemente llamar al metodo leerFicheroAlojamientos para llenar el ArrayList<Alojamiento> con todos los registros que contenga el fichero
        this.alojamientos = gestionFichero.leerFicheroAlojamientos(rutaLectura);

        // Devuelvo true o false para indicar si he podido llenar el ArrayList o no
        return this.alojamientos.isEmpty();

    }

    /**
     * Método para escribir todos los datos del ArrayList de {@link Alojamiento} en el fichero
     * @return
     */
    public void escribirDatos() {
        gestionFichero.escribirFicheroDatos(this.alojamientos, rutaEscritura);
    }

    /**
     * Método para obtener los 20 alojamientos más baratos
     */
    public void get20MasBaratos() {
        Collections.sort(this.alojamientos);
        for (int i=0; i< Math.min(20, this.alojamientos.size()); i++) {
            System.out.println(this.alojamientos.get(i));
        }
    }

    /**
     * Método para obtener los 20 alojamientos más caros
     */
    public void get20MasCaros() {
        Collections.sort(this.alojamientos);
        Collections.reverse(this.alojamientos);
        for (int i=0; i< Math.min(20, this.alojamientos.size()); i++) {
            System.out.println(this.alojamientos.get(i));
        }
    }


    /**
     * Método para obtener los alojamientos que se ajusten a un presupuesto dado
     */
    public void getByPresupuesto() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Introduzca el presupuesto deseado: ");
        String presupuestoSt = scan.nextLine();

        try {
            double presupuestoD = Double.parseDouble(presupuestoSt);
            /*
            this.alojamientos.stream()
                    .filter(alojamiento -> alojamiento.getPrecio() <= presupuestoD)
                    .forEach(System.out::println);
                    //.forEach(alojamiento -> System.out.println(alojamiento));

             // Este código que algunos habéis puesto en vuestros proyectos equivaldría al que tenéis más abajo
             */
            for (Alojamiento a : this.alojamientos) {
                if(a.getPrecio() <= presupuestoD) {
                    System.out.println(a);
                }
            }


        } catch (NumberFormatException e) {
            System.out.println("Presupuesto erróneo...");
        } catch (Exception e) {
            System.out.println("Error...");
        }

    }

    /**
     * Método para modificar el precio de un alojamiento, buscandolo por su id
     */
    public void modifyPrecioById() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Introduzca el ID del alojamiento deseado: ");
        String idAlojamiento = scan.nextLine();

        /*
        Alojamiento a = this.alojamientos.stream()
                                .filter(alojamiento -> alojamiento.getId().equalsIgnoreCase(idAlojamiento))
                                .findFirst()
                                .orElse(null);
        // Este trozo de código que algunos habéis hecho equivaldría al que presento abajo
        */
        Alojamiento a = null;
        for (Alojamiento alojamiento : this.alojamientos) {
            if(alojamiento.getId().equalsIgnoreCase(idAlojamiento)) {
                a = alojamiento;
                break;
            }
        }


        if(a != null) {

            // Si existe el alojamiento dentro de mis datos, puedo proceder a cambiar el precio del mismo
            try {

                System.out.print("El precio anterior es: "+a.getPrecio()+"\nIntroduzca el nuevo precio: ");
                String nuevoPrecioSt = scan.nextLine();
                double nuevoPrecioD = Double.parseDouble(nuevoPrecioSt);

                /*
                this.alojamientos.stream()
                        .filter(alojamiento -> alojamiento.getId().equalsIgnoreCase(idAlojamiento))
                        .findFirst()
                        .orElse(null)
                        .setPrecio(nuevoPrecioD);
                // Siguiendo con algunos códigos que se han visto en la práctica anterior, esta es una manera de hacerlo, pero hay más
                 */

                /*
                // Otra manera es con un foreach normal y corriente
                for (Alojamiento al : this.alojamientos) {

                    if(al.getId().equalsIgnoreCase(idAlojamiento)) {
                        al.setPrecio(nuevoPrecioD);
                        break;
                    }
                }

                 */

                // La forma más directa de hacer el cambio de precio es modificar el precio del objeto a que hemos buscado anteriormente.
                // Este objeto está igualado al objeto del ArrayList... así que en realidad si modifico a, estoy modificando el objeto del ArrayList
                a.setPrecio(nuevoPrecioD);

                // Una vez tenemos el nuevo precio puesto, podemos escribirlo en el fichero
                escribirDatos();

            } catch (NumberFormatException e) {
                System.out.println("Presupuesto erróneo...");
            } catch (Exception e) {
                System.out.println("Error...");
            }

        } else {
            System.out.println("Id "+idAlojamiento+" no encontrado...");
        }
    }

    /**
     * Método para modificar los datos del propietario de un alojamiento, buscandolo por su id
     */
    public void modifyPropietarioById() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Introduzca el ID del alojamiento deseado: ");
        String idAlojamiento = scan.nextLine();

        /*
        Alojamiento a = this.alojamientos.stream()
                                .filter(alojamiento -> alojamiento.getId().equalsIgnoreCase(idAlojamiento))
                                .findFirst()
                                .orElse(null);
        // Este trozo de código que algunos habéis hecho equivaldría al que presento abajo
        */
        Alojamiento a = null;
        for (Alojamiento alojamiento : this.alojamientos) {
            if(alojamiento.getId().equalsIgnoreCase(idAlojamiento)) {
                a = alojamiento;
                break;
            }
        }


        if(a != null) {

            // Si existe el alojamiento dentro de mis datos, puedo proceder a cambiar el precio del mismo
            try {

                System.out.print("El propietario anterior es: "+a.getPropietario()+"\n");
                System.out.print("Introduzca el nombre del nuevo propietario: ");
                String nombreNuevoProp = scan.nextLine();
                System.out.print("Introduzca el id de "+nombreNuevoProp+": ");
                String idNuevoProp = scan.nextLine();

                if(!nombreNuevoProp.contains(",") && !idNuevoProp.contains(",")) {

                    Propietario nuevoPropietario = new Propietario(idNuevoProp, nombreNuevoProp);
                    /*
                    this.alojamientos.stream()
                            .filter(alojamiento -> alojamiento.getId().equalsIgnoreCase(idAlojamiento))
                            .findFirst()
                            .orElse(null)
                            .setPropietario(nuevoPropietario);
                    // Siguiendo con algunos códigos que se han visto en la práctica anterior, esta es una manera de hacerlo, pero hay más
                     */

                    /*
                    // Otra manera es con un foreach normal y corriente
                    for (Alojamiento al : this.alojamientos) {

                        if(al.getId().equalsIgnoreCase(idAlojamiento)) {
                            al.setPropietario(nuevoPropietario);
                            break;
                        }
                    }

                     */

                    // La forma más directa de hacer el cambio de precio es modificar el precio del objeto a que hemos buscado anteriormente.
                    // Este objeto está igualado al objeto del ArrayList... así que en realidad si modifico a, estoy modificando el objeto del ArrayList
                    a.setPropietario(nuevoPropietario);

                    // Una vez tenemos el nuevo precio puesto, podemos escribirlo en el fichero
                    escribirDatos();
                } else {
                    System.out.println("Datos del nuevo propietario incorrectos...");
                }

            } catch (Exception e) {
                System.out.println("Error...");
            }

        } else {
            System.out.println("Id "+idAlojamiento+" no encontrado...");
        }
    }
}
