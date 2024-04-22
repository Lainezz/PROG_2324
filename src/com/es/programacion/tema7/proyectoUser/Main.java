package com.es.programacion.tema7.proyectoUser;

import com.es.programacion.tema7.proyectoUser.model.User;
import com.es.programacion.tema7.proyectoUser.services.impl.ServiceCine;
import com.es.programacion.tema7.proyectoUser.services.impl.ServiceUser;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Primero declaro los dos objetos que me van a permitir llamar a los diferentes métodos que tengo en las
        // clases GestionFicheroUser y UsersService.

        ServiceUser serviceUser = new ServiceUser();

        Scanner scan = new Scanner(System.in);
        String opc = "";
        String idUser = "";

        System.out.println("Bienvenid@ a UbriCines");
        do {
            System.out.print("""
                    1. Login
                    2. Alta
                    0. Salir
                    
                    Elija una opción: """);

            opc = scan.nextLine();

            switch (opc) {
                case "1":
                    idUser = serviceUser.loginUsuario();
                    break;
                case "2":
                    idUser = serviceUser.altaUsuario();
                    break;
                case "0":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }

        } while (idUser.equalsIgnoreCase("") && !opc.equalsIgnoreCase("0"));


        if(!idUser.equalsIgnoreCase("")) {

            // Seccion Ubricines
            System.out.println("Ubricines");
            ServiceCine serviceCine = new ServiceCine("UbriCines", idUser);

            do {
                System.out.print("""
                    1. Mostrar Butacas
                    2. Comprar Entrada
                    3. Devolver Entrada
                    0. Salir
                    
                    Elija una opción: """);

                opc = scan.nextLine();

                switch (opc) {
                    case "1":
                        serviceCine.mostrarButacas();
                        break;
                    case "2":
                        serviceCine.comprarEntrada();
                        break;
                    case "3":
                        serviceCine.devolverEntrada();
                        break;
                    case "0":
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                        break;
                }

            } while (!opc.equalsIgnoreCase("0"));

        }
    }
}
