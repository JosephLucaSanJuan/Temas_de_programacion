package Geometria;

public class Triangulo extends Figura {
  protected int base;
  protected int altura;

  protected Triangulo(int base, int altura) {
    super(3);
    this.base = base;
    this.altura = altura;
  }
  
  @Override
  public double area() {
    return this.base*this.altura / 2;
  }

  @Override
  public double perimetro() {
    return 0;
  }

  @Override
  public String toString() {
    return "Triangulo";
  }
}
