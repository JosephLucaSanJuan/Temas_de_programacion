package Array_de_objetos.Ejercicio5;

public class Articulo {
    private String codigo = "EMPTY";
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;

    Articulo(){}

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
