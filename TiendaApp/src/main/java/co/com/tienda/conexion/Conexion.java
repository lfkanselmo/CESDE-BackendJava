package co.com.tienda.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static Conexion conexion;
    private static Connection connect;

    private Conexion() {
        try {
                if(connect == null){
                    connect = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/tienda_epica",
                            "root",
                            "root");
                }

            if (connect != null) {
                System.out.println();
                System.out.println("Conexión exitosa");
                System.out.println();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }


    public static Conexion get_Instance() {
        if (conexion == null) {
            conexion = new Conexion();
        }
        return conexion;
    }


    public Connection get_Connection() {
        if (connect == null) {
            System.out.println("conexion nueva");
            new Conexion();
        }

        return connect;
    }

    public void close_Connection() {

        try {
            if (connect != null) {
                connect.close();
                connect = null;
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
