package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static Connection con;
    private static String url = "jdbc:mysql://localhost:3306/prueba";
    private static String user = "root";
    private static String password = "";

    private Conexion(){

    }

    public static Connection getConnection() {
        if (con == null){
            try {
                con = DriverManager.getConnection(url,user,password);
            } catch (SQLException e) {
                System.out.println(e);
            }

        }

        return con;
    }

    public static void closeConnection(){
        if (con != null){
            try {
                con.close();
                con = null;
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
}
