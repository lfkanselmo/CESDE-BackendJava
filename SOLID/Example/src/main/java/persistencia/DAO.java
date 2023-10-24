package persistencia;

import java.util.List;

public interface DAO<T> {

    void crear(T tipo);
    List<T> listar();
    List<T> listarPorId(Integer id);
    List<T> listarPorNombre(String nombre);
    void modificar(T tipo);
    void eliminar(T tipo);
}
