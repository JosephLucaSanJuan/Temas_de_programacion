package java_capitulo_10.Ejercicio17;

import java.util.ArrayList;

public class Carrito {
  ArrayList<Elemento> lista = new ArrayList<Elemento>();

  Carrito(){

  }

  public Elemento agrega(Elemento e) {
    lista.add(e);
    return e;
  }

  public double importeTotal() {
    int importe = 0;
    for (Elemento elemento : lista) {
      importe += numeroDeUnidades()*elemento.getPrecio();
    }
    return importe;
  }

  public int numeroDeElementos() {
    return lista.size();
  }

  public int numeroDeUnidades(){
    int cantidad = 0;
    for (Elemento elemento : lista) {
      cantidad += elemento.getUnidades();
    }
    return cantidad;
  }

  @Override
  public String toString(){
    String respuesta;
    respuesta = "Contenido del carrito\n=====================\n";
    for (Elemento elemento : lista) {
      respuesta += elemento;
    }
    return respuesta;
  }
}
