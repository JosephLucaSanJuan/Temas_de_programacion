package Ejercicio12;

public class Libro extends Publicacion implements Prestable {
  private boolean prestado = false;
  
  Libro(String isbn, String titulo, int anPub) {
    super(isbn, titulo, anPub);
  }

  @Override
  public void presta() {
    if (this.prestado) {
      System.out.println("Lo siento. Ese libro está prestado.");
    } else {
      this.prestado = true;
    }
  }

  @Override
  public void devuelve() {
    this.prestado = false;
  }

  @Override
  public String toString() {
    return super.toString() + " (" + (this.prestado ? "prestado" : "no prestado") + ")";
  }

  @Override
  public boolean estaPrestado() {
    return this.prestado;
  }
}
