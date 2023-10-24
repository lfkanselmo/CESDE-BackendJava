package persistencia;

import dominio.Producto;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ProductoDAO extends DAOAbstract{

    @Override
    public void crear(Object tipo) {

    }

    @Override
    public List listar() {
        List<Producto> productos = null;
        try {


        } catch (SQLException e) {
            System.out.println("Falló conección");
            System.out.println(e);
        }


        return productos;
    }

    @Override
    public List listarPorId(Integer id) {
        return null;
    }

    @Override
    public List listarPorNombre(String nombre) {
        return null;
    }

    @Override
    public void modificar(Object tipo) {

    }

    @Override
    public void eliminar(Object tipo) {

    }
}
