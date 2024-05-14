package com.es.programacion.tema9.teoriaII;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TeoriaII {
    public TeoriaII() {
    }

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/bdempleados?user=root&password=";

        try {
            Connection con = DriverManager.getConnection(url);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM empleados");

            String id;
            String nombre;
            String correo;
            String edad;
            String isAdmin;
            while(rs.next()) {
                id = rs.getString("id");
                nombre = rs.getString("nombre");
                correo = rs.getString("correo");
                edad = rs.getString("edad");
                isAdmin = rs.getString("isAdmin");
                System.out.println("id: " + id);
                System.out.println("\tnombre: " + nombre);
                System.out.println("\tcorreo: " + correo);
                System.out.println("\tedad: " + edad);
                System.out.println("\tisAdmin: " + isAdmin);
            }

            ResultSet rs2 = st.executeQuery("SELECT * FROM empleados WHERE edad < 30");
            while(rs2.next()) {
                id = rs2.getString("id");
                nombre = rs2.getString("nombre");
                correo = rs2.getString("correo");
                edad = rs2.getString("edad");
                isAdmin = rs2.getString("isAdmin");
                System.out.println("id: " + id);
                System.out.println("\tnombre: " + nombre);
                System.out.println("\tcorreo: " + correo);
                System.out.println("\tedad: " + edad);
                System.out.println("\tisAdmin: " + isAdmin);
            }

            ResultSet rsGumer = st.executeQuery("SELECT * FROM empleados WHERE nombre = 'Gumersindo'");
            while(rsGumer.next()) {
                id = rsGumer.getString("id");
                nombre = rsGumer.getString("nombre");
                correo = rsGumer.getString("correo");
                edad = rsGumer.getString("edad");
                isAdmin = rsGumer.getString("isAdmin");
                System.out.println("id: " + id);
                System.out.println("\tnombre: " + nombre);
                System.out.println("\tcorreo: " + correo);
                System.out.println("\tedad: " + edad);
                System.out.println("\tisAdmin: " + isAdmin);
            }

            st.execute("INSERT INTO empleados VALUES ('emp8', 'Patri', 'patri@patri.com', 24, 1)");
            ResultSet rsInsert = st.executeQuery("SELECT * FROM empleados WHERE id = 'emp8'");

            while(rsInsert.next()) {
                id = rsInsert.getString("id");
                nombre = rsInsert.getString("nombre");
                correo = rsInsert.getString("correo");
                edad = rsInsert.getString("edad");
                isAdmin = rsInsert.getString("isAdmin");
                System.out.println("id: " + id);
                System.out.println("\tnombre: " + nombre);
                System.out.println("\tcorreo: " + correo);
                System.out.println("\tedad: " + edad);
                System.out.println("\tisAdmin: " + isAdmin);
            }

            con.close();
        } catch (Exception var13) {
            var13.printStackTrace();
        }

    }
}
