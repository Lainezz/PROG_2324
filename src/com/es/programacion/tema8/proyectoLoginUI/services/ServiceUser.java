package com.es.programacion.tema8.proyectoLoginUI.services;

import com.es.programacion.tema7.proyectoUser.model.User;
import com.es.programacion.tema7.proyectoUser.services.api.BasicServiceUser;
import com.es.programacion.tema7.proyectoUser.services.impl.LoggerService;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceUser implements BasicServiceUser {

    // ATRIBUTOS
    ArrayList<User> users; // Contiene todos los registros del fichero users.txt
    GestionFicheroUser gestionUser; // gestion es un objeto para poder llamar a los métodos de GestionFicheroUser
    LoggerService logger;

    public ServiceUser() {
        this.users = new ArrayList<>();
        this.gestionUser = new GestionFicheroUser();
        leerFicheroUsers();
        this.logger = new LoggerService();
    }


    public boolean loginUI(String idUser, String passUser) {
        return users.stream()
                .filter(user -> user.getId().equalsIgnoreCase(idUser) && user.getPass().equals(passUser))
                .findFirst()
                .isPresent();
    }

    @Override
    public String altaUsuario() {

        Scanner scan = new Scanner(System.in);
        String idUsuario = "";
        String nombreUsuario = "";
        String passwordUsuario = "";
        String isAdminSt = "";
        boolean isAdmin = false;

        System.out.print("Introduzca su idUsuario: ");
        idUsuario = scan.nextLine();

        // Comprobamos en el fichero si el idUser existe
        if (userExists(idUsuario)) {

            System.out.println("El usuario ya existe en el sistema");
            logger.registrarLog(idUsuario, "alta", "user already registered");
            return "";

        } else {
            System.out.print("Introduzca su nombre: ");
            nombreUsuario = scan.nextLine();

            System.out.print("Introduzca su password: ");
            passwordUsuario = scan.nextLine();

            System.out.print("¿Desea perfil de administrador? (si/no)");
            isAdminSt = scan.nextLine();

            if (isAdminSt.equalsIgnoreCase("si") || isAdminSt.equalsIgnoreCase("s")) {
                isAdmin = true;
            } else if (isAdminSt.equalsIgnoreCase("no") || isAdminSt.equalsIgnoreCase("n")) {
                isAdmin = false;
            } else {
                logger.registrarLog(idUsuario, "alta", "wrong data");
                System.out.println("Comando no identificado");
            }

            // TODO Comprobar que los datos introducidos son correctos

            // Creamos el usuario
            User newUser = new User(idUsuario, nombreUsuario, passwordUsuario, isAdmin);
            // Lo anadimos al ArrayList<User>
            this.users.add(newUser);
            // Persistimos los datos en el fichero
            this.anadirFicheroUsers(newUser);
            logger.registrarLog(idUsuario, "alta", "OK");
            return idUsuario;
        }
    }

    @Override
    public String loginUsuario() {

        Scanner scan = new Scanner(System.in);
        String idUsuario = "";
        String passwordUsuario = "";


        System.out.print("Introduzca su idUsuario: ");
        idUsuario = scan.nextLine();

        // Comprobamos en el fichero si el idUser existe
        if (userExists(idUsuario)) {

            System.out.print("Introduzca su password: ");
            passwordUsuario = scan.nextLine();

            if (checkUser(idUsuario, passwordUsuario)) {

                System.out.println("Bienvenid@ " + idUsuario);

                logger.registrarLog(idUsuario, "login", "OK");
                return idUsuario;
            } else {
                System.out.println("Credenciales incorrectas");
                logger.registrarLog(idUsuario, "login", "incorrect credentials");
                return "";
            }

        } else {
            System.out.println("El usuario no existe en el sistema");
            logger.registrarLog(idUsuario, "login", "user not exists");
            return "";
        }
    }

    @Override
    public boolean checkUser(String idUser, String password) {

        // 1º manera de hacerlo
        for (int i = 0; i < this.users.size(); i++) {
            User usuario = this.users.get(i); // usuario es el elemento de la posicion i de users
            if (usuario.getId().equalsIgnoreCase(idUser) && usuario.getPass().equals(password)) {
                return true;
            }
        }

        // 2º manera de hacerlo
        /*
        for(User usuario : this.users) {
            if(usuario.getId().equalsIgnoreCase(idUser) && usuario.getPass().equals(password)) {
                return true;
            }
        }
         */

        // 3º manera de hacerlo
        /*
        return !this.users.stream()
                .filter(usuario -> usuario.getId().equalsIgnoreCase(idUser) && usuario.getPass().equals(password))
                .findFirst()
                .isEmpty();
        */

        return false;
    }

    @Override
    public boolean userExists(String idUser) {

        return this.users.stream().anyMatch(user -> user.getId().equalsIgnoreCase(idUser));

    }

    @Override
    public void leerFicheroUsers() {
        this.users = gestionUser.leerFichero("src/main/resources/archivosTema7/users/users.txt");
    }

    @Override
    public void anadirFicheroUsers(User u) {
        gestionUser.anadirFichero(u, "src/main/resources/archivosTema7/users/users.txt");
    }

    @Override
    public void modificarFicheroUsers() {
        gestionUser.modificarFichero(this.users, "src/main/resources/archivosTema7/users/users.txt");
    }
}
