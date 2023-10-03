package co.com.tienda.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection get_connection(){
        Connection connect = null;

        try{
            connect = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/tienda_cesde",
                    "root",
                    "");
            if(connect != null){
                System.out.println("La conexión ha sido exitosa");
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return connect;
    };
}
