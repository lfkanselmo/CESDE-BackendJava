package co.com.tienda.models;

public class Producto {
    private int id;
    private String nombreProducto;
    private String descripcionProducto;
    private double precio;
    private double costo;
    private double cantidad;

    public Producto() {
    }

    public Producto(String nombreProducto, String descripcionProducto, double precio, double costo, double cantidad) {
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.precio = precio;
        this.costo = costo;
        this.cantidad = cantidad;
    }

    public Producto(int id, String nombreProducto, String descripcionProducto, double precio, double costo, double cantidad) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.precio = precio;
        this.costo = costo;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
