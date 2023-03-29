package Ejercicio17;

public class Elemento {
  private String nombre;
  private double precio;
  private int unidades;

  public Elemento(String nombre, double precio, int unidades) {
    this.nombre = nombre;
    this.precio = precio;
    this.unidades = unidades;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getPrecio() {
    return this.precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getUnidades() {
    return this.unidades;
  }

  public void setUnidades(int unidades) {
    this.unidades = unidades;
  }

  @Override
  public String toString() {
    return getNombre() + "  PVP: " + getPrecio() + "  Unidades: " + getUnidades() + "  Subtotal: " + this.precio*this.unidades + "\n";
  }
}
