package co.com.cesde.minimarket.persistence;

import co.com.cesde.minimarket.persistence.crud.ProductoCrudRepository;
import co.com.cesde.minimarket.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository{
    private ProductoCrudRepository productoCrudRepository;

    public Optional<Producto> getProducto(Integer idProducto){
        return productoCrudRepository.findById(idProducto);
    }

    public Producto save(Producto producto){
        return productoCrudRepository.save(producto);
    }

    public void delete (Integer idProducto){
        productoCrudRepository.deleteById(idProducto);
    }


    public Optional<List<Producto>> getByEscasos(Integer cantidad){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, true);
    }

    public List<Producto> getByCategoria(Integer idCategoria){
        return productoCrudRepository.findByIdCategoriaOrderByNombreProductoAsc(idCategoria);
    }
}

