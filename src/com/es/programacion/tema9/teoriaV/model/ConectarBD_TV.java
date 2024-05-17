package com.es.programacion.tema9.teoriaV.model;

import java.sql.Connection;
import java.sql.SQLException;

public class ConectarBD_TV {

    private String user, pass, dbName, url;
    private Connection connection;

    public ConectarBD_TV(String user, String pass, String dbName) {
        this.user = user;
        this.pass = pass;
        this.dbName = dbName;

        this.url = "jdbc:mysql://localhost:3306/"+this.dbName+"?user="+this.user+"&password="+this.pass;
    }

    /**
     * Método que realiza la conexión a la base de datos. Almacena dicha conexión en el atributo connection
     */
    public void realizarConexion() {

        try {

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
