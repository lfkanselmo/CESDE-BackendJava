package co.com.tienda.test;

import co.com.tienda.services.ProductoService;

public class TestProductoDao {
    public static void main(String[] args) {
        ProductoService.crearProducto();
        ProductoService.crearProducto();
        ProductoService.listarProductos();
    }
}
