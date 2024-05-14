package com.es.programacion.tema9.teoriaIV.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private String user;
    private String password;
    private String url;
    private String BD;
    private Connection connection;

    public ConexionBD(String user, String password, String BD) {
        this.BD = BD;
        this.user = user;
        this.password = password;
        this.url = "jdbc:mysql://localhost:3306/" + this.BD + "?user=" + this.user + "&password=" + this.password;
    }

    public void conectarBD() {
        try {
            this.connection = DriverManager.getConnection(this.url);
        } catch (SQLException var2) {
            var2.printStackTrace();
        }

    }

    public void desconectarBD() {
        try {
            this.connection.close();
        } catch (SQLException var2) {
            var2.printStackTrace();
        }

    }

    public Connection obtenerConexion() {
        return this.connection;
    }
}