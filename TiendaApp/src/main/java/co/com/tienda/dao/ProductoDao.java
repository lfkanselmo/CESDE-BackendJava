package co.com.tienda.dao;

import co.com.tienda.conexion.Conexion;
import co.com.tienda.models.Producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDao {

    public static void crearProductoDB(Producto producto) {
        try (Connection con = Conexion.get_connection()) {

            PreparedStatement ps = null;
            try {
                String query = """
                        INSERT INTO producto(nombre,descripcion,precio,costo,cantidad) 
                        VALUES (?,?,?,?,?);
                        """;

                ps = con.prepareStatement(query);

                ps.setString(1, producto.getNombreProducto());
                ps.setString(2, producto.getDescripcionProducto());
                ps.setDouble(3, producto.getPrecio());
                ps.setDouble(4, producto.getCosto());
                ps.setDouble(5, producto.getCantidad());

                int resultOperacion = ps.executeUpdate();

                if (resultOperacion == 0) {
                    System.out.println("No fue posible guardar el producto");
                } else {
                    System.out.println("El producto se guardó con éxito");
                }

            } catch (SQLException e) {
                System.out.println(e);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static List<Producto> listarProductosDB() {

        List<Producto> productos = new ArrayList<>();
        try (Connection con = Conexion.get_connection()) {
            PreparedStatement ps = null;

            try {
                String query = """
                        SELECT * 
                        FROM producto;
                        """;
                ps = con.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                productos = resultSetAList(rs);

            } catch (SQLException e) {
                System.out.println("No se recuperaron registros");
                System.out.println(e);
            }

        } catch (SQLException e) {
            System.out.println("No se recuperaron registros");
            System.out.println(e);
        }

        return productos;
    }

    public static void modificarProductoDB(Producto pModificado) {
        try (Connection con = Conexion.get_connection()) {
            PreparedStatement ps = null;
            try {
                String query = """
                        UPDATE producto
                        SET nombre = ?,
                        descripcion = ?,
                        precio = ?,
                        costo = ?,
                        cantidad = ?
                        WHERE id = ?;
                        """;
                ps = con.prepareStatement(query);
                ps.setString(1, pModificado.getNombreProducto());
                ps.setString(2, pModificado.getDescripcionProducto());
                ps.setDouble(3, pModificado.getPrecio());
                ps.setDouble(4, pModificado.getCosto());
                ps.setDouble(5, pModificado.getCantidad());
                ps.setInt(6, pModificado.getId());

                int resultOperacion = ps.executeUpdate();

                if (resultOperacion == 0) {
                    System.out.println("No se pudo modificar el producto");
                } else {
                    System.out.println("Producto modificado con éxito");
                }

            } catch (SQLException e) {
                System.out.println("No se pudo modificar el producto");
                System.out.println(e);
            }

        } catch (SQLException e) {
            System.out.println("No se pudo modificar el producto");
            System.out.println(e);
        }
    }

    public static void eliminarProductoDB(int idProducto) {
        try (Connection con = Conexion.get_connection()) {
            PreparedStatement ps = null;

            try {
                String query = """
                        DELETE FROM producto 
                        WHERE id = ?
                        """;
                ps = con.prepareStatement(query);
                ps.setInt(1, idProducto);
                int resultOperacion = ps.executeUpdate();
                if (resultOperacion == 0) {
                    System.out.println("No se eliminaron productos");
                } else {
                    System.out.println("La eliminación del producto fue éxitosa");
                }

            } catch (SQLException e) {
                System.out.println("Falló la eliminación del producto");
                System.out.println(e);
            }
        } catch (SQLException e) {
            System.out.println("Falló la eliminación del producto");
            System.out.println(e);
        }
    }

    public static Producto traerProductoId(int id) {
        Producto actualizable = null;
        List<Producto> producto;

        try (Connection con = Conexion.get_connection()) {
            PreparedStatement ps = null;
            try {
                String query = """
                        SELECT * 
                        FROM producto 
                        WHERE id = ?
                        """;
                ps = con.prepareStatement(query);
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();

                producto = resultSetAList(rs);
                if (producto.isEmpty()) {
                    actualizable = null;
                } else {
                    actualizable = producto.get(0);
                }

            } catch (SQLException e) {
                System.out.println("No fue posible traer el producto con ID: " + id);
                System.out.println(e);
            }

        } catch (SQLException e) {
            System.out.println("No fue posible traer el producto con ID: " + id);
            System.out.println(e);
        }

        return actualizable;
    }

    private static List<Producto> resultSetAList(ResultSet rs) throws SQLException {
        List<Producto> productos = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            String descripcion = rs.getString("descripcion");
            double precio = rs.getDouble("precio");
            double costo = rs.getDouble("costo");
            double cantidad = rs.getDouble("cantidad");

            productos.add(new Producto(id, nombre, descripcion, precio, costo, cantidad));
        }
        return productos;
    }

}
