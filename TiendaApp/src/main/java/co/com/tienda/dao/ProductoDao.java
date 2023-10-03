package co.com.tienda.dao;

import co.com.tienda.conexion.Conexion;
import co.com.tienda.models.Producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductoDao {

    public static void crearProductoDB(Producto producto){
        Conexion connect = new Conexion();
        try(Connection con = connect.get_connection()) {

            PreparedStatement ps = null;
            try{
                String query = "INSERT INTO producto(nombre,descripcion,precio,costo,cantidad)" +
                        "VALUES (?,?,?,?,?)";

                ps = con.prepareStatement(query);

                ps.setString(1,producto.getNombreProducto());
                ps.setString(2, producto.getDescripcionProducto());
                ps.setDouble(3, producto.getPrecio());
                ps.setDouble(4,producto.getCosto());
                ps.setDouble(5, producto.getCantidad());

                ps.executeUpdate();

                System.out.println("Registro exitoso");

            }catch (SQLException e){
                System.out.println(e);
            }

        }catch(SQLException e){
            System.out.println(e);
        }
    }

    public static  void listarProductosDB(){

    }

    public static  void modificarProductoDB(){

    }

    public static void eliminarProductoDB(){

    }
}
