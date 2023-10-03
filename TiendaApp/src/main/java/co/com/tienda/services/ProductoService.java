package co.com.tienda.services;

import co.com.tienda.dao.ProductoDao;
import co.com.tienda.models.Producto;

import java.util.Scanner;

public class ProductoService {
    private static final Scanner read = new Scanner(System.in);
    public static void crearProducto() {
        System.out.println("Ingrese el nombre del producto");
        String nombre = read.nextLine();
        System.out.println("Ingrese la descripción del producto");
        String descripcion = read.nextLine();
        System.out.println("Ingrese el precio del producto");
        double precio = read.nextDouble();
        System.out.println("Ingrese el costo del producto");
        double costo = read.nextDouble();
        System.out.println("Ingrese la cantidad del producto");
        double cantidad = read.nextDouble();

        Producto producto = new Producto(nombre,descripcion,precio,costo,cantidad);

        ProductoDao.crearProductoDB(producto);
    }

    public static  void listarProductos(){

    }

    public static  void modificarProducto(){

    }

    public static void eliminarProducto(){

    }
}
