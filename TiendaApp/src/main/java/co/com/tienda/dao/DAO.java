package co.com.tienda.dao;

import java.util.List;

public interface DAO<T> {
    public void crear(T tipo);
    public List<T> listar();
    public T listarPorNombre(String nombre);
    public T listarPorId(int id);
    public void eliminar(int id);
    public void modificar(T tipo);
}
