package Geometria;

public class Rectangulo extends Figura {
  protected int base;
  protected int altura;

  public Rectangulo(int base, int altura) {
    super(4);
    this.base = base;
    this.altura = altura;
  }

  @Override
  public double area() {
    // TODO Auto-generated method stub
    return this.base*this.altura;
  }

  @Override
  public double perimetro() {
    // TODO Auto-generated method stub
    return 2*this.base+2*this.altura;
  }

  @Override
  public String toString() {
    return "Rectángulo: (base: " + this.base + ", altura: " + this.altura + ")";
  }
  
}
