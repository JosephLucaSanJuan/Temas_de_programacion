package Ejercicio13;

public class Articulo {
    private String codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;

    Articulo(){}

    Articulo(String code, String descrip, double precioC, double precioV, int stock){
        this.codigo = code;
        this.descripcion = descrip;
        this.precioCompra = precioC;
        this.precioVenta = precioV;
        this.stock = stock;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public double getPrecioC(){
        return this.precioCompra;
    }

    public double getPrecioV(){
        return this.precioVenta;
    }

    public int getStock(){
        return this.stock;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescipcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecioC(double precioC) {
        this.precioCompra = precioC;
    }

    public void setPrecioV(double precioV) {
        this.precioVenta = precioV;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString(){
        String cadena = "=============================";
        cadena += "\nCódigo: "+this.codigo;
        cadena += "\nDescripción: "+this.descripcion;
        cadena += "\nPrecio de Compra: "+this.precioCompra;
        cadena += "\nPrecio de Venta: "+this.precioVenta;
        cadena += "\nUnidades en Stock: "+this.stock;
        cadena += "\n=============================";
        return cadena;
    }
}
