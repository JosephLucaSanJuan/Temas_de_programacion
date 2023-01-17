package Geometria;

public class TrianguloEquilatero extends Triangulo {
  
  TrianguloEquilatero(int base, int altura) {
    super(base, altura);
  }

  @Override
  public double perimetro() {
    return 3*this.base;
  }

  @Override
  public String toString() {
    return "Triángulo equilatero: (base: " + this.base + ", altura: " + this.altura + ")";
  }
  
}
