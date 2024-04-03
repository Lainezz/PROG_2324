package com.es.programacion.tema7.proyectoUser.services;

import com.es.programacion.tema7.proyectoUser.model.User;

import java.util.ArrayList;

public class UsersService {


    private String rutaLectura;
    private String rutaEscritura;
    private ArrayList<User> users;
    private GestionFicheroUser gestionFicheroUser;

    public UsersService(String rutaLectura, String rutaEscritura, GestionFicheroUser gestionFicheroUser) {
        this.gestionFicheroUser = gestionFicheroUser;
        this.rutaLectura = rutaLectura;
        this.rutaEscritura = rutaEscritura;
        users = new ArrayList<>();
    }

    public void leerFicheroUsers() {
        this.users = gestionFicheroUser.leerFicheroUsers(rutaLectura);
    }

    public void anadirFicheroUsers(User u) {
        gestionFicheroUser.anadirFicheroUsers(u, rutaEscritura);
    }

    public void modificarFicheroUsers() {
        gestionFicheroUser.modificarFicheroUsers(this.users, rutaEscritura);
    }

    /**
     * Método para comprobar si un usuario existe en el sistema o no
     * @param idUser id del usuario a buscar
     * @return true si existe o false si no existe
     */
    public boolean userExists(String idUser) {
        /*
        // Este código, se parece a lo que habéis puesto en la práctica del AirBnb. Lo hago más sencillo un poco más abajo
        return this.users.stream()
                .filter(user -> user.getId().equalsIgnoreCase(idUser))
                .findFirst()
                 .isEmpty();
         */

        for (User u : this.users) {
            if(u.getId().equalsIgnoreCase(idUser)) {
                // Si encontramos al usuario, podemos devolver true directamente
                return true;
            }
        }
        // Si llega a este punto es que no ha encontrado ningún usuario
        return false;
    }

    /**
     * Método para buscar a un User por su id
     * @param idUser id del usuario a buscar
     * @return User con el usuario encontrado o null si no lo encuentra
     */
    public User findUserById(String idUser) {
        /*
        // Este código, se parece a lo que habéis puesto en la práctica del AirBnb. Lo hago más sencillo un poco más abajo
        return this.users.stream()
                .filter(user -> user.getId().equalsIgnoreCase(idUser))
                .findFirst()
                .orElse(null);
         */

        for (User u : this.users) {
            if(u.getId().equalsIgnoreCase(idUser)) {
                // Si encontramos al usuario, podemos devolverlo directamente
                return u;
            }
        }
        // Si llega a este punto es que no ha encontrado ningún usuario
        return null;
    }

    public boolean altaUsuario(User newUser) {
        // Si encontramos al usuario dentro del sistema, significa que ya existe, así que no podemos darlo de alta
        if(userExists(newUser.getId())) {
           // Si el usuario ya existe en el sistema, devolveremos un false indicando que ya existe y que no se puede duplicar
            System.out.println("Usuario ya existente en el sistema...");
            return false;
        } else {
            users.add(newUser); // Primero lo añado al ArrayList que contiene los usuarios
            anadirFicheroUsers(newUser); // Acto seguido, persisto los datos para que estén en el fichero también
            return users.contains(newUser); // Devuelvo true si se ha añadido correctamente o false si ha habido algún problema al añadirlo
        }
    }

    public boolean userIsAdmin(String idUser) {
        return this.users.stream()
                .filter(user -> user.getId().equalsIgnoreCase(idUser) && user.isAdmin())
                .findFirst()
                .isEmpty();
    }

}
