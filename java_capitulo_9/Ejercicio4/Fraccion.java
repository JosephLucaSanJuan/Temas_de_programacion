package Ejercicio4;

public class Fraccion {
  private int numerador;
  private int denominador;

  public Fraccion(int numerador, int denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
  }

  public int getNumerador() {
    return this.numerador;
  }

  public void setNumerador(int numerador) {
    this.numerador = numerador;
  }

  public int getDenominador() {
    return this.denominador;
  }

  public void setDenominador(int denominador) {
    this.denominador = denominador;
  }

  @Override
  public String toString() {
    return this.numerador+"/"+this.denominador;
  }

  public Fraccion simplifica() {
    int n = this.numerador;
    int d = this.denominador;

    for (int i = 2; i < Math.min(this.numerador, this.denominador); i++) {
      while ((n%i)==0 && (d%i)==0) {
        n/=i;
        d/=i;
      }
    }
    return new Fraccion(n, d);
  }

  public Fraccion multiplica(Fraccion f) {
    return new Fraccion(this.numerador*f.getNumerador(), this.denominador*f.getDenominador());
  }

  public Fraccion divide(Fraccion f) {
    return new Fraccion(this.numerador*f.getDenominador(), this.denominador*f.getNumerador());
  }
}
