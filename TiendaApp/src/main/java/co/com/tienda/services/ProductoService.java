package co.com.tienda.services;

import co.com.tienda.dao.ProductoDao;
import co.com.tienda.models.Producto;

import java.util.List;
import java.util.Scanner;

public class ProductoService {
    private static final Scanner read = new Scanner(System.in);
    public static void crearProducto() {
        System.out.println();
        System.out.println("----------------------- PRODUCTO NUEVO -----------------------");
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
        read.skip("\n");

        Producto producto = new Producto(nombre,descripcion,precio,costo,cantidad);

        ProductoDao.crearProductoDB(producto);
    }

    public static  void listarProductos(){
        List<Producto> productos = ProductoDao.listarProductosDB();

        if(productos.isEmpty()){
            System.out.println("-----------------------------------------------------");
            System.out.println("No hay productos a mostrar");
            System.out.println("-----------------------------------------------------");
        } else{
            System.out.println("--------------------- PRODUCTOS ---------------------");
            for (Producto p : productos) {
                System.out.println("-----------------------------------------------------");
                System.out.println(
                        "ID: " + p.getId() + "\n" +
                        "Nombre: " + p.getNombreProducto() + "\n" +
                        "Descripcion: " + p.getDescripcionProducto() + "\n" +
                        "Precio: " + p.getPrecio() + "\n" +
                        "Cantidad: " + p.getCantidad() + "\n"
                );
            }
            System.out.println();
        }

    }

    public static void mostrarProductoPorId(){
        System.out.println();
        System.out.println("Ingrese el ID del producto a mostrar");
        int idAux = read.nextInt();

        Producto productoAMostrar = ProductoDao.traerProductoId(idAux);
        if (productoAMostrar != null){
            System.out.println("--------------------- PRODUCTOS ---------------------");
            System.out.println(
                    "ID: " + productoAMostrar.getId() + "\n" +
                            "Nombre: " + productoAMostrar.getNombreProducto() + "\n" +
                            "Descripcion: " + productoAMostrar.getDescripcionProducto() + "\n" +
                            "Precio: " + productoAMostrar.getPrecio() + "\n" +
                            "Costo: " + productoAMostrar.getCosto() + "\n" +
                            "Cantidad: " + productoAMostrar.getCantidad() + "\n"
            );
        }else{
            System.out.println("Producto con ID " + idAux + " no existe");
        }

        System.out.println();
    }

    public static  void modificarProducto(){
        System.out.println();
        System.out.println("Ingrese el ID del producto a modificar: ");
        int idAux = read.nextInt();

        Producto actualizable = ProductoDao.traerProductoId(idAux);

        if(actualizable != null){
            boolean finish = true;

            do{
                System.out.println("-------------------------------------------------");
                System.out.println(" ----------- " + actualizable.getNombreProducto() + " ----------- ");
                System.out.println("Indique para modificar: ");
                System.out.println("1. Nombre");
                System.out.println("2. Descripcion");
                System.out.println("3. Precio");
                System.out.println("4. Costo");
                System.out.println("5. Cantidad");
                System.out.println("6. Terminar modificación");
                String opc = read.next();
                read.skip("\n");


                switch(opc){
                    case "1":
                        System.out.println("Ingrese el nuevo nombre del producto");
                        actualizable.setNombreProducto(read.nextLine());
                        finish = true;
                        break;

                    case "2":
                        System.out.println("Ingrese la nueva descripción del producto");
                        actualizable.setDescripcionProducto(read.nextLine());
                        finish = true;
                        break;

                    case "3":
                        System.out.println("Ingrese el nuevo precio del producto");
                        actualizable.setPrecio(read.nextDouble());
                        finish = true;
                        break;

                    case "4":
                        System.out.println("Ingrese el nuevo costo del producto");
                        actualizable.setCosto(read.nextDouble());
                        finish = true;
                        break;

                    case "5":
                        System.out.println("ingrese la nueva cantidad del producto");
                        actualizable.setCantidad(read.nextDouble());
                        finish = true;
                        break;

                    case "6":
                        System.out.println("----------- Fin de modicaciones -----------");
                        finish = false;
                        break;

                }
            }while(finish);

            ProductoDao.modificarProductoDB(actualizable);

        } else {
            System.out.println();
            System.out.println("ID de producto a modificar no existe");
            System.out.println();
        }

    }

    public static void eliminarProducto(){
        System.out.println();
        System.out.println("Ingrese el ID del producto a borrar: ");
        int idAux = read.nextInt();
        ProductoDao.eliminarProductoDB(idAux);
    }
}
