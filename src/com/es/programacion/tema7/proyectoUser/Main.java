package com.es.programacion.tema7.proyectoUser;

import com.es.programacion.tema7.proyectoUser.model.User;
import com.es.programacion.tema7.proyectoUser.services.impl.ServiceUser;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Primero declaro los dos objetos que me van a permitir llamar a los diferentes métodos que tengo en las
        // clases GestionFicheroUser y UsersService.

        ServiceUser service = new ServiceUser();

        Scanner scan = new Scanner(System.in);
        String opc = "";
        boolean loginCorrecto = false;

        System.out.println("Bienvenid@ a UbriCines");
        do {
            System.out.print("""
                    1. Login
                    2. Alta
                    0. Salir
                    
                    Elija una opción: 
                    """);

            opc = scan.nextLine();

            switch (opc) {
                case "1":
                    loginCorrecto = service.loginUsuario();
                    break;
                case "2":
                    loginCorrecto = service.altaUsuario();
                    break;
                case "0":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }




        } while (!loginCorrecto && !opc.equalsIgnoreCase("0"));


        if(loginCorrecto) {

            // Seccion Ubricines
            System.out.println("Ubricines");

        }





    }
}
