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
                            "");
                }

            if (connect != null) {
                System.out.println();
                System.out.println("Conexión exitosa");
                System.out.println();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        System.out.println("Creando conexión: " + connect);
    }


    public static Conexion get_Instance() {
        if (conexion == null) {
            conexion = new Conexion();
        }
        return conexion;
    }


    public Connection get_Connection() {
        System.out.println("Trayendo conexion: " + connect);
        if (connect == null) {
            System.out.println("conexion nueva");
            new Conexion();
        }

        return connect;
    }

    public void close_Connection() {
        System.out.println("Antes de cerrar conexion: " + connect);
        try {
            if (connect != null) {
                connect.close();
                connect = null;
                System.out.println("cerrada conexion");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Después de cerrar conexión: " + connect);
    }
}
