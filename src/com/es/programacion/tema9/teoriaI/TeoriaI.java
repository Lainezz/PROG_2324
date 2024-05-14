package com.es.programacion.tema9.teoriaI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TeoriaI {
    public TeoriaI() {
    }

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/alumnos?user=root&password=";

        try {
            Connection connection = DriverManager.getConnection(url);
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM estudiantes");

            while(rs.next()) {
                String nombre = rs.getString("nombre");
                System.out.println("Nombre: " + nombre);
            }

            connection.close();
        } catch (SQLException var6) {
            var6.printStackTrace();
        }

    }
}