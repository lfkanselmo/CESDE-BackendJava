package co.com.tienda.test;

import co.com.tienda.conexion.Conexion;

import java.sql.Connection;

public class TestConexion {
    public static void main(String[] args) {

        try(Connection conect = Conexion.get_connection()){

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
