package co.com.tienda.test;

import co.com.tienda.conexion.Conexion;

import java.sql.Connection;

public class TestConexion {
    public static void main(String[] args) {
        Conexion conexion = new Conexion();

        try(Connection conect = conexion.get_connection()){

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
