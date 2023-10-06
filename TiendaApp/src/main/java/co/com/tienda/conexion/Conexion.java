package co.com.tienda.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private Conexion conexion;

    private Conexion(){
        if (conexion == null){
            conexion = new Conexion();
        }
    }

    public static Connection get_connection(){
        Connection connect = null;

        try{
            connect = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/tienda_epica",
                    "root",
                    "");
            if(connect != null){
                System.out.println("Conexión exitosa");
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return connect;
    };
}
