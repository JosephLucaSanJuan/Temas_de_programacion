package Ejercicio12;

public class Publicacion {
  protected String isbn;
  protected String titulo;
  protected int anPub;
  
  Publicacion(String isbn, String titulo, int anPub) {
    this.isbn = isbn;
    this.titulo = titulo;
    this.anPub = anPub;
  }

  @Override
  public String toString() {
    return "ISBN = " + isbn + ", Titulo = " + titulo + ", Año de Publicación = " + anPub;
  }
}
