package co.com.tienda.test;

import co.com.tienda.conexion.Conexion;

import java.sql.Connection;

public class TestConexion {
    public static void main(String[] args) {

        Conexion conexion = Conexion.get_Instance();

        try(Connection conect = conexion.get_Connection()){

        }catch (Exception e){
            System.out.println(e);
        } finally {
            conexion.close_Connection();
        }


        try(Connection conect = conexion.get_Connection()){

        }catch (Exception e){
            System.out.println(e);
        } finally {
            conexion.close_Connection();
        }

    }
}
