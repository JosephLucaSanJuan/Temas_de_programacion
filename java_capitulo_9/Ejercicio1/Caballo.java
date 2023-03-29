package Ejercicio1;

public class Caballo {
  public String nombre;
  private double altura;
  private String genero;
  private int edad;
  
  public Caballo(String nombre, double altura, String genero, int edad) {
    this.nombre = nombre;
    this.altura = altura;
    this.genero = genero;
    this.edad = edad;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getAltura() {
    return this.altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public String getGenero() {
    return this.genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public int getEdad() {
    return this.edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }
  
  public void come() {
    System.out.println("Muchas gracias. Ñam, ñam, ñam, ñam");
  }
}
