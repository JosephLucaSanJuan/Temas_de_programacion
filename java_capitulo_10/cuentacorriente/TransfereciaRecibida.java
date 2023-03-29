package cuentacorriente;

public class TransfereciaRecibida extends Transferencia {

  public TransfereciaRecibida(float importe, String cuenta, float saldo) {
    super(importe, cuenta, saldo);
  }

  @Override
  public String toString() {
    return String.format("Transferencia recebida de %.2f $ de la cuenta %s Saldo %.2f $", this.importe, this.cuenta, this.saldo);
  }
}
