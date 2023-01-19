package Ejercicio13;

public class CuentaCorriente {
  private long numero;
  private double paga;

  CuentaCorriente(){
    this.generaNumero();
  }

  CuentaCorriente(double paga){
    this.generaNumero();
    this.paga = paga;
  }

  private void generaNumero() {
    for (int i = 0; i < 10; i++) {
      numero += (int)(Math.random()*10);
    }
  }

  @Override
  public String toString() {
    return "Número de cta: " + this.numero + ", Saldo: " + this.paga + "$";
  }

  public void ingreso(int dinero) {
    paga += dinero;
  }

  public void cargo(int dinero) {
    paga -= dinero;
  }

  public void transferencia(CuentaCorriente cuenta, int dinero) {
    paga -= dinero;
    cuenta.paga += dinero;
  }
}
