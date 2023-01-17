package Geometria;

public class Cuadrado extends Rectangulo {

  public Cuadrado(int lado) {
    super(lado, lado);
  }

  @Override
  public String toString() {
    return "Cuadrado: ("+this.base+")";
  }
}
