package com.es.programacion.tema7.proyectoUser.services.impl;

import com.es.programacion.tema7.proyectoUser.model.Butaca;
import com.es.programacion.tema7.proyectoUser.services.api.BasicServiceCine;

import java.util.Scanner;

public class ServiceCine implements BasicServiceCine {

    private String nombreCine;
    public static final int NFILAS = 10;
    public static final int NASIENTOS = 10;

    private Butaca[][] salaDeCine;
    private String idUser;
    private GestionFicheroCine gestion;

    // Constructor
    public ServiceCine(String nombreCine, String idUser) {

        this.nombreCine = nombreCine;
        this.gestion = new GestionFicheroCine();
        this.salaDeCine = new Butaca[NFILAS][NASIENTOS]; // Aquí, tendríamos un array bidimensional de Butaca, lleno de nulls
        this.leerFicheroCine();
        this.idUser = idUser;
    }


    @Override
    public void mostrarButacas() {

        System.out.format("%5s", " ");
        for (int i=0; i<NASIENTOS; i++) {
            System.out.format("%4s", "A"+(i));
        }
        System.out.println();

        for (int i=0; i<salaDeCine.length; i++) {
            System.out.format("F.%2s.", i);
            for (int j=0; j<salaDeCine[i].length; j++) {
                if (salaDeCine[i][j] == null) {
                    System.out.format("%4s", "__");
                } else {
                    System.out.format("%4s", "XX");
                }
            }
            System.out.println();
        }
    }

    @Override
    public boolean comprarEntrada() {

        Scanner scan = new Scanner(System.in);
        String fila = "";
        String asiento = "";
        int filaI = -1;
        int asientoI = -1;

        System.out.print("Indique la fila: ");
        fila = scan.nextLine();

        System.out.print("Indique el asiento: ");
        asiento = scan.nextLine();

        try {
            filaI = Integer.parseInt(fila);
            asientoI = Integer.parseInt(asiento);

            if (this.salaDeCine[filaI][asientoI] == null) {
                Butaca b = new Butaca(filaI, asientoI, this.idUser);
                this.salaDeCine[filaI][asientoI] = b;

                this.anadirFicheroCine(b);
                System.out.println("Compra efectuada: "+b.toString());
                return true;

            } else {
                System.out.println("Asiento ("+fila+":"+asiento+") ocupado");
                return false;
            }

        } catch (Exception e) {
            System.out.println("Error al seleccionar la fila y el asiento");
            return false;
        }
    }

    @Override
    public boolean devolverEntrada() {
        Scanner scan = new Scanner(System.in);

        String fila = "";
        String asiento = "";
        int filaI = -1;
        int asientoI = -1;

        System.out.print("Indique la fila: ");
        fila = scan.nextLine();

        System.out.print("Indique el asiento: ");
        asiento = scan.nextLine();

        try {
            filaI = Integer.parseInt(fila);
            asientoI = Integer.parseInt(asiento);

            if (this.salaDeCine[filaI][asientoI] != null) { // Comprobamos que ese asiento está OCUPADO

                if (this.salaDeCine[filaI][asientoI].getIdUser().equalsIgnoreCase(this.idUser)) { // Comprobamos que el idUsuario de ese asiento coincide con el usuario logado

                    this.salaDeCine[filaI][asientoI] = null;

                    this.modificarFicheroCine();
                    System.out.println("Devolucion efectuada");
                    return true;

                } else {
                    System.out.println("El idUsuario no coincide");
                    return false;
                }

            } else {
                System.out.println("Asiento ("+fila+":"+asiento+") no ocupado");
                return false;
            }

        } catch (Exception e) {
            System.out.println("Error al seleccionar la fila y el asiento");
            return false;
        }
    }

    @Override
    public boolean checkComprador(String idUser) {
        return false;
    }

    @Override
    public void leerFicheroCine() {
        this.salaDeCine = gestion.leerFicheroCine("src/main/resources/archivosTema7/ubriCine/entradas_vendidas.txt"); //aquí vamos a leer el fichero para llenar el array de objetos Butaca
    }

    @Override
    public void anadirFicheroCine(Butaca b) {
        gestion.anadirFicheroCine(b, "src/main/resources/archivosTema7/ubriCine/entradas_vendidas.txt");
    }

    @Override
    public void modificarFicheroCine() {
        gestion.modificarFicheroCine(this.salaDeCine, "src/main/resources/archivosTema7/ubriCine/entradas_vendidas.txt");
    }
}
