package com.es.programacion.tema9.teoriaV;

import com.es.programacion.tema9.teoriaV.model.ConectarBD_TV;
import com.es.programacion.tema9.teoriaV.utils.DBUtils;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TeoriaV {


    public static void main(String[] args) {

        // 1º pedimos las credenciales
        Scanner scan = new Scanner(System.in);

        System.out.print("user: ");
        String user = scan.nextLine();

        System.out.print("Pass: ");
        String pass = scan.nextLine();

        // 2º REALIZAR LA CONEXION
        // A) Establecer la url
        ConectarBD_TV conectarBDTv = new ConectarBD_TV(DBUtils.USER, DBUtils.PASS, DBUtils.DB_NAME);
        // B) Establecer la conexión
        conectarBDTv.realizarConexion();


        try {
            // C) Crear un objeto PreparedStatement con la QUERY
            PreparedStatement pst = conectarBDTv.obtenerConexion().prepareStatement(DBUtils.QUERY_LOGIN);
            // METER LOS PARAMETROS
            // (el numero del parametro, y el parametro en sí)
            pst.setString(1, user);
            pst.setString(2, pass);

            // D) EJECUTAR LA QUERY
            ResultSet rs = pst.executeQuery();

            // E) LEER RESULTADOS
            if (rs.next()) {
                System.out.println("Bienvenid@");

                PreparedStatement pst2 = conectarBDTv.obtenerConexion().prepareStatement(DBUtils.QUERY_CHECK_USER_IN_ACCESOS);

                pst2.setString(1, user);

                ResultSet rs2 = pst2.executeQuery();

                if(rs2.next()) {

                    // Se mete aquí si rs2.next ha sido true -> es decir, que sí existe
                    PreparedStatement pst3 = conectarBDTv.obtenerConexion().prepareStatement(DBUtils.QUERY_UPDATE_NACCESOS);
                    pst3.setString(1, user);

                    int nfilas = pst3.executeUpdate(); // Devuelve el nº de filas afectadas

                    if (nfilas > 0) {
                        System.out.println("Registro actualizado correctamente");
                    } else {
                        System.out.println("ID no encontado");
                    }
                } else {

                    PreparedStatement pst4 = conectarBDTv.obtenerConexion().prepareStatement(DBUtils.QUERY_INSERT_USER_IN_ACCESOS);

                    pst4.setString(1, user);
                    pst4.setInt(2,0);

                    int nfilas = pst4.executeUpdate();

                    if (nfilas > 0) {
                        System.out.println("Registro insertado correctamente");

                        PreparedStatement pst5 = conectarBDTv.obtenerConexion().prepareStatement(DBUtils.QUERY_UPDATE_NACCESOS);

                        int nfilasUpdate = pst5.executeUpdate(); // Devuelve el nº de filas afectadas

                        if (nfilasUpdate > 0) {
                            System.out.println("Registro actualizado correctamente");
                        } else {
                            System.out.println("ID no encontado");
                        }


                    } else {
                        System.out.println("fallo al insertar");
                    }


                }


            } else {
                System.out.println("No estas registrad@");
            }

            // f) CERRAR CONEXIOn
            conectarBDTv.realizarDesconexion();



        } catch (SQLException e){
            e.printStackTrace();
        }







    }
}
