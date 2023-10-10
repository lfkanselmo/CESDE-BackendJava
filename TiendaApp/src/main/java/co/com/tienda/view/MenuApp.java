package co.com.tienda.view;

import co.com.tienda.services.ProductoService;

import java.util.Scanner;

public class MenuApp {

    private static final Scanner read = new Scanner(System.in);

    public static void iniciarMenuProducto() {
        boolean running = true;
        do {
            System.out.println();
            System.out.println("********** MENÚ DE PRODUCTO **********");
            System.out.println();

            System.out.println(
                    """
                            Ingrese la opción deseada: 
                            1. Crear producto nuevo
                            2. Modificar producto
                            3. Eliminar producto
                            4. Mostrar todos los productos
                            5. Mostrar el producto indicado
                            6. Terminar menú de productos
                            """
            );

            String opc = read.next();
            read.skip("\n");

            switch (opc) {
                case "1":
                    ProductoService.crearProducto();
                    running = true;
                    break;
                case "2":
                    ProductoService.modificarProducto();
                    running = true;
                    break;
                case "3":
                    ProductoService.eliminarProducto();
                    running = true;
                    break;
                case "4":
                    ProductoService.listarProductos();
                    running = true;
                    break;
                case "5":
                    ProductoService.mostrarProductoPorId();
                    running = true;
                    break;
                case "6":
                    System.out.println("************ MENÚ TERMINADO ************");
                    running = false;
                    break;

                default:
                    System.out.println("Opción ingresada no válida");
                    running = true;
                    break;
            }


        } while (running);
    }
}
