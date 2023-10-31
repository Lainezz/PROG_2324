package com.es.programacion.tema2.entregas;

import java.util.Scanner;

public class ProyectoUnidad2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String usuario = "manolito";
        String intentoUsuario;
        String contrasena = "Manolito1234.";
        String intentoContrasena;
        double opcion;
        String producto = "Café";
        String producto1 = "Agua";
        String producto2 = "Tostada";
        double cafe = 0;
        double agua = 0;
        double tostada = 0;
        double total = 0;



        System.out.println("Bienvenido a UbriCoffee, por favor incie sesion: ");
        do {
            System.out.print("Introduzca su usuario: ");
            intentoUsuario = scan.next();
            System.out.print("Introduzca su contrasena: ");
            intentoContrasena = scan.next();
            if (!intentoUsuario.equals(usuario) || !intentoContrasena.equals(contrasena)){
                System.out.println("Credenciales incorrectas, por favor prueba de nuevo");
            } else {
                System.out.println("Credenciales corectar, bienvenido "+usuario);
            }
        }while (!intentoUsuario.equals(usuario) || !intentoContrasena.equals(contrasena));

        System.out.println("****ZONA DE MENU****");

        do {

            System.out.println("1. Café 1€");
            System.out.println("2. Agua 0,50€");
            System.out.println("3. Tostada 1,20€");
            System.out.println("0. Terminar/Salir");
            System.out.print("Seleccion un producto: ");
            opcion = scan.nextInt();

            if (opcion == 1){
                cafe++;
                System.out.println("Has elegido "+cafe+" "+producto);
            } else if (opcion == 2) {
                agua++;
                System.out.println("Has elegido "+agua+" "+producto1);
            } else if (opcion == 3) {
                tostada++;
                System.out.println("Has elegido "+tostada+" "+producto2);
            }
            System.out.println("¿Desea algo mas?");
            System.out.println("1. Si");
            System.out.println("2. No");
            int opcion2;
            opcion2 = scan.nextInt();

            if (opcion2 == 2){
                opcion = 0;
                System.out.println("Has terminado de seleccionar productos");
            }


        } while (opcion != 0);


        if (cafe > 0){
            System.out.println("Has selccionado "+cafe+" "+producto);
        }
        if (agua > 0){
            System.out.println("Has selccionado "+agua+" "+producto1);
        }
        if (tostada > 0){
            System.out.println("Has selccionado "+tostada+" "+producto2);
        }
        total = (cafe * 1) + (agua * 0.50) + (tostada * 1.20);
        System.out.println("Total a pagar: "+total+"€");
        System.out.println("Gracias por su pedido");


       // a. ¿CUaL ES LA PARTE MaS COMPLEJA A LA HORA DE TRABAHAR CON BUCLES?
       //  Saber que bucle usar en cada momento
       // b. ¿POR QUÉ HAS DECIDIDO UTILIZAR UN BUCLE WHILE EN LUGAR DE UN DO-WHILE?
       //  Porque el do-while es mas eficiente a la hora de hacer listas como los menús.
       // c. ¿CUaL HA SIDO LA PARTE MAS COMPLEJA DE LA PRaCTICA?
       //  La zona del menú


    }

}
