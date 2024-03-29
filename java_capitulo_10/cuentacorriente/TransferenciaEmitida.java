package cuentacorriente;

public class TransferenciaEmitida extends Transferencia {
  private String cuentaDestino;

  public TransferenciaEmitida(float importe, String cuenta, float saldo, String cuentaDestino){
    super(importe, cuenta, saldo);
    this.cuentaDestino = cuentaDestino;
  }

  @Override
  public String toString(){
    return String.format("Transf. recibida de %.2f $ de la cuenta %s Saldo %.2f $", this.importe, this.cuentaDestino, this.saldo);
  }
}
