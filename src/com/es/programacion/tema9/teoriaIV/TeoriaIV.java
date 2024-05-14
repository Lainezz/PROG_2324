package com.es.programacion.tema9.teoriaIV;

import com.es.programacion.tema9.teoriaIV.model.ConexionBD;
import java.sql.SQLException;
import java.sql.Statement;

public class TeoriaIV {
    public TeoriaIV() {
    }

    public static void main(String[] args) {
        ConexionBD conexionBD = new ConexionBD("root", "", "bdempleados");
        conexionBD.conectarBD();

        try {
            Statement st = conexionBD.obtenerConexion().createStatement();
            int nFilasAfectadas = st.executeUpdate("DELETE FROM empleados WHERE id = 'emp4'");
            if (nFilasAfectadas > 0) {
                System.out.println("FILA ELIMINADA CORRECTAMENTE");
            } else {
                System.out.println("NO SE HA ELIMINADO EL REGISTRO");
            }
        } catch (SQLException var4) {
            var4.printStackTrace();
        }

    }
}