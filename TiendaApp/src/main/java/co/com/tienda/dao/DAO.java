package co.com.tienda.dao;

import java.util.List;

public interface DAO<T> {
    void crear(T tipo);
    List<T> listar();
    T listarPorNombre(String nombre);
    T listarPorId(int id);
    void eliminar(int id);
    void modificar(T tipo);
}
