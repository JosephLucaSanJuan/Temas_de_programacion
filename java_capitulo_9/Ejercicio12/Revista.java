package Ejercicio12;

public class Revista extends Publicacion{
  private int numero;

  Revista(String isbn, String titulo, int anPub, int numero) {
    super(isbn, titulo, anPub);
    this.numero = numero;
  }
}
